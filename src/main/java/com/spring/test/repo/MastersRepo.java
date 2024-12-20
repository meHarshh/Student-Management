package com.spring.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.Masters;

public interface MastersRepo extends JpaRepository<Masters, Integer>{

}
