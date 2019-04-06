package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_timetable")
public class Timetable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	
	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "class")
	private Integer studentClass;
	
	@Column(name = "subject")
	private Integer studentSubject;
	
	@Column(name = "mon_from")
	private String mondayFrom;
	
	@Column(name = "mon_to")
	private String mondayTo;
	
	@Column(name = "tue_from")
	private String tuedayFrom;
	
	@Column(name = "tue_to")
	private String tuesdayTo;
	
	@Column(name = "wed_from")
	private String wednesdayFrom;
	
	@Column(name = "wed_to")
	private String wednesdayTo;
	
	@Column(name = "thu_from")
	private String thursdayFrom;
	
	@Column(name = "thu_to")
	private String thursdayTo;
	
	@Column(name = "fri_from")
	private String fridayFrom;
	
	@Column(name = "fri_to")
	private String fridayTo;
	
	@Column(name = "sat_from")
	private String saturdayFrom;
	
	@Column(name = "sat_to")
	private String saturdayTo;
	
	@Column(name = "sun_from")
	private String sundayFrom;
	
	@Column(name = "sun_to")
	private String sundayTo;
	
	

	public Timetable() {
		super();
	}

	public Timetable(BigInteger id, BigInteger schoolCode, Integer studentClass, Integer studentSubject,
			String mondayFrom, String mondayTo, String tuedayFrom, String tuesdayTo, String wednesdayFrom,
			String wednesdayTo, String thursdayFrom, String thursdayTo, String fridayFrom, String fridayTo,
			String saturdayFrom, String saturdayTo, String sundayFrom, String sundayTo) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.studentClass = studentClass;
		this.studentSubject = studentSubject;
		this.mondayFrom = mondayFrom;
		this.mondayTo = mondayTo;
		this.tuedayFrom = tuedayFrom;
		this.tuesdayTo = tuesdayTo;
		this.wednesdayFrom = wednesdayFrom;
		this.wednesdayTo = wednesdayTo;
		this.thursdayFrom = thursdayFrom;
		this.thursdayTo = thursdayTo;
		this.fridayFrom = fridayFrom;
		this.fridayTo = fridayTo;
		this.saturdayFrom = saturdayFrom;
		this.saturdayTo = saturdayTo;
		this.sundayFrom = sundayFrom;
		this.sundayTo = sundayTo;
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public BigInteger getSchoolCode() {
		return schoolCode;
	}

	public void setSchoolCode(BigInteger schoolCode) {
		this.schoolCode = schoolCode;
	}

	public Integer getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(Integer studentClass) {
		this.studentClass = studentClass;
	}

	public Integer getStudentSubject() {
		return studentSubject;
	}

	public void setStudentSubject(Integer studentSubject) {
		this.studentSubject = studentSubject;
	}

	public String getMondayFrom() {
		return mondayFrom;
	}

	public void setMondayFrom(String mondayFrom) {
		this.mondayFrom = mondayFrom;
	}

	public String getMondayTo() {
		return mondayTo;
	}

	public void setMondayTo(String mondayTo) {
		this.mondayTo = mondayTo;
	}

	public String getTuedayFrom() {
		return tuedayFrom;
	}

	public void setTuedayFrom(String tuedayFrom) {
		this.tuedayFrom = tuedayFrom;
	}

	public String getTuesdayTo() {
		return tuesdayTo;
	}

	public void setTuesdayTo(String tuesdayTo) {
		this.tuesdayTo = tuesdayTo;
	}

	public String getWednesdayFrom() {
		return wednesdayFrom;
	}

	public void setWednesdayFrom(String wednesdayFrom) {
		this.wednesdayFrom = wednesdayFrom;
	}

	public String getWednesdayTo() {
		return wednesdayTo;
	}

	public void setWednesdayTo(String wednesdayTo) {
		this.wednesdayTo = wednesdayTo;
	}

	public String getThursdayFrom() {
		return thursdayFrom;
	}

	public void setThursdayFrom(String thursdayFrom) {
		this.thursdayFrom = thursdayFrom;
	}

	public String getThursdayTo() {
		return thursdayTo;
	}

	public void setThursdayTo(String thursdayTo) {
		this.thursdayTo = thursdayTo;
	}

	public String getFridayFrom() {
		return fridayFrom;
	}

	public void setFridayFrom(String fridayFrom) {
		this.fridayFrom = fridayFrom;
	}

	public String getFridayTo() {
		return fridayTo;
	}

	public void setFridayTo(String fridayTo) {
		this.fridayTo = fridayTo;
	}

	public String getSaturdayFrom() {
		return saturdayFrom;
	}

	public void setSaturdayFrom(String saturdayFrom) {
		this.saturdayFrom = saturdayFrom;
	}

	public String getSaturdayTo() {
		return saturdayTo;
	}

	public void setSaturdayTo(String saturdayTo) {
		this.saturdayTo = saturdayTo;
	}

	public String getSundayFrom() {
		return sundayFrom;
	}

	public void setSundayFrom(String sundayFrom) {
		this.sundayFrom = sundayFrom;
	}

	public String getSundayTo() {
		return sundayTo;
	}

	public void setSundayTo(String sundayTo) {
		this.sundayTo = sundayTo;
	}
	
	
}
