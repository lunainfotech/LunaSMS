package com.kamkanakdurga.sms.exam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.kamkanakdurga.sms.library.entities.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{
		
	List<Subject> findByExamType(int examType);
}
