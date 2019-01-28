package com.kamkanakdurga.sms.user.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.library.dto.FirstLevelMenuDTO;
import com.kamkanakdurga.sms.user.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;

	public List<FirstLevelMenuDTO> getMenuGroupIdByRoleId(int roleId) {
		return menuRepository.getMenuGroupDetailsByRoleId(roleId);
	}

	public List<FirstLevelMenuDTO> getMenuInfo(int roleId) {
		List<FirstLevelMenuDTO> menuGroupIdLists = getMenuGroupIdByRoleId(roleId);
		List<FirstLevelMenuDTO> menuLists = new ArrayList<FirstLevelMenuDTO>();
		for (FirstLevelMenuDTO menuGroupId : menuGroupIdLists) {
			menuGroupId.setChildmenu(menuRepository.getMenuInfo(roleId, menuGroupId.getMenu_group_id()));
			menuLists.add(menuGroupId);
		}
		return menuLists;
	}

}
