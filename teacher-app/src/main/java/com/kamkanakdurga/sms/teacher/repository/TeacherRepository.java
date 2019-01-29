package com.kamkanakdurga.sms.teacher.repository;

import java.math.BigInteger;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.teacher.dto.TeacherRecordsDTO;
import com.kamkanakdurga.sms.library.entities.Teacher;

public interface TeacherRepository extends JpaRepository<Teacher, Integer> {

	String query = "select new com.kamkanakdurga.sms.teacher.dto.TeacherRecordsDTO(APT.id, APT.districtCode, APT.blockCode, APT.villageCode, APT.schoolCode," 
			+"APT.firstName, APT.lastName, APT.dob, APT.adhaarNo, APT.designation, APT.gender," 
			+"APT.nationality, APT.religion, APT.caste, APT.fatherName, APT.address, APT.village,"
			+"APT.city, APT.state, APT.pincode, APT.mobile, APT.landline, APT.email, APT.doa, APT.doj,"
			+"APT.qualification, APS.schoolName, APV.villageName, APM.blockName, APD.districtName) "
			+ "from Teacher as APT join School as APS on APS.schoolCode = APT.schoolCode join Village as APV "
			+ "on APV.villageCode = APT.villageCode join Mandal as APM on APM.blockCode = APT.blockCode join District as APD"
			+ " on APD.districtCode = APT.districtCode where APT.schoolCode = ?1";

	@Query(query)
	Page<TeacherRecordsDTO> getTeacherRecordsBySchoolCode(BigInteger schoolCode, Pageable pageable);

}
