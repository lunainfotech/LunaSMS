package com.kamkanakdurga.sms.exam.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO;
import com.kamkanakdurga.sms.library.entities.MarksSA;


public interface MarksSARepository extends JpaRepository<MarksSA, String>{
	
	@Query("SELECT new com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO("
			+ " SA.id,"
			+ " SA.schoolCode,"
			+ " SA.studentCode,"
			+ " SA.exam,"
			+ " SA.subject,"
			+ " SA.termOne,"
			+ " SA.termOneAttendance)"
			+ " FROM MarksSA AS SA "
			+ "WHERE SA.schoolCode = ?1 AND SA.exam = ?2 AND SA.classId = ?3 AND SA.subject = ?4")
	List getExamStudentsSA_1(BigInteger schoolCode, int examId,int classId, int subjectId);
	
	@Query("SELECT new com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO("
			+ " SA.id,"
			+ " SA.schoolCode,"
			+ " SA.studentCode,"
			+ " SA.exam,"
			+ " SA.subject,"
			+ " SA.termOne,"
			+ " SA.termOneAttendance,"
			+ " SA.termTwo,"
			+ " SA.termTwoAttendance,"
			+ " SA.termThree,"
			+ " SA.termThreeAttendance)"
			+ " FROM MarksSA AS SA "
			+ "WHERE SA.schoolCode = ?1 AND SA.exam = ?2 AND SA.classId = ?3 AND SA.subject = ?4")
	List getExamStudentsSA_3(BigInteger schoolCode, int examId,int classId, int subjectId);
	
	@Query("SELECT new com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO("
			+ " SA.id,"
			+ " SA.schoolCode,"
			+ " SA.studentCode,"
			+ " SA.exam,"
			+ " SA.subject,"
			+ " SA.termOne,"
			+ " SA.termOneAttendance,"
			+ " SA.termTwo,"
			+ " SA.termTwoAttendance,"
			+ " SA.termThree,"
			+ " SA.termThreeAttendance,"
			+ " SA.termFour,"
			+ " SA.termFourAttendance,"
			+ " SA.termFive,"
			+ " SA.termFiveAttendance)"
			+ " FROM MarksSA AS SA "
			+ "WHERE SA.schoolCode = ?1 AND SA.exam = ?2 AND SA.classId = ?3 AND SA.subject = ?4")
	List getExamStudentsSA_5(BigInteger schoolCode, int examId,int classId, int subjectId);
	
	@Query("SELECT new com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO("
			+ " SA.id,"
			+ " SA.schoolCode,"
			+ " SA.studentCode,"
			+ " SA.exam,"
			+ " SA.subject,"
			+ " SA.termOne,"
			+ " SA.termOneAttendance,"
			+ " SA.termTwo,"
			+ " SA.termTwoAttendance,"
			+ " SA.termThree,"
			+ " SA.termThreeAttendance,"
			+ " SA.termFour,"
			+ " SA.termFourAttendance,"
			+ " SA.termFive,"
			+ " SA.termFiveAttendance,"
			+ " SA.termSix,"
			+ " SA.termSixAttendance)"
			+ " FROM MarksSA AS SA "
			+ "WHERE SA.schoolCode = ?1 AND SA.exam = ?2 AND SA.classId = ?3 AND SA.subject = ?4")
	List getExamStudentsSA_6(BigInteger schoolCode, int examId,int classId, int subjectId);

	
}
