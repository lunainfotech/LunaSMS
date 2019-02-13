package com.kamkanakdurga.sms.exam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.ExamGrade;

public interface ExamGradeRepository extends JpaRepository<ExamGrade, String>{

}
