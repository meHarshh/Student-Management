package com.spring.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.entity.MailMessage;
import com.spring.test.service.MailMessageService;

@RestController
public class MailMessageController {
	
	@Autowired
	private MailMessageService messageService;
	
	@PostMapping(value = "/sendMail")
	private String sendMailMessage(@RequestBody MailMessage mailMessage) {
		return messageService.sendMailMessage(mailMessage);
	}

}
