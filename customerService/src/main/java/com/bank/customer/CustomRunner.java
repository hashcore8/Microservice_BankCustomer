package com.bank.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.bank.customer.entity.Address;
import com.bank.customer.entity.Customer;
import com.bank.customer.entity.Name;
import com.bank.customer.repository.CustomerRepository;

//@SpringBootApplication
//@ComponentScan(basePackages = {"com.bank.customer.controller"})
public class CustomRunner implements CommandLineRunner {

	
	@Autowired
	CustomerRepository repo;
	
	
	
	public static void main(String args[])
	{
		SpringApplication.run(CustomRunner.class, args);
	}
	
	
	


	
	 @Override
	    public void run(String... args) throws Exception {
	        // Cleanup the users table
		 
		 System.out.println("Called and Run");
		 
		 repo.deleteAllInBatch();

	        // Insert a new user in the database
	        Name name = new Name("Ashish","Kowekar");
	      // Address(String HNo,String street, String area, int pincode)
	        Address address = new Address("747", "Golf View Road", "Bangalore",560008);
	       
	        
	        Customer customer = new Customer(name, address);       
	        
	        

	        repo.save(customer);
	    }
	
	
}
