package com.kamkanakdurga.sms.location.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kamkanakdurga.sms.location.dto.SchoolDTO;
import com.kamkanakdurga.sms.location.dto.SchoolListDTO;
import com.kamkanakdurga.sms.location.entities.District;
import com.kamkanakdurga.sms.location.entities.Mandal;
import com.kamkanakdurga.sms.location.entities.School;
import com.kamkanakdurga.sms.location.service.LocationService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/location")
@Api(tags = "location")
public class LocationController {

	@Autowired
	private LocationService locationService;
	
	@Autowired
	private ModelMapper modelMapper;

	@RequestMapping(value = "/heartbeat", method = RequestMethod.GET)
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Map<String, String> heartbeat() {
		HashMap<String, String> map = new HashMap<>();

		try {
			Socket socket = new Socket("localhost", 3306);
			socket.close();
			map.put("status", "ok");
			map.put("message", "Database server is up and running");
		} catch (IOException e) {
			map.put("status", "not_ok");
			map.put("reason", "Database is down");
		}
		return map;
	}
	
	@GetMapping(value = "/school/record")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER') " + "or hasRole('ROLE_STUDENT') "
			+ "or hasRole('ROLE_PARENT') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting school record")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<SchoolDTO> getSchoolRecords(@RequestParam("school_code") BigInteger schoolCode) {
		List<SchoolDTO> schoolRecords = locationService.findSchoolRecordBySchoolCode(schoolCode);
		return schoolRecords;
		//return (SchoolDTO) locationService.findSchoolRecordBySchoolCode(schoolCode);
	}

	@GetMapping(value = "/school/records")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting all school records")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Page<SchoolListDTO> getSchoolRecords(@RequestParam("page") int page, @RequestParam("records") int records) {
		Page<SchoolListDTO> schoolRecords = locationService.findAllSchoolRecords(page, records);
		return schoolRecords;
	}

	@GetMapping(value = "/school/records/block_code")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting school records by block code")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Page<SchoolListDTO> getSchoolRecordsByBlockCode(@RequestParam("block_code") int blockCode,
			@RequestParam("page") int page, @RequestParam("records") int records) {
		Page<SchoolListDTO> schoolRecords = locationService.findAllSchoolRecordsByBlockCode(blockCode, page, records);
		return schoolRecords;
	}

	@GetMapping(value = "/school/records/dictrict_code")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting school records by district code")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Page<SchoolListDTO> getSchoolRecordsByDistrictCode(@RequestParam("district_code") int dictrictCode,
			@RequestParam("page") int page, @RequestParam("records") int records) {
		Page<SchoolListDTO> schoolRecords = locationService.findAllSchoolRecordsByDistrictCode(dictrictCode, page, records);
		return schoolRecords;
	}

	/* Mandal Controller */
	@GetMapping(value = "/mandal/records")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER') " + "or hasRole('ROLE_STUDENT') "
			+ "or hasRole('ROLE_PARENT') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting All District")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<Mandal> getAllMandal() {
		List<Mandal> mandalRecords = locationService.findMandalRecords();
		return mandalRecords;
	}

	
	@GetMapping(value = "/mandal/records/dictrict_code")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER') " + "or hasRole('ROLE_STUDENT') "
			+ "or hasRole('ROLE_PARENT') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting All Mandal")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	
	public List<Mandal> getMandalByDistrictCode(@RequestParam("code") int districtCode) {
		List<Mandal> mandalRecords = locationService.findMandalRecordsByDistrictCode(districtCode);
		return mandalRecords;
	}
	
	/*District Controller*/
	@GetMapping(value = "/district/records")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER') " + "or hasRole('ROLE_STUDENT') "
			+ "or hasRole('ROLE_PARENT') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting All District")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<District> getFindAll() {
		List<District> districtRecords = locationService.findDistrictRecords();
		return districtRecords;
	}
}
