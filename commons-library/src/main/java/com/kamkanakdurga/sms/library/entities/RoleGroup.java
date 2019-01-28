package com.kamkanakdurga.sms.library.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ap_user_role_group")
public class RoleGroup {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "role_id", nullable = false)
	private int roleId;

	@Column(name = "menu_group_id", nullable = false)
	private int menuGroupId;
	
	@Column(name = "menu", nullable = true)
	private int menu;

	@Column(name = "deleted", nullable = false)
	private int deleted;

	@Column(name = "in_active", nullable = false)
	private int InActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public int getMenuGroupId() {
		return menuGroupId;
	}

	public void setMenuGroupId(int menuGroupId) {
		this.menuGroupId = menuGroupId;
	}

	public int getMenu() {
		return menu;
	}

	public void setMenu(int menu) {
		this.menu = menu;
	}

	public int getDeleted() {
		return deleted;
	}

	public void setDeleted(int deleted) {
		this.deleted = deleted;
	}

	public int getInActive() {
		return InActive;
	}

	public void setInActive(int inActive) {
		InActive = inActive;
	}

}
