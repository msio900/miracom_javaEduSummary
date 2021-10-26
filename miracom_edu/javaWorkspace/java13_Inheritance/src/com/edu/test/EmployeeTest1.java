package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class EmployeeTest1 {

	public static void main(String[] args) {
		Manager m = new Manager("James", new MyDate(1990,1,1), 30000.0,"IT");		
		Employee e = new Employee("Peter", new MyDate(2000, 1, 1));
		Engineer eg = new Engineer("Tom", new MyDate(1980,1,1), 400000.0,"AI", 1000);
		
		
		
		System.out.println(m.getDetails()); //null, null, 0.0
		System.out.println(e.getDetails()); //Peter, 200-1-1, 100.0
		System.out.println(eg.getDetails()); //Peter, 200-1-1, 100.0
		m.chageDept("Marketing");
		
		System.out.println("=== 부서 변경 후 ===");
		System.out.println(m.getDetails());

	}

}
