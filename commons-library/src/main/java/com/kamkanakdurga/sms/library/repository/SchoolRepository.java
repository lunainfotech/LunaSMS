package com.kamkanakdurga.sms.library.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.library.entities.School;

public interface SchoolRepository extends JpaRepository <School, Integer>{
	
	@Query("SELECT new com.kamkanakdurga.sms.library.dto.SchoolDTO("
			+ "S.id, "
			+ "S.districtCode, "
			+ "S.districtName, "
			+ "S.blockCode, "
			+ "S.blockName, "
			+ "S.schoolCode, "
			+ "S.schoolName, "
			+ "S.schoolArea, "
			+ "S.schoolAddress, "
			+ "S.schoolPin, "
			+ "S.schoolContactName, "
			+ "S.schoolContactNumber, "
			+ "S.schoolEmailId, "
			+ "S.schoolLatitude, "
			+ "S.schoolLongitude, "
			+ "S.schoolOfInc, "
			+ "S.schoolMaxStudent, "
			+ "S.schoolMaxTeacher, "
			+ "S.schoolMaxStaff, "
			+ "S.schoolType, "
			+ "S.schoolSubClass"
			+ ") "
			+ "FROM School as S "
			+ "WHERE S.schoolCode = ?1"
			)
	
	List<School> findSchoolbySchoolCode(BigInteger schoolCode);

}
