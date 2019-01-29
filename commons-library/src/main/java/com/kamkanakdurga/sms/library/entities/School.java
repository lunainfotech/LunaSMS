package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_school")
public class School {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "district_code")
	private int districtCode;
	
	@Column(name = "block_code")
	private int blockCode;
	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "school_name")
	private String schoolName;
	
	@Column(name = "school_area")
	private String schoolArea;
	
	@Column(name = "school_address")
	private String schoolAddress;
	
	@Column(name = "school_pin")
	private int schoolPin;
	
	@Column(name = "school_contact_name")
	private String schoolContactName;
	
	@Column(name = "school_contact_number")
	private String schoolContactNumber;
	
	@Column(name = "school_email_id")
	private String schoolEmailId;
	
	@Column(name = "school_latitude")
	private int schoolLatitude;
	
	@Column(name = "school_longitude")
	private int schoolLongitude;
	
	@Column(name = "school_of_inc")
	private String schoolOfInc;
	
	@Column(name = "school_max_student")
	private int schoolMaxStudent;
	
	@Column(name = "school_max_teacher")
	private int schoolMaxTeacher;
	
	@Column(name = "school_max_staff")
	private int schoolMaxStaff;
	
	@Column(name = "school_type")
	private String schoolType;
	
	@Column(name = "school_sub_class")
	private String schoolSubClass;
	
	public School() {
		
	}

	public School(Integer id, int districtCode, int blockCode, BigInteger schoolCode, String schoolName,
			String schoolArea, String schoolAddress, int schoolPin, String schoolContactName,
			String schoolContactNumber, String schoolEmailId, int schoolLatitude, int schoolLongitude,
			String schoolOfInc, int schoolMaxStudent, int schoolMaxTeacher, int schoolMaxStaff, String schoolType,
			String schoolSubClass) {
		//super();
		this.id = id;
		this.districtCode = districtCode;
		this.blockCode = blockCode;
		this.schoolCode = schoolCode;
		this.schoolName = schoolName;
		this.schoolArea = schoolArea;
		this.schoolAddress = schoolAddress;
		this.schoolPin = schoolPin;
		this.schoolContactName = schoolContactName;
		this.schoolContactNumber = schoolContactNumber;
		this.schoolEmailId = schoolEmailId;
		this.schoolLatitude = schoolLatitude;
		this.schoolLongitude = schoolLongitude;
		this.schoolOfInc = schoolOfInc;
		this.schoolMaxStudent = schoolMaxStudent;
		this.schoolMaxTeacher = schoolMaxTeacher;
		this.schoolMaxStaff = schoolMaxStaff;
		this.schoolType = schoolType;
		this.schoolSubClass = schoolSubClass;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getDistrictCode() {
		return districtCode;
	}

	public void setDistrictCode(int districtCode) {
		this.districtCode = districtCode;
	}

	public int getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(int blockCode) {
		this.blockCode = blockCode;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getSchoolArea() {
		return schoolArea;
	}

	public void setSchoolArea(String schoolArea) {
		this.schoolArea = schoolArea;
	}

	public String getSchoolAddress() {
		return schoolAddress;
	}

	public void setSchoolAddress(String schoolAddress) {
		this.schoolAddress = schoolAddress;
	}

	public int getSchoolPin() {
		return schoolPin;
	}

	public void setSchoolPin(int schoolPin) {
		this.schoolPin = schoolPin;
	}

	public String getSchoolContactName() {
		return schoolContactName;
	}

	public void setSchoolContactName(String schoolContactName) {
		this.schoolContactName = schoolContactName;
	}

	public String getSchoolContactNumber() {
		return schoolContactNumber;
	}

	public void setSchoolContactNumber(String schoolContactNumber) {
		this.schoolContactNumber = schoolContactNumber;
	}

	public String getSchoolEmailId() {
		return schoolEmailId;
	}

	public void setSchoolEmailId(String schoolEmailId) {
		this.schoolEmailId = schoolEmailId;
	}

	public int getSchoolLatitude() {
		return schoolLatitude;
	}

	public void setSchoolLatitude(int schoolLatitude) {
		this.schoolLatitude = schoolLatitude;
	}

	public int getSchoolLongitude() {
		return schoolLongitude;
	}

	public void setSchoolLongitude(int schoolLongitude) {
		this.schoolLongitude = schoolLongitude;
	}

	public String getSchoolOfInc() {
		return schoolOfInc;
	}

	public void setSchoolOfInc(String schoolOfInc) {
		this.schoolOfInc = schoolOfInc;
	}

	public int getSchoolMaxStudent() {
		return schoolMaxStudent;
	}

	public void setSchoolMaxStudent(int schoolMaxStudent) {
		this.schoolMaxStudent = schoolMaxStudent;
	}

	public int getSchoolMaxTeacher() {
		return schoolMaxTeacher;
	}

	public void setSchoolMaxTeacher(int schoolMaxTeacher) {
		this.schoolMaxTeacher = schoolMaxTeacher;
	}

	public int getSchoolMaxStaff() {
		return schoolMaxStaff;
	}

	public void setSchoolMaxStaff(int schoolMaxStaff) {
		this.schoolMaxStaff = schoolMaxStaff;
	}

	public String getSchoolType() {
		return schoolType;
	}

	public void setSchoolType(String schoolType) {
		this.schoolType = schoolType;
	}

	public String getSchoolSubClass() {
		return schoolSubClass;
	}

	public void setSchoolSubClass(String schoolSubClass) {
		this.schoolSubClass = schoolSubClass;
	}
	
}
