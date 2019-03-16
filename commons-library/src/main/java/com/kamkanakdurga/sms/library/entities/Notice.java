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
@Table(name = "ap_notice")
public class Notice {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;

	@Column(name = "school_code")
	private BigInteger schoolCode;
	
	@Column(name = "notice_title")
	private String noticeTitle;
	
	@Column(name = "notice_content")
	private String noticeContent;
	
	@Column(name = "notice_date")
	private Date noticeDate;

	public Notice(BigInteger id, BigInteger schoolCode, String noticeTitle, String noticeContent, Date noticeDate) {
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
