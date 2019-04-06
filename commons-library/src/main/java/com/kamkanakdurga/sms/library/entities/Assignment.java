package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_assignment")
public class Assignment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	@Column(name = "academic_year")
	private Integer academicYear;
	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "class")
	private Integer studentClass;
	
	@Column(name = "subject")
	private Integer studentSubject;
	
	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;
	
	public Assignment() {
		
	}
	
	public Assignment(BigInteger id, Integer academicYear, BigInteger schoolCode, Integer studentClass,
			Integer studentSubject, String title, String description) {
		super();
		this.id = id;
		this.academicYear = academicYear;
		this.schoolCode = schoolCode;
		this.studentClass = studentClass;
		this.studentSubject = studentSubject;
		this.title = title;
		this.description = description;
	}

	public Assignment(BigInteger schoolCode, Integer studentClass, Integer studentSubject) {
		super();
		this.schoolCode = schoolCode;
		this.studentClass = studentClass;
		this.studentSubject = studentSubject;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public Integer getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(Integer academicYear) {
		this.academicYear = academicYear;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public Integer getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Integer studentClass) {
		this.studentClass = studentClass;
	}

	public Integer getStudentSubject() {
		return studentSubject;
	}

	public void setStudentSubject(Integer studentSubject) {
		this.studentSubject = studentSubject;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	
	
}
