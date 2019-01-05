package com.kamkanakdurga.sms.attendance;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("com.kamkanakdurga.sms.attendance.entities")
@EnableJpaRepositories("com.kamkanakdurga.sms.attendance.repository")
public class AttendanceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttendanceApplication.class, args);
    }
    
    @Bean
    public ModelMapper modelMapper() {
      return new ModelMapper();
    }
}