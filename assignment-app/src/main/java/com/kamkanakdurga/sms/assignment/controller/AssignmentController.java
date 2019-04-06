package com.kamkanakdurga.sms.assignment.controller;

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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kamkanakdurga.sms.assignment.dto.AssignmentDTO;
import com.kamkanakdurga.sms.assignment.service.AssignmentService;
import com.kamkanakdurga.sms.library.entities.Assignment;
import com.kamkanakdurga.sms.library.entities.AttendanceStatus;
import com.kamkanakdurga.sms.library.entities.Holiday;
import com.kamkanakdurga.sms.library.entities.SchoolClass;
import com.kamkanakdurga.sms.library.entities.SchoolSection;
import com.kamkanakdurga.sms.library.entities.Staff;
import com.kamkanakdurga.sms.library.entities.StaffAttendance;
import com.kamkanakdurga.sms.library.entities.StudentAttendance;
import com.kamkanakdurga.sms.library.entities.Student;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class AssignmentController {

	@Value("${mysql.url}")
	String mysqlUrl;

	@Value("${mysql.port}")
	int mysqlPort;

	@Autowired
	private AssignmentService assignmentService;
	
	/********** Heartbeat Start *********/
	
	@RequestMapping(value = "/assignment/heartbeat", method = RequestMethod.GET)
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

	/********** Heartbeat End *********/
	/********** Assignment Get By School Code Start *********/
	
	@RequestMapping(value = "/assignment/getBySchool", method = RequestMethod.GET)
	@PreAuthorize(
				"hasRole('ROLE_SUPER_ADMIN')"
				+ "or hasRole('ROLE_ADMIN')"
				+ "or hasRole('ROLE_SCHOOL')"
				+ "or hasRole('ROLE_PRINCIPAL')"
				+ "or hasRole('ROLE_TEACHER')"
			)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	
	public List<Assignment> getAssignmentsBySchool(
			@RequestParam("school_code") BigInteger schoolCode
			){
		
		List<Assignment> results = assignmentService.getAssignmentsBySchool(schoolCode);
		return results;
	}

	/********** Assignment Get By School Code End *********/
	/********** Assignment Get By School Code and Class Start *********/
	
	@RequestMapping(value = "/assignment/getBySchoolAndClass", method = RequestMethod.GET)
	@PreAuthorize(
				"hasRole('ROLE_SUPER_ADMIN')"
				+ "or hasRole('ROLE_ADMIN')"
				+ "or hasRole('ROLE_SCHOOL')"
				+ "or hasRole('ROLE_PRINCIPAL')"
				+ "or hasRole('ROLE_TEACHER')"
			)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	
	public List<Assignment> getAssignmentsBySchoolAndClass(
			@RequestParam("school_code") BigInteger schoolCode,
			@RequestParam("class") Integer studentClass
			){
		
		List<Assignment> results = assignmentService.getAssignmentsBySchoolByClass(schoolCode, studentClass);
		return results;
	}
	
	/********** Assignment Get By School Code and Class End *********/
	/********** Assignment Get By School Code And Class and Subject Start *********/
	
	@RequestMapping(value = "/assignment/getBySchoolAndClassAndSubject", method = RequestMethod.GET)
	@PreAuthorize(
				"hasRole('ROLE_SUPER_ADMIN')"
				+ "or hasRole('ROLE_ADMIN')"
				+ "or hasRole('ROLE_SCHOOL')"
				+ "or hasRole('ROLE_PRINCIPAL')"
				+ "or hasRole('ROLE_TEACHER')"
			)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	
	public List<Assignment> getAssignmentBySchoolByClassBySubject(
			@RequestParam("school_code") BigInteger schoolCode,
			@RequestParam("class") int studentClass,
			@RequestParam("subject") int studentSubject
			) {

		List<Assignment> results = assignmentService.getAssignmentBySchoolByClassBySubject(schoolCode, studentClass, studentSubject);
		return results;
	}

	/********** Assignment Get By School Code And Class and Subject End *********/
	/********** Assignment Get By Id Start *********/

	@RequestMapping(value = "/assignment/getById", method = RequestMethod.GET)
	@PreAuthorize(
				"hasRole('ROLE_SUPER_ADMIN')"
				+ "or hasRole('ROLE_ADMIN')"
				+ "or hasRole('ROLE_SCHOOL')"
				+ "or hasRole('ROLE_PRINCIPAL')"
				+ "or hasRole('ROLE_TEACHER')"
			)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	
	public AssignmentDTO getAssignmentsById(
			@RequestParam("id") BigInteger assignmentId
			){
		
		AssignmentDTO results = assignmentService.getAssignmentById(assignmentId);
		return results;
	}

	/********** Assignment Get By ID End *********/
		/********** Assignment Save Start *********/
	
	@PostMapping(value = "/assignment/save")
	@PreAuthorize(
				"hasRole('ROLE_SUPER_ADMIN')"
				+ "or hasRole('ROLE_ADMIN')"
				+ "or hasRole('ROLE_SCHOOL')"
				+ "or hasRole('ROLE_PRINCIPAL')"
				+ "or hasRole('ROLE_TEACHER')"
			)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	
	public Assignment saveAssignment(
			@RequestBody Assignment assignmentInfo
			) {

		Assignment results = assignmentService.saveAssignmentRecord(assignmentInfo);
		return results;
	}
	
	/********** Assignment Save End *********/
	/********** Assignment Delete By Id Start *********/
	
	@DeleteMapping(value = "/assignment/deleteById")
	@PreAuthorize(
				"hasRole('ROLE_SUPER_ADMIN')"
				+ "or hasRole('ROLE_ADMIN')"
				+ "or hasRole('ROLE_SCHOOL')"
				+ "or hasRole('ROLE_PRINCIPAL')"
				+ "or hasRole('ROLE_TEACHER')"
			)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	
	public BigInteger deleteAssignmentsById(
			@RequestParam("id") BigInteger assignmentId
			){
		assignmentService.deleteAssignmentRecord(assignmentId);
		return assignmentId;
	}

	/********** Assignment Delete By Id End *********/
}
