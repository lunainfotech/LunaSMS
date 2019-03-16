package com.kamkanakdurga.sms.exam.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class TermFADTO {
	
	@ApiModelProperty(position = 1)
	private TermInfoDTO T1;
	
	@ApiModelProperty(position = 2)
	private TermInfoDTO T2;
	
	@ApiModelProperty(position = 3)
	private TermInfoDTO T3;
	
	@ApiModelProperty(position = 4)
	private TermInfoDTO T4;

	public TermFADTO(TermInfoDTO t1, TermInfoDTO t2, TermInfoDTO t3, TermInfoDTO t4) {
		super();
		T1 = t1;
		T2 = t2;
		T3 = t3;
		T4 = t4;
	}

	public TermInfoDTO getT1() {
		return T1;
	}

	public void setT1(TermInfoDTO t1) {
		T1 = t1;
	}

	public TermInfoDTO getT2() {
		return T2;
	}

	public void setT2(TermInfoDTO t2) {
		T2 = t2;
	}

	public TermInfoDTO getT3() {
		return T3;
	}

	public void setT3(TermInfoDTO t3) {
		T3 = t3;
	}

	public TermInfoDTO getT4() {
		return T4;
	}

	public void setT4(TermInfoDTO t4) {
		T4 = t4;
	}
	
	
	/*private int termOne;

	private int termOneAttendance;
	
	private int termOneMarks;

	private int termTwo;

	private int termTwoAttendance;
	
	private int termTwoMarks;

	private int termThree;

	private int termThreeAttendance;
	
	private int termThreeMarks;

	private int termFour;

	private int termFourAttendance;
	
	private int termFourMarks;

	public TermFADTO(int termOne, int termOneAttendance, int termOneMarks, int termTwo, int termTwoAttendance,
			int termTwoMarks, int termThree, int termThreeAttendance, int termThreeMarks, int termFour,
			int termFourAttendance, int termFourMarks) {
		super();
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
		this.termOneMarks = termOneMarks;
		this.termTwo = termTwo;
		this.termTwoAttendance = termTwoAttendance;
		this.termTwoMarks = termTwoMarks;
		this.termThree = termThree;
		this.termThreeAttendance = termThreeAttendance;
		this.termThreeMarks = termThreeMarks;
		this.termFour = termFour;
		this.termFourAttendance = termFourAttendance;
		this.termFourMarks = termFourMarks;
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
	
	*/
	
	
}
