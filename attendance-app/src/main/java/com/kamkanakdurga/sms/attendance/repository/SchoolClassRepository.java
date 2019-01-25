package com.kamkanakdurga.sms.attendance.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.attendance.entities.SchoolClass;

public interface SchoolClassRepository extends JpaRepository<SchoolClass, String>{

}
