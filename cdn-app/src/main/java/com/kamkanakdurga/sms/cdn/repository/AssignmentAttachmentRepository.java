package com.kamkanakdurga.sms.cdn.repository;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamkanakdurga.sms.library.entities.AssignmentAttachment;

public interface AssignmentAttachmentRepository extends JpaRepository<AssignmentAttachment, Integer> {
	
	//List<AssignmentAttachment> findByassignmentId(BigInteger assignmentId);

}
