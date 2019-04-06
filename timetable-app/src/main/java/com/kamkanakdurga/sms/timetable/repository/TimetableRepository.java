package com.kamkanakdurga.sms.timetable.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.kamkanakdurga.sms.library.entities.Timetable;


public interface TimetableRepository extends JpaRepository<Timetable, Integer>{

	List<Timetable> findBySchoolCodeAndStudentClass(BigInteger schoolCode, Integer schoolClass);
}
