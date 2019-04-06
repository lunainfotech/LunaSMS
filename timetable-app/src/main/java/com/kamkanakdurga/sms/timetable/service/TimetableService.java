package com.kamkanakdurga.sms.timetable.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.library.entities.Assignment;
import com.kamkanakdurga.sms.library.entities.MarksFA;
import com.kamkanakdurga.sms.library.entities.Timetable;
import com.kamkanakdurga.sms.timetable.repository.TimetableRepository;

@Service
public class TimetableService {
	
	@Autowired
	private TimetableRepository timetableRepository;
	
	
	public List<Timetable> getTimetableBySchoolAndClass(BigInteger schoolCode, Integer studentClass) {
		
		List<Timetable> result = timetableRepository.findBySchoolCodeAndStudentClass(schoolCode, studentClass);
		 
		return result;
	}
	
	public List<Timetable> saveTimetable(Iterable<Timetable> timetableArray) {
		
		List<Timetable> result = timetableRepository.saveAll(timetableArray);
		 
		return result;
	}	
}
