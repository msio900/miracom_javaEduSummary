package com.edu.cons;

public class Programmer {
	String name;
	String address;
	String mainSkill;
	int	salary;
	public Programmer(){}
	public Programmer(String name, String address, String mainSkill, int salary){
		this.name = name;
		this.address = address;
		this.mainSkill = mainSkill;
		this.salary = salary;
	}
	
	public void setProgrammerInfo(String name,
			String address, String mainSkill, int salary) {
		this.name=name;
		this.address=address;
		this.mainSkill=mainSkill;
		this.salary=salary;
	}
	public String getProgrammerInfo() {
		return "name :: "+name+"\t livingPlace :: "+address+"\t mainSkill :: "+mainSkill+"\t salary :: "+salary; 
	}
	public int getAnnualSalary() {
		return salary * 12;
		
	}
}
