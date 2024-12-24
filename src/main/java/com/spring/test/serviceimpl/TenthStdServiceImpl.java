package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.TenthStd;
import com.spring.test.repo.TenthStdRepo;
import com.spring.test.service.TenthStdService;
import com.spring.test.util.ResponseStructure;

@Service
public class TenthStdServiceImpl implements TenthStdService {
	@Autowired
	private TenthStdRepo tenthStdRepo;

	@Override
	public ResponseEntity<ResponseStructure<TenthStd>> addTenth(TenthStd tenthStd) {
	TenthStd std = tenthStdRepo.save(tenthStd);
	
	ResponseStructure<TenthStd> responseStructure = new ResponseStructure<TenthStd>();
	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	responseStructure.setMessage("Tenth standard details Added Successfully");
	responseStructure.setData(std);
	
	return new ResponseEntity<ResponseStructure<TenthStd>>(responseStructure, HttpStatus.CREATED);
	
	}

	@Override
	public ResponseEntity<ResponseStructure<List<TenthStd>>> getTenthDetails() {
	List<TenthStd> list = tenthStdRepo.findAll();
	
	ResponseStructure<List<TenthStd>> responseStructure = new ResponseStructure<List<TenthStd>>();
	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	responseStructure.setMessage("Tenth standard details fetched Successfully");
	responseStructure.setData(list);
	
	return new ResponseEntity<ResponseStructure<List<TenthStd>>>(responseStructure, HttpStatus.CREATED);
	}
	

}
