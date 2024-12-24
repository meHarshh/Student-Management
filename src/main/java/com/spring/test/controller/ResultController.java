package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.Result;
import com.spring.test.service.ResultService;
import com.spring.test.util.ResponseStructure;

@RestController
public class ResultController {
	
	@Autowired
	private ResultService resultService;
	
	@PostMapping(value = "/admin/addResult")
	private ResponseEntity<ResponseStructure<Result>> addResult(@RequestBody Result result){
		return resultService.addResult(result);
	}
	
	@GetMapping(value = "/admin/results")
	private ResponseEntity<ResponseStructure<List<Result>>> getResults(){
		return resultService.getResults();
	}
	
	@GetMapping(value = "/admin/results/{resultId}")
	private ResponseEntity<ResponseStructure<Result>> fetchResult(@PathVariable int resultId){
		return resultService.fetchResult(resultId);
	}

}
