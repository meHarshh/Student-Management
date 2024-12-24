package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.Masters;
import com.spring.test.util.ResponseStructure;

public interface MastersService {

	ResponseEntity<ResponseStructure<Masters>> addMaster(Masters masters);

	ResponseEntity<ResponseStructure<List<Masters>>> getMasters();

}
