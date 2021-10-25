package com.edu.bank.vo;
/*
 * Outlet에서
 * 상품을 구입하는 고객에 대한 정보를 담고 있는 VO 클래스...
 */
public class Customer {
	private int ssn;	
	private String name;
	private String address;
	
	//Has a Relation
	private Product[ ] products;

	public Customer(int ssn, String name, String address) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.address = address;
	}

	public int getSsn() {
		return ssn;
	}
	
	//ssn은 수정의 대상이 아니기 때문에 이 메소드는 제거하는 것이 더 좋을듯...
	/*	public void setSsn(int ssn) {
		this.ssn = ssn;
	}*/

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void changeAddress(String address) {
		this.address = address;
	}

	public Product[] getProducts() {
		return products;
	}

	public void buyProducts(Product[] products) {
		this.products = products;
	}
	
	//
	public String getCustomerInfo() {
		return name+" , "+address;
	}
	
}






