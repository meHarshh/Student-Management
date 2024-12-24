package com.spring.test.exception;

@SuppressWarnings("serial")
public class StudentIdNotExistsException extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public StudentIdNotExistsException(String message) {
		super();
		this.message = message;
	}

	public StudentIdNotExistsException() {
	
	}

}
