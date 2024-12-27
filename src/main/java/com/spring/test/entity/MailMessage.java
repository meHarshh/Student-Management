package com.spring.test.entity;

public class MailMessage {
	
	private String to;
	private String subject = "Verify the OTP sent through the mail";
	
	public String getTo() {
		return to;
	}
	
	public void setTo(String to) {
		this.to = to;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	@Override
	public String toString() {
		return "MailMessage [to=" + to + ", subject=" + subject + "]";
	}

	public MailMessage() {
		
	}
}
