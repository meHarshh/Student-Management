package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.TwelvthStd;
import com.spring.test.service.TwelvthStdService;
import com.spring.test.util.ResponseStructure;

@RestController
public class TwelvthStdController {
	@Autowired
	private TwelvthStdService twelvthStdService;
	
	@PostMapping(value = "/admin/addTwelvth")
	private ResponseEntity<ResponseStructure<TwelvthStd>> addTwelvthDetail(@RequestBody TwelvthStd twelvthStd){
		return twelvthStdService.addTwelvthDetail(twelvthStd);
	}
	
	@GetMapping(value = "/admin/twelvth")
	private ResponseEntity<ResponseStructure<List<TwelvthStd>>> getTwelvthDetails(){
		return twelvthStdService.getTwelvthDetails();
	}
	

}
