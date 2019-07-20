package com.cg.ohms.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.cg.ohms"})
public class OhmsSprint5Application {

	public static void main(String[] args) {
		SpringApplication.run(OhmsSprint5Application.class, args);
		
		
	}

}
