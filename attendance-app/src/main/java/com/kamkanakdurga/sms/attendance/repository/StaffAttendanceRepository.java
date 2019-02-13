package com.kamkanakdurga.sms.attendance.repository;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.attendance.dto.ViewAttendanceStaffDTO;
import com.kamkanakdurga.sms.library.entities.StaffAttendance;

public interface StaffAttendanceRepository extends JpaRepository<StaffAttendance, String> {

	@Query("select count(*) from StaffAttendance as S where S.schoolCode = ?1 and DATE(S.attendanceDate) = CURDATE()")
	public Integer attendanceExists( BigInteger staffCode);
	
	@Query("SELECT new com.kamkanakdurga.sms.attendance.dto.ViewAttendanceStaffDTO("
			+ "A.schoolCode, "
			+ "A.staffCode, "
			+ "A.attendanceDate, "
			+ "A.attendanceStatus, "
			+ "S.staffFirstName, "
			+ "S.staffMiddleName, "
			+ "S.staffLastName, "
			+ "S.staffGender, "
			+ "S.designation) "
			+ "FROM StaffAttendance as A "
			+ "JOIN Staff AS S ON S.staffCode = A.staffCode "
			+ "WHERE A.schoolCode = ?1 AND "
			+ "DATE(A.attendanceDate) = ?2"
			)
	List<ViewAttendanceStaffDTO> getStaffsAttendance(BigInteger schoolCode, Timestamp attendanceDate);

	@Query("SELECT new com.kamkanakdurga.sms.attendance.dto.ViewAttendanceStaffDTO("
			+ "A.schoolCode, "
			+ "A.staffCode, "
			+ "A.attendanceDate, "
			+ "A.attendanceStatus, "
			+ "S.staffFirstName, "
			+ "S.staffMiddleName, "
			+ "S.staffLastName, "
			+ "S.staffGender, "
			+ "S.designation) "
			+ "FROM StaffAttendance as A "
			+ "JOIN Staff AS S ON S.staffCode = A.staffCode "
			+ "WHERE A.staffCode = ?1 AND "
			+ "DATE(A.attendanceDate) >= ?2 AND "
			+ "DATE(A.attendanceDate) <= ?3"
			)
	List<ViewAttendanceStaffDTO> getStaffAttendanceSelf(BigInteger studentlCode, Timestamp attendanceDateFrom, Timestamp attendanceDateTo);
}
