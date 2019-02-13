package com.kamkanakdurga.sms.exam.dto;

import java.math.BigInteger;

import io.swagger.annotations.ApiModelProperty;

public class StudentDTO {
	
	@ApiModelProperty(position = 0)
	private BigInteger schoolCode;
	
	@ApiModelProperty(position = 1)
	private BigInteger studentCode;
	
	@ApiModelProperty(position = 2)
	private int studentRoll;
	
	@ApiModelProperty(position = 3)
	private String studentFirstName;

	@ApiModelProperty(position = 4)
	private String studentLastName;
	
	@ApiModelProperty(position = 5)
	private int studentClass;
	
	@ApiModelProperty(position = 6)
	private int studentSection;

	
	public StudentDTO(BigInteger schoolCode, BigInteger studentCode, String studentFirstName,
			String studentLastName, int studentClass, int studentSection, int studentRoll) {
		super();
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentClass = studentClass;
		this.studentSection = studentSection;
		this.studentRoll = studentRoll;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public BigInteger getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(BigInteger studentCode) {
		this.studentCode = studentCode;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}

	public int getStudentSection() {
		return studentSection;
	}

	public void setStudentSection(int studentSection) {
		this.studentSection = studentSection;
	}
	
	
}
