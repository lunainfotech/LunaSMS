package com.kamkanakdurga.sms.exam.dto;

public class TermSixDTO {

	private int termSix;
	
	private int termSixAttendance;
	
	private int termSixMarks;

	public TermSixDTO( int termSix, int termSixAttendance, int termSixMarks) {
		super();
		this.termSix = termSix;
		this.termSixAttendance = termSixAttendance;
		this.termSixMarks = termSixMarks;
	}

	public int getTermSix() {
		return termSix;
	}

	public void setTermSix(int termSix) {
		this.termSix = termSix;
	}

	public int getTermSixAttendance() {
		return termSixAttendance;
	}

	public void setTermSixAttendance(int termSixAttendance) {
		this.termSixAttendance = termSixAttendance;
	}

	public int getTermSixMarks() {
		return termSixMarks;
	}

	public void setTermSixMarks(int termSixMarks) {
		this.termSixMarks = termSixMarks;
	}
	
}
