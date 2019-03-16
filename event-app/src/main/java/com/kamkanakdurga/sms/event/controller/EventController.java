package com.kamkanakdurga.sms.event.controller;

import java.io.IOException;
import java.math.BigInteger;
import java.net.Socket;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kamkanakdurga.sms.event.dto.HolidayDTO;
import com.kamkanakdurga.sms.event.dto.NoticeDTO;
import com.kamkanakdurga.sms.library.entities.Event;
import com.kamkanakdurga.sms.library.entities.EventAttachment;
import com.kamkanakdurga.sms.library.entities.EventCategory;
import com.kamkanakdurga.sms.library.entities.Holiday;
import com.kamkanakdurga.sms.service.EventService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/event")
@Api(tags = "event")
public class EventController {
	
	@Autowired
	private EventService eventService;
	
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
	@GetMapping(value = "/holidays")
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
	public Page<HolidayDTO> getHolidayRecords(@RequestParam("page") int page, @RequestParam("records") int records) {
		Page<HolidayDTO> holidayRecords = eventService.findAllHolidayRecords(page, records);
		return holidayRecords;
	}
	@PostMapping(value = "/holiday/save")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN')")
	@ApiOperation(value = "Geting menu details of user")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Holiday saveHolidayRecord(@RequestBody Holiday holidayInfo) {
		Holiday result = eventService.saveHolidayRecord(holidayInfo);
		return result;
	}
	
	@PostMapping(value = "/holiday/edit")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN')")
	@ApiOperation(value = "Geting menu details of user")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Holiday editHolidayRecord(@RequestBody Holiday holidayInfo) {
		Holiday result = eventService.editHolidayRecord(holidayInfo);
		return result;
	}	
	
	@GetMapping(value = "/category")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN')")
	@ApiOperation(value = "Geting Event Category")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public List<EventCategory> getEventGategory() {
			List<EventCategory> result = eventService.getEventCategory();
			return result;
		
	}
	
	@PostMapping(value = "/save")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN')")
	@ApiOperation(value = "Geting Event Category")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public Event saveEvent(
				@RequestBody Event eventInfo
			) {
		
			Event result = eventService.saveEvent(eventInfo);
			return result;
		
	}
	
	@GetMapping(value = "/notice")
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
	public Page<NoticeDTO> getNoticeRecords(@RequestParam("school_code") BigInteger schoolCode, @RequestParam("page") int page, @RequestParam("records") int records) {
		Page<NoticeDTO> noticeRecords = eventService.findAllNoticeRecords(schoolCode,page, records);
		return noticeRecords;
	}
}
