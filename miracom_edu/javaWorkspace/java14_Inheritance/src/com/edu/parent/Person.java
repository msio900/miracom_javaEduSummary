package com.edu.parent;

public class Person {
	private String name;
	private int age;
	private String address;
	
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(String name, int age, String address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public String getDetails() {
		return name+", "+age+", "+address;
	}
	// �߰�
	@Override
	//1. �θ� ���� �޼ҵ带 �����޴´�.
	//2. �װ� ��ģ��.
	public String toString() {
		return name+", "+age+", "+address;
	}
	

}
