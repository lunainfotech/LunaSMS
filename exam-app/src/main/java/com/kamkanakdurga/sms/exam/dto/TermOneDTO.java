package com.kamkanakdurga.sms.exam.dto;

public class TermOneDTO {
	
	private int termOne;

	private int termOneAttendance;
	
	private int termOneMarks;

	public TermOneDTO(int termOne, int termOneAttendance, int termOneMarks) {
		super();
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
		this.termOneMarks = termOneMarks;
	}

	public int getTermOne() {
		return termOne;
	}

	public void setTermOne(int termOne) {
		this.termOne = termOne;
	}

	public int getTermOneAttendance() {
		return termOneAttendance;
	}

	public void setTermOneAttendance(int termOneAttendance) {
		this.termOneAttendance = termOneAttendance;
	}

	public int getTermOneMarks() {
		return termOneMarks;
	}

	public void setTermOneMarks(int termOneMarks) {
		this.termOneMarks = termOneMarks;
	}
	
	
}
