package com.kamkanakdurga.sms.location.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.location.entities.District;

public interface DistrictRepository extends JpaRepository<District, Integer> {
	
	@Query(
			"SELECT new com.kamkanakdurga.sms.location.entities.District("
			+ "D.id, "
			+ "D.districtCode, "
			+ "D.districtName "
			+ ") "
			+ "FROM District as D"
		)
	List<District> findAllDistrict();
}
