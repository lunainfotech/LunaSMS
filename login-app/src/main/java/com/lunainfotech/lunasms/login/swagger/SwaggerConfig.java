package com.lunainfotech.lunasms.login.swagger;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

  public static final String DEFAULT_CONTACT = "Luna InfoTech, https://www.lunainfotech.com/, mail@lunainfotech.com";
  
  @SuppressWarnings("deprecation")
public static final ApiInfo DEFAULT_API_INFO = new ApiInfo(
      "School Management System API", "Luna SMS", "1.0",
      "https://www.lunainfotech.com/", DEFAULT_CONTACT, 
      "Luna Infotech", "https://www.lunainfotech.com/");

  private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = 
      new HashSet<String>(Arrays.asList("application/json"));

  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(DEFAULT_API_INFO)
        .produces(DEFAULT_PRODUCES_AND_CONSUMES)
        .consumes(DEFAULT_PRODUCES_AND_CONSUMES);
  }
}