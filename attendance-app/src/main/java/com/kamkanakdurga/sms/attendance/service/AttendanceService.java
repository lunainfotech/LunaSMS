package com.kamkanakdurga.sms.attendance.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.attendance.entities.StudentAttendance;
import com.kamkanakdurga.sms.attendance.entities.StudentInfo;
import com.kamkanakdurga.sms.attendance.entities.SchoolClass;
import com.kamkanakdurga.sms.attendance.entities.SchoolSection;
import com.kamkanakdurga.sms.attendance.repository.SchoolClassRepository;
import com.kamkanakdurga.sms.attendance.repository.SchoolSectionRepository;
import com.kamkanakdurga.sms.attendance.repository.StudentAttendanceRepository;
import com.kamkanakdurga.sms.attendance.repository.StudentRepository;

@Service
public class AttendanceService {

	@Autowired
	private StudentAttendanceRepository studentAttendanceRepository;
	
	@Autowired
	private SchoolClassRepository schoolClassRepository;
	
	@Autowired
	private SchoolSectionRepository schoolSectionRepository;
	
	@Autowired
	private StudentRepository studentRepository;

	public List<StudentAttendance> saveStudentsAttendance(Iterable<StudentAttendance> studentAttendanceArray) {
		List<StudentAttendance> result  = null;
		if (studentAttendanceRepository.attendanceExists() == 0 ) {
			result = studentAttendanceRepository.saveAll(studentAttendanceArray);
			return result;
		} else {
			
			return result;
		}
		
	}
	public List<SchoolClass> getSchoolClass() {
		List<SchoolClass> result = schoolClassRepository.findAll();
		return result;
	}
	
	public List<SchoolSection> getSchoolSectionByClassId(int classId) {
		List<SchoolSection> result = schoolSectionRepository.findAllByClassId(classId);
		return result;
	}
	
	public List<StudentInfo> findBySchoolCodeAndStudentClassAndStudentSection(BigInteger schoolCode, int studentClass, int studentSection){
		List<StudentInfo> result = studentRepository.findBySchoolCodeAndStudentClassAndStudentSection(schoolCode, studentClass, studentSection);
		return result;
		
	}
}
