package com.kamkanakdurga.sms.exam.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.exam.dto.ExamClassDTO;
import com.kamkanakdurga.sms.exam.dto.ExamStudentsFADTO;
import com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO;
import com.kamkanakdurga.sms.exam.dto.ExamSubjectDTO;
import com.kamkanakdurga.sms.exam.dto.StudentDTO;
import com.kamkanakdurga.sms.exam.repository.ExamClassRepository;
import com.kamkanakdurga.sms.exam.repository.ExamGradeRepository;
import com.kamkanakdurga.sms.exam.repository.ExamRepository;
import com.kamkanakdurga.sms.exam.repository.MarksFARepository;
import com.kamkanakdurga.sms.exam.repository.StudentRepository;
import com.kamkanakdurga.sms.exam.repository.SubjectRepository;
import com.kamkanakdurga.sms.library.entities.Exam;
import com.kamkanakdurga.sms.library.entities.ExamGrade;
import com.kamkanakdurga.sms.library.entities.MarksFA;
import com.kamkanakdurga.sms.library.entities.Subject;

@Service
public class ExamService {

	@Autowired
	private ExamRepository examRepository;
	
	@Autowired
	private SubjectRepository subjectRepository;
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private ExamGradeRepository examGradeRepository;
	
	@Autowired
	private ExamClassRepository examClassRepository;
	
	@Autowired
	private MarksFARepository marksFARepository;
	
	public List<Exam> getAllExams() {
		List<Exam> result = examRepository.findAll();
		return result;
	}
	
	public List<ExamSubjectDTO> getExamSubjects(int examId, int classId) {
		List<ExamSubjectDTO> result = examRepository.getExamSubjects(examId, classId);
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
	
	public List<ExamStudentsFADTO> getExamStudentsFA(BigInteger schoolCode, int examId, int classId, int subjectId) {
		List<ExamStudentsFADTO> results = new ArrayList<ExamStudentsFADTO>();
		List<StudentDTO> students = studentRepository.getStudentByClass(schoolCode, classId);
		List<ExamStudentsSADTO> marksFas = marksFARepository.getExamStudentsFA(schoolCode, examId, classId, subjectId);
		
		for(StudentDTO student : students) {
			for(ExamStudentsSADTO marksFa : marksFas) {
				if(student.getStudentCode().equals(marksFa.getStudentCode())) {
					ExamStudentsFADTO examStudentsFADTO = new ExamStudentsFADTO(
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							marksFa.getExam(), 
							marksFa.getSubject(), 
							marksFa.getTermOne(), 
							marksFa.getTermOneAttendance(), 
							marksFa.getTermTwo(), 
							marksFa.getTermTwoAttendance(), 
							marksFa.getTermThree(), 
							marksFa.getTermThreeAttendance(), 
							marksFa.getTermFour(), 
							marksFa.getTermFourAttendance());
					results.add(examStudentsFADTO);
				}
				else {
					ExamStudentsFADTO examStudentsFADTO = new ExamStudentsFADTO(
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							marksFa.getExam(), 
							marksFa.getSubject(), 
							-1, 
							1, 
							-1, 
							1, 
							-1, 
							1, 
							-1, 
							1);
					results.add(examStudentsFADTO);
				}
			}
			if(marksFas.size()==0) {
				ExamStudentsFADTO examStudentsFADTO = new ExamStudentsFADTO(
						student.getSchoolCode(), 
						student.getStudentCode(), 
						student.getStudentRoll(),
						student.getStudentFirstName(), 
						student.getStudentLastName(), 
						examId, 
						subjectId, 
						-1, 
						1, 
						-1, 
						1, 
						-1, 
						1, 
						-1, 
						1);
				results.add(examStudentsFADTO);
			}
		}
		return results;
	}
	
	public List<ExamSubjectDTO> getExamStudentsSA(BigInteger schoolCode, int examId, int classId, int subjectId) {
		List<ExamSubjectDTO> result = examRepository.getExamStudentsSA(schoolCode, examId, classId, subjectId);
		return result;
	}
	
	public List<MarksFA> saveExamStudents(Iterable<MarksFA> marksFAArray) {
		List<MarksFA> result = marksFARepository.saveAll(marksFAArray);
		return result;
	}

}