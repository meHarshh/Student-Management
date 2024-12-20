package com.spring.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.Test;

public interface TestRepo extends JpaRepository<Test, Integer>{

}
