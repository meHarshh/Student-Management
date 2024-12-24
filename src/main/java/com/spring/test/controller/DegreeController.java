package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.Degree;
import com.spring.test.service.DegreeService;
import com.spring.test.util.ResponseStructure;

@RestController
public class DegreeController {
	
	@Autowired
	private DegreeService degreeService;
	
	@PostMapping(value = "/admin/addDegree")
	private ResponseEntity<ResponseStructure<Degree>> addDegree(@RequestBody Degree degree){
		return degreeService.addDegree(degree);
	}
	
	@GetMapping(value = "/admin/degree")
	private ResponseEntity<ResponseStructure<List<Degree>>> getDegree(){
		return degreeService.getDegree();
	}

}
