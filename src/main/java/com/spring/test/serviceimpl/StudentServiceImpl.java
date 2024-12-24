package com.spring.test.serviceimpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.Student;
import com.spring.test.exception.InvalidEmailException;
import com.spring.test.exception.StudentExistById;
import com.spring.test.exception.StudentIdNotExistsException;
import com.spring.test.exception.UsernameOrPasswordAlreadyExistException;
import com.spring.test.repo.StudentRepo;
import com.spring.test.service.StudentService;
import com.spring.test.util.ResponseStructure;

@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public ResponseEntity<ResponseStructure<Student>> addStudent(Student student) {
		String username = student.getUserName();
		String password = student.getPassword();
		int studentId = student.getStudentId();

		if(studentRepo.existsByStudentId(studentId)) {
			throw new StudentExistById("Student is Exist with the ID, please Enter the another Id.");
		}
		if (studentRepo.existsByUsernameAndPassword(username, password)) {
			throw new UsernameOrPasswordAlreadyExistException(
					"The username or Email already exists please enter a new username and retry");
		}

		if (!student.getEmail().contains("@") && !student.getEmail().contains(".com")) {
			throw new InvalidEmailException("Please enter the valid email-id");
		}

		Student student2 =	studentRepo.save(student);

		String message = "Student ID :" + student.getStudentId() + " Added Successfully!!";

		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();
		responseStructure.setStatusCode(HttpStatus.CREATED.value());
		responseStructure.setMessage(message);
		responseStructure.setData(student2);

		return new ResponseEntity<ResponseStructure<Student>>(responseStructure, HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<ResponseStructure<List<Student>>> login(String username, String password) {
		Optional<Student> student = studentRepo.findByUsernameAndPassword(username, password);

		if (student.isPresent()) {
			Student student2 = student.get();

			List<Student> students = new ArrayList<Student>();
			students.add(student2);

			String message = "Student ID :" + student2.getStudentId() + " LoggedIn Successfully!!";

			ResponseStructure<List<Student>> responseStructure = new ResponseStructure<List<Student>>();
			responseStructure.setStatusCode(HttpStatus.OK.value());
			responseStructure.setMessage(message);
			responseStructure.setData(students);

			return new ResponseEntity<ResponseStructure<List<Student>>>(responseStructure, HttpStatus.OK);
		} else {
			String errorMessage = "Invalid credentials: Student not found.";

			ResponseStructure<List<Student>> errorResponse = new ResponseStructure<List<Student>>();
			errorResponse.setStatusCode(HttpStatus.UNAUTHORIZED.value());
			errorResponse.setMessage(errorMessage);
			errorResponse.setData(Collections.emptyList());

			return new ResponseEntity<ResponseStructure<List<Student>>>(errorResponse, HttpStatus.UNAUTHORIZED);
		}
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Student>>> fetchAllStudents() {
		List<Student> students = studentRepo.findAll();

		ResponseStructure<List<Student>> responseStructure = new ResponseStructure<List<Student>>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Students Details fetched Successfully");
		responseStructure.setData(students);

		return new ResponseEntity<ResponseStructure<List<Student>>>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<Student>> getStudent(int studentId) {
		Student student = studentRepo.findById(studentId)
				.orElseThrow(() -> new StudentIdNotExistsException("Student with ID not found."));

		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Student Detail with ID :" + studentId + " fetched successfully");
		responseStructure.setData(student);

		return new ResponseEntity<ResponseStructure<Student>>(responseStructure, HttpStatus.OK);	

	}

	@Override
	public ResponseEntity<ResponseStructure<Student>> editStudent(int studentId, Student student) {
		Student student2 = studentRepo.findById(studentId)
				.orElseThrow(() -> new StudentIdNotExistsException("Student with ID not found."));

		student2.setFirstName(student.getFirstName());
		student2.setLastName(student.getLastName());
		student2.setAadharNumber(student.getAadharNumber());
		student2.setAlternateNumber(student.getAlternateNumber());
		student2.setDob(student.getDob());
		student2.setEmail(student.getEmail());
		student2.setFatherName(student.getFatherName());
		student2.setGender(student.getGender());
		student2.setMobileNumber(student.getMobileNumber());
		student2.setPassportNumber(student.getPassportNumber());
		student2.setPassportNumber(student.getPassportNumber());
		student2.setTemporaryAddress(student.getTemporaryAddress());
		student2.setUserName(student.getUserName());

		Student student3 = studentRepo.save(student2);

		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Student Detail with ID :" + studentId + " updated successfully");
		responseStructure.setData(student3);

		return new ResponseEntity<ResponseStructure<Student>>(responseStructure, HttpStatus.OK);	
	}

	@Override
	public ResponseEntity<ResponseStructure<Student>> deleteStudent(int studentId) {
		Student student = studentRepo.findById(studentId)
				.orElseThrow(() -> new StudentIdNotExistsException("Student with ID not found."));

		studentRepo.delete(student);

		ResponseStructure<Student> responseStructure = new ResponseStructure<Student>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Student Detail with ID :" + studentId + " deleted successfully");
		responseStructure.setData(student);

		return new ResponseEntity<ResponseStructure<Student>>(responseStructure, HttpStatus.OK);	

	}

}





