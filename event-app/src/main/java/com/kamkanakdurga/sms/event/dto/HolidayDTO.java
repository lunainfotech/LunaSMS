package com.kamkanakdurga.sms.event.dto;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class HolidayDTO {
	@ApiModelProperty(position = 0)
	private Integer id;

	@ApiModelProperty(position = 1)
	private String holidayName;

	@ApiModelProperty(position = 2)
	private Date holidayFrom;

	@ApiModelProperty(position = 3)
	private Date holidayTo;
	
	@ApiModelProperty(position = 4)
	private int active;

	public HolidayDTO(Integer id, String holidayName, Date holidayFrom, Date holidayTo, int active) {
		super();
		this.id = id;
		this.holidayName = holidayName;
		this.holidayFrom = holidayFrom;
		this.holidayTo = holidayTo;
		this.active = active;
	}

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
