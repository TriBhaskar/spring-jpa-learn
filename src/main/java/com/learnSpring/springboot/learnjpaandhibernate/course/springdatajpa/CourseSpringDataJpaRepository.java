package com.learnSpring.springboot.learnjpaandhibernate.course.springdatajpa;

import com.learnSpring.springboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course,Long> {
    List<Course> findByAuthor(String author);
    List<Course> findByName(String name);
}