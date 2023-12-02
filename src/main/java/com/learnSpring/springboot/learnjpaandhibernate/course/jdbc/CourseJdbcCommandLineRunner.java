package com.learnSpring.springboot.learnjpaandhibernate.course.jdbc;

import com.learnSpring.springboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {
    @Autowired
    CourseJdbcRepository courseJdbcRepository;
    @Override
    public void run(String... args) throws Exception {
        courseJdbcRepository.insert(new Course(1L,"Learn Java!","BY Bhaskar"));
        courseJdbcRepository.insert(new Course(2L,"Learn Python!","BY Bhaskar"));
        courseJdbcRepository.insert(new Course(3L,"Learn JavaScript!","BY Bhaskar"));
        courseJdbcRepository.delete(1L);
    }
}
