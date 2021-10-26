package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class Engineer extends Employee{

	private String tech;
	private int bonus;
	
	public Engineer(String name,MyDate birthDate,double salary,String tech, int bonus) {
		super(name, birthDate,salary);
		this.tech = tech;
		this.bonus = bonus;
	}	
	
	
	public String getDetails() {
		return super.getDetails()+","+tech;
	}


	public String changeTech() {
		return tech;
	}


	public void setTech(String tech) {
		this.tech = tech;
	}


	public int getBonus() {
		return bonus;
	}


	public void setBonus(int bonus) {
		this.bonus = bonus;
	}
	
	
}//class´Ý±âÀü
