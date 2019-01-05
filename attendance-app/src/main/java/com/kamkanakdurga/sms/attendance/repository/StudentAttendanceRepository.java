package com.kamkanakdurga.sms.attendance.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.attendance.dto.StudentAttendanceRecordDTO;
import com.kamkanakdurga.sms.attendance.entities.StudentAttendanceInfo;

@Repository
public interface StudentAttendanceRepository extends JpaRepository<StudentAttendanceInfo, String> {
	
	@SuppressWarnings("unchecked")
	StudentAttendanceInfo save(StudentAttendanceInfo studentAttendanceInfo);
		
//	@Query(value = "select STU.classNo as classNo, STU.section as section, STU.rollNo as rollNo, STU.studentFirstName as studentFirstName, STU.studentLastName as studentLastName, STU_ATT.attendanceStatus as attendanceStatus from StudentInfo as STU, StudentAttendanceInfo as STU_ATT where STU.schoolCode = STU_ATT.schoolCode and STU.schoolCode = ?1 and STU.classNo = ?2 and STU.section = ?3 order by STU_ATT.attendanceUpdate desc")
//	List<StudentAttendanceRecordDTO> findBySchoolCodeAndClassNoAndSection(BigInteger schoolCode, int classNo, String section);
//	
//	@Query(value = "select STU.classNo as classNo, STU.section as section, STU.rollNo as rollNo, STU.studentFirstName as studentFirstName, STU.studentLastName as studentLastName, STU_ATT.attendanceStatus as attendanceStatus from StudentInfo as STU, StudentAttendanceInfo as STU_ATT where STU.studentCode = STU_ATT.studentCode and STU_ATT.studentCode = ?1 AND STU.schoolCode = ?2 and STU.classNo = ?3 and STU.section = ?4 order by STU_ATT.attendanceUpdate desc")
//	List<StudentAttendanceRecordDTO> findByStudentCodeAndSchoolCodeAndClassNoAndSection(BigInteger studentCode, BigInteger schoolCode, int classNo, String section);

	@Query(value = "select new com.lunainfotech.lunasms.attendance.dto.StudentAttendanceRecordDTO(STU.classNo, STU.section, STU.rollNo, STU.studentFirstName, STU.studentLastName, STU_ATT.attendanceStatus) from StudentInfo as STU, StudentAttendanceInfo as STU_ATT where STU.schoolCode = STU_ATT.schoolCode and STU.schoolCode = ?1 and STU.classNo = ?2 and STU.section = ?3 order by STU_ATT.attendanceUpdate desc")
	List<StudentAttendanceRecordDTO> findBySchoolCodeAndClassNoAndSection(BigInteger schoolCode, int classNo, String section);
	
	@Query(value = "select new com.lunainfotech.lunasms.attendance.dto.StudentAttendanceRecordDTO(STU.classNo, STU.section, STU.rollNo, STU.studentFirstName, STU.studentLastName, STU_ATT.attendanceStatus) from StudentInfo as STU, StudentAttendanceInfo as STU_ATT where STU.studentCode = STU_ATT.studentCode and STU_ATT.studentCode = ?1 AND STU.schoolCode = ?2 and STU.classNo = ?3 and STU.section = ?4 order by STU_ATT.attendanceUpdate desc")
	List<StudentAttendanceRecordDTO> findByStudentCodeAndSchoolCodeAndClassNoAndSection(BigInteger studentCode, BigInteger schoolCode, int classNo, String section);
	
}