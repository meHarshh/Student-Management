package com.spring.test.exception;

@SuppressWarnings("serial")
public class StudentExistById extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StudentExistById(String message) {
		super();
		this.message = message;
	}

	public StudentExistById() {
		
	}

}
