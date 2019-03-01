package com.kamkanakdurga.sms.exam.dto;

public class TermInfoDTO {

	private int marks;

	private int attendance;
	
	private int totalMarks;

	public TermInfoDTO(int marks, int attendance, int totalMarks) {
		super();
		this.marks = marks;
		this.attendance = attendance;
		this.totalMarks = totalMarks;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public int getAttendance() {
		return attendance;
	}

	public void setAttendance(int attendance) {
		this.attendance = attendance;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}
	
	
}
