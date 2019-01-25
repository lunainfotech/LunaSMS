package com.kamkanakdurga.sms.student.entities;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
	ROLE_VOID,				//	0
	ROLE_SUPER_ADMIN, 		//	1
	ROLE_ADMIN,				//	2
	ROLE_SCHOOL,			//	3
	ROLE_PRINCIPAL,			//	4
	ROLE_TEACHER,			//	5
	ROLE_STUDENT,			//	6
	ROLE_PARENT,			//	7
	ROLE_MEO,				//	8
	ROLE_DEO,				//	9
	ROLE_GOVT;				//	10

  public String getAuthority() {
    return name();
  }

}
