package com.edu.bank.vo;
/*
 * Outlet����
 * ��ǰ�� �����ϴ� ���� ���� ������ ��� �ִ� VO Ŭ����...
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
	
	//ssn�� ������ ����� �ƴϱ� ������ �� �޼ҵ�� �����ϴ� ���� �� ������...
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






