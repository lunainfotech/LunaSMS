package com.kamkanakdurga.sms.library.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class UserDetailsDTO {
	
	@ApiModelProperty(position = 0)
	UserResponseDTO user;
	
	@ApiModelProperty(position = 1)
	List<FirstLevelMenuDTO> menuDetails;

	public UserResponseDTO getUser() {
		return user;
	}

	public void setUser(UserResponseDTO user) {
		this.user = user;
	}

	public List<FirstLevelMenuDTO> getMenuDetails() {
		return menuDetails;
	}

	public void setMenuDetails(List<FirstLevelMenuDTO> menuDetails) {
		this.menuDetails = menuDetails;
	}

	
}
