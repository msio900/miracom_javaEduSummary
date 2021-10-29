package com.edu.collection.vo;

/*
 * VO(Value Object)
 * Ư���� ������ �����ϴ� Ŭ����
 * DB Table�� �ϳ��� Row�� �ν��Ͻ�ȭ ��Ų ��ü
 * VO�� �ʵ尡 DB���̺��� �÷����� ����
 * 
 * 1. private �ʵ�
 * 2. ������ 2�� (�⺻ ������, ����� ������)
 * 3. setter/getter
 * 4. toString Overriding
 * 
 */
public class Person {
	private String name;
	private String address;
	private int age;
	
	public Person() { }
	public Person(String name, String address, int age) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + ", age=" + age + "]";
	}
}
