package com.bank.customer.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.bank.customer.entity.Customer;
import com.bank.customer.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerServicesI {

	
	@Autowired
	private CustomerRepository cust_repo;
	
	 RestTemplate restTemplate ;
	 
	 
	 String AccountUrl="www.localhost:8181/createaccount";
	 
	 ResponseEntity<Customer> postForEntity=null;
	
	@Override
	public boolean AddCustomer(Customer cust) {
		// TODO Auto-generated method stub
		
		//create customer 
		Customer save = cust_repo.save(new Customer(cust.getName(),cust.getAdd()));
		
		/*
		
//		new Account()		
		
		ResponseEntity<Customer> postForEntity = restTemplate.postForEntity(AccountUrl, HttpMethod.POST, Customer.class);
		
		ResponseEntity<Customer> postForEntity2 = restTemplate.postForEntity(AccountUrl, null, Customer.class);
		
		
		//create Account 
		
		System.out.println("postForEntity :"+postForEntity.getStatusCode());
		System.out.println("postForEntity :"+postForEntity.toString());
		System.out.println("postForEntity--2 :\"+postForEntity."+postForEntity2.getStatusCode());
		System.out.println("postForEntity :\"+postForEntity."+postForEntity.toString() );
		
		
		*/
		
		
		return true;
	}

	@Override
	public boolean UpdateCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomer(Customer cust) {
		// TODO Auto-generated method stub
		return false;
	}

}
