package com.kamkanakdurga.sms.event.dto;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class EventDTO {

	@ApiModelProperty(position = 0)
	private BigInteger id;

	@ApiModelProperty(position = 1)
	private BigInteger schoolCode;
	
	@ApiModelProperty(position = 2)
	private String eventTitle;
	
	@ApiModelProperty(position = 3)
	private String eventContent;
	
	@ApiModelProperty(position = 4)
	private int eventCategory;
	
	@ApiModelProperty(position = 5)
	private int eventStatus;
	
	@ApiModelProperty(position = 6)
	private Date eventDate;

	@ApiModelProperty(position = 7)
	private List attachment;

	public EventDTO(BigInteger id, BigInteger schoolCode, String eventTitle, String eventContent, int eventCategory,
			int eventStatus, Date eventDate, List attachment) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.eventTitle = eventTitle;
		this.eventContent = eventContent;
		this.eventCategory = eventCategory;
		this.eventStatus = eventStatus;
		this.eventDate = eventDate;
		this.attachment = attachment;
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

	public String getEventTitle() {
		return eventTitle;
	}

	public void setEventTitle(String eventTitle) {
		this.eventTitle = eventTitle;
	}

	public String getEventContent() {
		return eventContent;
	}

	public void setEventContent(String eventContent) {
		this.eventContent = eventContent;
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

	public List getAttachment() {
		return attachment;
	}

	public void setAttachment(List attachment) {
		this.attachment = attachment;
	}
	
}
