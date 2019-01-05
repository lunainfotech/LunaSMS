package com.kamkanakdurga.sms.attendance.entities;

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
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name = "ap_student")
@Table(name = "ap_student",indexes = { @Index(name = "UK_fm12uk16v1j717dlvafxuk7ps", columnList = "school_code") })
public class StudentInfo {
	
	public enum Gender{ 
	    Male, Female 
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "schoolCode")
	private List<StudentAttendanceInfo> studentAttendanceInfo;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private BigInteger id;
    
    @Column(name = "student_code")
    @Length(min = 16, max =16)
    @NotEmpty()
    private BigInteger studentCode;
    
    @Column(name = "school_name")
    @NotEmpty
    private String schoolName;
    
    @Column(name = "school_code")
    @Length(min = 11, max =11)
    @NotEmpty()
    private BigInteger schoolCode;
    
    @Column(name = "student_first_name")
    @NotEmpty
    private String studentFirstName;
    
    @Column(name = "student_last_name")
    @NotEmpty
    private String studentLastName;
    
    @Column(name = "date_of_birth")
    @NotEmpty
    private Date dateOfBirth;
    
    @Column(name = "gender")
    @Length(min = 4, max = 6)
    @NotEmpty
    @Enumerated(EnumType.STRING)
    private Gender gender;
    
    @Column(name = "aadhar_number")
    @Length(min = 12, max = 12)
    @NotEmpty
    private BigInteger aadharNumber;
    
    @Column(name = "admission_no")
    @Length(min = 16, max = 16)
    @NotEmpty()
    private String admissionNo;
    
    @Column(name = "class")
    @Length(min = 1, max = 2)
    @NotEmpty
    private int classNo;
    
    @Column(name = "section")
    @Length(min = 1, max = 1)
    @NotEmpty
    private String section;
    
    @Column(name = "roll_no")
    @Length(min = 4, max = 4)
    private int rollNo; 
    
    @Column(name = "joining_date")
    @NotEmpty()
    private Date joiningDate; 
   
    @Column(name = "admission_in_class")
    @Length(min = 1, max = 2)
    @NotEmpty()
    private int admissionInClass;
    
    @Column(name = "address_1")
    @NotEmpty
    private String address1;
    
    @Column(name = "address_2")
    private String address2;
    
    @Column(name = "address_3")
    private String address3;
    
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
    private String fatherName;
    
    @Column(name = "father_occupation")
    @NotEmpty
    private String fatherOccupation;
    
    @Column(name = "father_income_level")
    @NotEmpty
    private String fatherIncomeLevel;
    
    @Column(name = "father_mobile")
    @Length(min = 10, max = 10)
    @NotEmpty
    private BigInteger fatherMobile;
    
    @Column(name = "father_email")
    @Email
    private String fatherEmail;
    
    @Column(name = "mother_name")
    @NotEmpty
    private String motherName;
    
    @Column(name = "mother_occupation")
    @NotEmpty
    private String motherOccupation;
    
    @Column(name = "mother_mobile")
    @Length(min = 10, max = 10)
    @NotEmpty
    private String motherMobile;
    
    @Column(name = "landline")
    @Length(min = 10, max = 12)
    @NotEmpty
    private String landline;
    
    @Column(name = "blood_group")
    @Length(min = 2, max = 3)
    @NotEmpty
    private String bloodGroup;
    
    @Column(name = "religion")
    @NotEmpty
    private String religion;
    
    @Column(name = "cast")
    @NotEmpty
    private String cast;
    
    @Column(name = "cast_certificate_no")
    @Length(max = 20)
    private String castCertificateNo;
    
    @Column(name = "height_in_cm")
    @Length(min = 2, max = 3)
    private int heightInCm;
    
    @Column(name = "weight_in_kg")
    @Length(min = 2, max = 3)
    private int weightInKg;
    
    @Column(name = "creation_date")
    @NotEmpty
    private Date creationDate;
    
    @Column(name = "update_date")
    @NotEmpty
    private Date updateDate;
    
}
