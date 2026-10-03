package com.example.exercise2_jpa_relation.Repository;

import com.example.exercise2_jpa_relation.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

}