package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;


public class Secretary extends Employee {
	private String bossOfName;

	public Secretary(String name, MyDate birthDate, double salary, String bossOfName) {

		super(name, birthDate, salary);
		this.bossOfName = bossOfName;

	}


	public String getDetails() {
		return super.getDetails() + "," +bossOfName;
	}


}
