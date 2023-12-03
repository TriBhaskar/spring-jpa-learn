package com.learnSpring.springboot.learnjpaandhibernate.course.jpa;

import com.learnSpring.springboot.learnjpaandhibernate.course.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public class CourseJpaRepository {
    @PersistenceContext //@PersistenceContext is similar to @autowired , but it is specific to Jpa
    private EntityManager entityManager;

    public void insert(Course course){
        entityManager.merge(course);
    }
    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }
    public void delete(long id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }

}