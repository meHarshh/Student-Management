package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.Student;
import com.spring.test.service.StudentService;
import com.spring.test.util.ResponseStructure;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping(value = "/admin/addStudent")
	private ResponseEntity<ResponseStructure<Student>> addStudent(@RequestBody Student student){
		return studentService.addStudent(student);
	}
	
	@PostMapping(value = "/admin/login")
	private ResponseEntity<ResponseStructure<List<Student>>> login(@RequestParam String username, @RequestParam String password){
		return studentService.login(username, password);
	}
	
	@GetMapping(value = "/admin/students")
	private ResponseEntity<ResponseStructure<List<Student>>> fetchAllStudents(){
		return studentService.fetchAllStudents();
	}

	@GetMapping(value = "/admin/students/{studentId}")
	private ResponseEntity<ResponseStructure<Student>> getStudent(@PathVariable int studentId){
		return studentService.getStudent(studentId);
	}
	
	@PutMapping(value = "/admin/students/{studentID}")
	private ResponseEntity<ResponseStructure<Student>> editStudent(@PathVariable int studentId ,@RequestBody Student student){
		return studentService.editStudent(studentId, student);
	}
	
	@DeleteMapping(value = "/admin/students/{studentId}")
	private ResponseEntity<ResponseStructure<Student>> deleteStudent(@PathVariable int studentId){
		return studentService.deleteStudent(studentId);
	}

}
