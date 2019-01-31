package com.kamkanakdurga.sms.attendance.repository;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.attendance.dto.ViewAttendanceDTO;
import com.kamkanakdurga.sms.library.entities.StudentAttendance;
import com.kamkanakdurga.sms.library.entities.Student;

@Repository
public interface StudentAttendanceRepository extends JpaRepository<StudentAttendance, String> {
	
	@Query("select count(*) from StudentAttendance as S where S.schoolCode = ?1 and S.studentClass = ?2 and S.studentSection = ?3 and DATE(S.attendanceDate) = CURDATE()")
	public Integer attendanceExists( BigInteger schoolCode, int studentClass, int studentSection);

	@Query("SELECT new com.kamkanakdurga.sms.attendance.dto.ViewAttendanceDTO("
			+ "A.schoolCode, "
			+ "A.studentCode, "
			+ "A.studentClass, "
			+ "A.studentSection, "
			+ "A.attendanceDate, "
			+ "A.attendanceStatus, "
			+ "S.studentFirstName, "
			+ "S.studentLastName, "
			+ "S.studentGender, "
			+ "S.studentRoll) "
			+ "FROM StudentAttendance as A "
			+ "JOIN Student AS S ON S.studentCode = A.studentCode "
			+ "WHERE A.schoolCode = ?1 AND "
			+ "A.studentClass = ?2 AND "
			+ "A.studentSection = ?3 AND "
			+ "DATE(A.attendanceDate) = ?4"
			)
	List<ViewAttendanceDTO> getStudentsAttendance(BigInteger schoolCode, int studentClass, int studentSection, Timestamp attendanceDate);
	
	@Query("SELECT "
			+ "A.schoolCode, "
			+ "A.studentCode, "
			+ "A.studentClass, "
			+ "A.studentSection, "
			+ "A.attendanceDate, "
			+ "A.attendanceStatus "
			+ "FROM StudentAttendance as A "
			+ "WHERE A.studentCode = ?1 AND "
			+ "DATE(A.attendanceDate) >= ?2 AND "
			+ "DATE(A.attendanceDate) <= ?3"
			)
	List<StudentAttendance> getStudentsAttendanceSelf(BigInteger studentlCode, Timestamp attendanceDateFrom, Timestamp attendanceDateTo);
}