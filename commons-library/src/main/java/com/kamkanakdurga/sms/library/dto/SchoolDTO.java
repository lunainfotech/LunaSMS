package com.kamkanakdurga.sms.library.dto;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

public class SchoolDTO {
	
	@ApiModelProperty(position = 0)
	private Integer id;

	@ApiModelProperty(position = 1)
	private int districtCode;

	@ApiModelProperty(position = 2)
	private String districtName;

	@ApiModelProperty(position = 3)
	private int blockCode;

	@ApiModelProperty(position = 4)
	private String blockName;

	@ApiModelProperty(position = 5)
	private BigInteger schoolCode;

	@ApiModelProperty(position = 6)
	private String schoolName;
	
	@ApiModelProperty(position = 7)
	private String schoolArea;
	
	@ApiModelProperty(position = 8)
	private String schoolAddress;
	
	@ApiModelProperty(position = 9)
	private int schoolPin;
	
	@ApiModelProperty(position = 10)
	private String schoolContactName;
	
	@ApiModelProperty(position = 11)
	private String schoolContactNumber;
	
	@ApiModelProperty(position = 12)
	private String schoolEmailId;
	
	@ApiModelProperty(position = 13)
	private int schoolLatitude;
	
	@ApiModelProperty(position = 14)
	private int schoolLongitude;
	
	@ApiModelProperty(position = 15)
	private String schoolOfInc;
	
	@ApiModelProperty(position = 16)
	private int schoolMaxStudent;
	
	@ApiModelProperty(position = 17)
	private int schoolMaxTeacher;
	
	@ApiModelProperty(position = 18)
	private int schoolMaxStaff;
	
	@ApiModelProperty(position = 19)
	private String schoolType;
	
	@ApiModelProperty(position = 20)
	private String schoolSubClass;
	
	public SchoolDTO() {

	}

	
	public SchoolDTO(Integer id, int districtCode, String districtName, int blockCode, String blockName,
			BigInteger schoolCode, String schoolName, String schoolArea, String schoolAddress, int schoolPin,
			String schoolContactName, String schoolContactNumber, String schoolEmailId, int schoolLatitude,
			int schoolLongitude, String schoolOfInc, int schoolMaxStudent, int schoolMaxTeacher, int schoolMaxStaff,
			String schoolType, String schoolSubClass) {
		//super();
		this.id = id;
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.blockCode = blockCode;
		this.blockName = blockName;
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

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}

	public int getBlockCode() {
		return blockCode;
	}

	public void setBlockCode(int blockCode) {
		this.blockCode = blockCode;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
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
