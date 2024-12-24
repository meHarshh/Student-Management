package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.Degree;
import com.spring.test.util.ResponseStructure;

public interface DegreeService {

	ResponseEntity<ResponseStructure<Degree>> addDegree(Degree degree);

	ResponseEntity<ResponseStructure<List<Degree>>> getDegree();

}
