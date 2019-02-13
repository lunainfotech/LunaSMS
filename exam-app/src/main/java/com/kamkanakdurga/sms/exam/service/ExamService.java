package com.kamkanakdurga.sms.exam.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.exam.dto.ExamClassDTO;
import com.kamkanakdurga.sms.exam.dto.StudentDTO;
import com.kamkanakdurga.sms.exam.repository.ExamClassRepository;
import com.kamkanakdurga.sms.exam.repository.ExamGradeRepository;
import com.kamkanakdurga.sms.exam.repository.ExamRepository;
import com.kamkanakdurga.sms.exam.repository.MarksFARepository;
import com.kamkanakdurga.sms.exam.repository.MarksSARepository;
import com.kamkanakdurga.sms.exam.repository.SchoolClassRepository;
import com.kamkanakdurga.sms.exam.repository.SchoolSectionRepository;
import com.kamkanakdurga.sms.exam.repository.StudentRepository;
import com.kamkanakdurga.sms.exam.repository.SubjectRepository;
import com.kamkanakdurga.sms.library.entities.Exam;
import com.kamkanakdurga.sms.library.entities.ExamGrade;
import com.kamkanakdurga.sms.library.entities.MarksFA;
import com.kamkanakdurga.sms.library.entities.MarksSA;
import com.kamkanakdurga.sms.library.entities.SchoolClass;
import com.kamkanakdurga.sms.library.entities.SchoolSection;
import com.kamkanakdurga.sms.library.entities.StaffAttendance;
import com.kamkanakdurga.sms.library.entities.Student;
import com.kamkanakdurga.sms.library.entities.Subject;
import com.kamkanakdurga.sms.library.entities.SubjectByExam;

@Service
public class ExamService {

	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private ExamGradeRepository examGradeRepository;
	
	@Autowired
	private ExamClassRepository examClassRepository;
	
	
	public List<Exam> getAllExams() {
		List<Exam> result = examRepository.findAll();
		return result;
	}
	
	public List<Subject> getAllSubjects() {
		List<Subject> result = subjectRepository.findAll();
		return result;
	}	
	
	public List<Subject> getAllSubjectsFA(int examType) {
		List<Subject> result = subjectRepository.findByExamType(examType);
		return result;
	}
	
	public List<ExamGrade> getExamGrade() {
		List<ExamGrade> result = examGradeRepository.findAll();
		return result;
	}
	
	public List<ExamClassDTO> getExamClass(int examId) {
		List<ExamClassDTO> result = examClassRepository.findClassByExam(examId);
		return result;
	}

}

