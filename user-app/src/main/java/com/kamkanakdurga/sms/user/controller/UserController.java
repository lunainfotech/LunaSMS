package com.kamkanakdurga.sms.user.controller;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kamkanakdurga.sms.library.dto.UserDetailsDTO;
import com.kamkanakdurga.sms.library.dto.UserResponseDTO;
import com.kamkanakdurga.sms.library.entities.Role;
import com.kamkanakdurga.sms.library.entities.User;
import com.kamkanakdurga.sms.user.service.MenuService;
import com.kamkanakdurga.sms.library.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/users")
@Api(tags = "users")
public class UserController {

	@Autowired
	private UserService userService;
	
	@Autowired
	private MenuService menuService;

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

	@PostMapping("/signin")
	@ApiOperation(value = "${UserController.signin}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 422, message = "Invalid username/password supplied") })
	public String login(
			@RequestBody User user) {
		return userService.signin(user.getUsername(), user.getPassword());
	}

	@PostMapping("/signup")
	@ApiOperation(value = "${UserController.signup}")
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 422, message = "Username is already in use"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public String signup(@ApiParam("Signup User") @RequestBody User user) {
		return userService.signup(modelMapper.map(user, User.class));
	}	

	@DeleteMapping(value = "/{username}")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') or hasRole('ROLE_ADMIN')")
	@ApiOperation(value = "${UserController.delete}")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 404, message = "The user doesn't exist"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public String delete(@ApiParam("Username") @PathVariable String username) {
		userService.delete(username);
		return username;
	}

	@GetMapping(value = "/{username}")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') or hasRole('ROLE_ADMIN')")
	@ApiOperation(value = "${UserController.search}", response = UserResponseDTO.class)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 404, message = "The user doesn't exist"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public UserResponseDTO search(@ApiParam("Username") @PathVariable String username) {
		return modelMapper.map(userService.search(username), UserResponseDTO.class);
	}
	
	@GetMapping(value = "/me")
	@PreAuthorize("hasRole('ROLE_SUPER_ADMIN') " + "or hasRole('ROLE_ADMIN') " + "or hasRole('ROLE_SCHOOL') "
			+ "or hasRole('ROLE_PRINCIPAL') " + "or hasRole('ROLE_TEACHER') " + "or hasRole('ROLE_STUDENT') "
			+ "or hasRole('ROLE_PARENT') " + "or hasRole('ROLE_MEO') " + "or hasRole('ROLE_DEO') "
			+ "or hasRole('ROLE_GOVT') ")
	@ApiOperation(value = "Geting menu details of user", response = UserDetailsDTO.class)
	@ApiImplicitParams({
			@ApiImplicitParam(name = "Authorization", value = "Authorization token", required = true, dataType = "string", paramType = "header") })
	@ApiResponses(value = { @ApiResponse(code = 400, message = "Something went wrong"),
			@ApiResponse(code = 403, message = "Access denied"),
			@ApiResponse(code = 500, message = "Expired or invalid JWT token") })
	public UserDetailsDTO getMenuDetails(HttpServletRequest req) {
		User user = userService.whoami(req);
		int roleId = Role.valueOf(user.getRole().get(0).toString()).ordinal();
		UserDetailsDTO userDetails = new UserDetailsDTO();
		userDetails.setMenuDetails(menuService.getMenuInfo(roleId));
		UserResponseDTO userResponseDTO = modelMapper.map(user, UserResponseDTO.class);
		userDetails.setUser(userResponseDTO);
		return modelMapper.map(userDetails, UserDetailsDTO.class);
	}

}
