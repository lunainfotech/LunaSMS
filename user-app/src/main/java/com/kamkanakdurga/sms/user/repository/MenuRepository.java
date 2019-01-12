package com.kamkanakdurga.sms.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.user.dto.FirstLevelMenuDTO;
import com.kamkanakdurga.sms.user.dto.MenuInfoDTO;
import com.kamkanakdurga.sms.user.entities.RoleGroup;

public interface MenuRepository extends JpaRepository<RoleGroup, Integer> {
	
	@Query(value = "select new com.kamkanakdurga.sms.user.dto.FirstLevelMenuDTO(APUR.menuGroupId, APMG.name, APMG.description, APMG.url) from RoleGroup as APUR inner join MenuGroups as APMG on APMG.id = APUR.menuGroupId where APUR.roleId = ?1 and APUR.InActive = ?2 order by APUR.menuGroupId asc")
	List<FirstLevelMenuDTO> getMenuGroupDetailsByRoleId(int roleId,int InActive);
	
	@Query(value = "select new com.kamkanakdurga.sms.user.dto.MenuInfoDTO(M.id, M.name, M.url, M.description) from Menu as M where M.groupId = ?1 and M.InActive = ?2 order by M.sequence asc")
	List<MenuInfoDTO> getMenuInfo(int groupId,int InActive);
	
	
}
