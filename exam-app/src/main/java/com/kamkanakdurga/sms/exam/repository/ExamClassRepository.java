package com.kamkanakdurga.sms.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.exam.dto.ExamClassDTO;
import com.kamkanakdurga.sms.library.entities.SubjectByExam;

@Repository
public interface ExamClassRepository extends JpaRepository<SubjectByExam, Integer>{
	
	@Query("SELECT DISTINCT new com.kamkanakdurga.sms.exam.dto.ExamClassDTO(SBE.classId, CL.className ) "
			+ "FROM SubjectByExam AS SBE "
			+ "JOIN SchoolClass as CL ON SBE.classId = CL.id "
			+ "WHERE SBE.examId = ?1")
	List<ExamClassDTO> findClassByExam(int examId);

}
