package com.edu.service;

import java.util.ArrayList;

import com.edu.vo.Employee;

//����� Template�� ��Ƴ��� �������̽�....
public interface EmployeeListService {
	void addEmployee(Employee e);//public abstract�� ����....
	void deleteEmployee(String empId);
	void updateEmployee(Employee e);
	
	//Method Overloading
	ArrayList<Employee> findEmployees(String addr);
	void findEmployees();
}
