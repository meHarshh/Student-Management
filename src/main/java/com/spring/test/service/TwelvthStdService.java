package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.TwelvthStd;
import com.spring.test.util.ResponseStructure;

public interface TwelvthStdService {

	ResponseEntity<ResponseStructure<TwelvthStd>> addTwelvthDetail(TwelvthStd twelvthStd);

	ResponseEntity<ResponseStructure<List<TwelvthStd>>> getTwelvthDetails();

}
