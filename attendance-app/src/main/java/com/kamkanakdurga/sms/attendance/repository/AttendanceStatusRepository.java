package com.kamkanakdurga.sms.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.AttendanceStatus;

public interface AttendanceStatusRepository extends JpaRepository<AttendanceStatus, String>{
	

}
