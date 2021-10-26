package com.edu.test;
/*
 * Polymorphism
 * ::
 * 부모타입의 클래스로 자식을 생성하는 것
 * ::
 * 2가지 이슈가 발생 그것을 해결할수 있어야 함.
 * 1. Virtual Method Invocation문제
 * 2. Object Casting
 */
import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

public class PolyTest1 {

	public static void main(String[] args) {
		/*Employee e = new Employee("Peter", new MyDate(2000,1,1));
		Manager m = new Manager("James", new MyDate(1990,1,1), 30000.0, "IT");
		Engineer eg = new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000);*/
		
		//Polymorphism방식으로 자식 객체를 생성		
		//Employee e = new Employee("Peter", new MyDate(2000,1,1));
		Employee m = new Manager("James", new MyDate(1990,1,1), 30000.0, "IT");
		Employee eg = new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000);
		Employee s = new Secretary("Jane", new MyDate(1985,1,1), 350000.0, "Tom");
		
		//결과출력이 될까요!?
		//employee에 있는 getDetails()를 출력함.
		System.out.println(m.getDetails()); //null, null, 0.0
		System.out.println(eg.getDetails()); //Peter, 2000-1-1, 100.0
		System.out.println(s.getDetails());
		
		//?
		//m.changeDept("Marketing");
	}

}
