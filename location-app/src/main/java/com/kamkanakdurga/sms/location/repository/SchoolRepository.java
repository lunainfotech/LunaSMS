package com.kamkanakdurga.sms.location.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.kamkanakdurga.sms.location.dto.SchoolDTO;
import com.kamkanakdurga.sms.location.dto.SchoolListDTO;
import com.kamkanakdurga.sms.location.entities.School;

public interface SchoolRepository extends JpaRepository<School, Integer> {

	@Query(
			"SELECT new com.kamkanakdurga.sms.location.dto.SchoolListDTO("
			+ "S.id, "
			+ "S.schoolName, "
			+ "S.schoolCode, "
			+ "S.schoolType, "
			+ "S.schoolSubClass, "
			+ "S.districtCode, "
			+ "D.districtName, "
			+ "S.blockCode, "
			+ "M.blockName, "
			+ "S.schoolContactName, "
			+ "S.schoolContactNumber "
			+ ") "
			+ "FROM School AS S "
		    + "JOIN Mandal AS M ON "
		    + "M.blockCode = S.blockCode "
		    + "JOIN District AS D ON "
		    + "D.districtCode = S.districtCode"
			)
	Page<SchoolListDTO> findAllSchoolRecords(Pageable pageable);

	@Query(""
			+ "SELECT new com.kamkanakdurga.sms.location.dto.SchoolListDTO("
			+ "S.id, "
			+ "S.schoolName, "
			+ "S.schoolCode, "
			+ "S.schoolType, "
			+ "S.schoolSubClass, "
			+ "S.districtCode, "
			+ "D.districtName, "
			+ "S.blockCode, "
			+ "M.blockName, "
			+ "S.schoolContactName, "
			+ "S.schoolContactNumber "
			+ ") "
			+ "FROM School AS S "
			+ "JOIN Mandal AS M ON "
			+ "M.blockCode = S.blockCode "
		    + "JOIN District AS D ON "
		    + "D.districtCode = S.districtCode "
			+ "WHERE S.blockCode = ?1")
	Page<SchoolListDTO> findAllSchoolRecordsByBlockCode(int blockCode, Pageable pageable);

	@Query(""
			+ "SELECT new com.kamkanakdurga.sms.location.dto.SchoolListDTO("
			+ "S.id, "
			+ "S.schoolName, "
			+ "S.schoolCode, "
			+ "S.schoolType, "
			+ "S.schoolSubClass, "
			+ "S.districtCode, "
			+ "D.districtName, "
			+ "S.blockCode, "
			+ "M.blockName, "
			+ "S.schoolContactName, "
			+ "S.schoolContactNumber "
			+ ") "
			+ "FROM School AS S "
			+ "join Mandal AS M ON "
			+ "M.blockCode = S.blockCode "
		    + "JOIN District AS D ON "
		    + "D.districtCode = S.districtCode "
			+ "WHERE S.districtCode = ?1")
	Page<SchoolListDTO> findAllSchoolRecordsByDistrictCode(int districtCode, Pageable pageable);

	
	@Query(""
			+ "SELECT new com.kamkanakdurga.sms.location.dto.SchoolDTO("
			+ "S.id, "
			+ "S.districtCode, "
			+ "D.districtName, "
			+ "S.blockCode, "
			+ "M.blockName, "
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
			+ "S.schoolSubClass "
			+ ") "
			+ "FROM School AS S "
			+ "JOIN Mandal AS M ON "
			+ "M.blockCode = S.blockCode "
			+ "JOIN District AS D ON "
			+ "D.districtCode = S.districtCode "
			+ "WHERE S.schoolCode = ?1")
	List<SchoolDTO> findSchoolRecordBySchoolCode(BigInteger schoolCode);

}
