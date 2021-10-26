package com.edu.parent;

import com.edu.util.MyDate;

/*
 * 부모 클래스를 작성
 */
public class Employee {
	private String name;
	private MyDate birthDate;
	private double salary;
	
	/*public Employee() {
		//super(); 가 들어 있음.
	}//default를 추가하여 error를 없앰.*/
	public Employee(String name, MyDate birthDate, double salary) {
		super();//super 키워드는 상위클래스를 가리키는 키워드...object
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public String getDetails() {
		return name+", "+birthDate+", "+salary;
	}
	
}
