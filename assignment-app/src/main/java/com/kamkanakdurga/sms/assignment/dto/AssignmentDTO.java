package com.kamkanakdurga.sms.assignment.dto;

import java.math.BigInteger;
import java.util.List;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class AssignmentDTO {
	
	@ApiModelProperty(position = 0)
	private BigInteger id;

	@ApiModelProperty(position = 1)
	private Integer academicYear;
	
	@ApiModelProperty(position = 2)
	private BigInteger schoolCode;
	
	@ApiModelProperty(position = 3)
	private Integer studentClass;
	
	@ApiModelProperty(position = 4)
	private Integer studentSubject;
	
	@ApiModelProperty(position = 5)
	private String title;

	@ApiModelProperty(position = 6)
	private String description;
	
	@ApiModelProperty(position = 7)
	private List attachment;

	public AssignmentDTO(BigInteger id, Integer academicYear, BigInteger schoolCode, Integer studentClass,
			Integer studentSubject, String title, String description, List attachment) {
		super();
		this.id = id;
		this.academicYear = academicYear;
		this.schoolCode = schoolCode;
		this.studentClass = studentClass;
		this.studentSubject = studentSubject;
		this.title = title;
		this.description = description;
		this.attachment = attachment;
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

	public List getAttachment() {
		return attachment;
	}

	public void setAttachment(List attachment) {
		this.attachment = attachment;
	}
	
}
