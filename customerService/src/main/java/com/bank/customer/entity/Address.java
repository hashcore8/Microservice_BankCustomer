package com.bank.customer.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

	private String HouseNo;
	private String street;
	private String  Area;
	private int pincode;
	
	public Address(){
		
	}
	
public Address(String HNo,String street, String area, int pincode){
	this.HouseNo=HNo;
	this.street=street; 
	this.Area=area;
	this.pincode=pincode;
		
	}

public String getHouseNo() {
	return HouseNo;
}

public String getStreet() {
	return street;
}

public String getArea() {
	return Area;
}

public int getPincode() {
	return pincode;
}

@Override
public String toString() {
	return "Address [HouseNo=" + HouseNo + ", street=" + street + ", Area=" + Area + ", pincode=" + pincode + "]";
}

public void setHouseNo(String houseNo) {
	HouseNo = houseNo;
}

public void setStreet(String street) {
	this.street = street;
}

public void setArea(String area) {
	Area = area;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}
	




}
