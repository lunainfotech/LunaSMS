package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "student_code")
	private BigInteger studentCode;
	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "student_first_name")
	private String studentFirstName;
	
	@Column(name = "student_last_name")
	private String studentLastName;
	
	@Column(name = "date_of_birth")
	private String studentDOB;
	
	@Column(name = "gender")
	private String studentGender;
	
	@Column(name = "aadhar_number")
	private BigInteger aadharNumber;
	
	@Column(name = "admission_no")
	private BigInteger admissionNo;
	
	@Column(name = "class")
	private int studentClass;
	
	@Column(name = "section")
	private int studentSection;
	
	@Column(name = "roll_no")
	private int studentRoll;
	
	@Column(name = "joining_date")
	private String studentJoinDate;
	
	@Column(name = "admission_in_class")
	private int studentAdmissionClass;
	
	@Column(name = "address_1")
	private String studentAddress1;
	
	@Column(name = "address_2")
	private String studentAddress2;
	
	@Column(name = "address_3")
	private String studentAddress3;
	
	@Column(name = "pincode")
	private int studentPin;
	
	@Column(name = "village")
	private BigInteger studentVillageCode;
	
	@Column(name = "mandal")
	private int studentMandalCode;
	
	@Column(name = "district")
	private int studentDistrictCode;
	
	@Column(name = "state")
	private int studentStateCode;
	
	@Column(name = "father_name")
	private String studentFatherName;
	
	@Column(name = "father_occupation")
	private String studentFatherOccupation;
	
	@Column(name = "father_income_level")
	private String studentFatherIncom;
	
	@Column(name = "father_mobile")
	private BigInteger studentFatherMobile;
	
	@Column(name = "father_email")
	private String studentFatherEmail;
	
	@Column(name = "mother_name")
	private String studentMothername;
	
	@Column(name = "mother_occupation")
	private String studentMotherOccupation;
	
	@Column(name = "mother_mobile")
	private BigInteger studentMotherMobile;
	
	@Column(name = "landline")
	private BigInteger studentLandline;
	
	@Column(name = "blood_group")
	private String studentBloodGroup;
	
	@Column(name = "religion")
	private int studentReligion;
	
	@Column(name = "caste")
	private int studentCaste;
	
	@Column(name = "caste_certificate_no")
	private String studentCasteCertNo;
	
	@Column(name = "height_in_cm")
	private int studentHeight;
	
	@Column(name = "weight_in_kg")
	private int studentWeight;
	
	@Column(name = "creation_date")
	private String studentCreationDate;
	
	@Column(name = "update_date")
	private String studentUpdateDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public String getStudentGender() {
		return studentGender;
	}

	public void setStudentGender(String studentGender) {
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
