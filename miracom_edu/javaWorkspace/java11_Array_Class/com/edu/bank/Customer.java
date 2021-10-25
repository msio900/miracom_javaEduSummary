package com.edu.bank;
/*
 * 은행 고객의 정보를 담고 있는 클래스
 * 해당 고객은 여러개의 통장을 가지고 있는 고객으로 설계되어져 있다.
 * --------------------------------------------------
 * Customer 클래스는
 * Account[ ]클래스를 가지는 관계이다.
 */
public class Customer {
	//1. 필드 선언
	private int ssn;	//생성자로 가면 좋음
	private String name;//생성자로 가면 좋음
	
	//Has a Relation
	private Account[ ] accounts;//setter()로 주입

	
	//2. 선언한 필드값을 각각 주입한다.
	public Customer(int ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
	
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	
	/////////////////////////////////////////////////
	
	//고객의 정보를 반환
	public String getCustomerInfo() {
		return ssn+", "+name;
	}
	

}
