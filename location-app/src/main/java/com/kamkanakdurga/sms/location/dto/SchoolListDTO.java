package com.kamkanakdurga.sms.location.dto;

import java.math.BigInteger;

import io.swagger.annotations.ApiModelProperty;

public class SchoolListDTO {

	@ApiModelProperty(position = 0)
	private Integer id;

	@ApiModelProperty(position = 1)
	private String schoolName;

	@ApiModelProperty(position = 2)
	private BigInteger schoolCode;
	
	@ApiModelProperty(position = 3)
	private String schoolType;
	
	@ApiModelProperty(position = 4)
	private String schoolSubClass;	

	@ApiModelProperty(position = 5)
	private int districtCode;

	@ApiModelProperty(position = 6)
	private String districtName;

	@ApiModelProperty(position = 7)
	private int blockCode;

	@ApiModelProperty(position = 8)
	private String blockName;
	
	@ApiModelProperty(position = 9)
	private String schoolContactName;
	
	@ApiModelProperty(position = 10)
	private String schoolContactNumber;

	public SchoolListDTO(Integer id, String schoolName, BigInteger schoolCode, String schoolType, String schoolSubClass,
			int districtCode, String districtName, int blockCode, String blockName, String schoolContactName,
			String schoolContactNumber) {
		super();
		this.id = id;
		this.schoolName = schoolName;
		this.schoolCode = schoolCode;
		this.schoolType = schoolType;
		this.schoolSubClass = schoolSubClass;
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.blockCode = blockCode;
		this.blockName = blockName;
		this.schoolContactName = schoolContactName;
		this.schoolContactNumber = schoolContactNumber;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
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
	
	
}
