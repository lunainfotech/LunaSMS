package com.kamkanakdurga.sms.teacher.dto;

import java.math.BigInteger;
import java.sql.Date;

public class TeacherRecordsDTO {
	
	  private Integer id;
	  
	  private int districtCode;

	  private int blockCode;
	  
	  private int villageCode;
	  
	  private BigInteger schoolCode;
	  
	  private String firstName;
	  
	  private String lastName;
	  
	  private Date dob;
	  
	  private String adhaarNo;
	  
	  private String designation;
	  
	  private String gender;
	  
	  private String nationality;
	  
	  private String religion;
	  
	  private String caste;
	  
	  private String fatherName;
	  
	  private String address;
	  
	  private String village;
	  
	  private String city;
	  
	  private String state;
	  
	  private String pincode;
	  
	  private String mobile;
	  
	  private String landline;
	  
	  private String email;
	  
	  private Date doa;
	  
	  private Date doj;
	  
	  private String qualification;
	  
	  private String schoolName;
	  
	  private String villageName;
	  
	  private String blockName;
	  
	  private String districtName;

	public TeacherRecordsDTO(Integer id, int districtCode, int blockCode, int villageCode, BigInteger schoolCode,
			String firstName, String lastName, Date dob, String adhaarNo, String designation, String gender,
			String nationality, String religion, String caste, String fatherName, String address, String village,
			String city, String state, String pincode, String mobile, String landline, String email, Date doa, Date doj,
			String qualification, String schoolName, String villageName, String blockName, String districtName) {
		super();
		this.id = id;
		this.districtCode = districtCode;
		this.blockCode = blockCode;
		this.villageCode = villageCode;
		this.schoolCode = schoolCode;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.adhaarNo = adhaarNo;
		this.designation = designation;
		this.gender = gender;
		this.nationality = nationality;
		this.religion = religion;
		this.caste = caste;
		this.fatherName = fatherName;
		this.address = address;
		this.village = village;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.mobile = mobile;
		this.landline = landline;
		this.email = email;
		this.doa = doa;
		this.doj = doj;
		this.qualification = qualification;
		this.schoolName = schoolName;
		this.villageName = villageName;
		this.blockName = blockName;
		this.districtName = districtName;
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

	public int getVillageCode() {
		return villageCode;
	}

	public void setVillageCode(int villageCode) {
		this.villageCode = villageCode;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getAdhaarNo() {
		return adhaarNo;
	}

	public void setAdhaarNo(String adhaarNo) {
		this.adhaarNo = adhaarNo;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCaste() {
		return caste;
	}

	public void setCaste(String caste) {
		this.caste = caste;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDoa() {
		return doa;
	}

	public void setDoa(Date doa) {
		this.doa = doa;
	}

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getVillageName() {
		return villageName;
	}

	public void setVillageName(String villageName) {
		this.villageName = villageName;
	}

	public String getBlockName() {
		return blockName;
	}

	public void setBlockName(String blockName) {
		this.blockName = blockName;
	}

	public String getDistrictName() {
		return districtName;
	}

	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	  

}
