package com.edu.parent;

import com.edu.util.MyDate;

/*
 * �θ� Ŭ������ �ۼ�
 */
public class Employee {
	private String name;
	private MyDate birthDate;
	private double salary;
	
	/*public Employee() {
		//super(); �� ��� ����.
	}//default�� �߰��Ͽ� error�� ����.*/
	public Employee(String name, MyDate birthDate, double salary) {
		super();//super Ű����� ����Ŭ������ ����Ű�� Ű����...object
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	
	public String getDetails() {
		return name+", "+birthDate+", "+salary;
	}
	
}
