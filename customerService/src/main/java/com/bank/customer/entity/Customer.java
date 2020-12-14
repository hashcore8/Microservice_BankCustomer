package com.bank.customer.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long customer_id;

	 @Embedded
	private Name name;

	 @Embedded
	private Address add;
	
	/*
	 * @OneToOne(mappedBy = "customer") private long account_id;
	 */

	public Customer(Name name, Address add) {
		super();

		this.name = name;
		this.add = add;
	}

	
	  public Customer() {
	  
	  }
	  
	 
	

	public long getCustomer_id() {
		return customer_id;
	}

	public Name getName() {
		return name;
	}

	public Address getAdd() {
		return add;
	}

	@Override
	public String toString() {
		return "Customer [customer_id=" + customer_id + ", name=" + name + ", add=" + add + "]";
	}


	public void setCustomer_id(long customer_id) {
		this.customer_id = customer_id;
	}


	public void setName(Name name) {
		this.name = name;
	}


	public void setAdd(Address add) {
		this.add = add;
	}

	
	
	
}
