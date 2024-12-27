package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.Masters;
import com.spring.test.repo.MastersRepo;
import com.spring.test.service.MastersService;
import com.spring.test.util.ResponseStructure;

@Service
public class MastersServiceImpl implements MastersService{
	@Autowired
	private MastersRepo mastersRepo;

	@Override
	public ResponseEntity<ResponseStructure<Masters>> addMaster(Masters masters) {
	Masters masters2 =	mastersRepo.save(masters);
	
	ResponseStructure<Masters> responseStructure = new ResponseStructure<Masters>();
	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	responseStructure.setMessage("Master Details added successfully");
	responseStructure.setData(masters2);
	
	return new ResponseEntity<ResponseStructure<Masters>>(responseStructure, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Masters>>> getMasters() {
	List<Masters> list = mastersRepo.findAll();
	
	ResponseStructure<List<Masters>> responseStructure = new ResponseStructure<List<Masters>>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("Masters Details fetched successfully");
	responseStructure.setData(list);
	
	return new ResponseEntity<ResponseStructure<List<Masters>>>(responseStructure, HttpStatus.OK);
	}

}
