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
	
	@Column(name = "attachmemt_src")
	private String attachmentSrc;

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

	public String getAttachmentSrc() {
		return attachmentSrc;
	}

	public void setAttachmentSrc(String attachmentSrc) {
		this.attachmentSrc = attachmentSrc;
	}
	
}
