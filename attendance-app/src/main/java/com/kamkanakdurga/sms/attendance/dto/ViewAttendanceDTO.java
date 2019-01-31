package com.kamkanakdurga.sms.attendance.dto;

import java.math.BigInteger;
import java.util.Date;

public class ViewAttendanceDTO {
	
	private BigInteger schoolCode;
	
	private BigInteger studentCode;
	
	private int studentClass;
	
	private int studentSection;
	
	private Date attendanceDate;
	
	private String attendanceStatus;
	
	private String studentFirstName;
	
	private String studentLastName;
	
	private String studentGender;
	
	private int studentRoll;

	public ViewAttendanceDTO(BigInteger schoolCode, BigInteger studentCode, int studentClass, int studentSection,
			Date attendanceDate, String attendanceStatus, String studentFirstName, String studentLastName,
			String studentGender, int studentRoll) {
		super();
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentClass = studentClass;
		this.studentSection = studentSection;
		this.attendanceDate = attendanceDate;
		this.attendanceStatus = attendanceStatus;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentGender = studentGender;
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

	public Date getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
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

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
		this.studentGender = studentGender;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

}
