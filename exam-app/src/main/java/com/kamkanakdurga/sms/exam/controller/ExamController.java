package com.kamkanakdurga.sms.exam.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
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

import com.kamkanakdurga.sms.exam.dto.ExamClassDTO;
import com.kamkanakdurga.sms.exam.dto.StudentDTO;
import com.kamkanakdurga.sms.exam.service.ExamService;
import com.kamkanakdurga.sms.library.entities.Exam;
import com.kamkanakdurga.sms.library.entities.ExamGrade;
import com.kamkanakdurga.sms.library.entities.MarksFA;
import com.kamkanakdurga.sms.library.entities.MarksSA;
import com.kamkanakdurga.sms.library.entities.SchoolClass;
import com.kamkanakdurga.sms.library.entities.SchoolSection;
import com.kamkanakdurga.sms.library.entities.StaffAttendance;
import com.kamkanakdurga.sms.library.entities.Student;
import com.kamkanakdurga.sms.library.entities.Subject;
import com.kamkanakdurga.sms.library.entities.SubjectByExam;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;


@RestController
public class ExamController {
	
	@Value("${mysql.url}")
	String mysqlUrl;

	@Value("${mysql.port}")
	int mysqlPort;

	@Autowired
	private ExamService examService;
	
	@Autowired
	
	@RequestMapping(value = "/exam/heartbeat", method = RequestMethod.GET)
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

	@RequestMapping(value = "/exam/all", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<Exam> getAllExams() {

		List<Exam> results = examService.getAllExams();
		return results;
	}
		
	@RequestMapping(value = "/exam/grade", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<ExamGrade> getExamGrade() {

		List<ExamGrade> results = examService.getExamGrade();
		return results;
	}
	
	@RequestMapping(value = "/exam/class", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<ExamClassDTO> getExamClass(@RequestParam("exam_id") int examId) {

		List<ExamClassDTO> results = examService.getExamClass(examId);
		return results;
	}

	@RequestMapping(value = "/exam/subjects", method = RequestMethod.GET)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<Subject> getExamSubjects() {

		List<Subject> results = examService.getAllSubjects();
		return results;
	}
}
