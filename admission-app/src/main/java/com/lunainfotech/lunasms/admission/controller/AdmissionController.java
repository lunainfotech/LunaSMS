package com.lunainfotech.lunasms.admission.controller;

import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.lunainfotech.lunasms.admission.service.AdmissionService;
import com.lunainfotech.lunasms.admission.entities.StudentInfo;


@RestController
public class AdmissionController {
	
	@Value("${mysql.url}")
	String mysqlUrl;
	
	@Value("${mysql.port}")
	int mysqlPort;
	
	@Autowired
	private AdmissionService admissionService;

    @RequestMapping(value = "/admission/heartbeat", method = RequestMethod.GET)
    public Map<String, String> heartbeat() {
    	HashMap<String, String> map = new HashMap<>();

    	if(isServerUp()) {
    		map.put("status", "ok");
    		map.put("message","Server is up and running");
    	}
    	else {
    	    map.put("status", "not_ok");
    	    map.put("reason", "Database is down");
    	}
    	return map;   
    }
    
    @RequestMapping(value = "/application", method = RequestMethod.POST)
    public ModelAndView createNewStudentRecord(@RequestBody StudentInfo studentInfo, BindingResult bindingResult) {
        ModelAndView modelAndView = new ModelAndView();
//        StudentInfo studentExists = admissionService.findUserByAdhaar(studentInfo.getAadhar_number());
//        if (studentExists != null) {
//            bindingResult
//                    .rejectValue("email", "error.user",
//                            "There is already a student information registered with the adhaar provided");
//        }
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("application");
        } else {
        	admissionService.saveStudentInfo(studentInfo);
            modelAndView.addObject("successMessage", "Student application has been created successfully");
            modelAndView.addObject("studentInfo", new StudentInfo());
            modelAndView.setViewName("application");

        }
        return modelAndView;
    }
    
    private boolean isServerUp() {
        boolean isUp = false;
        try {
            Socket socket = new Socket(mysqlUrl, mysqlPort);
            // Server is up
            isUp = true;
            socket.close();
        }
        catch (IOException e)
        {
            // Server is down
        }
        return isUp;
    }
}
