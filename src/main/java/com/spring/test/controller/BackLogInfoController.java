package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.BackLogInfo;
import com.spring.test.service.BackLogInfoService;
import com.spring.test.util.ResponseStructure;

@RestController
public class BackLogInfoController {
	@Autowired
	private BackLogInfoService backLogInfoService;
	
	@PostMapping(value = "/admin/backlogInfo")
	private ResponseEntity<ResponseStructure<BackLogInfo>> addBackLog(@RequestBody BackLogInfo backLogInfo){
		return backLogInfoService.addBackLog(backLogInfo);
	}
	
	@GetMapping(value = "/admin/backlogs")
	private ResponseEntity<ResponseStructure<List<BackLogInfo>>> getBackLogInfo(){
		return backLogInfoService.getBackLogInfo();
	}

}
