package com.kamkanakdurga.sms.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.user.dto.FirstLevelMenuDTO;
import com.kamkanakdurga.sms.user.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	  private MenuRepository menuRepository;
	  
	public List<FirstLevelMenuDTO> getMenuGroupIdByRoleId(int roleId, int InActive) {
		return menuRepository.getMenuGroupDetailsByRoleId(roleId, InActive);
	}
	
	public List<FirstLevelMenuDTO> getMenuInfo(int roleId, int InActive) {
		List<FirstLevelMenuDTO> menuGroupIdLists = getMenuGroupIdByRoleId(roleId, InActive);
		List<FirstLevelMenuDTO> menuLists = new ArrayList<FirstLevelMenuDTO>(); 
		for(FirstLevelMenuDTO menuGroupId : menuGroupIdLists) {
			menuGroupId.setChildmenu(menuRepository.getMenuInfo(menuGroupId.getMenu_group_id(), InActive));
			menuLists.add(menuGroupId);
		}
		return menuLists;
	}
	
}
