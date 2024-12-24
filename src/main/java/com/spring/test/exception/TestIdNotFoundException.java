package com.spring.test.exception;

@SuppressWarnings("serial")
public class TestIdNotFoundException extends RuntimeException {
	
	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public TestIdNotFoundException(String message) {
		super();
		this.message = message;
	}

	public TestIdNotFoundException() {

	}

}
