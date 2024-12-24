package com.spring.test.exception;

@SuppressWarnings("serial")
public class InvalidEmailException extends RuntimeException {
 
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public InvalidEmailException(String message) {
		super();
		this.message = message;
	}

	public InvalidEmailException() {
		
	}
	
}
