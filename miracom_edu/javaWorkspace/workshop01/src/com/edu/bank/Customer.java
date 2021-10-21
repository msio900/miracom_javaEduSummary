package com.edu.bank;

public class Customer {
	String firstName;
	String lastName;
	
	//Has a Relation
	Account account; //1
	
	public Customer(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	//field명을 중심으로 class명을 짜여지게 되므로....identifier가 중요함. 
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	public String getCustomer() {
		return lastName+" "+firstName;
	}
	
	

}
