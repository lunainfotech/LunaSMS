package com.kamkanakdurga.sms.exam.dto;

import java.math.BigInteger;

public class DisplayTermSixSADTO {
	
	private BigInteger id;
	
	private BigInteger schoolCode;

	private BigInteger studentCode;

	private int studentRoll;

	private String studentFirstName;

	private String studentLastName;

	private int exam;

	private int subject;

	TermSixSADTO examTerm;

	public DisplayTermSixSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int studentRoll,
			String studentFirstName, String studentLastName, int exam, int subject, TermSixSADTO examTerm) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentRoll = studentRoll;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.exam = exam;
		this.subject = subject;
		this.examTerm = examTerm;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
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

	public int getExam() {
		return exam;
	}

	public void setExam(int exam) {
		this.exam = exam;
	}

	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
	}

	public TermSixSADTO getExamTerm() {
		return examTerm;
	}

	public void setExamTerm(TermSixSADTO examTerm) {
		this.examTerm = examTerm;
	}
	
	

}
