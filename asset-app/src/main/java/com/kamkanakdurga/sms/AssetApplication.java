package com.kamkanakdurga.sms;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AssetApplication {

	 public static void main(String[] args) {
	        SpringApplication.run(AssetApplication.class, args);
	    }
	    
	    @Bean
	    public ModelMapper modelMapper() {
	      return new ModelMapper();
	    }    

}
