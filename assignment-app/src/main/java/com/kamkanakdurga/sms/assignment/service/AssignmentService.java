package com.kamkanakdurga.sms.assignment.service;

import java.math.BigInteger;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kamkanakdurga.sms.assignment.dto.AssignmentDTO;
import com.kamkanakdurga.sms.assignment.repository.AssignmentAttachmentRepository;
import com.kamkanakdurga.sms.assignment.repository.AssignmentRepository;
import com.kamkanakdurga.sms.library.entities.Assignment;
import com.kamkanakdurga.sms.library.entities.AssignmentAttachment;
import com.kamkanakdurga.sms.library.entities.Holiday;


@Service
public class AssignmentService {
	
	@Autowired
	private AssignmentRepository assignmentRepository;

	@Autowired
	private AssignmentAttachmentRepository assignmentAttachmentRepository;
	
	public List<Assignment> getAssignmentsBySchool(BigInteger schoolCode) {
		
		List<Assignment> result = assignmentRepository.findBySchoolCode(schoolCode);
		 
		return result;
	}

	public List<Assignment> getAssignmentsBySchoolByClass(BigInteger schoolCode, Integer studentClass) {
		
		List<Assignment> result = assignmentRepository.findBySchoolCodeAndStudentClass(schoolCode, studentClass);
		 
		return result;
	}
	
	public List<Assignment> getAssignmentBySchoolByClassBySubject(BigInteger schoolCode, int studentClass, int studentSubject) {
		
		List<Assignment> result = assignmentRepository.findBySchoolCodeAndStudentClassAndStudentSubject(schoolCode, studentClass, studentSubject);
		 
		return result;
	}
	
	public AssignmentDTO getAssignmentById(BigInteger assignmentId) {
		
			Assignment assignment = assignmentRepository.findById(assignmentId);
			List<AssignmentAttachment> attachment = assignmentAttachmentRepository.findByAssignmentId(assignmentId);
			
			AssignmentDTO assignmentList = new AssignmentDTO(
					assignment.getId(),
					assignment.getAcademicYear(),
					assignment.getSchoolCode(),
					assignment.getStudentClass(),
					assignment.getStudentClass(),
					assignment.getTitle(),
					assignment.getDescription(),
					attachment
					);
		
		return assignmentList;
	}
	
	public Assignment saveAssignmentRecord(Assignment assignmentInfo) {

		Assignment result = assignmentRepository.save(assignmentInfo);
		return result;
	}
	
	public void deleteAssignmentRecord(BigInteger assignmentId) {
		assignmentRepository.deleteById(assignmentId);
	}
}
