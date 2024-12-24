package com.spring.test.entity;

import com.spring.test.enums.HasBackLogs;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BackLogInfo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int backLogId;
	private int studentId;
	private HasBackLogs backlogs;
	
	public int getBackLogId() {
		return backLogId;
	}
	public void setBackLogId(int backLogId) {
		this.backLogId = backLogId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public HasBackLogs getBacklogs() {
		return backlogs;
	}
	public void setBacklogs(HasBackLogs backlogs) {
		this.backlogs = backlogs;
	}
	
}
