package com.edu.parent;

import com.edu.util.MyDate;

/*
 * 부모 클래스를 작성
 */

public class Employee {
	// 기본값에 해당하는 상수값을 지정...
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	/*public Employee() {
		//super(); 가 들어 있음.
	}//default를 추가하여 error를 없앰.*/
	public Employee() { }
	public Employee(String name, MyDate birthDate, double salary) {
		super();//super 키워드는 상위클래스를 가리키는 키워드...object
		this.name = name;
		this.birthDate = birthDate;
		this.salary = salary;
	}
	public Employee(String name, MyDate birthDate) {
		//명시적으로 넘어온 salary값이 없을때는 지정된 상수값을 연결해준다.
		//this();
		/*
		 * 생성자 앞의 this
		 * ::
		 * 한 클래스 내에서 또다른 생성자를 호출
		 */
		this (name, birthDate, BASIC_SALARY);
	}
	
	public String getDetails() {
		return name+", "+birthDate+", "+salary;
	}
	
}
