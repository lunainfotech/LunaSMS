package com.kamkanakdurga.sms.exam.dto;

public class TermFourDTO {

	private int termFour;

	private int termFourAttendance;
	
	private int termFourMarks;

	public TermFourDTO(int termFour, int termFourAttendance, int termFourMarks) {
		super();
		this.termFour = termFour;
		this.termFourAttendance = termFourAttendance;
		this.termFourMarks = termFourMarks;
	}

	public int getTermFour() {
		return termFour;
	}

	public void setTermFour(int termFour) {
		this.termFour = termFour;
	}

	public int getTermFourAttendance() {
		return termFourAttendance;
	}

	public void setTermFourAttendance(int termFourAttendance) {
		this.termFourAttendance = termFourAttendance;
	}

	public int getTermFourMarks() {
		return termFourMarks;
	}

	public void setTermFourMarks(int termFourMarks) {
		this.termFourMarks = termFourMarks;
	}
	
	
}
