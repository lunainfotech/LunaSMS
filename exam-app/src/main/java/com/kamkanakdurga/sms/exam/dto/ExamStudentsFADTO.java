package com.kamkanakdurga.sms.exam.dto;

import java.math.BigInteger;
import java.util.List;

public class ExamStudentsFADTO {

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

	TermFADTO examTerm;

	public ExamStudentsFADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int studentRoll,
			String studentFirstName, String studentLastName, int exam, int subject, TermFADTO examTerm) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentCode = studentCode;
		this.studentRoll = studentRoll;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.exam = exam;
		this.subject = subject;
		this.examTerm = examTerm;
	}

	public ExamStudentsFADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode,
			int exam, int subject, int termOne, int termOneAttendance,
			int termTwo, int termTwoAttendance, int termThree, int termThreeAttendance, int termFour,
			int termFourAttendance) {
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
	}

	public ExamStudentsFADTO(BigInteger id, BigInteger schoolCode, BigInteger studentCode, int studentRoll,
			String studentFirstName, String studentLastName, int exam, int subject, int termOne, int termOneAttendance,
			int termOneMarks, int termTwo, int termTwoAttendance, int termTwoMarks, int termThree,
			int termThreeAttendance, int termThreeMarks, int termFour, int termFourAttendance, int termFourMarks) {
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

	public TermFADTO getExamTerm() {
		return examTerm;
	}

	public void setExamTerm(TermFADTO examTerm) {
		this.examTerm = examTerm;
	}
	
}