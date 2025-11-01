package com.ibm.infrafix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages = "com.ibm.infrafix.*")
public class CityInfraFixApplication {

	public static void main(String[] args) {
		SpringApplication.run(CityInfraFixApplication.class, args);
	}

}
