package com.ltts.com.StudentSystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.com.StudentSystem.model.Student;
import com.ltts.com.StudentSystem.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/add")
	public String add(@RequestBody Student student) {
		studentService.saveStudent(student);
		return "new student is added";
	}
	
	@GetMapping("/getAll")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@DeleteMapping("/deleteStudent/{studentId}")
	public String deleteStudent(@PathVariable("studentId") int studentId) {
//		studentService.deleteStudent(studentId);
		try {
			studentService.deleteStudent(studentId);
//			return ResponseEntity.status(HttpStatus.OK).build();
			return "student deleted successfully";
		} catch (Exception e) {
			// TODO: handle exception
//			e.printStackTrace();
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
			return "Student not deleted!!! server issue";
		}
	}
	
	@PutMapping("/updateStudent/{studentId}")
	public String updateStudent(@RequestBody Student student, @PathVariable("studentId") int studentId) {
		try {
			studentService.updateStudent(student, studentId);
			return "Student is updated";
		}
		catch(Exception e) {
			return "Student not updated!!! server issue";
		}
	}
	
}