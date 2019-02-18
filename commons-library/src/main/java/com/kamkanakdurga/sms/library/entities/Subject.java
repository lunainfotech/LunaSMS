package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_subject")
public class Subject {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "subject_name")
	private String subjectName;
	
	@Column(name = "fa_term")
	private int faTerm;
	
	@Column(name = "sa_term")
	private int saTerm;

	@Column(name = "sa_term_header")
	private String saTermHeader;
	
	@Column(name = "exam_type")
	private BigInteger examType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getFaTerm() {
		return faTerm;
	}

	public void setFaTerm(int faTerm) {
		this.faTerm = faTerm;
	}

	public int getSaTerm() {
		return saTerm;
	}

	public void setSaTerm(int saTerm) {
		this.saTerm = saTerm;
	}

	public String getSaTermHeader() {
		return saTermHeader;
	}

	public void setSaTermHeader(String saTermHeader) {
		this.saTermHeader = saTermHeader;
	}

	public BigInteger getExamType() {
		return examType;
	}

	public void setExamType(BigInteger examType) {
		this.examType = examType;
	}		
}
