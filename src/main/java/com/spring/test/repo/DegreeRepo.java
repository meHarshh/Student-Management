package com.spring.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.Degree;

public interface DegreeRepo extends JpaRepository<Degree, Integer> {

}
