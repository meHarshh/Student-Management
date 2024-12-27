package com.spring.test.serviceimpl;

import java.util.Date;
import java.util.Random;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.spring.test.entity.MailMessage;
import com.spring.test.service.MailMessageService;

import jakarta.mail.internet.MimeMessage;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MailMessageServiceImpl implements MailMessageService{

	private JavaMailSender javaMailSender;
	
	@Override
	public String sendMailMessage(MailMessage mailMessage) {
	String name = "Harsh";
		
		String otp = String.valueOf(new Random().nextInt(1000, 9999));
		String text = "<div style='font-family: Arial, sans-serif; max-width: 600px; margin: auto; padding: 20px; border: 1px solid #e0e0e0; border-radius: 10px; background-color: #ffffff;'>"
				+ "<div style='text-align: center; padding-bottom: 20px;'>"
				+ "<img src='https://assetsglobal.in/images/img/logo.png' style='height: 100px; width: auto;'>"
				+ "</div>" + "<p style='font-size: 16px; color: #333;'>Hi <strong>" + name + "</strong>,</p>"
				+ "<p style='font-size: 16px; color: #333;'>Thank you for showing interest in property posting with kingsmen.</p>"
				+ "<p style='font-size: 16px; color: #333;'>Please verify your email address using the OTP provided below:</p>"
				+ "<div style='text-align: center; margin: 20px 0; padding: 20px; border: 1px solid #e0e0e0; border-radius: 10px; background-color: #f0f8ff;'>"
				+ "<h1 style='color: #1e90ff; font-size: 32px; margin: 0;'>" + otp + "</h1>" + "</div>"
				+ "<p style='font-size: 16px; color: #333;'>Best Regards,</p>"
				+ "<p style='font-size: 16px; color: #333;'><strong>Kingsmen realty</strong></p>" + "</div>";
		
		try {
		MimeMessage message = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true);
		
		helper.setTo(mailMessage.getTo());
		helper.setSubject(mailMessage.getSubject());
		helper.setText(text, true);
		helper.setSentDate(new Date());
		
		javaMailSender.send(message);
		
		return "success";
		
	}catch(Exception e) {
		e.printStackTrace();
		return "null";
	}

   }
}
