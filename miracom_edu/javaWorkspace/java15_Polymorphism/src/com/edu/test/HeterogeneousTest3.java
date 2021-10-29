package com.edu.test;
/*
 * EmployeeService Ŭ������ ����� �� ��Ƴ��Ҵ�
 * EmployeeService ��ü�� �����ϰ�/ �޼ҵ带 ȣ��..
 */
import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.service.EmployeeService;
import com.edu.util.MyDate;

public class HeterogeneousTest3 {

	public static void main(String[] args) {
		Employee[ ] emps= {
				new Manager("James", new MyDate(1990,1,1), 30000.0, "IT"),
				new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000),
				new Secretary("Jane", new MyDate(1985,1,1), 350000.0,"Tom"),
				new Manager("Peter", new MyDate(1982,2,11), 30000.0, "python"),
				new Manager("Juliet", new MyDate(1992,3,1), 30000.0, "education")				
		};
		EmployeeService service = new EmployeeService();
		service.manageEmployee(emps[0]); //Manager James �Է�
		service.manageEmployee(emps[1]); //Engineer Tom �Է�
		
		service.printAllEmployee(emps);

	}//main

}//class
