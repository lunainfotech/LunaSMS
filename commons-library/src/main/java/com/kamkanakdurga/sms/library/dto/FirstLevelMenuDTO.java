package com.kamkanakdurga.sms.library.dto;

import java.util.List;

import com.kamkanakdurga.sms.library.dto.MenuInfoDTO;

import io.swagger.annotations.ApiModelProperty;

public class FirstLevelMenuDTO {

	@ApiModelProperty(position = 0)
	private int menu_group_id;

	@ApiModelProperty(position = 1)
	private String name;

	@ApiModelProperty(position = 2)
	private String description;

	@ApiModelProperty(position = 3)
	String url;
	
	@ApiModelProperty(position = 4)
	List<MenuInfoDTO> childmenu;

	public FirstLevelMenuDTO() {

	}

	public FirstLevelMenuDTO(int menu_group_id, String name, String description, String url) {
		this.menu_group_id = menu_group_id;
		this.name = name;
		this.description = description;
		this.url = url;
	}

	public int getMenu_group_id() {
		return menu_group_id;
	}

	public void setMenu_group_id(int menu_group_id) {
		this.menu_group_id = menu_group_id;
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

	public List<MenuInfoDTO> getChildmenu() {
		return childmenu;
	}

	public void setChildmenu(List<MenuInfoDTO> childmenu) {
		this.childmenu = childmenu;
	}
	
}
