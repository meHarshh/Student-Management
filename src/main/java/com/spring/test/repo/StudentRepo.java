package com.spring.test.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

	boolean existsByStudentId(int studentId);

	boolean existsByUsernameAndPassword(String username, String password);

	Optional<Student> findByUsernameAndPassword(String username, String password);

}
