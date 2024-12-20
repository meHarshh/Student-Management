package com.spring.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer>{

}
