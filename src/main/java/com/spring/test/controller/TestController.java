package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.Test;
import com.spring.test.service.TestService;
import com.spring.test.util.ResponseStructure;

@RestController
public class TestController {
	
	@Autowired
	private TestService testService;
	
	@PostMapping(value = "/admin/tests")
	private ResponseEntity<ResponseStructure<Test>> createTest(@RequestBody Test test){
		return testService.createTest(test);
	}
	
	@PutMapping(value = "/admin/tests/{testID}")
	private ResponseEntity<ResponseStructure<Test>> updateTest(@PathVariable int testId,@RequestBody Test test){
		return testService.updateTest(testId, test);
	}
	
	@DeleteMapping(value = "/admin/tests/{testId}")
	private ResponseEntity<ResponseStructure<Test>> deleteTest(@PathVariable int testId){
		return testService.deleteTest(testId);
	}
	
	@GetMapping(value = "/admin/tests")
	private ResponseEntity<ResponseStructure<List<Test>>> getTests(){
		return testService.getTests();
	}

}
