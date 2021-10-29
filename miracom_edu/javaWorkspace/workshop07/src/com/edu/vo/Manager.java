package com.edu.vo;

public class Manager extends Employee{
	
	String dept;

	public Manager(String empId, String name, String addr, int salary,String dept) {
		super(empId,name,addr,salary);
		this.dept = dept;
	}
	
	
	public String getDept() {
		return dept;
	}


	public void changeDept(String dept) {
		this.dept = dept;
	}


	@Override
	public String toString() {
		return super.toString()+" Manager [dept=" + dept + "]";
	}	
}
 