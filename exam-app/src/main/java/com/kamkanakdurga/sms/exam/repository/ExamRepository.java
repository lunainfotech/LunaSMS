package com.kamkanakdurga.sms.exam.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.exam.dto.ExamSubjectDTO;
import com.kamkanakdurga.sms.library.entities.Exam;

public interface ExamRepository extends JpaRepository <Exam, Integer>{
	
	@Query("SELECT DISTINCT new com.kamkanakdurga.sms.exam.dto.ExamSubjectDTO(SBE.subjectId, SUB.subjectName ) "
			+ "FROM SubjectByExam AS SBE "
			+ "JOIN Subject as SUB ON SBE.subjectId = SUB.id "
			+ "WHERE SBE.examId = ?1  AND SBE.classId = ?2")
	List<ExamSubjectDTO> getExamSubjects(int examId,int classId);
	
	@Query("SELECT DISTINCT new com.kamkanakdurga.sms.exam.dto.ExamSubjectDTO(SBE.subjectId, SUB.subjectName ) "
			+ "FROM SubjectByExam AS SBE "
			+ "JOIN Subject as SUB ON SBE.subjectId = SUB.id "
			+ "WHERE SBE.examId = ?1  AND SBE.classId = ?2")
	List<ExamSubjectDTO> getExamStudentsSA(BigInteger schoolCode, int examId,int classId, int subjectId);

}
