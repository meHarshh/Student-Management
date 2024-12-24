package com.spring.test.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.test.entity.Question;

public interface QuestionRepo extends JpaRepository<Question, Integer>{

}
