package com.spring.test.entity;

import java.time.LocalDate;
import java.util.List;

import com.spring.test.enums.GenderType;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int studentId;
	private String firstName;
	private String lastName;
	private String userName;
	private String password;
	private LocalDate dob;
	private String fatherName;
	private Long mobileNumber;
	private Long alternateNumber;
	private String email;
	private String temporaryAddress;
	private String permanentAddress;
	private Long aadharNumber;
	private Long passportNumber;
	private String imagePath;
	private String resumePath;
	private GenderType gender;

	@OneToMany(mappedBy = "student")
	private List<TenthStd> tenthStds;

	@OneToMany(mappedBy = "student")
	private List<Degree> degrees;

	@OneToMany(mappedBy = "student")
	private List<Result> results;

	@OneToMany(mappedBy = "student")
	private List<TwelvthStd>  twelvthStds ;

	@OneToMany(mappedBy = "student")
	private List<Masters> masters;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public LocalDate getDob() {
		return dob;
	}
	
	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	
	public String getFatherName() {
		return fatherName;
	}
	
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	
	public Long getMobileNumber() {
		return mobileNumber;
	}
	
	public void setMobileNumber(Long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	public Long getAlternateNumber() {
		return alternateNumber;
	}
	public void setAlternateNumber(Long alternateNumber) {
		this.alternateNumber = alternateNumber;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTemporaryAddress() {
		return temporaryAddress;
	}
	
	public void setTemporaryAddress(String temporaryAddress) {
		this.temporaryAddress = temporaryAddress;
	}
	
	public String getPermanentAddress() {
		return permanentAddress;
	}
	
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	
	public Long getAadharNumber() {
		return aadharNumber;
	}
	
	public void setAadharNumber(Long aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	
	public Long getPassportNumber() {
		return passportNumber;
	}
	
	public void setPassportNumber(Long passportNumber) {
		this.passportNumber = passportNumber;
	}
	
	public String getImagePath() {
		return imagePath;
	}
	
	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}
	
	public String getResumePath() {
		return resumePath;
	}
	
	public void setResumePath(String resumePath) {
		this.resumePath = resumePath;
	}
	
	public GenderType getGender() {
		return gender;
	}
	
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	
	public List<TenthStd> getTenthStds() {
		return tenthStds;
	}
	
	public void setTenthStds(List<TenthStd> tenthStds) {
		this.tenthStds = tenthStds;
	}
	
	public List<Degree> getDegrees() {
		return degrees;
	}
	
	public void setDegrees(List<Degree> degrees) {
		this.degrees = degrees;
	}
	
	public List<Result> getResults() {
		return results;
	}
	
	public void setResults(List<Result> results) {
		this.results = results;
	}
	
	public List<TwelvthStd> getTwelvthStds() {
		return twelvthStds;
	}
	
	public void setTwelvthStds(List<TwelvthStd> twelvthStds) {
		this.twelvthStds = twelvthStds;
	}
	
	public List<Masters> getMasters() {
		return masters;
	}
	
	public void setMasters(List<Masters> masters) {
		this.masters = masters;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
