package com.araksh.ArakshaBackendApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan(basePackages= {"com.araksha.service","com.araksha.controllers"})
@EnableMongoRepositories(basePackages= {"com.araksha.repository"})
public class ArakshaBackendAppApplication {

	@Autowired
	com.araksha.service.EmployeeService employeeService;
	public static void main(String[] args) {
		SpringApplication.run(ArakshaBackendAppApplication.class, args);
	}
}
