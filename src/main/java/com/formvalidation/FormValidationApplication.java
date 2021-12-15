package com.formvalidation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.formvalidation.formatter.PhoneNumberFormatter;

@SpringBootApplication
public class FormValidationApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(FormValidationApplication.class, args);
	}
	
	public void addFormatters(FormatterRegistry registry) {
		
		registry.addFormatter(new PhoneNumberFormatter());
	}

}
