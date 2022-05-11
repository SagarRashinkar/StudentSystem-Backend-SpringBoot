package com.ltts.com.StudentSystem.service;

import java.util.List;

import com.ltts.com.StudentSystem.model.Student;

public interface StudentService {

//	add student in database
	public Student saveStudent(Student student);

//	get all students data from database
	public List<Student> getAllStudents();
	
//	delete specific student data from database
	public void deleteStudent(int studentId);
	
//	update student data in database
	public Student updateStudent(Student student, int studentId);
}
