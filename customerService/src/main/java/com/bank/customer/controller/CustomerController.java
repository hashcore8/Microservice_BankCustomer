package com.bank.customer.controller;

import java.text.ParseException;
import java.util.List;
import java.util.ListIterator;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bank.customer.dtoConversion.CustomerDTO;
import com.bank.customer.dtoConversion.DTOConversion;
import com.bank.customer.entity.Customer;
import com.bank.customer.service.CustomerServicesI;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired 
	DTOConversion dtoconversion;
	@Autowired
	CustomerServicesI customerservicesI;
	
	
	@RequestMapping(method=RequestMethod.GET,value="/welcomeCustomer")
	public String customerService(Model model)
	{
		
		return "welcome to the Customer Service";
	}
	
	
	
	
	
	
	
	@RequestMapping(method=RequestMethod.GET,value="/customerform")
	public String getcustomerform(Model model)
	{// the model can supply attributes used for rendering views. It is a Interface.
		model.addAttribute("message", "Using model");
		model.addAttribute("customer", new CustomerDTO());
		
		
		System.out.println("============Customer form called============");
		return "customer_registrationform";
	} 
	
	@RequestMapping(method=RequestMethod.GET,value="/form_modelmap")
	public String getcustomerform_modelmap(ModelMap modelmap)
	{//ModelMap is it gives us the ability to pass a collection of values and treat these values as if they were within a Map:
		
		modelmap.addAttribute("message", "using ModelMap");
		
		System.out.println("============Customer form called============");
		return "form";
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/form_modelandview")
	public ModelAndView getcustomerform_modelandview()
	{
		//This interface allows us to pass all the information required by Spring MVC in one return:
		 ModelAndView modelAndView = new ModelAndView("form");
		 modelAndView.addObject("message", "Model and View");	 
				 
		System.out.println("============Customer form called============");
		return modelAndView;
	}
	
	
	
	
	
	
	@RequestMapping(value="/postcustomer",method=RequestMethod.POST)
	public String addcustomer(@Valid @ModelAttribute ("customer")  CustomerDTO customerDto,BindingResult result,Model model)
	{
		//add  customer
		
		  if (result.hasErrors()) {
			  
			  List<ObjectError> allErrors = result.getAllErrors();
			  ListIterator<ObjectError> itr=allErrors.listIterator();
			  while(itr.hasNext()) {
			  System.out.println(itr.next());
			  }
			  
			  
			  int errorCount = result.getErrorCount();
			  System.out.println("errorCount :"+errorCount);
			  
			  
			  
			  
			  System.out.println("Error Occurred");
			  model.addAttribute("message", "Error Occured");
	            return "customer_registrationform";
	        }
		  else {
			  
			  Customer convertToEntity=null;
			try {
					convertToEntity = dtoconversion.convertToEntity(customerDto);
					System.out.println("Customer DTO :"+convertToEntity.toString());
					
					if(customerservicesI==null) {
						System.out.println("Yes it is Null customerservicesI------------------");
					}
				  customerservicesI.AddCustomer(convertToEntity);
				  model.addAttribute("message", "Sucessfull");
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				  model.addAttribute("message", "Sucessfull");
				e.printStackTrace();
			} 
			   
		  }
		
		  return "form";
	}
	
	
	//crud customer for Feign client
	
	@PostMapping(value="/createCustomer")
	public String createCustomer()
	{
		//return customer
		return "Created Customer";
	}
	@PostMapping(value="/updatecustomer")
	public String UpdateCustomer()
	{
		//return customer
		return "Customer is updated";
	}
	@GetMapping(value="/deletecustomer")
	public String DeleteCustomer()
	{
		//return customer
		return "Customer is Delete";
	}
	@GetMapping(value="/getcustomer/{id}")
	public String GetCustomer(@PathVariable String id)
	{
		
		System.out.println("Called service wooho");
		//return customer
		return "Read Customer with Id "+id;	
	}
	
	
	

}
