package com.kamkanakdurga.sms.attendance.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kamkanakdurga.sms.attendance.dto.ViewAttendanceDTO;
import com.kamkanakdurga.sms.attendance.service.AttendanceService;
import com.kamkanakdurga.sms.library.entities.SchoolClass;
import com.kamkanakdurga.sms.library.entities.SchoolSection;
import com.kamkanakdurga.sms.library.entities.StudentAttendance;
import com.kamkanakdurga.sms.library.entities.Student;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class AttendanceController {

	@Value("${mysql.url}")
	String mysqlUrl;

	@Value("${mysql.port}")
	int mysqlPort;

	@Autowired
	private AttendanceService attendanceService;

	@RequestMapping(value = "/attendance/heartbeat", method = RequestMethod.GET)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Map<String, String> heartbeat() {
		HashMap<String, String> map = new HashMap<>();

		try {
			Socket socket = new Socket(mysqlUrl, mysqlPort);
			socket.close();
			map.put("status", "ok");
			map.put("message", "Database server is up and running");
		} catch (IOException e) {
			map.put("status", "not_ok");
			map.put("reason", "Database is down");
		}
		return map;
	}

	@RequestMapping(value = "/attendance/students/take", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public HashMap<String, String> takeStudentsAttendanceRecord(
			@RequestBody StudentAttendance[] studentAttendanceArray) {
		HashMap<String, String> map = new HashMap<>();
		if (studentAttendanceArray != null && studentAttendanceArray.length > 0) {
			BigInteger schoolCode = studentAttendanceArray[0].getSchoolCode();
			int studentClass = studentAttendanceArray[0].getStudentClass();
			int studentSection = studentAttendanceArray[0].getStudentSection();
			Iterable<StudentAttendance> iterable = Arrays.asList(studentAttendanceArray);
			List<StudentAttendance> result = attendanceService.saveStudentsAttendance(iterable, schoolCode, studentClass, studentSection);

			if (result == null) {
				map.put("status", "not_ok");
				map.put("response Code", "400");
				map.put("message", "Attendance already taken");
				return map;
			}

			map.put("status", "ok");
			map.put("response Code", "200");
			map.put("message", "records inserted sucessfully");
			return map;

		} else {
			map.put("status", "not_ok");
			map.put("message", "records not inserted!");
			return map;
		}
	}

	@RequestMapping(value = "/attendance/school/class", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<SchoolClass> getSchoolClass() {

		List<SchoolClass> results = attendanceService.getSchoolClass();
		return results;
	}

	@RequestMapping(value = "/attendance/school/section", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<SchoolSection> getSchoolSectionByClassId(@RequestParam("class_id") int classId) {

		List<SchoolSection> results = attendanceService.getSchoolSectionByClassId(classId);
		return results;
	}

	@RequestMapping(value = "/attendance/getstudents", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<Student> getStudentRecords(
			@RequestParam("school_code") BigInteger schoolCode,
			@RequestParam("class") int studentClass,
			@RequestParam("section") int studentSection) {

		List<Student> results = attendanceService.getStudentRecords(schoolCode, studentClass, studentSection);
		return results;
	}
	
	@RequestMapping(value = "/attendance/viewstudents", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<ViewAttendanceDTO> getStudentsAttendance(
			@RequestParam("school_code") BigInteger schoolCode,
			@RequestParam("class") int studentClass,
			@RequestParam("section") int studentSection,
			@RequestParam("date") String date
			) {
		Timestamp attendanceDate = Timestamp.valueOf(date.trim() + " 00:00:00");
		List<ViewAttendanceDTO> results = attendanceService.getStudentsAttendance(schoolCode, studentClass, studentSection, attendanceDate);
		return results;
	}
	
	@RequestMapping(value = "/attendance/student/self", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<StudentAttendance> getStudentsSelf(
			@RequestParam("student_code") BigInteger studentCode,
			@RequestParam("date_from") String date_from,
			@RequestParam("date_to") String date_to
			) {
		Timestamp attendanceDateFrom = Timestamp.valueOf(date_from.trim() + " 00:00:00.000");
		Timestamp attendanceDateTo = Timestamp.valueOf(date_to.trim() + " 00:00:00.000");
		List<StudentAttendance> results = attendanceService.getStudentsAttendanceSelf(studentCode, attendanceDateFrom, attendanceDateTo);
		return results;
	}
}
