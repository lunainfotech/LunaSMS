package com.kamkanakdurga.sms.exam.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
import com.kamkanakdurga.sms.exam.repository.MarksSARepository;
import com.kamkanakdurga.sms.exam.repository.StudentRepository;
import com.kamkanakdurga.sms.exam.repository.SubjectRepository;
import com.kamkanakdurga.sms.library.entities.Exam;
import com.kamkanakdurga.sms.library.entities.ExamGrade;
import com.kamkanakdurga.sms.library.entities.MarksFA;
import com.kamkanakdurga.sms.library.entities.MarksSA;
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
	
	@Autowired
	private MarksSARepository marksSARepository;
	
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
		List<ExamStudentsFADTO> marksFas = marksFARepository.getExamStudentsFA(schoolCode, examId, classId, subjectId);
		
		for(StudentDTO student : students) {
			for(ExamStudentsFADTO marksFa : marksFas) {
				if(student.getStudentCode().equals(marksFa.getStudentCode())) {
					ExamStudentsFADTO examStudentsFADTO = new ExamStudentsFADTO(
							marksFa.getId(),
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
							BigInteger.valueOf(0),
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
						BigInteger.valueOf(0),
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
	
	public List<ExamStudentsSADTO> getExamStudentsSA(BigInteger schoolCode, int examId, int classId, int subjectId) {
		List<ExamStudentsSADTO> results = new ArrayList<ExamStudentsSADTO>();
		Optional<Subject> subjectElement = subjectRepository.findById(subjectId);
		int saTerm = subjectElement.get().getSaTerm();
		List<StudentDTO> students = studentRepository.getStudentByClass(schoolCode, classId);
		List<ExamStudentsSADTO> marksSas = null;
		if(saTerm == 1) {
			marksSas = marksSARepository.getExamStudentsSA_1(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance());
						results.add(examStudentsSADTO);
					}
					else {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								-1, 
								1);
						results.add(examStudentsSADTO);
					}
				}
				if(marksSas.size()==0) {
					ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
							BigInteger.valueOf(0),
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							examId, 
							subjectId, 
							-1, 
							1);
					results.add(examStudentsSADTO);
				}
			}
		} else if(saTerm == 3){
			marksSas = marksSARepository.getExamStudentsSA_3(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance(),
								marksSa.getTermTwo(), 
								marksSa.getTermTwoAttendance(),
								marksSa.getTermThree(), 
								marksSa.getTermThreeAttendance());
						results.add(examStudentsSADTO);
					}
					else {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								-1, 
								1,
								-1, 
								1,
								-1, 
								1);
						results.add(examStudentsSADTO);
					}
				}
				if(marksSas.size()==0) {
					ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
							BigInteger.valueOf(0),
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
							1);
					results.add(examStudentsSADTO);
				}
			}
		} else if(saTerm == 5){
			marksSas = marksSARepository.getExamStudentsSA_5(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance(),
								marksSa.getTermTwo(), 
								marksSa.getTermTwoAttendance(),
								marksSa.getTermThree(), 
								marksSa.getTermThreeAttendance(),
								marksSa.getTermFour(), 
								marksSa.getTermFourAttendance(),
								marksSa.getTermFive(), 
								marksSa.getTermFiveAttendance());
						results.add(examStudentsSADTO);
					}
					else {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								-1, 
								1,
								-1, 
								1,
								-1, 
								1,
								-1, 
								1,
								-1, 
								1);
						results.add(examStudentsSADTO);
					}
				}
				if(marksSas.size()==0) {
					ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
							BigInteger.valueOf(0),
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
							1,
							-1, 
							1);
					results.add(examStudentsSADTO);
				}
			}
		} else if(saTerm == 6){
			marksSas = marksSARepository.getExamStudentsSA_6(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance(),
								marksSa.getTermTwo(), 
								marksSa.getTermTwoAttendance(),
								marksSa.getTermThree(), 
								marksSa.getTermThreeAttendance(),
								marksSa.getTermFour(), 
								marksSa.getTermFourAttendance(),
								marksSa.getTermFive(), 
								marksSa.getTermFiveAttendance(),
								marksSa.getTermSix(), 
								marksSa.getTermSixAttendance());
						results.add(examStudentsSADTO);
					}
					else {
						ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								-1, 
								1,
								-1, 
								1,
								-1, 
								1,
								-1, 
								1,
								-1, 
								1,
								-1, 
								1);
						results.add(examStudentsSADTO);
					}
				}
				if(marksSas.size()==0) {
					ExamStudentsSADTO examStudentsSADTO = new ExamStudentsSADTO(
							BigInteger.valueOf(0),
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
							1,
							-1, 
							1,
							-1, 
							1);
					results.add(examStudentsSADTO);
				}
			}
		}
		
		return results;
	}
	
	public List<MarksFA> saveExamStudentsFAMarks(Iterable<MarksFA> marksFAArray) {
		List<MarksFA> result = marksFARepository.saveAll(marksFAArray);
		return result;
	}
	
	public List<MarksSA> saveExamStudentsSAMarks(Iterable<MarksSA> marksSAArray) {
		List<MarksSA> result = marksSARepository.saveAll(marksSAArray);
		return result;
	}

}