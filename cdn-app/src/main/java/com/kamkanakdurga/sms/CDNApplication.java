package com.kamkanakdurga.sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.kamkanakdurga.sms.cdn.property.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
		FileStorageProperties.class
})
public class CDNApplication {

	public static void main(String[] args) {
		SpringApplication.run(CDNApplication.class, args);
	}
}
