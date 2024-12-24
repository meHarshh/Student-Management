package com.spring.test.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.spring.test.entity.Question;
import com.spring.test.util.ResponseStructure;

public interface QuestionService {

	ResponseEntity<ResponseStructure<Question>> addQuestion(Question question);

	ResponseEntity<ResponseStructure<Question>> updateQuestion(int questionId, Question question);

	ResponseEntity<ResponseStructure<Question>> deleteQuestion(int questionId);

	ResponseEntity<ResponseStructure<List<Question>>> fetchQuestion();

}
