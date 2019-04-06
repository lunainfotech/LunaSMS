package com.kamkanakdurga.sms.assignment.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.Assignment;


public interface AssignmentRepository extends JpaRepository<Assignment, Integer> {
	
	List<Assignment> findBySchoolCode(BigInteger schoolCode);
	
	List<Assignment> findBySchoolCodeAndStudentClass(BigInteger schoolCode, int studentClass);

	List<Assignment> findBySchoolCodeAndStudentClassAndStudentSubject(BigInteger schoolCode, int studentClass, int studentSubject);
	
	Assignment findById(BigInteger id);
	
	List<Assignment> deleteById(BigInteger id);
}
