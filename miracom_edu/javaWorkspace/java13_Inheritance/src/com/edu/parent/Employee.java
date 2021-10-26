package com.edu.parent;

import com.edu.util.MyDate;

/*
 * �θ� Ŭ������ �ۼ�
 */

public class Employee {
	// �⺻���� �ش��ϴ� ������� ����...
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	/*public Employee() {
		//super(); �� ��� ����.
	}//default�� �߰��Ͽ� error�� ����.*/
	public Employee() { }
	public Employee(String name, MyDate birthDate, double salary) {
		super();//super Ű����� ����Ŭ������ ����Ű�� Ű����...object
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	public Employee(String name, MyDate birthDate) {
		//��������� �Ѿ�� salary���� �������� ������ ������� �������ش�.
		//this();
		/*
		 * ������ ���� this
		 * ::
		 * �� Ŭ���� ������ �Ǵٸ� �����ڸ� ȣ��
		 */
		this (name, birthDate, BASIC_SALARY);
	}
	
	public String getDetails() {
		return name+", "+birthDate+", "+salary;
	}
	
}
