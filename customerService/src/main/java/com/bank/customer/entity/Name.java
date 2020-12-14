package com.bank.customer.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Name {

	private String fN;
	private String LN;

	Name() {
	}

	public Name(String first, String last) {
		this.fN = first;
		this.LN = last;
	}

	public String getfN() {
		return fN;
	}

	public String getLN() {
		return LN;
	}

	@Override
	public String toString() {
		return "Name [fN=" + fN + ", LN=" + LN + "]";
	}

	public void setfN(String fN) {
		this.fN = fN;
	}

	public void setLN(String lN) {
		LN = lN;
	}

	
	
	
	
}
