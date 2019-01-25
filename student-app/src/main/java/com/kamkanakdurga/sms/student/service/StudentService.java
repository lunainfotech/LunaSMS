package com.kamkanakdurga.sms.student.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.student.entities.District;
import com.kamkanakdurga.sms.student.entities.Student;
import com.kamkanakdurga.sms.student.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getStudentRecordsBySchoolCode(int studentCode) {
		List<Student> result = studentRepository.findStudentbyStudentCode(studentCode);
		return result;
	}

}
