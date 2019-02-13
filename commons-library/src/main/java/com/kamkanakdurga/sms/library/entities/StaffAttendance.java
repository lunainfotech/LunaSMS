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
@Table(name = "ap_attendance_staff")
public class StaffAttendance {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private BigInteger id;

	@Column(name = "staff_code")
	private BigInteger staffCode;

	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "attendance_status")
    private int attendanceStatus;
	
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

	public BigInteger getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(BigInteger staffCode) {
		this.staffCode = staffCode;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public int getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(int attendanceStatus) {
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
