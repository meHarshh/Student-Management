package com.spring.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.BackLogInfo;

public interface BackLogInfoRepo extends JpaRepository<BackLogInfo, Integer> {

}
