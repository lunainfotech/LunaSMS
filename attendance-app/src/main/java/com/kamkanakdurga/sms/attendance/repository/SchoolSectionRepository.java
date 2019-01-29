package com.kamkanakdurga.sms.attendance.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.SchoolSection;

public interface SchoolSectionRepository extends JpaRepository<SchoolSection, String>{

	List<SchoolSection> findAllByClassId(int classId);
}