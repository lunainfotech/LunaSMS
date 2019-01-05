package com.kamkanakdurga.sms.attendance.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import com.kamkanakdurga.sms.attendance.entities.StudentAttendanceInfo;
import com.kamkanakdurga.sms.attendance.entities.StudentAttendanceInfo.AttendanceStatus;

public class StudentAttendanceRecordDTO {
	
	private int classNo;
	
	private String section;
	
	private int rollNo;
	
	private String studentFirstName;
	
	private String studentLastName;

	@Enumerated(EnumType.STRING)
    private StudentAttendanceInfo.AttendanceStatus attendanceStatus;

	
	public StudentAttendanceRecordDTO() {
		
	}


	public StudentAttendanceRecordDTO(int classNo, String section, int rollNo, String studentFirstName,
			String studentLastName, StudentAttendanceInfo.AttendanceStatus attendanceStatus) {
		super();
		this.classNo = classNo;
		this.section = section;
		this.rollNo = rollNo;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.attendanceStatus = attendanceStatus;
	}


	public int getClassNo() {
		return classNo;
	}


	public void setClassNo(int classNo) {
		this.classNo = classNo;
	}


	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}


	public int getRollNo() {
		return rollNo;
	}


	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
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


	public StudentAttendanceInfo.AttendanceStatus getAttendanceStatus() {
		return attendanceStatus;
	}


	public void setAttendanceStatus(StudentAttendanceInfo.AttendanceStatus attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}
	
}
