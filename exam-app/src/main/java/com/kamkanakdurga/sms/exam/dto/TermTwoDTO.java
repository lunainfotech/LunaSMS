package com.kamkanakdurga.sms.exam.dto;

public class TermTwoDTO {

	private int termTwo;

	private int termTwoAttendance;
	
	private int termTwoMarks;

	public TermTwoDTO(int termTwo, int termTwoAttendance, int termTwoMarks) {
		super();
		this.termTwo = termTwo;
		this.termTwoAttendance = termTwoAttendance;
		this.termTwoMarks = termTwoMarks;
	}


	public int getTermTwo() {
		return termTwo;
	}

	public void setTermTwo(int termTwo) {
		this.termTwo = termTwo;
	}

	public int getTermTwoAttendance() {
		return termTwoAttendance;
	}

	public void setTermTwoAttendance(int termTwoAttendance) {
		this.termTwoAttendance = termTwoAttendance;
	}

	public int getTermTwoMarks() {
		return termTwoMarks;
	}

	public void setTermTwoMarks(int termTwoMarks) {
		this.termTwoMarks = termTwoMarks;
	}
	
	
}
