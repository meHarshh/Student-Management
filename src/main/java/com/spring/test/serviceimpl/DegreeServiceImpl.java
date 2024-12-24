package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.Degree;
import com.spring.test.repo.DegreeRepo;
import com.spring.test.service.DegreeService;
import com.spring.test.util.ResponseStructure;

@Service
public class DegreeServiceImpl implements DegreeService{
	@Autowired
	private DegreeRepo degreeRepo;

	@Override
	public ResponseEntity<ResponseStructure<Degree>> addDegree(Degree degree) {
	Degree degree2 = degreeRepo.save(degree);
	
	ResponseStructure<Degree> responseStructure = new ResponseStructure<Degree>();
	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	responseStructure.setMessage("Degree Details added successfully");
	responseStructure.setData(degree2);
	
	return new ResponseEntity<ResponseStructure<Degree>>(responseStructure, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Degree>>> getDegree() {
	List<Degree> list =	degreeRepo.findAll();
	
	ResponseStructure<List<Degree>> responseStructure = new ResponseStructure<List<Degree>>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("Degree Details fetched successfully");
	responseStructure.setData(list);
	
	return new ResponseEntity<ResponseStructure<List<Degree>>>(responseStructure, HttpStatus.OK);
	}
	

}
