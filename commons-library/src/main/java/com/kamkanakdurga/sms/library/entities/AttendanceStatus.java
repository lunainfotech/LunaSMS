package com.kamkanakdurga.sms.library.entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_attendance_status")
public class AttendanceStatus {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private int id;

	@Column(name = "status")
	private String attendanceStatus;

	@Column(name = "creation_date")
	private Timestamp attendanceDate;
	
	@Column(name = "update_update")
	private Timestamp attendanceUpdate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAttendanceStatus() {
		return attendanceStatus;
	}

	public void setAttendanceStatus(String attendanceStatus) {
		this.attendanceStatus = attendanceStatus;
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
