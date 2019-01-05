package com.kamkanakdurga.sms.attendance.entities;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ap_attendance_student")
public class StudentAttendanceInfo {
	
	public enum AttendanceStatus{ 
	    Present, Absent 
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private BigInteger id;

	@Column(name = "student_code")
	private BigInteger studentCode;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="school_code",referencedColumnName = "school_code", insertable = false, updatable = false)
    private StudentInfo studentInfo;
	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "class")
	private int classNo;
	
	@Column(name = "section")
	private String section;
	
	@Column(name = "attendance_status")
	@Enumerated(EnumType.STRING)
    private AttendanceStatus attendanceStatus;
	
	@Column(name = "attendance_by")
	private BigInteger attendanceBy;
	
	@Column(name = "attendance_date")
	private Timestamp attendanceDate;
	
	@Column(name = "attendance_update")
	private Timestamp attendanceUpdate;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(BigInteger studentCode) {
		this.studentCode = studentCode;
	}

	public StudentInfo getStudentInfo() {
		return studentInfo;
	}

	public void setStudentInfo(StudentInfo studentInfo) {
		this.studentInfo = studentInfo;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
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

	public AttendanceStatus getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(AttendanceStatus attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	public BigInteger getAttendanceBy() {
		return attendanceBy;
	}

	public void setAttendanceBy(BigInteger attendanceBy) {
		this.attendanceBy = attendanceBy;
	}

	public Timestamp getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(Timestamp attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public Timestamp getAttendanceUpdate() {
		return attendanceUpdate;
	}

	public void setAttendanceUpdate(Timestamp attendanceUpdate) {
		this.attendanceUpdate = attendanceUpdate;
	}

	

}
