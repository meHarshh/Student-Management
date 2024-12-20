package com.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.service.BackLogInfoService;

@RestController
public class BackLogInfoController {
	@Autowired
	private BackLogInfoService backLogInfoService;

}
