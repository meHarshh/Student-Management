package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.Test;
import com.spring.test.exception.TestIdNotFoundException;
import com.spring.test.repo.TestRepo;
import com.spring.test.service.TestService;
import com.spring.test.util.ResponseStructure;

@Service
public class TestServiceImpl implements TestService{

	@Autowired
	private TestRepo testRepo;

	@Override
	public ResponseEntity<ResponseStructure<Test>> createTest(Test test) {
		test = testRepo.save(test);

		ResponseStructure<Test> responseStructure = new ResponseStructure<Test>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Test Detail with ID :" + test.getTestId() + " of " + test.getTopicName() + " created successfully");
		responseStructure.setData(test);

		return new ResponseEntity<ResponseStructure<Test>>(responseStructure, HttpStatus.OK);	

	}

	@Override
	public ResponseEntity<ResponseStructure<Test>> updateTest(int testId, Test test) {
		Test test2 = testRepo.findById(testId)
				.orElseThrow(() -> new TestIdNotFoundException("Test Detail with ID not found"));

		test2.setTopicName(test.getTopicName());
		testRepo.save(test2);

		ResponseStructure<Test> responseStructure = new ResponseStructure<Test>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Test updated successfully");
		responseStructure.setData(test2);

		return new ResponseEntity<ResponseStructure<Test>>(responseStructure, HttpStatus.OK);	
	}

	@Override
	public ResponseEntity<ResponseStructure<Test>> deleteTest(int testId) {
		Test test = testRepo.findById(testId)
				.orElseThrow(() -> new TestIdNotFoundException("Test Detail with ID not found"));

		testRepo.delete(test);
		
		ResponseStructure<Test> responseStructure = new ResponseStructure<Test>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Test deleted successfully");
		responseStructure.setData(test);

		return new ResponseEntity<ResponseStructure<Test>>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Test>>> getTests() {
		List<Test> list =	testRepo.findAll();

		ResponseStructure<List<Test>> responseStructure = new ResponseStructure<List<Test>>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Test details fetched successfully");
		responseStructure.setData(list);

		return new ResponseEntity<ResponseStructure<List<Test>>>(responseStructure, HttpStatus.OK);

	}
	
}
