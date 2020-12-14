package com.bank.customer.service;

import org.springframework.stereotype.Service;

import com.bank.customer.entity.Customer;


public interface CustomerServicesI {
	
	public boolean AddCustomer(Customer cust);
	public boolean UpdateCustomer(Customer cust);
	public boolean deleteCustomer(Customer cust);
	
	

}
