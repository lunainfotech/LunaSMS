package com.kamkanakdurga.sms.library.entities;

import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_event")
public class Event {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "event_title")
	private String eventTitle;
	
	@Column(name = "event_content")
	private String eventContent;
	
	@Column(name = "event_category")
	private int eventCategory;
	
	@Column(name = "event_status")
	private int eventStatus;
	
	@Column(name = "event_date")
	private Date eventDate;

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

	public String getEventTitle() {
		return eventTitle;
	}

	
	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public int getEventCategory() {
		return eventCategory;
	}

	public void setEventCategory(int eventCategory) {
		this.eventCategory = eventCategory;
	}

	public int getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(int eventStatus) {
		this.eventStatus = eventStatus;
	}

	public Date getEventDate() {
		return eventDate;
	}

	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	
	
}
