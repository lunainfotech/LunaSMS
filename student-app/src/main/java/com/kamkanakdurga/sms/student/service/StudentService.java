package com.kamkanakdurga.sms.student.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.student.entities.Role;
import com.kamkanakdurga.sms.student.entities.Student;
import com.kamkanakdurga.sms.student.repository.StudentRepository;
import com.kamkanakdurga.sms.student.repository.UserRepository;
import com.kamkanakdurga.sms.student.security.JwtTokenProvider;
import com.kamkanakdurga.sms.student.exception.CustomException;

import com.kamkanakdurga.sms.student.entities.User;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private JwtTokenProvider jwtTokenProvider;

	public List<Student> getStudentRecordsBySchoolCode(BigInteger studentCode) {
		List<Student> result = studentRepository.findStudentbyStudentCode(studentCode);
		return result;
	}

	public Student saveStudentRecord(Student studentInfo) {

		User user = new User();
		user.setUsername(String.valueOf(studentInfo.getStudentCode()));
		user.setPassword(String.valueOf(studentInfo.getStudentCode()));
		List<Role> role = new ArrayList<Role>();
		role.add(Role.ROLE_STUDENT);
		user.setRole(role);
		String userToken = null;
		if (!userRepository.existsByUsername(user.getUsername())) {
			user.setPassword(passwordEncoder.encode(user.getPassword()));
			userRepository.save(user);
			userToken = jwtTokenProvider.createToken(user.getUsername(), user.getRole());
		} else {
			throw new CustomException("Username is already in use", HttpStatus.UNPROCESSABLE_ENTITY);
		}
		Student result = new Student();
		if(jwtTokenProvider.validateToken(userToken)) {
			result = studentRepository.save(studentInfo);
		}
		return result;
	}
}
