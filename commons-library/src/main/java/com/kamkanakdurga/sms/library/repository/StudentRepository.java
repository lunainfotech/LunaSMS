package com.kamkanakdurga.sms.library.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.library.dto.StudentDTO;
import com.kamkanakdurga.sms.library.entities.Student;

public interface StudentRepository extends JpaRepository<Student, Integer>  {
	
	@Query("SELECT new com.kamkanakdurga.sms.library.dto.StudentDTO("
			+ "S.studentCode, "
			+ "S.schoolCode, "
			+ "S.studentFirstName, "
			+ "S.studentLastName, "
			+ "S.studentDOB, "
			+ "S.studentGender, "
			+ "S.aadharNumber, "
			+ "S.admissionNo, "
			+ "S.studentClass, "
			+ "S.studentSection, "
			+ "S.studentRoll, "
			+ "S.studentJoinDate, "
			+ "S.studentAdmissionClass, "
			+ "S.studentAddress1, "
			+ "S.studentAddress2 , "
			+ "S.studentAddress3, "
			+ "S.studentPin, "
			+ "S.studentVillageCode, "
			+ "S.studentMandalCode, "
			+ "S.studentDistrictCode, "
			+ "S.studentStateCode, "
			+ "S.studentFatherName, "
			+ "S.studentFatherOccupation, "
			+ "S.studentFatherIncom, "
			+ "S.studentFatherMobile, "
			+ "S.studentFatherEmail, "
			+ "S.studentMothername, "
			+ "S.studentMotherOccupation, "
			+ "S.studentMotherMobile, "
			+ "S.studentLandline, "
			+ "S.studentBloodGroup, "
			+ "S.studentReligion, "
			+ "S.studentCaste, "
			+ "S.studentCasteCertNo, "
			+ "S.studentHeight, "
			+ "S.studentWeight, "
			+ "S.studentCreationDate, "
			+ "S.studentUpdateDate "
			+ ") "
			+ "FROM Student as S "
			+ "WHERE S.studentCode = ?1"
			)
	
	List<StudentDTO> findStudentbyStudentCode(BigInteger studentCode);
	
	@Query("SELECT new com.kamkanakdurga.sms.library.dto.StudentDTO("
			+ "S.studentCode, "
			+ "S.schoolCode, "
			+ "S.studentFirstName, "
			+ "S.studentLastName, "
			+ "S.studentDOB, "
			+ "S.studentGender, "
			+ "S.aadharNumber, "
			+ "S.admissionNo, "
			+ "S.studentClass, "
			+ "S.studentSection, "
			+ "S.studentRoll, "
			+ "S.studentJoinDate, "
			+ "S.studentAdmissionClass, "
			+ "S.studentAddress1, "
			+ "S.studentAddress2 , "
			+ "S.studentAddress3, "
			+ "S.studentPin, "
			+ "S.studentVillageCode, "
			+ "S.studentMandalCode, "
			+ "S.studentDistrictCode, "
			+ "S.studentStateCode, "
			+ "S.studentFatherName, "
			+ "S.studentFatherOccupation, "
			+ "S.studentFatherIncom, "
			+ "S.studentFatherMobile, "
			+ "S.studentFatherEmail, "
			+ "S.studentMothername, "
			+ "S.studentMotherOccupation, "
			+ "S.studentMotherMobile, "
			+ "S.studentLandline, "
			+ "S.studentBloodGroup, "
			+ "S.studentReligion, "
			+ "S.studentCaste, "
			+ "S.studentCasteCertNo, "
			+ "S.studentHeight, "
			+ "S.studentWeight, "
			+ "S.studentCreationDate, "
			+ "S.studentUpdateDate "
			+ ") "
			+ "FROM Student as S "
			+ "WHERE S.schoolCode = ?1 AND S.studentClass = ?2"
			)
	
	List<StudentDTO> findStudentbySchoolCode(BigInteger schoolCode, Integer studentClass);
}
