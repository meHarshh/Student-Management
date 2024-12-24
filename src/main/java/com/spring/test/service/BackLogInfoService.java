package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.BackLogInfo;
import com.spring.test.util.ResponseStructure;

public interface BackLogInfoService {

	ResponseEntity<ResponseStructure<BackLogInfo>> addBackLog(BackLogInfo backLogInfo);

	ResponseEntity<ResponseStructure<List<BackLogInfo>>> getBackLogInfo();

}
