package com.edu.service.impl;

import java.util.ArrayList;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeListServiceImpl implements EmployeeListService{
	
	//Ãß°¡
	private ArrayList<Employee> list;
	
	//
	
	@Override
	public void addEmployee(Employee e) {		
		//	
	}
	@Override
	public void deleteEmployee(String empId) {		
		//			
		
	}
	@Override
	public void updateEmployee(Employee e) {		
		boolean find = false;
		//
	}//updateEmployee
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		//
		return temp;
	}
	
	@Override
	public void findEmployees() {
		//
	}
}
