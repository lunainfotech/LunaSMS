package com.kamkanakdurga.sms.library.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_subject_by_exam")
public class SubjectByExam {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "subject")
	private int subjectId;
	
	@Column(name = "class")
	private int classId;


	@Column(name = "exam")
	private int examId;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getSubjectId() {
		return subjectId;
	}


	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}


	public int getClassId() {
		return classId;
	}


	public void setClassId(int classId) {
		this.classId = classId;
	}


	public int getExamId() {
		return examId;
	}


	public void setExamId(int examId) {
		this.examId = examId;
	}
	
}
