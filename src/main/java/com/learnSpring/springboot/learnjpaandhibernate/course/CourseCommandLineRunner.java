package com.learnSpring.springboot.learnjpaandhibernate.course;

import com.learnSpring.springboot.learnjpaandhibernate.course.Course;
import com.learnSpring.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learnSpring.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.learnSpring.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    private CourseJdbcRepository courseJdbcRepository;

//    @Autowired
//    private CourseJpaRepository courseJpaRepository;
    @Autowired
    private CourseSpringDataJpaRepository courseSpringDataJpaRepository;
    @Override
    public void run(String... args) throws Exception {
        courseSpringDataJpaRepository.save(new Course(1L,"Learn Java!","BY Bhaskar"));
        courseSpringDataJpaRepository.save(new Course(2L,"Learn Python!","BY Bhaskar"));
        courseSpringDataJpaRepository.save(new Course(3L,"Learn JavaScript!","BY Bhaskarp"));
        courseSpringDataJpaRepository.deleteById(1L);

        System.out.println(courseSpringDataJpaRepository.findById(2L));
        System.out.println(courseSpringDataJpaRepository.findById(3L));

        System.out.println(courseSpringDataJpaRepository.findByAuthor("BY Bhaskar"));
        System.out.println(courseSpringDataJpaRepository.findByName("Learn JavaScript!"));
    }
}
