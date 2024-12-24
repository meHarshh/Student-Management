package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.Result;
import com.spring.test.exception.ResultDetailNotFoundException;
import com.spring.test.repo.ResultRepo;
import com.spring.test.service.ResultService;
import com.spring.test.util.ResponseStructure;

@Service
public class ResultServiceImpl implements ResultService{
	@Autowired
	private ResultRepo resultRepo;

	@Override
	public ResponseEntity<ResponseStructure<Result>> addResult(Result result) {
	Result result2 = resultRepo.save(result);
	
	ResponseStructure<Result> responseStructure = new ResponseStructure<Result>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("Result added successfully");
	responseStructure.setData(result2);
	
	return new ResponseEntity<ResponseStructure<Result>>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Result>>> getResults() {
	List<Result> list =	resultRepo.findAll();
	
	ResponseStructure<List<Result>> responseStructure = new ResponseStructure<List<Result>>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("Results fetched successfully");
	responseStructure.setData(list);
	
	return new ResponseEntity<ResponseStructure<List<Result>>>(responseStructure, HttpStatus.OK);
	
	}

	@Override
	public ResponseEntity<ResponseStructure<Result>> fetchResult(int resultId) {
	Result result =	resultRepo.findById(resultId)
		.orElseThrow(() -> new ResultDetailNotFoundException("Result details not found for ID"));
	
	ResponseStructure<Result> responseStructure = new ResponseStructure<Result>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("Result with Id fetched successfully");
	responseStructure.setData(result);
	
	return new ResponseEntity<ResponseStructure<Result>>(responseStructure, HttpStatus.OK);
	}

}
