package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.Result;
import com.spring.test.util.ResponseStructure;

public interface ResultService {

	ResponseEntity<ResponseStructure<Result>> addResult(Result result);

	ResponseEntity<ResponseStructure<List<Result>>> getResults();

	ResponseEntity<ResponseStructure<Result>> fetchResult(int resultId);

}
