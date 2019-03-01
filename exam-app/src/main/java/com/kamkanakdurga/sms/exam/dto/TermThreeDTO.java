package com.kamkanakdurga.sms.exam.dto;

public class TermThreeDTO {

	private int termThree;

	private int termThreeAttendance;
	
	private int termThreeMarks;

	public TermThreeDTO(int termThree, int termThreeAttendance, int termThreeMarks) {
		super();
		this.termThree = termThree;
		this.termThreeAttendance = termThreeAttendance;
		this.termThreeMarks = termThreeMarks;
	}

	public int getTermThree() {
		return termThree;
	}

	public void setTermThree(int termThree) {
		this.termThree = termThree;
	}

	public int getTermThreeAttendance() {
		return termThreeAttendance;
	}

	public void setTermThreeAttendance(int termThreeAttendance) {
		this.termThreeAttendance = termThreeAttendance;
	}

	public int getTermThreeMarks() {
		return termThreeMarks;
	}

	public void setTermThreeMarks(int termThreeMarks) {
		this.termThreeMarks = termThreeMarks;
	}
	
	
}
