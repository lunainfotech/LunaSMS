package com.kamkanakdurga.sms.teacher.entities;

import java.math.BigInteger;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_teacher")
public class Teacher {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Integer id;

	  @Column(name = "district_code")
	  private int districtCode;

	  @Column(name = "block_code")
	  private int blockCode;
	  
	  @Column(name = "village_code")
	  private int villageCode;
	  
	  @Column(name = "school_code")
	  private BigInteger schoolCode;
	  
	  @Column(name = "first_name")
	  private String firstName;
	  
	  @Column(name = "last_name")
	  private String lastName;
	  
	  @Column(name = "dob")
	  private Date dob;
	  
	  @Column(name = "aadhar_no")
	  private String adhaarNo;
	  
	  @Column(name = "designation")
	  private String designation;
	  
	  @Column(name = "gender")
	  private String gender;
	  
	  @Column(name = "nationality")
	  private String nationality;
	  
	  @Column(name = "religion")
	  private String religion;
	  
	  @Column(name = "caste")
	  private String caste;
	  
	  @Column(name = "father_name")
	  private String fatherName;
	  
	  @Column(name = "address")
	  private String address;
	  
	  @Column(name = "village")
	  private String village;
	  
	  @Column(name = "city")
	  private String city;
	  
	  @Column(name = "state")
	  private String state;
	  
	  @Column(name = "pincode")
	  private String pincode;
	  
	  @Column(name = "mobile")
	  private String mobile;
	  
	  @Column(name = "landline")
	  private String landline;
	  
	  @Column(name = "email")
	  private String email;
	  
	  @Column(name = "doa")
	  private Date doa;
	  
	  @Column(name = "doj")
	  private Date doj;
	  
	  @Column(name = "qualification")
	  private String qualification;

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
	  

}
