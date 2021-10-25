package com.edu.bank;
/*
 * ���� ���� ������ ��� �ִ� Ŭ����
 * �ش� ���� �������� ������ ������ �ִ� ������ ����Ǿ��� �ִ�.
 * --------------------------------------------------
 * Customer Ŭ������
 * Account[ ]Ŭ������ ������ �����̴�.
 */
public class Customer {
	//1. �ʵ� ����
	private int ssn;	//�����ڷ� ���� ����
	private String name;//�����ڷ� ���� ����
	
	//Has a Relation
	private Account[ ] accounts;//setter()�� ����

	
	//2. ������ �ʵ尪�� ���� �����Ѵ�.
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
	
	//���� ������ ��ȯ
	public String getCustomerInfo() {
		return ssn+", "+name;
	}
	

}
