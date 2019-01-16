package com.kamkanakdurga.sms.location.service;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.location.entities.School;
import com.kamkanakdurga.sms.location.repository.SchoolRepository;

@Service
public class LocationService {

	@Autowired
	private SchoolRepository schoolRepository;

	@SuppressWarnings("deprecation")
	public Page<School> findAllSchoolRecords(int page, int records) {
		if (page <= 1) {
			page = 0;
		} else {
			page--;
		}
		if (records <= 0) {
			records = 25;
		}
		return schoolRepository.findAllSchoolRecords(new PageRequest(page, records));
	}

	public long totalSchoolRecords() {
		return schoolRepository.count();
	}

	@SuppressWarnings("deprecation")
	public Page<School> findAllSchoolRecordsByBlockCode(int blockCode, int page, int records) {
		if (page <= 1) {
			page = 0;
		} else {
			page--;
		}
		if (records <= 0) {
			records = 25;
		}
		return schoolRepository.findAllSchoolRecordsByBlockCode(blockCode, new PageRequest(page, records));
	}

	@SuppressWarnings("deprecation")
	public Page<School> findAllSchoolRecordsByDistrictCode(int districtCode, int page, int records) {
		if (page <= 1) {
			page = 0;
		} else {
			page--;
		}
		if (records <= 0) {
			records = 25;
		}
		return schoolRepository.findAllSchoolRecordsByDistrictCode(districtCode, new PageRequest(page, records));
	}
	
	public School findSchoolRecordBySchoolCode(BigInteger schoolCode) {
		return schoolRepository.findSchoolRecordBySchoolCode(schoolCode);
	}

}
