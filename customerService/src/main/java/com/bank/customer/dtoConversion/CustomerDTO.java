package com.bank.customer.dtoConversion;

import java.util.Date;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

public class CustomerDTO {
	
	
	
	
	
	@NotNull
	@Size(min=2, max=30)
	private String F_name;
	
	

	@NotNull
	@Size(min=2, max=30)
	private String L_name;

	@NotNull
	@Size(min=2, max=30)
	private String HouseNo;

	@NotNull(message = "Please enter a valid street address")
	@Size(min=2, max=30)
	private String street;

	@NotNull
	@Size(min=2, max=30)
	private String  Area;

	@NotNull(message = "Please enter a valid pincode ")
	@Range(min=440000, max=450000)
	private int pincode;
	
	
	 @DateTimeFormat(pattern = "yyyy-mm-dd")
	    private Date birthday;
	
	
	
	
	
	
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public String getF_name() {
		return F_name;
	}
	public void setF_name(String f_name) {
		F_name = f_name;
	}
	public String getL_name() {
		return L_name;
	}
	public void setL_name(String l_name) {
		L_name = l_name;
	}
	public String getHouseNo() {
		return HouseNo;
	}
	public void setHouseNo(String houseNo) {
		HouseNo = houseNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	@Override
	public String toString() {
		return "CustomerDTO [ F_name=" + F_name + ", L_name=" + L_name + ", HouseNo="
				+ HouseNo + ", street=" + street + ", Area=" + Area + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
