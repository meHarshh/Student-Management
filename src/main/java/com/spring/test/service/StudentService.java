package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.Student;
import com.spring.test.util.ResponseStructure;

public interface StudentService {

	ResponseEntity<ResponseStructure<Student>> addStudent(Student student);

	ResponseEntity<ResponseStructure<List<Student>>> login(String username, String password);

	ResponseEntity<ResponseStructure<List<Student>>> fetchAllStudents();

	ResponseEntity<ResponseStructure<Student>> getStudent(int studentId);

	ResponseEntity<ResponseStructure<Student>> editStudent(int studentId, Student student);

	ResponseEntity<ResponseStructure<Student>> deleteStudent(int studentId);

}
