package com.ltts.com.StudentSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ltts.com.StudentSystem.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
