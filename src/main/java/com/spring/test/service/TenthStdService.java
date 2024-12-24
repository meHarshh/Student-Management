package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.TenthStd;
import com.spring.test.util.ResponseStructure;

public interface TenthStdService {

	ResponseEntity<ResponseStructure<TenthStd>> addTenth(TenthStd tenthStd);

	ResponseEntity<ResponseStructure<List<TenthStd>>> getTenthDetails();

}
