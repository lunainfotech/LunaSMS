package com.kamkanakdurga.sms.teacher.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.teacher.dto.TeacherRecordsDTO;
import com.kamkanakdurga.sms.teacher.repository.TeacherRepository;

@Service
public class TeacherService {

	@Autowired
	private TeacherRepository teacherRepository;
	
	public Page<TeacherRecordsDTO> getTeacherRecordsBySchoolCode(BigInteger schoolCode, int page, int records) {
		return teacherRepository.getTeacherRecordsBySchoolCode(schoolCode, new PageRequest(page,records));
	}
	
	public Page getTeacherRecordsByBlockCode(int blockCode) {
		return null;
	}

	

}
