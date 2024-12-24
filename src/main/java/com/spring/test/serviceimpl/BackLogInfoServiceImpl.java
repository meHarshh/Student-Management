package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.BackLogInfo;
import com.spring.test.repo.BackLogInfoRepo;
import com.spring.test.service.BackLogInfoService;
import com.spring.test.util.ResponseStructure;

@Service
public class BackLogInfoServiceImpl implements BackLogInfoService {
	
	@Autowired
	private BackLogInfoRepo backLogInfoRepo;

	@Override
	public ResponseEntity<ResponseStructure<BackLogInfo>> addBackLog(BackLogInfo backLogInfo) {
	BackLogInfo backLogInfo2 = backLogInfoRepo.save(backLogInfo);
	
	ResponseStructure<BackLogInfo> responseStructure = new ResponseStructure<BackLogInfo>();
	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	responseStructure.setMessage("BackLog Details added successfully");
	responseStructure.setData(backLogInfo2);

	return new ResponseEntity<ResponseStructure<BackLogInfo>>(responseStructure, HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<ResponseStructure<List<BackLogInfo>>> getBackLogInfo() {
	List<BackLogInfo> list = backLogInfoRepo.findAll();
	
	ResponseStructure<List<BackLogInfo>> responseStructure = new ResponseStructure<List<BackLogInfo>>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("BackLog Details fetched successfully");
	responseStructure.setData(list);

	return new ResponseEntity<ResponseStructure<List<BackLogInfo>>>(responseStructure, HttpStatus.OK);
	}
	

}
