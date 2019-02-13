package com.kamkanakdurga.sms.attendance.service;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.library.entities.StudentAttendance;
import com.kamkanakdurga.sms.library.entities.Student;
import com.kamkanakdurga.sms.library.entities.AttendanceStatus;
import com.kamkanakdurga.sms.library.entities.SchoolClass;
import com.kamkanakdurga.sms.library.entities.SchoolSection;
import com.kamkanakdurga.sms.library.entities.Staff;
import com.kamkanakdurga.sms.library.entities.StaffAttendance;
import com.kamkanakdurga.sms.attendance.dto.ViewAttendanceDTO;
import com.kamkanakdurga.sms.attendance.dto.ViewAttendanceStaffDTO;
import com.kamkanakdurga.sms.attendance.repository.AttendanceStatusRepository;
import com.kamkanakdurga.sms.attendance.repository.SchoolClassRepository;
import com.kamkanakdurga.sms.attendance.repository.SchoolSectionRepository;
import com.kamkanakdurga.sms.attendance.repository.StaffAttendanceRepository;
import com.kamkanakdurga.sms.attendance.repository.StaffRepository;
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
	
	@Autowired
	private AttendanceStatusRepository attendanceStatusRepository;	
	
	@Autowired
	private StaffRepository staffRepository;	
	
	@Autowired
	private StaffAttendanceRepository staffAttendanceRepository;
	
	public List<AttendanceStatus> getAttendanceStatus() {
		List<AttendanceStatus> result = attendanceStatusRepository.findAll();
		return result;
	}

	public List<StudentAttendance> saveStudentsAttendance(Iterable<StudentAttendance> studentAttendanceArray, BigInteger schoolCode, int studentClass, int studentSection) {
		List<StudentAttendance> result = null;
		if (studentAttendanceRepository.attendanceExists(schoolCode, studentClass, studentSection) == 0) {
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

	public List<Student> getStudentRecords(BigInteger schoolCode, int studentClass,
			int studentSection) {
		List<Student> result = studentRepository.findBySchoolCodeAndStudentClassAndStudentSection(schoolCode,
				studentClass, studentSection);
		return result;

	}
	public List<ViewAttendanceDTO> getStudentsAttendance(BigInteger schoolCode, int studentClass, int studentSection, Timestamp attendanceDate) {
		List<ViewAttendanceDTO> result = studentAttendanceRepository.getStudentsAttendance(schoolCode, studentClass, studentSection, attendanceDate);
		return result;

	}
	public List<StudentAttendance> getStudentsAttendanceSelf(BigInteger studentCode, Timestamp attendanceDateFrom, Timestamp attendanceDateTo) {
		List<StudentAttendance> result = studentAttendanceRepository.getStudentsAttendanceSelf(studentCode, attendanceDateFrom, attendanceDateTo);
		return result;

	}
	
	/* Staff Attendance */
	public List<StaffAttendance> saveStaffsAttendance(Iterable<StaffAttendance> staffAttendanceArray, BigInteger schoolCode) {
		List<StaffAttendance> result = null;
		if (staffAttendanceRepository.attendanceExists(schoolCode) == 0) {
			result = staffAttendanceRepository.saveAll(staffAttendanceArray);
			return result;
		} else {

			return result;
		}

	}
	
	public List<Staff> getStaffRecords(BigInteger schoolCode) {
		List<Staff> result = staffRepository.findBySchoolCode(schoolCode);
		return result;

	}

	public List<ViewAttendanceStaffDTO> getStaffsAttendance(BigInteger schoolCode,Timestamp attendanceDate) {
		List<ViewAttendanceStaffDTO> result = staffAttendanceRepository.getStaffsAttendance(schoolCode, attendanceDate);
		return result;

	}
	public List<ViewAttendanceStaffDTO> getStaffAttendanceSelf(BigInteger staffCode, Timestamp attendanceDateFrom, Timestamp attendanceDateTo) {
		List<ViewAttendanceStaffDTO> result = staffAttendanceRepository.getStaffAttendanceSelf(staffCode, attendanceDateFrom, attendanceDateTo);
		return result;

	}
}
