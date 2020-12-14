package com.bank.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//@EnableEurekaClient
@SpringBootApplication
@ComponentScan(basePackages = {"com.bank.customer.controller","com.bank.customer.dtoConversion","com.bank.customer.configuration","com.bank.customer.service" })
public class CustomerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerServiceApplication.class, args);
	}


}




