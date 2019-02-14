package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_marks_sa")
public class MarksSA {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	
	@Column(name = "academic_year")
	private int academicYear;	
	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "student_code")
	private BigInteger studentCode;
	
	@Column(name = "class")
	private int classId;
	
	@Column(name = "exam")
	private int exam;
	
	@Column(name = "subject")
	private int subject;
	
	@Column(name = "term_1")
	private int termOne;
	
	@Column(name = "term_1_attendance")
	private int termOneAttendance;

	@Column(name = "term_2")
	private int termTwo;
	
	@Column(name = "term_2_attendance")
	private int termTwoAttendance;

	@Column(name = "term_3")
	private int termThree;
	
	@Column(name = "term_3_attendance")
	private int termThreeAttendance;

	@Column(name = "term_4")
	private int termFour;
	
	@Column(name = "term_4_attendance")
	private int termFourAttendance;

	@Column(name = "term_5")
	private int termFive;
	
	@Column(name = "term_5_attendance")
	private int termFiveAttendance;

	@Column(name = "term_6")
	private int termSix;
	
	@Column(name = "term_6_attendance")
	private int termSixAttendance;

	@Column(name = "term_7")
	private int termSeven;
	
	@Column(name = "term_7_attendance")
	private int termSevenAttendance;

	@Column(name = "term_8")
	private int termEight;
	
	@Column(name = "term_8_attendance")
	private int termEightAttendance;

	@Column(name = "term_9")
	private int termNine;
	
	@Column(name = "term_9_attendance")
	private int termNineAttendance;

	@Column(name = "term_10")
	private int termTen;
	
	@Column(name = "term_10_attendance")
	private int termTenAttendance;

	@Column(name = "term_11")
	private int termEleven;
	
	@Column(name = "term_11_attendance")
	private int termElevenAttendance;

	@Column(name = "term_12")
	private int termTwelve;
	
	@Column(name = "term_12_attendance")
	private int termTwelveAttendance;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public int getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
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

	public int getClassId() {
		return classId;
	}

	public void setClassId(int classId) {
		this.classId = classId;
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
