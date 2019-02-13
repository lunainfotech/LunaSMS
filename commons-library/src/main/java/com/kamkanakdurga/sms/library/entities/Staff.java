package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_staff")
public class Staff {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private BigInteger id;
	
	@Column(name = "staff_code")
	private BigInteger staffCode;
	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "staff_first_name")
	private String staffFirstName;
	
	@Column(name = "staff_middle_name")
	private String staffMiddleName;
	
	@Column(name = "staff_last_name")
	private String staffLastName;
	
	@Column(name = "date_of_birth")
	private Date dateOfBirth;
	
	@Column(name = "aadhar_number")
	private BigInteger aadharNumber;
	
	@Column(name = "gender")
	private String staffGender;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "religion")
	private int religion;
	
	@Column(name = "caste")
	private int caste;
	
	@Column(name = "caste_certificate_no")
	private String casteCertificateNo;
	
	@Column(name = "father_name")
	private String fatherName;
	
	@Column(name = "address_1")
	private String address1;
	
	@Column(name = "address_2")
	private String address2;
	
	@Column(name = "address_3")
	private String address3;
	
	@Column(name = "pincode")
	private int pincode;
	
	@Column(name = "village")
	private int village;
	
	@Column(name = "mandal")
	private int mandal;
	
	@Column(name = "district")
	private int district;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "landline_number")
	private BigInteger landlineNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "date_of_appointment")
	private Date dateOfAppointment;
	
	@Column(name = "date_of_joining")
	private Date dateOfJoining;
	
	@Column(name = "designation")
	private String designation;
	
	@Column(name = "qualification")
	private String qualification;
	
	@Column(name = "creation_date")
	private Timestamp creationDate;
	
	@Column(name = "update_date")
	private Timestamp updateDate;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getStaffCode() {
		return staffCode;
	}

	public void setStaffCode(BigInteger staffCode) {
		this.staffCode = staffCode;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public String getStaffFirstName() {
		return staffFirstName;
	}

	public void setStaffFirstName(String staffFirstName) {
		this.staffFirstName = staffFirstName;
	}

	public String getStaffMiddleName() {
		return staffMiddleName;
	}

	public void setStaffMiddleName(String staffMiddleName) {
		this.staffMiddleName = staffMiddleName;
	}

	public String getStaffLastName() {
		return staffLastName;
	}

	public void setStaffLastName(String staffLastName) {
		this.staffLastName = staffLastName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public BigInteger getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(BigInteger aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getStaffGender() {
		return staffGender;
	}

	public void setStaffGender(String staffGender) {
		this.staffGender = staffGender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public int getReligion() {
		return religion;
	}

	public void setReligion(int religion) {
		this.religion = religion;
	}

	public int getCaste() {
		return caste;
	}

	public void setCaste(int caste) {
		this.caste = caste;
	}

	public String getCasteCertificateNo() {
		return casteCertificateNo;
	}

	public void setCasteCertificateNo(String casteCertificateNo) {
		this.casteCertificateNo = casteCertificateNo;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getAddress3() {
		return address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public int getVillage() {
		return village;
	}

	public void setVillage(int village) {
		this.village = village;
	}

	public int getMandal() {
		return mandal;
	}

	public void setMandal(int mandal) {
		this.mandal = mandal;
	}

	public int getDistrict() {
		return district;
	}

	public void setDistrict(int district) {
		this.district = district;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public BigInteger getLandlineNumber() {
		return landlineNumber;
	}

	public void setLandlineNumber(BigInteger landlineNumber) {
		this.landlineNumber = landlineNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(Date dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Timestamp getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Timestamp creationDate) {
		this.creationDate = creationDate;
	}

	public Timestamp getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Timestamp updateDate) {
		this.updateDate = updateDate;
	}
	
}
