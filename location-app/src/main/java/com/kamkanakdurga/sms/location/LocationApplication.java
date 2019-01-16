package com.kamkanakdurga.sms.location;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.kamkanakdurga.sms.location.service.LocationService;

@SpringBootApplication
public class LocationApplication {
	
    public static void main(String[] args) {
        SpringApplication.run(LocationApplication.class, args);
    }
    
    @Bean
    public ModelMapper modelMapper() {
      return new ModelMapper();
    }    
}
