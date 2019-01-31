package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_attendance_student")
public class StudentAttendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private BigInteger id;

	@Column(name = "student_code")
	private BigInteger studentCode;

	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "class")
	private int studentClass;
	
	@Column(name = "section")
	private int studentSection;
	
	@Column(name = "attendance_status")
    private String attendanceStatus;
	
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

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
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

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
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
