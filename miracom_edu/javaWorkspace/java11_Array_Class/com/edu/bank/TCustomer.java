package com.edu.bank;
/*
 * 은행 고객의 정보를 담고 있는 클래스
 * 해당 고객은 여러개의 통장을 가지고 있는 고객으로 설계되어져 있다.
 * --------------------------------------------------
 * Customer 클래스는
 * Account[ ] 클래스를 가지는 관계이다.
 */
public class TCustomer {
	//1. 필드 선언
	//생성자 주입
	private int ssn;
	private String name;
	
	//Has a Relation
	//setter주입
	private Account[ ] accounts;
	
	//2. 선언한 필드값을 각각 주입한다.
	public TCustomer(int ssn, String name) {
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
		return ssn+", "+ name;
	}	
}
