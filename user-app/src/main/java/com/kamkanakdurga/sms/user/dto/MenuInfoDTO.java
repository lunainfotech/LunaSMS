package com.kamkanakdurga.sms.user.dto;

import io.swagger.annotations.ApiModelProperty;

public class MenuInfoDTO {

	@ApiModelProperty(position = 0)
	private int id;

	@ApiModelProperty(position = 1)
	private String name;

	@ApiModelProperty(position = 2)
	private String description;

	@ApiModelProperty(position = 3)
	String url;

	@ApiModelProperty(position = 4)
	String icon;
	
	public MenuInfoDTO() {

	}

	public MenuInfoDTO(int id, String name, String description, String url, String icon) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.url = url;
		this.icon = icon;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}
}
