package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.Test;
import com.spring.test.util.ResponseStructure;

public interface TestService {

	ResponseEntity<ResponseStructure<Test>> createTest(Test test);

	ResponseEntity<ResponseStructure<Test>> updateTest(int testId, Test test);

	ResponseEntity<ResponseStructure<Test>> deleteTest(int testId);

	ResponseEntity<ResponseStructure<List<Test>>> getTests();

}
