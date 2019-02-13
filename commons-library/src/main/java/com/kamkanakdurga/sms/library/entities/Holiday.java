package com.kamkanakdurga.sms.library.entities;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_holiday")
public class Holiday {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "name")
	private String holidayName;
	
	@Column(name = "holiday_from")
	private Date holidayFrom;
	
	@Column(name = "holiday_to")
	private Date holidayTo;

	@Column(name = "active")
	private int active;
	/*
	@Column(name = "creation_date")
	private Timestamp holidayCreationDate;
	
	@Column(name = "update_date")
	private Timestamp holidayUpdateDate;

	*/

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public Date getHolidayFrom() {
		return holidayFrom;
	}

	public void setHolidayFrom(Date holidayFrom) {
		this.holidayFrom = holidayFrom;
	}

	public Date getHolidayTo() {
		return holidayTo;
	}

	public void setHolidayTo(Date holidayTo) {
		this.holidayTo = holidayTo;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}

	
}
