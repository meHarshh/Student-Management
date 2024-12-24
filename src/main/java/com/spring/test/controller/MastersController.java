package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.Masters;
import com.spring.test.service.MastersService;
import com.spring.test.util.ResponseStructure;

@RestController
public class MastersController {
	
	@Autowired
	private MastersService mastersService;
	
	@PostMapping(value = "/admin/addMasters")
	private ResponseEntity<ResponseStructure<Masters>> addMaster(@RequestBody Masters masters){
		return mastersService.addMaster(masters);
	}
	
	@GetMapping(value = "/admin/masters")
	private ResponseEntity<ResponseStructure<List<Masters>>> getMasters(){
		return mastersService.getMasters();
	}

}
