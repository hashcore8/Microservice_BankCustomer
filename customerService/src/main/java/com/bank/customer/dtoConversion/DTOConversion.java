package com.bank.customer.dtoConversion;

import java.text.ParseException;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bank.customer.entity.Address;
import com.bank.customer.entity.Customer;
import com.bank.customer.entity.Name;
@Component
public class DTOConversion {	
	
	
	@Autowired
    private ModelMapper modelMapper;
	

	public Customer convertToEntity(CustomerDTO custDto) throws ParseException {
		
		System.out.println("CustomerDto modelMapper:"+custDto.toString());
		
		//Customer cust = modelMapper.map(custDto, Customer.class);
		
		Name name=new Name(custDto.getF_name(), custDto.getL_name());
		
		System.out.println("Name :"+name.toString());
		
		//cust.getName().setfN(custDto.getF_name());
		//cust.getName().setLN(custDto.getL_name());
		
		Address add=new Address();
		
		add.setHouseNo(custDto.getHouseNo());
		add.setArea(custDto.getArea());
		add.setPincode(custDto.getPincode());
		add.setStreet(custDto.getStreet());
	
		
		Customer cust =new Customer(name,add);
		
		/*
		 * cust.getAdd().setHouseNo(custDto.getHouseNo());
		 * cust.getAdd().setStreet(custDto.getStreet());
		 * cust.getAdd().setArea(custDto.getArea());
		 * cust.getAdd().setPincode(custDto.getPincode());
		 */
		
		
		
		System.out.println("Customer modelMapper:"+cust.toString());
	   
	    return cust;
	}
	
	
}
