package com.maveric.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import org.springframework.context.annotation.ComponentScan;


@ComponentScan({ "com.maveric.employee.repo" })
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class EmployeeManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementServiceApplication.class, args);
	}

}
