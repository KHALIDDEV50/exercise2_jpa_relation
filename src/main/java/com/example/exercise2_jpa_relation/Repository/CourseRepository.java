package com.example.exercise2_jpa_relation.Repository;

import com.example.exercise2_jpa_relation.Model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {
}