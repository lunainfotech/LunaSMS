package com.lunainfotech.lunasms.attendance.controller;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.lunainfotech.lunasms.attendance.dto.StudentAttendanceRecordDTO;
import com.lunainfotech.lunasms.attendance.entities.StudentAttendanceInfo;
import com.lunainfotech.lunasms.attendance.entities.StudentInfo;
import com.lunainfotech.lunasms.attendance.service.AttendanceService;

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
	
	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping(value = "/attendance/heartbeat", method = RequestMethod.GET)
	@ApiResponses(value = {
		      @ApiResponse(code = 400, message = "Something went wrong"), 
		      @ApiResponse(code = 403, message = "Access denied"), 
		      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
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
	
	@RequestMapping(value = "/attendance/getStudentsRecord", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') "
			+ "or hasRole('ROLE_ADMIN') "
			+ "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') "
			+ "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = {
		      @ApiResponse(code = 400, message = "Something went wrong"), 
		      @ApiResponse(code = 403, message = "Access denied"), 
		      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public String getStudentsRecord(@RequestParam("school_code") BigInteger schoolCode, @RequestParam("class") int classNo, @RequestParam("section") String section) {
		List<StudentInfo> studentInfo = attendanceService.findStudentsRecord(schoolCode, classNo, section);
		return parseToJsonString(studentInfo);
    }
	
	
	@RequestMapping(value = "/attendance/createStudentsAttendanceRecord", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') "
			+ "or hasRole('ROLE_ADMIN') "
			+ "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') "
			+ "or hasRole('ROLE_TEACHER')")
	@ApiImplicitParams({@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = {
		      @ApiResponse(code = 400, message = "Something went wrong"), 
		      @ApiResponse(code = 403, message = "Access denied"), 
		      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public Map<String, String> createNewStudentsAttendanceRecord(@RequestBody StudentAttendanceInfo[] studentAttendanceInfoArray) {
		HashMap<String, String> map = new HashMap<>();
		if(studentAttendanceInfoArray != null && studentAttendanceInfoArray.length > 0) {
			for (StudentAttendanceInfo studentAttendanceInfo : studentAttendanceInfoArray) {
				attendanceService.saveStudentsAttendanceInfo(studentAttendanceInfo);
			}
			map.put("status", "ok");
    		map.put("response Code","200");
    		map.put("message", "records inserted sucessfully");
		    return map;
		}
		else{
			map.put("status", "not_ok");
    		map.put("message", "records not inserted!");
			return map;
		}
    }
	
	@RequestMapping(value = "/attendance/getStudentsAttendanceRecord", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') "
			+ "or hasRole('ROLE_ADMIN') "
			+ "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') "
			+ "or hasRole('ROLE_TEACHER') "
			+ "or hasRole('ROLE_MEO') "
			+ "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT')")
	@ApiImplicitParams({@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = {
		      @ApiResponse(code = 400, message = "Something went wrong"), 
		      @ApiResponse(code = 403, message = "Access denied"), 
		      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public String getStudentsAttendanceRecord(@RequestParam("school_code") BigInteger schoolCode, @RequestParam("class") int classNo, @RequestParam("section") String section) {
		List<StudentAttendanceRecordDTO> studentsAttendance = attendanceService.findStudentsAttendanceRecord(schoolCode, classNo, section);
		return parseToJsonString(studentsAttendance);
    }
	
	@RequestMapping(value = "/attendance/getStudentAttendanceRecord", method = RequestMethod.GET, produces="application/json")
	@ResponseBody
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') "
			+ "or hasRole('ROLE_ADMIN') "
			+ "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') "
			+ "or hasRole('ROLE_TEACHER') "
			+ "or hasRole('ROLE_STUDENT') "
			+ "or hasRole('ROLE_PARENT') "
			+ "or hasRole('ROLE_MEO') "
			+ "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT')")
	@ApiImplicitParams({@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = {
		      @ApiResponse(code = 400, message = "Something went wrong"), 
		      @ApiResponse(code = 403, message = "Access denied"), 
		      @ApiResponse(code = 500, message = "Expired or invalid JWT token")})
    public String getStudentAttendanceRecord(@RequestParam("school_code") BigInteger schoolCode, @RequestParam("student_code") BigInteger studentCode,  @RequestParam("class") int classNo, @RequestParam("section") String section) {
		List<StudentAttendanceRecordDTO> studentAttendance = attendanceService.findStudentAttendanceRecord(studentCode, schoolCode, classNo, section);
		return parseToJsonString(studentAttendance);
    }
    
	private <T> String parseToJsonString(List<T> studentInfo) {
		Gson gson = new Gson();
		@SuppressWarnings("serial")
		Type type = new TypeToken<List<T>>(){}.getType();
        String json = gson.toJson(studentInfo, type);
        return json;
	}
}
