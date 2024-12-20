package com.spring.test.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.test.repo.TestRepo;
import com.spring.test.service.TestService;

@Service
public class TestServiceImpl implements TestService{
	
	@Autowired
	private TestRepo testRepo;
	
	

}
