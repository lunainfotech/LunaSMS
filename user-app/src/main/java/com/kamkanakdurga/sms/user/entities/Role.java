package com.kamkanakdurga.sms.user.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	ROLE_SUPER_ADMIN, 		//	0
	ROLE_ADMIN,				//	1
	ROLE_SCHOOL,			//	2
	ROLE_PRINCIPAL,			//	3
	ROLE_TEACHER,			//	4
	ROLE_STUDENT,			//	5
	ROLE_PARENT,			//	6
	ROLE_MEO,				//	7
	ROLE_DEO,				//	8
	ROLE_GOVT;				//	9

  public String getAuthority() {
    return name();
  }

}
