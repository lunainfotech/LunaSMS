package com.kamkanakdurga.sms.exam.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO;
import com.kamkanakdurga.sms.library.entities.MarksFA;

public interface MarksFARepository extends JpaRepository<MarksFA, String>{
	
	@Query("SELECT new com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO( "
			+ " FA.id,"
			+ " FA.schoolCode,"
			+ " FA.studentCode,"
			+ " FA.exam,"
			+ " FA.subject,"
			+ " FA.termOne,"
			+ " FA.termOneAttendance,"
			+ " FA.termTwo,"
			+ " FA.termTwoAttendance,"
			+ " FA.termThree,"
			+ " FA.termThreeAttendance,"
			+ " FA.termFour,"
			+ " FA.termFourAttendance )"
			+ " FROM MarksFA AS FA "
			+ "WHERE FA.schoolCode = ?1 AND FA.exam = ?2 AND FA.classId = ?3 AND FA.subject = ?4")
	List<ExamStudentsSADTO> getExamStudentsFA(BigInteger schoolCode, int examId,int classId, int subjectId);
	
}
