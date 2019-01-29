package com.kamkanakdurga.sms.location.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.library.entities.District;

public interface DistrictRepository extends JpaRepository<District, Integer> {

	@Query("SELECT new com.kamkanakdurga.sms.library.entities.District(" 
					+ "D.id, " 
					+ "D.districtCode, "
					+ "D.districtName " + ") " 
					+ "FROM District as D")
	List<District> findAllDistrict();
}
