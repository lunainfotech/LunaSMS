package com.kamkanakdurga.sms.admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kamkanakdurga.sms.admission.entities.StudentInfo;

@Repository
public interface AdmissionRepository extends JpaRepository<StudentInfo,String> {
   //StudentInfo findByAadhar_number(String aadhar_number);
}