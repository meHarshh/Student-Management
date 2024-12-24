package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.TenthStd;
import com.spring.test.service.TenthStdService;
import com.spring.test.util.ResponseStructure;

@RestController
public class TenthStdController {
	@Autowired
	private TenthStdService tenthStdService;

	@PostMapping(value = "/admin/addTenth")
	private ResponseEntity<ResponseStructure<TenthStd>> addTenth(@RequestBody TenthStd tenthStd){
		return tenthStdService.addTenth(tenthStd);
	}
	
	@GetMapping(value = "/admin/tenth")
	private ResponseEntity<ResponseStructure<List<TenthStd>>> getTenthDetails(){
		return tenthStdService.getTenthDetails();
	}
}
