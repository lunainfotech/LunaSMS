package com.kamkanakdurga.sms.exam.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.exam.dto.DisplayFADTO;
import com.kamkanakdurga.sms.exam.dto.DisplayTermFiveSADTO;
import com.kamkanakdurga.sms.exam.dto.DisplayTermOneSADTO;
import com.kamkanakdurga.sms.exam.dto.DisplayTermSixSADTO;
import com.kamkanakdurga.sms.exam.dto.DisplayTermThreeSADTO;
import com.kamkanakdurga.sms.exam.dto.ExamClassDTO;
import com.kamkanakdurga.sms.exam.dto.ExamStudentsFADTO;
import com.kamkanakdurga.sms.exam.dto.ExamStudentsSADTO;
import com.kamkanakdurga.sms.exam.dto.ExamSubjectDTO;
import com.kamkanakdurga.sms.exam.dto.StudentDTO;
import com.kamkanakdurga.sms.exam.dto.TermFADTO;
import com.kamkanakdurga.sms.exam.dto.TermFiveDTO;
import com.kamkanakdurga.sms.exam.dto.TermFiveSADTO;
import com.kamkanakdurga.sms.exam.dto.TermFourDTO;
import com.kamkanakdurga.sms.exam.dto.TermInfoDTO;
import com.kamkanakdurga.sms.exam.dto.TermOneDTO;
import com.kamkanakdurga.sms.exam.dto.TermOneSADTO;
import com.kamkanakdurga.sms.exam.dto.TermSixDTO;
import com.kamkanakdurga.sms.exam.dto.TermSixSADTO;
import com.kamkanakdurga.sms.exam.dto.TermThreeDTO;
import com.kamkanakdurga.sms.exam.dto.TermThreeSADTO;
import com.kamkanakdurga.sms.exam.dto.TermTwoDTO;
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
	
	public List<DisplayFADTO> getExamStudentsFA(BigInteger schoolCode, int examId, int classId, int subjectId) {
		List<DisplayFADTO> results = new ArrayList<DisplayFADTO>();
		List<StudentDTO> students = studentRepository.getStudentByClass(schoolCode, classId);
		List<ExamStudentsFADTO> marksFas = marksFARepository.getExamStudentsFA(schoolCode, examId, classId, subjectId);
		
		for(StudentDTO student : students) {
			for(ExamStudentsFADTO marksFa : marksFas) {
				if(student.getStudentCode().equals(marksFa.getStudentCode())) {
					
					TermInfoDTO termOne 	= new TermInfoDTO(
								marksFa.getTermOne(), 
								marksFa.getTermOneAttendance(),
								10
							);
					
					TermInfoDTO termTwo	= new TermInfoDTO(
								marksFa.getTermTwo(), 
								marksFa.getTermTwoAttendance(), 
								10
							);
					
					TermInfoDTO termThree  = new TermInfoDTO(
								marksFa.getTermThree(), 
								marksFa.getTermThreeAttendance(), 
								10
							);
					
					TermInfoDTO termFour	= new TermInfoDTO(
								marksFa.getTermFour(), 
								marksFa.getTermFourAttendance(),
								20
							);
					
					TermFADTO termFA = new TermFADTO(
								termOne,
								termTwo,
								termThree,
								termFour
							);
					
					DisplayFADTO examStudentsFADTO = new DisplayFADTO(
							marksFa.getId(),
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							marksFa.getExam(), 
							marksFa.getSubject(), 
							termFA
							);
					results.add(examStudentsFADTO);
				}
				else {
					
					TermInfoDTO termOne 	= new TermInfoDTO(
							-1, 
							1,
							10
						);
				
					TermInfoDTO termTwo	= new TermInfoDTO(
							-1, 
							1, 
							10
						);
					
					TermInfoDTO termThree  = new TermInfoDTO(
							-1, 
							1, 
							10
						);
					
					TermInfoDTO termFour	= new TermInfoDTO(
							-1, 
							1,
							20
						);					
					
					TermFADTO termFA = new TermFADTO(
							termOne,
							termTwo,
							termThree,
							termFour
						);
					
					DisplayFADTO examStudentsFADTO = new DisplayFADTO(
							BigInteger.valueOf(0),
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							marksFa.getExam(), 
							marksFa.getSubject(), 
							termFA
						);
					results.add(examStudentsFADTO);
				}
			}
			if(marksFas.size()==0) {
				TermInfoDTO termOne 	= new TermInfoDTO(
						-1, 
						1,
						10
					);
			
				TermInfoDTO termTwo	= new TermInfoDTO(
						-1, 
						1, 
						10
					);
				
				TermInfoDTO termThree  = new TermInfoDTO(
						-1, 
						1, 
						10
					);
				
				TermInfoDTO termFour	= new TermInfoDTO(
						-1, 
						1,
						20
					);					
				
				TermFADTO termFA = new TermFADTO(
						termOne,
						termTwo,
						termThree,
						termFour
					);
				
				DisplayFADTO examStudentsFADTO = new DisplayFADTO(
						BigInteger.valueOf(0),
						student.getSchoolCode(), 
						student.getStudentCode(), 
						student.getStudentRoll(),
						student.getStudentFirstName(), 
						student.getStudentLastName(), 
						examId, 
						subjectId, 
						termFA
						);
				results.add(examStudentsFADTO);
			}
		}
		return results;
	}
	
	public List getExamStudentsSA(BigInteger schoolCode, int examId, int classId, int subjectId) {
		List results = new ArrayList();
		Optional<Subject> subjectElement = subjectRepository.findById(subjectId);
		int saTerm = subjectElement.get().getSaTerm();
		List<StudentDTO> students = studentRepository.getStudentByClass(schoolCode, classId);
		List<ExamStudentsSADTO> marksSas = null;
		
		if(saTerm == 1) {
			marksSas = marksSARepository.getExamStudentsSA_1(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {
						TermInfoDTO termOne 	= new TermInfoDTO(
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance(),
								50
							);
						
						TermOneSADTO termSA = new TermOneSADTO(
								termOne
								);
						
						DisplayTermOneSADTO examStudentsSADTO = new DisplayTermOneSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								termSA
								);
						results.add(examStudentsSADTO);
					}
					else {
						
						TermInfoDTO termOne 	= new TermInfoDTO(
								-1, 
								1,
								50
							);
						
						TermOneSADTO termSA = new TermOneSADTO(
								termOne
								);
						
						DisplayTermOneSADTO examStudentsSADTO = new DisplayTermOneSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								termSA
								);
						results.add(examStudentsSADTO);
					}
				}
				if(marksSas.size()==0) {
					
					TermInfoDTO termOne 	= new TermInfoDTO(
							-1, 
							1,
							50
						);
					
					TermOneSADTO termSA = new TermOneSADTO(
							termOne
							);
					
					DisplayTermOneSADTO examStudentsSADTO = new DisplayTermOneSADTO(
							BigInteger.valueOf(0),
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							examId, 
							subjectId, 
							termSA
							);
					results.add(examStudentsSADTO);
				}
			}
		} else if(saTerm == 3){
			marksSas = marksSARepository.getExamStudentsSA_3(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {
						
						TermInfoDTO termOne 	= new TermInfoDTO(
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance(),
								20
							);
						
						TermInfoDTO termTwo 	= new TermInfoDTO(
								marksSa.getTermTwo(), 
								marksSa.getTermTwoAttendance(),
								20
							);
						
						TermInfoDTO termThree 	= new TermInfoDTO(
								marksSa.getTermThree(), 
								marksSa.getTermThreeAttendance(),
								30
							);
						
						TermThreeSADTO termSA = new TermThreeSADTO(
								termOne,
								termTwo,
								termThree
							);
						
						
						DisplayTermThreeSADTO examStudentsSADTO = new DisplayTermThreeSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								termSA
								);
						results.add(examStudentsSADTO);
					}
					else {
						
						TermInfoDTO termOne 	= new TermInfoDTO(
								-1, 
								1,
								20
							);
						
						TermInfoDTO termTwo 	= new TermInfoDTO(
								-1, 
								1,
								20
							);
						
						TermInfoDTO termThree 	= new TermInfoDTO(
								-1, 
								1,
								30
							);
						
						TermThreeSADTO termSA = new TermThreeSADTO(
								termOne,
								termTwo,
								termThree
							);
						
						DisplayTermThreeSADTO examStudentsSADTO = new DisplayTermThreeSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								termSA
								);
						results.add(examStudentsSADTO);
					}
				}
				if(marksSas.size()==0) {
					
					TermInfoDTO termOne 	= new TermInfoDTO(
							-1, 
							1,
							20
						);
					
					TermInfoDTO termTwo 	= new TermInfoDTO(
							-1, 
							1,
							20
						);
					
					TermInfoDTO termThree 	= new TermInfoDTO(
							-1, 
							1,
							30
						);
					
					TermThreeSADTO termSA = new TermThreeSADTO(
							termOne,
							termTwo,
							termThree
						);
					
					DisplayTermThreeSADTO examStudentsSADTO = new DisplayTermThreeSADTO(
							BigInteger.valueOf(0),
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							examId, 
							subjectId, 
							termSA
							);
					results.add(examStudentsSADTO);
				}
			}
		} else if(saTerm == 5){
			marksSas = marksSARepository.getExamStudentsSA_5(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {

						TermInfoDTO termOne 	= new TermInfoDTO(
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance(),
								32
							);
						
						TermInfoDTO termTwo 	= new TermInfoDTO(
								marksSa.getTermTwo(), 
								marksSa.getTermTwoAttendance(),
								16
							);
						
						TermInfoDTO termThree 	= new TermInfoDTO(
								marksSa.getTermThree(), 
								marksSa.getTermThreeAttendance(),
								8
							);

						TermInfoDTO termFour 	= new TermInfoDTO(
								marksSa.getTermFour(), 
								marksSa.getTermFourAttendance(),
								12
							);
						
						TermInfoDTO termFive 	= new TermInfoDTO(
								marksSa.getTermFour(), 
								marksSa.getTermFourAttendance(),
								12
							);
						
						TermFiveSADTO termSA = new TermFiveSADTO(
								termOne,
								termTwo,
								termThree,
								termFour,
								termFive
								);
						
						DisplayTermFiveSADTO examStudentsSADTO = new DisplayTermFiveSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(),
								termSA
								);
						results.add(examStudentsSADTO);
					}
					else {
						
						TermInfoDTO termOne 	= new TermInfoDTO(
								-1, 
								1,
								32
							);
						
						TermInfoDTO termTwo 	= new TermInfoDTO(
								-1, 
								1,
								16
							);
						
						TermInfoDTO termThree 	= new TermInfoDTO(
								-1, 
								1,
								8
							);

						TermInfoDTO termFour 	= new TermInfoDTO(
								-1, 
								1,
								12
							);
						
						TermInfoDTO termFive 	= new TermInfoDTO(
								-1, 
								1,
								12
							);
						
						TermFiveSADTO termSA = new TermFiveSADTO(
								termOne,
								termTwo,
								termThree,
								termFour,
								termFive
							);
						
						DisplayTermFiveSADTO examStudentsSADTO = new DisplayTermFiveSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								termSA
								);
						results.add(examStudentsSADTO);
					}
				}
				if(marksSas.size()==0) {
					
					TermInfoDTO termOne 	= new TermInfoDTO(
							-1, 
							1,
							32
						);
					
					TermInfoDTO termTwo 	= new TermInfoDTO(
							-1, 
							1,
							16
						);
					
					TermInfoDTO termThree 	= new TermInfoDTO(
							-1, 
							1,
							8
						);

					TermInfoDTO termFour 	= new TermInfoDTO(
							-1, 
							1,
							12
						);
					
					TermInfoDTO termFive 	= new TermInfoDTO(
							-1, 
							1,
							12
						);
					
					TermFiveSADTO termSA = new TermFiveSADTO(
							termOne,
							termTwo,
							termThree,
							termFour,
							termFive
						);
					
					DisplayTermFiveSADTO examStudentsSADTO = new DisplayTermFiveSADTO(
							BigInteger.valueOf(0),
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							examId, 
							subjectId, 
							termSA
							);
					results.add(examStudentsSADTO);
				}
			}
		} else if(saTerm == 6){
			marksSas = marksSARepository.getExamStudentsSA_6(schoolCode, examId, classId, subjectId);
			for(StudentDTO student : students) {
				for(ExamStudentsSADTO marksSa : marksSas) {
					if(student.getStudentCode().equals(marksSa.getStudentCode())) {
						
						TermInfoDTO termOne 	= new TermInfoDTO(
								marksSa.getTermOne(), 
								marksSa.getTermOneAttendance(),
								32
							);
						
						TermInfoDTO termTwo 	= new TermInfoDTO(
								marksSa.getTermTwo(), 
								marksSa.getTermTwoAttendance(),
								8
							);
						
						TermInfoDTO termThree 	= new TermInfoDTO(
								marksSa.getTermThree(), 
								marksSa.getTermThreeAttendance(),
								12
							);

						TermInfoDTO termFour 	= new TermInfoDTO(
								marksSa.getTermFour(), 
								marksSa.getTermFourAttendance(),
								8
							);
						
						TermInfoDTO termFive 	= new TermInfoDTO(
								marksSa.getTermFive(), 
								marksSa.getTermFiveAttendance(),
								12
							);
						
						TermInfoDTO termSix 		= new TermInfoDTO(
								marksSa.getTermSix(), 
								marksSa.getTermSixAttendance(),
								8
							);					
						
						TermSixSADTO termSA = new TermSixSADTO(
								termOne,
								termTwo,
								termThree,
								termFour,
								termFive,
								termSix
								);
						
						DisplayTermSixSADTO examStudentsSADTO = new DisplayTermSixSADTO(
								marksSa.getId(),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								termSA
								);
						results.add(examStudentsSADTO);
						
					}
					else {
						
						TermInfoDTO termOne 	= new TermInfoDTO(
								-1, 
								0,
								32
							);
						
						TermInfoDTO termTwo 	= new TermInfoDTO(
								-1, 
								0,
								8
							);
						
						TermInfoDTO termThree 	= new TermInfoDTO(
								-1, 
								0,
								12
							);

						TermInfoDTO termFour 	= new TermInfoDTO(
								-1, 
								0,
								8
							);
						
						TermInfoDTO termFive 	= new TermInfoDTO(
								-1, 
								0,
								12
							);
						
						TermInfoDTO termSix 		= new TermInfoDTO(
								-1, 
								0,
								8
							);					
						
						TermSixSADTO termSA = new TermSixSADTO(
								termOne,
								termTwo,
								termThree,
								termFour,
								termFive,
								termSix
								);
						
						DisplayTermSixSADTO examStudentsSADTO = new DisplayTermSixSADTO(
								BigInteger.valueOf(0),
								student.getSchoolCode(), 
								student.getStudentCode(), 
								student.getStudentRoll(),
								student.getStudentFirstName(), 
								student.getStudentLastName(), 
								marksSa.getExam(), 
								marksSa.getSubject(), 
								termSA
								);
						results.add(examStudentsSADTO);
					}
				}
				
				if(marksSas.size()==0) {
					
					TermInfoDTO termOne 	= new TermInfoDTO(
							-1, 
							0,
							32
						);
					
					TermInfoDTO termTwo 	= new TermInfoDTO(
							-1, 
							0,
							8
						);
					
					TermInfoDTO termThree 	= new TermInfoDTO(
							-1, 
							0,
							12
						);

					TermInfoDTO termFour 	= new TermInfoDTO(
							-1, 
							0,
							8
						);
					
					TermInfoDTO termFive 	= new TermInfoDTO(
							-1, 
							0,
							12
						);
					
					TermInfoDTO termSix 		= new TermInfoDTO(
							-1, 
							0,
							8
						);			
							
					TermSixSADTO termSA = new TermSixSADTO(
							termOne,
							termTwo,
							termThree,
							termFour,
							termFive,
							termSix
							);
					
					DisplayTermSixSADTO examStudentsSADTO = new DisplayTermSixSADTO(
							BigInteger.valueOf(0),
							student.getSchoolCode(), 
							student.getStudentCode(), 
							student.getStudentRoll(),
							student.getStudentFirstName(), 
							student.getStudentLastName(), 
							examId, 
							subjectId, 
							termSA
							);
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