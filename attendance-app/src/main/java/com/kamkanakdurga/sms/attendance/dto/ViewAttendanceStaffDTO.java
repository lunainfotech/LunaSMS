package com.kamkanakdurga.sms.attendance.dto;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

public class ViewAttendanceStaffDTO {

	private BigInteger schoolCode;
	
	private BigInteger staffCode;
	
	private Date attendanceDate;
	
	private int attendanceStatus;
	
	private String staffFirstName;
	
	private String staffMiddleName;
	
	private String staffLastName;
	
	private String staffGender;
	
	private String designation;
	
	
	public ViewAttendanceStaffDTO(BigInteger schoolCode, BigInteger staffCode, 
			Date attendanceDate, int attendanceStatus, String staffFirstName, String staffMiddleName, String staffLastName,
			String staffGender, String designation) {
		super();
		this.schoolCode = schoolCode;
		this.staffCode = staffCode;
		this.attendanceDate = attendanceDate;
		this.attendanceStatus = attendanceStatus;
		this.staffFirstName = staffFirstName;
		this.staffMiddleName = staffMiddleName;
		this.staffLastName = staffLastName;
		this.staffGender = staffGender;
		this.designation = designation;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public BigInteger getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(BigInteger staffCode) {
		this.staffCode = staffCode;
	}

	public Date getAttendanceDate() {
		return attendanceDate;
	}

	public void setAttendanceDate(Date attendanceDate) {
		this.attendanceDate = attendanceDate;
	}

	public int getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(int attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffMiddleName() {
		return staffMiddleName;
	}

	public void setStaffMiddleName(String staffMiddleName) {
		this.staffMiddleName = staffMiddleName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}
	
	
	
}
