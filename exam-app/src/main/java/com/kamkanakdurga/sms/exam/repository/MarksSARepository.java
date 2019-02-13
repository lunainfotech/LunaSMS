package com.kamkanakdurga.sms.exam.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.MarksSA;


public interface MarksSARepository extends JpaRepository<MarksSA, String>{
	/*

	@Query("SELECT "
			+ "S.schoolCode, "
			+ "S.studentCode, "
			+ "S.studentFirstName, "
			+ "S.studentLastName, "
			+ "S.studentClass, "
			+ "S.studentSection, "
			+ "S.studentRoll "
			+ "FROM MarksFA AS S "
			+ "WHERE S.schoolCode = ?1 AND S.studentClass = ?2 AND S.studentSection = ?3"
			)
	List<MarksFA> findMarksSheetBYSchoolAndClassAndSection(BigInteger studentCode, int studentClass, int studentSection);
	*/
	
	List<MarksSA> findBySchoolCodeAndSubjectAndExam(BigInteger schoolCode, int subject,int exam);
}
