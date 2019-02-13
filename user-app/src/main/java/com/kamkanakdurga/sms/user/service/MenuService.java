package com.kamkanakdurga.sms.user.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.library.constants.RoleConstants;
import com.kamkanakdurga.sms.library.entities.Role;
import com.kamkanakdurga.sms.library.entities.Student;
import com.kamkanakdurga.sms.library.entities.User;
import com.kamkanakdurga.sms.library.repository.StudentRepository;
import com.kamkanakdurga.sms.user.dto.FirstLevelMenuDTO;
import com.kamkanakdurga.sms.user.repository.MenuRepository;

@Service
public class MenuService {

	@Autowired
	private MenuRepository menuRepository;
	
	@Autowired
	private StudentRepository studentRepository;

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

	public List getProfileByUser(User user) {
		if(user.getRole().get(0).toString() == RoleConstants.ROLE_STUDENT) {
			List<Student> result = studentRepository.findStudentbyStudentCode(new BigInteger(user.getUsername()));
			return result;
		}
		
		return null;
	}
	
}
