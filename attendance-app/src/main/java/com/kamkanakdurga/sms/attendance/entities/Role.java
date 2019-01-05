package com.kamkanakdurga.sms.attendance.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	ROLE_SUPER_ADMIN,
	ROLE_ADMIN,
	ROLE_SCHOOL,
	ROLE_PRINCIPAL,
	ROLE_TEACHER,
	ROLE_STUDENT,
	ROLE_PARENT,
	ROLE_MEO,
	ROLE_DEO,
	ROLE_GOVT;

  public String getAuthority() {
    return name();
  }

}
