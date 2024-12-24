package com.spring.test.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Degree {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int degreeId;
	
	@Column(name = "stu_id")
	private int studentId;
	private String stream;
	private LocalDate yeraOfPassing;
	private double percentage;
	private String collegeName;
	private String universityName;
	private String universityId;
	
	@ManyToOne
	private Student student;
	
	@OneToMany
	private List<BackLogInfo> backLogInfo;
	
	public int getDegreeId() {
		return degreeId;
	}
	public void setDegreeId(int degreeId) {
		this.degreeId = degreeId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public LocalDate getYeraOfPassing() {
		return yeraOfPassing;
	}
	public void setYeraOfPassing(LocalDate yeraOfPassing) {
		this.yeraOfPassing = yeraOfPassing;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getUniversityName() {
		return universityName;
	}
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}
	public String getUniversityId() {
		return universityId;
	}
	public void setUniversityId(String universityId) {
		this.universityId = universityId;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public List<BackLogInfo> getBackLogInfo() {
		return backLogInfo;
	}
	public void setBackLogInfo(List<BackLogInfo> backLogInfo) {
		this.backLogInfo = backLogInfo;
	}
	
}
