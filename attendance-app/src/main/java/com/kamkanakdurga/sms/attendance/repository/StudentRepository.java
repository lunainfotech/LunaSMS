package com.kamkanakdurga.sms.attendance.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.library.entities.StudentInfo;

@Repository
public interface StudentRepository extends JpaRepository<StudentInfo, String> {
	
	//List<StudentInfo> findBySchoolCodeAndStudentCodeAndClassNoAndSection(BigInteger schoolCode, BigInteger studentCode, int classNo, String section);
	
	List<StudentInfo> findBySchoolCodeAndStudentClassAndStudentSection(BigInteger schoolCode, int studentClass, int studentSection);
}