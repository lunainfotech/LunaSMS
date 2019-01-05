package com.kamkanakdurga.sms.attendance.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.attendance.dto.StudentAttendanceRecordDTO;
import com.kamkanakdurga.sms.attendance.entities.StudentAttendanceInfo;
import com.kamkanakdurga.sms.attendance.entities.StudentInfo;
import com.kamkanakdurga.sms.attendance.repository.StudentAttendanceRepository;
import com.kamkanakdurga.sms.attendance.repository.StudentRepository;

@Service
public class AttendanceService {

	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private StudentAttendanceRepository studentAttendanceRepository;
	
	public StudentAttendanceInfo saveStudentsAttendanceInfo(StudentAttendanceInfo studentAttendanceInfo) {
		return studentAttendanceRepository.save(studentAttendanceInfo);
	}
	
	public List<StudentAttendanceRecordDTO> findStudentsAttendanceRecord(BigInteger schoolCode,int classNo, String section) {
		List<StudentAttendanceRecordDTO> result = studentAttendanceRepository.findBySchoolCodeAndClassNoAndSection(schoolCode, classNo, section);
		return result;
	}
	
	public List<StudentAttendanceRecordDTO> findStudentAttendanceRecord(BigInteger studentCode,BigInteger schoolCode,int classNo, String section) {
		List<StudentAttendanceRecordDTO> result = studentAttendanceRepository.findByStudentCodeAndSchoolCodeAndClassNoAndSection(studentCode, schoolCode, classNo, section);
		return result;
	}

	public List<StudentInfo> findStudentsRecord(BigInteger schoolCode, int classNo, String section) {
		return studentRepository.findBySchoolCodeAndClassNoAndSection(schoolCode, classNo, section);
	}
	
	public List<StudentInfo> findStudentRecord(BigInteger schoolCode, BigInteger studentCode, int classNo, String section) {
		return studentRepository.findBySchoolCodeAndStudentCodeAndClassNoAndSection(schoolCode, studentCode, classNo, section);
	}
}
