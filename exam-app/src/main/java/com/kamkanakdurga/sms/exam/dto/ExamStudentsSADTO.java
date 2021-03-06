package com.kamkanakdurga.sms.exam.dto;

import java.math.BigInteger;

public class ExamStudentsSADTO {
	
	private BigInteger id;
	
	private BigInteger schoolCode;

	private BigInteger studentCode;

	private int studentRoll;

	private String studentFirstName;

	private String studentLastName;

	private int exam;

	private int subject;

	private int termOne;

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
	
	private int termFive;
	
	private int termFiveAttendance;
	
	private int termFiveMarks;

	private int termSix;
	
	private int termSixAttendance;
	
	private int termSixMarks;

	private int termSeven;
	
	private int termSevenAttendance;
	
	private int termSevenMarks;

	private int termEight;
	
	private int termEightAttendance;
	
	private int termEightMarks;

	private int termNine;
	
	private int termNineAttendance;
	
	private int termNineMarks;

	private int termTen;
	
	private int termTenAttendance;
	
	private int termTenMarks;

	private int termEleven;
	
	private int termElevenAttendance;
	
	private int termElevenMarks;

	private int termTwelve;
	
	private int termTwelveAttendance;
	
	private int termTwelveMarks;
	
	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int exam, int subject, int termOne, int termOneAttendance) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.exam = exam;
		this.subject = subject;
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
	}
	
	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int studentRoll, String studentFirstName,
			String studentLastName, int exam, int subject, int termOne, int termOneAttendance, int termOneMarks) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentRoll = studentRoll;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.exam = exam;
		this.subject = subject;
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
		this.termOneMarks = termOneMarks;
	}
	
	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int exam, int subject, int termOne, int termOneAttendance, int termTwo, int termTwoAttendance, int termThree, int termThreeAttendance) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.exam = exam;
		this.subject = subject;
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
		this.termTwo = termTwo;
		this.termTwoAttendance = termTwoAttendance;
		this.termThree = termThree;
		this.termThreeAttendance = termThreeAttendance;
	}
	

	
	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int studentRoll,
			String studentFirstName, String studentLastName, int exam, int subject, int termOne, int termOneAttendance,
			int termOneMarks, int termTwo, int termTwoAttendance, int termTwoMarks, int termThree,
			int termThreeAttendance, int termThreeMarks) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentRoll = studentRoll;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.exam = exam;
		this.subject = subject;
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
		this.termOneMarks = termOneMarks;
		this.termTwo = termTwo;
		this.termTwoAttendance = termTwoAttendance;
		this.termTwoMarks = termTwoMarks;
		this.termThree = termThree;
		this.termThreeAttendance = termThreeAttendance;
		this.termThreeMarks = termThreeMarks;
	}

	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int exam, int subject, int termOne, int termOneAttendance, int termTwo, int termTwoAttendance, int termThree, int termThreeAttendance, int termFour, int termFourAttendance, int termFive, int termFiveAttendance) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.exam = exam;
		this.subject = subject;
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
		this.termTwo = termTwo;
		this.termTwoAttendance = termTwoAttendance;
		this.termThree = termThree;
		this.termThreeAttendance = termThreeAttendance;
		this.termFour = termFour;
		this.termFourAttendance = termFourAttendance;
		this.termFive = termFive;
		this.termFiveAttendance = termFiveAttendance;
	}
	

	
	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int studentRoll,
			String studentFirstName, String studentLastName, int exam, int subject, int termOne, int termOneAttendance,
			int termOneMarks, int termTwo, int termTwoAttendance, int termTwoMarks, int termThree,
			int termThreeAttendance, int termThreeMarks, int termFour, int termFourAttendance, int termFourMarks,
			int termFive, int termFiveAttendance, int termFiveMarks) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentRoll = studentRoll;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.exam = exam;
		this.subject = subject;
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
		this.termFive = termFive;
		this.termFiveAttendance = termFiveAttendance;
		this.termFiveMarks = termFiveMarks;
	}

	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int exam, int subject, int termOne, int termOneAttendance, int termTwo, int termTwoAttendance, int termThree, int termThreeAttendance, int termFour, int termFourAttendance, int termFive, int termFiveAttendance, int termSix, int termSixAttendance) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.exam = exam;
		this.subject = subject;
		this.termOne = termOne;
		this.termOneAttendance = termOneAttendance;
		this.termTwo = termTwo;
		this.termTwoAttendance = termTwoAttendance;
		this.termThree = termThree;
		this.termThreeAttendance = termThreeAttendance;
		this.termFour = termFour;
		this.termFourAttendance = termFourAttendance;
		this.termFive = termFive;
		this.termFiveAttendance = termFiveAttendance;
		this.termSix = termSix;
		this.termSixAttendance = termSixAttendance;
	}
	

	
	public ExamStudentsSADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int studentRoll,
			String studentFirstName, String studentLastName, int exam, int subject, int termOne, int termOneAttendance,
			int termOneMarks, int termTwo, int termTwoAttendance, int termTwoMarks, int termThree,
			int termThreeAttendance, int termThreeMarks, int termFour, int termFourAttendance, int termFourMarks,
			int termFive, int termFiveAttendance, int termFiveMarks, int termSix, int termSixAttendance,
			int termSixMarks) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentRoll = studentRoll;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.exam = exam;
		this.subject = subject;
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
		this.termFive = termFive;
		this.termFiveAttendance = termFiveAttendance;
		this.termFiveMarks = termFiveMarks;
		this.termSix = termSix;
		this.termSixAttendance = termSixAttendance;
		this.termSixMarks = termSixMarks;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public BigInteger getStudentCode() {
		return studentCode;
	}

	public void setStudentCode(BigInteger studentCode) {
		this.studentCode = studentCode;
	}

	public int getStudentRoll() {
		return studentRoll;
	}

	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getExam() {
		return exam;
	}

	public void setExam(int exam) {
		this.exam = exam;
	}

	public int getSubject() {
		return subject;
	}

	public void setSubject(int subject) {
		this.subject = subject;
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

	public int getTermSeven() {
		return termSeven;
	}

	public void setTermSeven(int termSeven) {
		this.termSeven = termSeven;
	}

	public int getTermSevenAttendance() {
		return termSevenAttendance;
	}

	public void setTermSevenAttendance(int termSevenAttendance) {
		this.termSevenAttendance = termSevenAttendance;
	}

	public int getTermEight() {
		return termEight;
	}

	public void setTermEight(int termEight) {
		this.termEight = termEight;
	}

	public int getTermEightAttendance() {
		return termEightAttendance;
	}

	public void setTermEightAttendance(int termEightAttendance) {
		this.termEightAttendance = termEightAttendance;
	}

	public int getTermNine() {
		return termNine;
	}

	public void setTermNine(int termNine) {
		this.termNine = termNine;
	}

	public int getTermNineAttendance() {
		return termNineAttendance;
	}

	public void setTermNineAttendance(int termNineAttendance) {
		this.termNineAttendance = termNineAttendance;
	}

	public int getTermTen() {
		return termTen;
	}

	public void setTermTen(int termTen) {
		this.termTen = termTen;
	}

	public int getTermTenAttendance() {
		return termTenAttendance;
	}

	public void setTermTenAttendance(int termTenAttendance) {
		this.termTenAttendance = termTenAttendance;
	}

	public int getTermEleven() {
		return termEleven;
	}

	public void setTermEleven(int termEleven) {
		this.termEleven = termEleven;
	}

	public int getTermElevenAttendance() {
		return termElevenAttendance;
	}

	public void setTermElevenAttendance(int termElevenAttendance) {
		this.termElevenAttendance = termElevenAttendance;
	}

	public int getTermTwelve() {
		return termTwelve;
	}

	public void setTermTwelve(int termTwelve) {
		this.termTwelve = termTwelve;
	}

	public int getTermTwelveAttendance() {
		return termTwelveAttendance;
	}

	public void setTermTwelveAttendance(int termTwelveAttendance) {
		this.termTwelveAttendance = termTwelveAttendance;
	}
}
