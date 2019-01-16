package com.kamkanakdurga.sms.location.repository;

import java.math.BigInteger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.location.entities.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

	@Query("select new com.kamkanakdurga.sms.location.entities.School(S.id, S.districtCode, S.districtName, S.blockCode, S.blockName, S.schoolCode, S.schoolName, S.schoolType, S.schoolSubClass) from School as S")
	Page<School> findAllSchoolRecords(Pageable pageable);

	Page<School> findAllSchoolRecordsByBlockCode(int blockCode, Pageable pageable);

	@Query("select new com.kamkanakdurga.sms.location.entities.School(APS.id, APS.districtCode, APS.districtName, APS.blockCode, APS.blockName, APS.schoolCode, APS.schoolName, APS.schoolType, APS.schoolSubClass) from School as APS join Mandal as APM on APM.blockCode = APS.blockCode WHERE APM.districtCode = ?1")
	Page<School> findAllSchoolRecordsByDistrictCode(int dictrictCode, Pageable pageable);

	School findSchoolRecordBySchoolCode(BigInteger schoolCode);

}
