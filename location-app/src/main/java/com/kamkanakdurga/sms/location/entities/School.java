package com.kamkanakdurga.sms.location.entities;

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

	@Column(name = "district_name")
	private String districtName;

	@Column(name = "block_code")
	private int blockCode;

	@Column(name = "block_name")
	private String blockName;

	@Column(name = "school_code")
	private BigInteger schoolCode;

	@Column(name = "school_name")
	private String schoolName;

	@Column(name = "school_type")
	private String schoolType;

	@Column(name = "school_sub_class")
	private String schoolSubClass;

	public School() {

	}

	public School(int id, int districtCode, String districtName, int blockCode, String blockName, BigInteger schoolCode,
			String schoolName, String schoolType, String schoolSubClass) {
		this.id = id;
		this.districtCode = districtCode;
		this.districtName = districtName;
		this.blockCode = blockCode;
		this.blockName = blockName;
		this.schoolCode = schoolCode;
		this.schoolName = schoolName;
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
