package com.kamkanakdurga.sms.exam.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.exam.dto.StudentDTO;
import com.kamkanakdurga.sms.library.entities.Student;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer>{

//	@Query("SELECT "
//			+ "S.schoolCode, "
//			+ "S.studentCode, "
//			+ "S.studentFirstName, "
//			+ "S.studentLastName, "
//			+ "S.studentClass, "
//			+ "S.studentSection, "
//			+ "S.studentRoll "
//			+ "FROM Student AS S "
//			+ "WHERE S.schoolCode = ?1 AND S.studentClass = ?2 AND S.studentSection = ?3"
//			)
//	List<Student> findStudents(BigInteger schoolCode, int studentClass, int studentSection);
	
	@Query("SELECT new com.kamkanakdurga.sms.exam.dto.StudentDTO( "
			+ "S.schoolCode, "
			+ "S.studentCode, "
			+ "S.studentFirstName, "
			+ "S.studentLastName, "
			+ "S.studentClass, "
			+ "S.studentRoll )"
			+ "FROM Student AS S "
			+ "WHERE S.schoolCode = ?1 AND S.studentClass = ?2"
			)
	List<StudentDTO> getStudentByClass(BigInteger schoolCode, int studentClass);
	
	
}
