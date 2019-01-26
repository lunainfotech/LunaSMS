package com.kamkanakdurga.sms.student.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.student.entities.Student;
import com.kamkanakdurga.sms.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudentRecordsBySchoolCode(BigInteger studentCode) {
		List<Student> result = studentRepository.findStudentbyStudentCode(studentCode);
		return result;
	}

	public Student saveStudentRecord(Student studentInfo) {
		
		Student result = studentRepository.save(studentInfo);
		return result;
	}
}
