package com.spring.test.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TenthStd {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tenthId;
	
	private int studentId;
	private String boardName;
	private LocalDate yearOfPassing;
	private double percentage;
	private String schoolName;
	
	@ManyToOne
	private Student student;
	
	public int getTenthId() {
		return tenthId;
	}
	public void setTenthId(int tenthId) {
		this.tenthId = tenthId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public LocalDate getYearOfPassing() {
		return yearOfPassing;
	}
	public void setYearOfPassing(LocalDate yearOfPassing) {
		this.yearOfPassing = yearOfPassing;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getSchoolName() {
		return schoolName;
	}
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	
}
