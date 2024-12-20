package com.spring.test.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int resultId;
	
	private int studentId;
	private String topicName;
	private LocalDate testDate;
	private int totalQuestions;
	private int correctAnswers;
	private int incorrectAnswer;
	private int unattempted;
	private double score;
	private double percentage;
	private String resultStatus;
	
	@ManyToOne
	private Student student;
	
	public int getResultId() {
		return resultId;
	}
	public void setResultId(int resultId) {
		this.resultId = resultId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getTopicName() {
		return topicName;
	}
	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}
	public LocalDate getTestDate() {
		return testDate;
	}
	public void setTestDate(LocalDate testDate) {
		this.testDate = testDate;
	}
	public int getTotalQuestions() {
		return totalQuestions;
	}
	public void setTotalQuestions(int totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	public int getCorrectAnswers() {
		return correctAnswers;
	}
	public void setCorrectAnswers(int correctAnswers) {
		this.correctAnswers = correctAnswers;
	}
	public int getIncorrectAnswer() {
		return incorrectAnswer;
	}
	public void setIncorrectAnswer(int incorrectAnswer) {
		this.incorrectAnswer = incorrectAnswer;
	}
	public int getUnattempted() {
		return unattempted;
	}
	public void setUnattempted(int unattempted) {
		this.unattempted = unattempted;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getResultStatus() {
		return resultStatus;
	}
	public void setResultStatus(String resultStatus) {
		this.resultStatus = resultStatus;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
	
}
