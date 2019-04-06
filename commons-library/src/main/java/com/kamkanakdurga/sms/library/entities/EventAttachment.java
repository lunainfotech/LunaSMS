package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_event_attachment")
public class EventAttachment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "event_id")
	private BigInteger eventId;
	
	@Column(name = "attachment_title")
	private String attachmentTitle;
	
	@Column(name = "filename")
	private String fileName;
	
	@Column(name = "attachmemt_src")
	private String imageSrc;
	

	public EventAttachment() {
		super();
	}

	public EventAttachment(BigInteger eventId, String attachmentTitle, String fileName, String imageSrc) {
		super();
		this.eventId = eventId;
		this.attachmentTitle = attachmentTitle;
		this.fileName = fileName;
		this.imageSrc = imageSrc;
	}

	public EventAttachment( String attachmentTitle, BigInteger eventId, String fileName, String imageSrc) {
		super();
		this.eventId = eventId;
		this.attachmentTitle = attachmentTitle;
		this.fileName = fileName;
		this.imageSrc = imageSrc;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BigInteger getEventId() {
		return eventId;
	}

	public void setEventId(BigInteger eventId) {
		this.eventId = eventId;
	}

	public String getAttachmentTitle() {
		return attachmentTitle;
	}

	public void setAttachmentTitle(String attachmentTitle) {
		this.attachmentTitle = attachmentTitle;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getImageSrc() {
		return imageSrc;
	}

	public void setImageSrc(String imageSrc) {
		this.imageSrc = imageSrc;
	}
	
}
