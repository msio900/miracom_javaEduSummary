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
	// 추가
	@Override
	//1. 부모가 가진 메소드를 물려받는다.
	//2. 그걸 고친다.
	public String toString() {
		return name+", "+age+", "+address;
	}
	

}
