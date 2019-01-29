package com.kamkanakdurga.sms.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.library.entities.StudentAttendance;

@Repository
public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, String> {
	
	@Query("select count(*) from StudentAttendance as S where DATE(S.attendanceDate) = CURDATE()")
	public Integer attendanceExists();
	
	
}