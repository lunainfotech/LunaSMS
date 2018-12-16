package com.lunainfotech.lunasms.admission.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import java.math.BigInteger;
import java.sql.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "ap_student")
public class StudentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private BigInteger id;
    
    @Column(name = "student_code")
    @Length(min = 16, max =16)
    @NotEmpty()
    private BigInteger student_code;
    
    @Column(name = "school_name")
    @NotEmpty
    private String school_name;
    
    @Column(name = "school_code")
    @Length(min = 11, max =11)
    @NotEmpty()
    private BigInteger school_code;
    
    @Column(name = "student_first_name")
    @NotEmpty
    private String student_first_name;
    
    @Column(name = "student_last_name")
    @NotEmpty
    private String student_last_name;
    
    @Column(name = "date_of_birth")
    @NotEmpty
    private Date date_of_birth;
    
    @Column(name = "gender")
    @Length(min = 4, max = 6)
    @NotEmpty
    private String gender;
    
    @Column(name = "aadhar_number")
    @Length(min = 12, max = 12)
    @NotEmpty
    private BigInteger aadhar_number;
    
    @Column(name = "admission_no")
    @Length(min = 16, max = 16)
    @NotEmpty()
    private String admission_no;
    
    @Column(name = "class")
    @Length(min = 1, max = 2)
    @NotEmpty
    private int classno;
    
    @Column(name = "section")
    @Length(min = 1, max = 1)
    @NotEmpty
    private String section;
    
    @Column(name = "roll_no")
    @Length(min = 4, max = 4)
    private int roll_no; 
    
    @Column(name = "joining_date")
    @NotEmpty()
    private Date joining_date; 
   
    @Column(name = "admission_in_class")
    @Length(min = 1, max = 2)
    @NotEmpty()
    private int admission_in_class;
    
    @Column(name = "address_1")
    @NotEmpty
    private String address_1;
    
    @Column(name = "address_2")
    private String address_2;
    
    @Column(name = "address_3")
    private String address_3;
    
    @Column(name = "pincode")
    @Length(min = 6, max = 6)
    @NotEmpty
    private int pincode; 
	  
	@Column(name = "village")
    @Length(min = 10, max = 10)
    @NotEmpty()
    private BigInteger village;   
    
    @Column(name = "mandal")
    @Length(min = 6, max = 6)
    @NotEmpty()
    private int mandal;   
	
    @Column(name = "district")
    @Length(min = 4, max = 4)
    @NotEmpty()
    private int district;
    
    @Column(name = "state")
    @NotEmpty()
    private String state;
    
    @Column(name = "father_name")
    @NotEmpty
    private String father_name;
    
    @Column(name = "father_occupation")
    @NotEmpty
    private String father_occupation;
    
    @Column(name = "father_income_level")
    @NotEmpty
    private String father_income_level;
    
    @Column(name = "father_mobile")
    @Length(min = 10, max = 10)
    @NotEmpty
    private BigInteger father_mobile;
    
    @Column(name = "father_email")
    @Email
    private String father_email;
    
    @Column(name = "mother_name")
    @NotEmpty
    private String mother_name;
    
    @Column(name = "mother_occupation")
    @NotEmpty
    private String mother_occupation;
    
    @Column(name = "mother_mobile")
    @Length(min = 10, max = 10)
    @NotEmpty
    private String mother_mobile;
    
    @Column(name = "landline")
    @Length(min = 10, max = 12)
    @NotEmpty
    private String landline;
    
    @Column(name = "blood_group")
    @Length(min = 2, max = 3)
    @NotEmpty
    private String blood_group;
    
    @Column(name = "religion")
    @NotEmpty
    private String religion;
    
    @Column(name = "cast")
    @NotEmpty
    private String cast;
    
    @Column(name = "cast_certificate_no")
    @Length(max = 20)
    private String cast_certificate_no;
    
    @Column(name = "height_in_cm")
    @Length(min = 2, max = 3)
    private int height_in_cm;
    
    @Column(name = "weight_in_kg")
    @Length(min = 2, max = 3)
    private int weight_in_kg;
    
    @Column(name = "creation_date")
    @NotEmpty
    private Date creation_date;
    
    @Column(name = "update_date")
    @NotEmpty
    private Date update_date;

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getStudent_code() {
		return student_code;
	}

	public void setStudent_code(BigInteger student_code) {
		this.student_code = student_code;
	}

	public String getSchool_name() {
		return school_name;
	}

	public void setSchool_name(String school_name) {
		this.school_name = school_name;
	}

	public BigInteger getSchool_code() {
		return school_code;
	}

	public void setSchool_code(BigInteger school_code) {
		this.school_code = school_code;
	}

	public String getStudent_first_name() {
		return student_first_name;
	}

	public void setStudent_first_name(String student_first_name) {
		this.student_first_name = student_first_name;
	}

	public String getStudent_last_name() {
		return student_last_name;
	}

	public void setStudent_last_name(String student_last_name) {
		this.student_last_name = student_last_name;
	}

	public Date getDate_of_birth() {
		return date_of_birth;
	}

	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public BigInteger getAadhar_number() {
		return aadhar_number;
	}

	public void setAadhar_number(BigInteger aadhar_number) {
		this.aadhar_number = aadhar_number;
	}

	public String getAdmission_no() {
		return admission_no;
	}

	public void setAdmission_no(String admission_no) {
		this.admission_no = admission_no;
	}

	public int getClassno() {
		return classno;
	}

	public void setClassno(int classno) {
		this.classno = classno;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
	}

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public Date getJoining_date() {
		return joining_date;
	}

	public void setJoining_date(Date joining_date) {
		this.joining_date = joining_date;
	}

	public int getAdmission_in_class() {
		return admission_in_class;
	}

	public void setAdmission_in_class(int admission_in_class) {
		this.admission_in_class = admission_in_class;
	}

	public String getAddress_1() {
		return address_1;
	}

	public void setAddress_1(String address_1) {
		this.address_1 = address_1;
	}

	public String getAddress_2() {
		return address_2;
	}

	public void setAddress_2(String address_2) {
		this.address_2 = address_2;
	}

	public String getAddress_3() {
		return address_3;
	}

	public void setAddress_3(String address_3) {
		this.address_3 = address_3;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public BigInteger getVillage() {
		return village;
	}

	public void setVillage(BigInteger village) {
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

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getFather_occupation() {
		return father_occupation;
	}

	public void setFather_occupation(String father_occupation) {
		this.father_occupation = father_occupation;
	}

	public String getFather_income_level() {
		return father_income_level;
	}

	public void setFather_income_level(String father_income_level) {
		this.father_income_level = father_income_level;
	}

	public BigInteger getFather_mobile() {
		return father_mobile;
	}

	public void setFather_mobile(BigInteger father_mobile) {
		this.father_mobile = father_mobile;
	}

	public String getFather_email() {
		return father_email;
	}

	public void setFather_email(String father_email) {
		this.father_email = father_email;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getMother_occupation() {
		return mother_occupation;
	}

	public void setMother_occupation(String mother_occupation) {
		this.mother_occupation = mother_occupation;
	}

	public String getMother_mobile() {
		return mother_mobile;
	}

	public void setMother_mobile(String mother_mobile) {
		this.mother_mobile = mother_mobile;
	}

	public String getLandline() {
		return landline;
	}

	public void setLandline(String landline) {
		this.landline = landline;
	}

	public String getBlood_group() {
		return blood_group;
	}

	public void setBlood_group(String blood_group) {
		this.blood_group = blood_group;
	}

	public String getReligion() {
		return religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public String getCast() {
		return cast;
	}

	public void setCast(String cast) {
		this.cast = cast;
	}

	public String getCast_certificate_no() {
		return cast_certificate_no;
	}

	public void setCast_certificate_no(String cast_certificate_no) {
		this.cast_certificate_no = cast_certificate_no;
	}

	public int getHeight_in_cm() {
		return height_in_cm;
	}

	public void setHeight_in_cm(int height_in_cm) {
		this.height_in_cm = height_in_cm;
	}

	public int getWeight_in_kg() {
		return weight_in_kg;
	}

	public void setWeight_in_kg(int weight_in_kg) {
		this.weight_in_kg = weight_in_kg;
	}

	public Date getCreation_date() {
		return creation_date;
	}

	public void setCreation_date(Date creation_date) {
		this.creation_date = creation_date;
	}

	public Date getUpdate_date() {
		return update_date;
	}

	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}

    
    
}
