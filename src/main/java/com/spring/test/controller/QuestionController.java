package com.spring.test.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.Question;
import com.spring.test.service.QuestionService;
import com.spring.test.util.ResponseStructure;

@RestController
public class QuestionController {
	
	@Autowired
	private QuestionService questionService;
	
	@PostMapping(value = "/admin/questions")
	private ResponseEntity<ResponseStructure<Question>> addQuestion(@RequestBody Question question){
		return questionService.addQuestion(question);
	}
	
	@PutMapping(value = "/admin/questions/{questionId}")
	private ResponseEntity<ResponseStructure<Question>> updateQuestion(@PathVariable int questionId, @RequestBody Question question){
		return questionService.updateQuestion(questionId, question);
	}
	
	@DeleteMapping(value = "/admin/questions/{questionId}")
	private ResponseEntity<ResponseStructure<Question>> deleteQuestion(@PathVariable int questionId){
		return questionService.deleteQuestion(questionId);
	}
	
	@GetMapping(value = "/admin/questions")
	private ResponseEntity<ResponseStructure<List<Question>>> fetchQuestion(){
		return questionService.fetchQuestion();
	}
	
}
	
	
	


