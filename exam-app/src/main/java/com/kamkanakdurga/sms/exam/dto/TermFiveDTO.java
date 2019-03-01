package com.kamkanakdurga.sms.exam.dto;

public class TermFiveDTO {
	
	private int termFive;
	
	private int termFiveAttendance;
	
	private int termFiveMarks;

	public TermFiveDTO(int termFive, int termFiveAttendance, int termFiveMarks) {
		super();
		this.termFive = termFive;
		this.termFiveAttendance = termFiveAttendance;
		this.termFiveMarks = termFiveMarks;
	}


	public int getTermFive() {
		return termFive;
	}

	public void setTermFive(int termFive) {
		this.termFive = termFive;
	}

	public int getTermFiveAttendance() {
		return termFiveAttendance;
	}

	public void setTermFiveAttendance(int termFiveAttendance) {
		this.termFiveAttendance = termFiveAttendance;
	}

	public int getTermFiveMarks() {
		return termFiveMarks;
	}

	public void setTermFiveMarks(int termFiveMarks) {
		this.termFiveMarks = termFiveMarks;
	}
	
}
