package com.edu.service;

import java.util.ArrayList;

import com.edu.vo.Employee;

//기능의 Template을 모아놓은 인터페이스....
public interface EmployeeListService {
	void addEmployee(Employee e);//public abstract가 생략....
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	
	//Method Overloading
	ArrayList<Employee> findEmployees(String addr);
	void findEmployees();
}
