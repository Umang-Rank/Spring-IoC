package com.model;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.model.Student;

@Configuration
public class Config {
	
	@Bean("stu")
	public Student s() {
		return new Student();
	}

}
