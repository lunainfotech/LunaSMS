package com.lunainfotech.lunasms.admission.service;

import com.lunainfotech.lunasms.admission.repository.AdmissionRepository;
import com.lunainfotech.lunasms.admission.entities.StudentInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdmissionService {
	
    private AdmissionRepository admissionRepository;

    @Autowired
    public AdmissionService(AdmissionRepository admissionRepository){
        this.admissionRepository = admissionRepository;
    }
    
//    public StudentInfo findUserByAdhaar(String adhaar) {
//        return admissionRepository.findByAdhaar(adhaar);
//    }
    
    public StudentInfo saveStudentInfo(StudentInfo studentInfo) {
        return admissionRepository.save(studentInfo);
    }

}