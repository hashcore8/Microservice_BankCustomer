package com.bank.customer.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration_Customer {

	@Bean
	public ModelMapper getBean() {
		System.out.println("Mappper bean created");
		return new ModelMapper();
	}

	/*
	 * @Bean public DTOConversion getdtoBean() {
	 * System.out.println("DTOConversion bean created"); return new DTOConversion();
	 * }
	 */
	
	

}
