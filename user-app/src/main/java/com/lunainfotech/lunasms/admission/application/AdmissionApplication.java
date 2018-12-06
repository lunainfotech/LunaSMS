package com.lunainfotech.lunasms.admission.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication @ComponentScan({"com.lunainfotech.lunasms.admission.controller","com.lunainfotech.lunasms.admission.swagger"})
public class AdmissionApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdmissionApplication.class, args);
    }
}
