package com.kamkanakdurga.sms.student.dto;

import java.math.BigInteger;
import com.kamkanakdurga.sms.student.entities.Student.Gender;

public class StudentDTO {
	
	private BigInteger studentCode;
	private BigInteger schoolCode;
	private String studentFirstName;
	private String studentLastName;
	private String studentDOB;
	private Gender studentGender;
	private BigInteger aadharNumber;
	private BigInteger admissionNo;
	private int studentClass;
	private int studentSection;
	private int studentRoll;
	private String studentJoinDate;
	private int studentAdmissionClass;
	private String studentAddress1;
	private String studentAddress2;
	private String studentAddress3;
	private int studentPin;
	private BigInteger studentVillageCode;
	private int studentMandalCode;
	private int studentDistrictCode;
	private int studentStateCode;
	private String studentFatherName;
	private String studentFatherOccupation;
	private String studentFatherIncom;
	private BigInteger studentFatherMobile;
	private String studentFatherEmail;
	private String studentMothername;
	private String studentMotherOccupation;
	private BigInteger studentMotherMobile;
	private BigInteger studentLandline;
	private String studentBloodGroup;
	private int studentReligion;
	private int studentCaste;
	private String studentCasteCertNo;
	private int studentHeight;
	private int studentWeight;
	private String studentCreationDate;
	private String studentUpdateDate;
	public StudentDTO(BigInteger studentCode, BigInteger schoolCode, String studentFirstName, String studentLastName,
			String studentDOB, Gender studentGender, BigInteger aadharNumber, BigInteger admissionNo, int studentClass,
			int studentSection, int studentRoll, String studentJoinDate, int studentAdmissionClass,
			String studentAddress1, String studentAddress2, String studentAddress3, int studentPin,
			BigInteger studentVillageCode, int studentMandalCode, int studentDistrictCode, int studentStateCode,
			String studentFatherName, String studentFatherOccupation, String studentFatherIncom,
			BigInteger studentFatherMobile, String studentFatherEmail, String studentMothername,
			String studentMotherOccupation, BigInteger studentMotherMobile, BigInteger studentLandline,
			String studentBloodGroup, int studentReligion, int studentCaste, String studentCasteCertNo,
			int studentHeight, int studentWeight, String studentCreationDate, String studentUpdateDate) {
		super();
		this.studentCode = studentCode;
		this.schoolCode = schoolCode;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentDOB = studentDOB;
		this.studentGender = studentGender;
		this.aadharNumber = aadharNumber;
		this.admissionNo = admissionNo;
		this.studentClass = studentClass;
		this.studentSection = studentSection;
		this.studentRoll = studentRoll;
		this.studentJoinDate = studentJoinDate;
		this.studentAdmissionClass = studentAdmissionClass;
		this.studentAddress1 = studentAddress1;
		this.studentAddress2 = studentAddress2;
		this.studentAddress3 = studentAddress3;
		this.studentPin = studentPin;
		this.studentVillageCode = studentVillageCode;
		this.studentMandalCode = studentMandalCode;
		this.studentDistrictCode = studentDistrictCode;
		this.studentStateCode = studentStateCode;
		this.studentFatherName = studentFatherName;
		this.studentFatherOccupation = studentFatherOccupation;
		this.studentFatherIncom = studentFatherIncom;
		this.studentFatherMobile = studentFatherMobile;
		this.studentFatherEmail = studentFatherEmail;
		this.studentMothername = studentMothername;
		this.studentMotherOccupation = studentMotherOccupation;
		this.studentMotherMobile = studentMotherMobile;
		this.studentLandline = studentLandline;
		this.studentBloodGroup = studentBloodGroup;
		this.studentReligion = studentReligion;
		this.studentCaste = studentCaste;
		this.studentCasteCertNo = studentCasteCertNo;
		this.studentHeight = studentHeight;
		this.studentWeight = studentWeight;
		this.studentCreationDate = studentCreationDate;
		this.studentUpdateDate = studentUpdateDate;
	}
	public BigInteger getStudentCode() {
		return studentCode;
	}
	public void setStudentCode(BigInteger studentCode) {
		this.studentCode = studentCode;
	}
	public BigInteger getSchoolCode() {
		return schoolCode;
	}
	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
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
	public String getStudentDOB() {
		return studentDOB;
	}
	public void setStudentDOB(String studentDOB) {
		this.studentDOB = studentDOB;
	}
	public Gender getStudentGender() {
		return studentGender;
	}
	public void setStudentGender(Gender studentGender) {
		this.studentGender = studentGender;
	}
	public BigInteger getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(BigInteger aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public BigInteger getAdmissionNo() {
		return admissionNo;
	}
	public void setAdmissionNo(BigInteger admissionNo) {
		this.admissionNo = admissionNo;
	}
	public int getStudentClass() {
		return studentClass;
	}
	public void setStudentClass(int studentClass) {
		this.studentClass = studentClass;
	}
	public int getStudentSection() {
		return studentSection;
	}
	public void setStudentSection(int studentSection) {
		this.studentSection = studentSection;
	}
	public int getStudentRoll() {
		return studentRoll;
	}
	public void setStudentRoll(int studentRoll) {
		this.studentRoll = studentRoll;
	}
	public String getStudentJoinDate() {
		return studentJoinDate;
	}
	public void setStudentJoinDate(String studentJoinDate) {
		this.studentJoinDate = studentJoinDate;
	}
	public int getStudentAdmissionClass() {
		return studentAdmissionClass;
	}
	public void setStudentAdmissionClass(int studentAdmissionClass) {
		this.studentAdmissionClass = studentAdmissionClass;
	}
	public String getStudentAddress1() {
		return studentAddress1;
	}
	public void setStudentAddress1(String studentAddress1) {
		this.studentAddress1 = studentAddress1;
	}
	public String getStudentAddress2() {
		return studentAddress2;
	}
	public void setStudentAddress2(String studentAddress2) {
		this.studentAddress2 = studentAddress2;
	}
	public String getStudentAddress3() {
		return studentAddress3;
	}
	public void setStudentAddress3(String studentAddress3) {
		this.studentAddress3 = studentAddress3;
	}
	public int getStudentPin() {
		return studentPin;
	}
	public void setStudentPin(int studentPin) {
		this.studentPin = studentPin;
	}
	public BigInteger getStudentVillageCode() {
		return studentVillageCode;
	}
	public void setStudentVillageCode(BigInteger studentVillageCode) {
		this.studentVillageCode = studentVillageCode;
	}
	public int getStudentMandalCode() {
		return studentMandalCode;
	}
	public void setStudentMandalCode(int studentMandalCode) {
		this.studentMandalCode = studentMandalCode;
	}
	public int getStudentDistrictCode() {
		return studentDistrictCode;
	}
	public void setStudentDistrictCode(int studentDistrictCode) {
		this.studentDistrictCode = studentDistrictCode;
	}
	public int getStudentStateCode() {
		return studentStateCode;
	}
	public void setStudentStateCode(int studentStateCode) {
		this.studentStateCode = studentStateCode;
	}
	public String getStudentFatherName() {
		return studentFatherName;
	}
	public void setStudentFatherName(String studentFatherName) {
		this.studentFatherName = studentFatherName;
	}
	public String getStudentFatherOccupation() {
		return studentFatherOccupation;
	}
	public void setStudentFatherOccupation(String studentFatherOccupation) {
		this.studentFatherOccupation = studentFatherOccupation;
	}
	public String getStudentFatherIncom() {
		return studentFatherIncom;
	}
	public void setStudentFatherIncom(String studentFatherIncom) {
		this.studentFatherIncom = studentFatherIncom;
	}
	public BigInteger getStudentFatherMobile() {
		return studentFatherMobile;
	}
	public void setStudentFatherMobile(BigInteger studentFatherMobile) {
		this.studentFatherMobile = studentFatherMobile;
	}
	public String getStudentFatherEmail() {
		return studentFatherEmail;
	}
	public void setStudentFatherEmail(String studentFatherEmail) {
		this.studentFatherEmail = studentFatherEmail;
	}
	public String getStudentMothername() {
		return studentMothername;
	}
	public void setStudentMothername(String studentMothername) {
		this.studentMothername = studentMothername;
	}
	public String getStudentMotherOccupation() {
		return studentMotherOccupation;
	}
	public void setStudentMotherOccupation(String studentMotherOccupation) {
		this.studentMotherOccupation = studentMotherOccupation;
	}
	public BigInteger getStudentMotherMobile() {
		return studentMotherMobile;
	}
	public void setStudentMotherMobile(BigInteger studentMotherMobile) {
		this.studentMotherMobile = studentMotherMobile;
	}
	public BigInteger getStudentLandline() {
		return studentLandline;
	}
	public void setStudentLandline(BigInteger studentLandline) {
		this.studentLandline = studentLandline;
	}
	public String getStudentBloodGroup() {
		return studentBloodGroup;
	}
	public void setStudentBloodGroup(String studentBloodGroup) {
		this.studentBloodGroup = studentBloodGroup;
	}
	public int getStudentReligion() {
		return studentReligion;
	}
	public void setStudentReligion(int studentReligion) {
		this.studentReligion = studentReligion;
	}
	public int getStudentCaste() {
		return studentCaste;
	}
	public void setStudentCaste(int studentCaste) {
		this.studentCaste = studentCaste;
	}
	public String getStudentCasteCertNo() {
		return studentCasteCertNo;
	}
	public void setStudentCasteCertNo(String studentCasteCertNo) {
		this.studentCasteCertNo = studentCasteCertNo;
	}
	public int getStudentHeight() {
		return studentHeight;
	}
	public void setStudentHeight(int studentHeight) {
		this.studentHeight = studentHeight;
	}
	public int getStudentWeight() {
		return studentWeight;
	}
	public void setStudentWeight(int studentWeight) {
		this.studentWeight = studentWeight;
	}
	public String getStudentCreationDate() {
		return studentCreationDate;
	}
	public void setStudentCreationDate(String studentCreationDate) {
		this.studentCreationDate = studentCreationDate;
	}
	public String getStudentUpdateDate() {
		return studentUpdateDate;
	}
	public void setStudentUpdateDate(String studentUpdateDate) {
		this.studentUpdateDate = studentUpdateDate;
	}
	
}
