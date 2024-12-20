package com.spring.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.Result;

public interface ResultRepo extends JpaRepository<Result, Integer>{

}
