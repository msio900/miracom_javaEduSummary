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
	//field���� �߽����� class���� ¥������ �ǹǷ�....identifier�� �߿���. 
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
