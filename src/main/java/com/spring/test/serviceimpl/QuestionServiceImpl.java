package com.spring.test.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.test.entity.Question;
import com.spring.test.exception.QuestionDetailNotExistException;
import com.spring.test.repo.QuestionRepo;
import com.spring.test.service.QuestionService;
import com.spring.test.util.ResponseStructure;

@Service
public class QuestionServiceImpl implements QuestionService{

	@Autowired
	private QuestionRepo questionRepo;

	@Override
	public ResponseEntity<ResponseStructure<Question>> addQuestion(Question question) {
		Question question2 = questionRepo.save(question);

		ResponseStructure<Question> responseStructure = new ResponseStructure<Question>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Question added with ID : " + question.getQuestionId());
		responseStructure.setData(question2);

		return new ResponseEntity<ResponseStructure<Question>>(responseStructure, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<ResponseStructure<Question>> updateQuestion(int questionId, Question question) {
		Question question2 = questionRepo.findById(questionId)
				.orElseThrow(() -> new QuestionDetailNotExistException("Question Details Not Found"));

		question2.setTopicName(question.getTopicName());
		question2.setDescription(question.getDescription());
		question2.setOption1(question.getOption1());
		question2.setOption2(question.getOption2());
		question2.setOption3(question.getOption3());
		question2.setOption4(question.getOption4());
		question2.setAnswer(question.getAnswer());

		Question question3 = questionRepo.save(question2);

		ResponseStructure<Question> responseStructure = new ResponseStructure<Question>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Question updated successfully");
		responseStructure.setData(question3);

		return new ResponseEntity<ResponseStructure<Question>>(responseStructure, HttpStatus.OK);

	}

	@Override
	public ResponseEntity<ResponseStructure<Question>> deleteQuestion(int questionId) {
		Question question = questionRepo.findById(questionId)
				.orElseThrow(() -> new QuestionDetailNotExistException("Question Details Not Found"));
		
		questionRepo.delete(question);
		
		ResponseStructure<Question> responseStructure = new ResponseStructure<Question>();
		responseStructure.setStatusCode(HttpStatus.OK.value());
		responseStructure.setMessage("Question deleted successfully");
		responseStructure.setData(question);

		return new ResponseEntity<ResponseStructure<Question>>(responseStructure, HttpStatus.OK);
		
	}

	@Override
	public ResponseEntity<ResponseStructure<List<Question>>> fetchQuestion() {
	List<Question> list = questionRepo.findAll();
	
	ResponseStructure<List<Question>> responseStructure = new ResponseStructure<List<Question>>();
	responseStructure.setStatusCode(HttpStatus.OK.value());
	responseStructure.setMessage("Questions fetched successfully");
	responseStructure.setData(list);

	return new ResponseEntity<ResponseStructure<List<Question>>>(responseStructure, HttpStatus.OK);
	
	}

}
