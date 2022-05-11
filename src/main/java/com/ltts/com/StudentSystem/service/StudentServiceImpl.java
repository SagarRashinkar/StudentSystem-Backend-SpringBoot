package com.ltts.com.StudentSystem.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ltts.com.StudentSystem.model.Student;
import com.ltts.com.StudentSystem.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student saveStudent(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepository.deleteById(studentId);		
	}

	@Override
	public Student updateStudent(Student student, int studentId) {
		student.setId(studentId);
		return studentRepository.save(student);
	}
}
