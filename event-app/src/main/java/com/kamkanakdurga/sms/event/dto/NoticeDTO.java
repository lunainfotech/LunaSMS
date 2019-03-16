package com.kamkanakdurga.sms.event.dto;

import java.math.BigInteger;
import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class NoticeDTO {

	@ApiModelProperty(position = 0)
	private BigInteger id;

	@ApiModelProperty(position = 1)
	private BigInteger schoolCode;

	@ApiModelProperty(position = 2)
	private String noticeTitle;

	@ApiModelProperty(position = 3)
	private String noticeContent;
	
	@ApiModelProperty(position = 4)
	private Date noticeDate;

	public NoticeDTO(BigInteger id, BigInteger schoolCode, String noticeTitle, String noticeContent, Date noticeDate) {
		super();
		this.id = id;
		this.schoolCode = schoolCode;
		this.noticeTitle = noticeTitle;
		this.noticeContent = noticeContent;
		this.noticeDate = noticeDate;
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

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getNoticeDate() {
		return noticeDate;
	}

	public void setNoticeDate(Date noticeDate) {
		this.noticeDate = noticeDate;
	}
	
}
