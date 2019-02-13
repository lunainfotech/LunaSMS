package com.kamkanakdurga.sms.user.dto;

import java.util.List;

import io.swagger.annotations.ApiModelProperty;

public class UserDetailsDTO {

	@ApiModelProperty(position = 0)
	UserResponseDTO user;

	@ApiModelProperty(position = 1)
	List<FirstLevelMenuDTO> menuDetails;
	
	@ApiModelProperty(position = 2)
	List profileDetails;

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

	public List getProfileDetails() {
		return profileDetails;
	}

	public void setProfileDetails(List profileDetails) {
		this.profileDetails = profileDetails;
	}

}
