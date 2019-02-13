package com.kamkanakdurga.sms.user.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.library.entities.RoleGroup;
import com.kamkanakdurga.sms.user.dto.FirstLevelMenuDTO;
import com.kamkanakdurga.sms.user.dto.MenuInfoDTO;

public interface MenuRepository extends JpaRepository<RoleGroup, Integer> {

	@Query(value = "select new com.kamkanakdurga.sms.user.dto.FirstLevelMenuDTO(APUR.menuGroupId, APMG.name, APMG.description, APMG.url, APMG.icon) from RoleGroup as APUR inner join MenuGroups as APMG on APMG.id = APUR.menuGroupId where APUR.roleId = ?1 and APUR.menu is null and APUR.InActive = 0 order by APMG.sequence asc")
	List<FirstLevelMenuDTO> getMenuGroupDetailsByRoleId(int roleId);

	@Query(value = "select new com.kamkanakdurga.sms.user.dto.MenuInfoDTO(APM.id, APM.name, APM.description, APM.url, APM.icon) from RoleGroup as APUR inner join Menu as APM on APM.id = APUR.menu where APUR.roleId = ?1 and APUR.menuGroupId = ?2 and APUR.menu is not null and APUR.InActive = 0 order by APM.sequence asc")
	List<MenuInfoDTO> getMenuInfo(int roleId, int menuGroupId);

}
