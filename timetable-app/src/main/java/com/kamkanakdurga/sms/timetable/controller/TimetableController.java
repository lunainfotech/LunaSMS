package com.kamkanakdurga.sms.timetable.controller;

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

import com.kamkanakdurga.sms.library.entities.Assignment;
import com.kamkanakdurga.sms.library.entities.MarksFA;
import com.kamkanakdurga.sms.library.entities.Timetable;
import com.kamkanakdurga.sms.timetable.service.TimetableService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class TimetableController {

	@Value("${mysql.url}")
	String mysqlUrl;

	@Value("${mysql.port}")
	int mysqlPort;

	@Autowired
	private TimetableService timetableService;
	
	/********** Heartbeat Start *********/
	
	@RequestMapping(value = "/timetable/heartbeat", method = RequestMethod.GET)
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
	/********** Timetable Get By StudentClass Start *********/
	
	@RequestMapping(value = "/timetable/getBySchoolAndClass", method = RequestMethod.GET)
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
	
	public List<Timetable> getAssignmentsBySchool(
			@RequestParam("school_code") BigInteger schoolCode,
			@RequestParam("class") Integer studentClass
			){
		
		List<Timetable> results = timetableService.getTimetableBySchoolAndClass(schoolCode, studentClass);
		return results;
	}
	
	@RequestMapping(value = "/timetable/save/", method = RequestMethod.POST)
	@PreAuthorize(
				"hasRole('ROLE_SUPER_ADMIN') " 
				+ "or hasRole('ROLE_ADMIN') " 
				+ "or hasRole('ROLE_SCHOOL') "
				+ "or hasRole('ROLE_PRINCIPAL') " 
				+ "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({
	@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
	@ApiResponse(code = 403, message = "Access denied"),
	@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<Timetable> saveTimetable(@RequestBody Timetable[] timetableArray) {
		Iterable<Timetable> iterable = Arrays.asList(timetableArray);
		List<Timetable> results = timetableService.saveTimetable(iterable);
		return results;
	}
}
