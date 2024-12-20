package com.spring.test.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.test.repo.ResultRepo;
import com.spring.test.service.ResultService;

@Service
public class ResultServiceImpl implements ResultService{
	@Autowired
	private ResultRepo resultRepo;

}
