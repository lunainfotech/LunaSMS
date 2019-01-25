package com.kamkanakdurga.sms.location.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.location.entities.School;
import com.kamkanakdurga.sms.location.dto.SchoolDTO;
import com.kamkanakdurga.sms.location.dto.SchoolListDTO;
import com.kamkanakdurga.sms.location.entities.District;
import com.kamkanakdurga.sms.location.entities.Mandal;
import com.kamkanakdurga.sms.location.repository.DistrictRepository;
import com.kamkanakdurga.sms.location.repository.MandalRepository;
import com.kamkanakdurga.sms.location.repository.SchoolRepository;

@Service
public class LocationService {

	@Autowired
	private SchoolRepository schoolRepository;

	@Autowired
	private MandalRepository mandalRepository;
	
	@Autowired
	private DistrictRepository districtRepository;

	@SuppressWarnings("deprecation")
	public Page<SchoolListDTO> findAllSchoolRecords(int page, int records) {
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
	public Page<SchoolListDTO> findAllSchoolRecordsByBlockCode(int blockCode, int page, int records) {
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
	public Page<SchoolListDTO> findAllSchoolRecordsByDistrictCode(int districtCode, int page, int records) {
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
	
	public List<SchoolDTO> findSchoolRecordBySchoolCode(BigInteger schoolCode) {
		List<SchoolDTO> results =  schoolRepository.findSchoolRecordBySchoolCode(schoolCode);
		return results;
	}
	
	/* Mandal Service */
	public List<Mandal> findMandalRecords() {
		List<Mandal> result = mandalRepository.findAllMandal();
		return result;
	}
	public List<Mandal> findMandalRecordsByDistrictCode(int districtCode) {
		List<Mandal> result = mandalRepository.findMandalByBlockCode(districtCode);
		return result;
	}
	
	/* District Service */
	public List<District> findDistrictRecords() {
		List<District> result = districtRepository.findAllDistrict();
		return result;
	}

}
