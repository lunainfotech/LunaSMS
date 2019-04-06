package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_assignment_attachment")
public class AssignmentAttachment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	@Column(name = "assignment_id")
	private BigInteger assignmentId;
	
	@Column(name = "caption")
	private String assignmentCaption;
	
	@Column(name = "src")
	private String imageSrc;
	
	@Column(name = "filename")
	private String fileName;
	

	public AssignmentAttachment() {
		//super();
	}


	public AssignmentAttachment(BigInteger id, BigInteger assignmentId, String assignmentCaption, String imageSrc,
			String fileName) {
		super();
		this.id = id;
		this.assignmentId = assignmentId;
		this.assignmentCaption = assignmentCaption;
		this.imageSrc = imageSrc;
		this.fileName = fileName;
	}

	public AssignmentAttachment(BigInteger assignmentId, String assignmentCaption, String imageSrc,
			String fileName) {
		super();
		this.assignmentId = assignmentId;
		this.assignmentCaption = assignmentCaption;
		this.imageSrc = imageSrc;
		this.fileName = fileName;
	}

	public BigInteger getId() {
		return id;
	}


	public void setId(BigInteger id) {
		this.id = id;
	}


	public BigInteger getAssignmentId() {
		return assignmentId;
	}


	public void setAssignmentId(BigInteger assignmentId) {
		this.assignmentId = assignmentId;
	}


	public String getAssignmentCaption() {
		return assignmentCaption;
	}


	public void setAssignmentCaption(String assignmentCaption) {
		this.assignmentCaption = assignmentCaption;
	}


	public String getImageSrc() {
		return imageSrc;
	}


	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}


	public String getFileName() {
		return fileName;
	}


	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
