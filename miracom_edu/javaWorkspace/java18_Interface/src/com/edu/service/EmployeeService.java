package com.edu.service;

import com.edu.parent.Employee;
//Project 시 PM역할을 맡은 친구들이 이부분을 작성해서 팀원들에게 나눠준다
public interface EmployeeService {
	
	void manageEmployee(Employee e);
	void printAllEmployee(Employee[ ] emps);
}
