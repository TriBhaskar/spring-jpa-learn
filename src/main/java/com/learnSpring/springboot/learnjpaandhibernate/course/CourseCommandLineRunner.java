package com.learnSpring.springboot.learnjpaandhibernate.course;

import com.learnSpring.springboot.learnjpaandhibernate.course.Course;
import com.learnSpring.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.learnSpring.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//    @Autowired
//    CourseJdbcRepository courseJdbcRepository;

    @Autowired
    CourseJpaRepository courseJpaRepository;
    @Override
    public void run(String... args) throws Exception {
        courseJpaRepository.insert(new Course(1L,"Learn Java!","BY Bhaskar"));
        courseJpaRepository.insert(new Course(2L,"Learn Python!","BY Bhaskar"));
        courseJpaRepository.insert(new Course(3L,"Learn JavaScript!","BY Bhaskar"));
        courseJpaRepository.delete(1L);

        System.out.println(courseJpaRepository.findById(2L));
        System.out.println(courseJpaRepository.findById(3L));
    }
}
