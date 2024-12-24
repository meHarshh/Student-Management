package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.spring.test.entity.TwelvthStd;
import com.spring.test.repo.TwelvthStdRepo;
import com.spring.test.service.TwelvthStdService;
import com.spring.test.util.ResponseStructure;

@Service
public class TwelvthStdServiceImpl implements TwelvthStdService{
	@Autowired
	private TwelvthStdRepo twelvthStdRepo;

	@Override
	public ResponseEntity<ResponseStructure<TwelvthStd>> addTwelvthDetail(TwelvthStd twelvthStd) {
	TwelvthStd std = twelvthStdRepo.save(twelvthStd);
	
	ResponseStructure<TwelvthStd> responseStructure = new ResponseStructure<TwelvthStd>();
	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	responseStructure.setMessage("Twelvth standard detail added successfully");
	responseStructure.setData(std);
	
	return new ResponseEntity<ResponseStructure<TwelvthStd>>(responseStructure, HttpStatus.CREATED);
	
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TwelvthStd>>> getTwelvthDetails() {
	List<TwelvthStd> list =	twelvthStdRepo.findAll();
	
	ResponseStructure<List<TwelvthStd>> responseStructure = new ResponseStructure<List<TwelvthStd>>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("Twelvth standard detail fetched successfully");
	responseStructure.setData(list);
	
	return new ResponseEntity<ResponseStructure<List<TwelvthStd>>>(responseStructure, HttpStatus.OK);
	
	}
	
	
}
