package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class DatabaseManageApplication extends SpringBootServletInitializer {
	
//check
	
	public static void main(String[] args) {
		SpringApplication.run(DatabaseManageApplication.class, args);
	}

}
