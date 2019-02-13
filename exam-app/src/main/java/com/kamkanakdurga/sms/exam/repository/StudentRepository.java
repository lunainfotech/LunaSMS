package com.kamkanakdurga.sms.exam.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.exam.dto.StudentDTO;
import com.kamkanakdurga.sms.library.entities.Student;

public interface StudentRepository extends JpaRepository <Student, Integer>{

	@Query("SELECT "
			+ "S.schoolCode, "
			+ "S.studentCode, "
			+ "S.studentFirstName, "
			+ "S.studentLastName, "
			+ "S.studentClass, "
			+ "S.studentSection, "
			+ "S.studentRoll "
			+ "FROM Student AS S "
			+ "WHERE S.schoolCode = ?1 AND S.studentClass = ?2 AND S.studentSection = ?3"
			)
	List<Student> findStudents(BigInteger schoolCode, int studentClass, int studentSection);
	
	
	
}
