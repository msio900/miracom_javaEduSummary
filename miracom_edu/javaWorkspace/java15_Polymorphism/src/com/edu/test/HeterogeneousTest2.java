package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * Heterogeneous Collection <-> Homogeneous Collection
 * ::
 *  서로 다른 타입을 가지는 이기종 간의 집합체
 *  
 */
public class HeterogeneousTest2 {
	// 배열에서 가장 중요한 세임데이터타입은 무너졋다.
	// 이기종간의 다양한 자식클래스들을 단일하게 관리하기 위해서는 부모타입의 [배열]에 담았다.
	public static void main(String[] args) {
		Employee[ ] emps= {
				new Manager("James", new MyDate(1990,1,1), 30000.0, "IT"),
				new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000),
				new Secretary("Jane", new MyDate(1985,1,1), 350000.0,"Tom"),
				new Manager("Peter", new MyDate(1982,2,11), 30000.0, "python"),
				new Manager("Juliet", new MyDate(1992,3,1), 30000.0, "education")				
		};
	 for(Employee e : emps)System.out.println(e.getDetails());
		
	 System.out.println("\n ===모든 고용인들의 연봉을 출력하기===");
	 int total=0;
	 // emps중에서 실질적으로 생성된 자식객체 타입을 알아야 할 필요가 있다.
	 // 부모타입으로 생성된 객체가  Manager, Engineer,Secretary 인지 알아 한다.
	 // 이럴때 사용하는 키워드가 instansof 키워드이다.
	 
	 for(Employee e: emps) {
		 if(e instanceof Engineer) {//e타입으로 생성된 객체타입이 Engineer가 맞다면
			 System.out.println("Information :" +e.getDetails());
			 System.out.println("Annual Salary :"+ (e.getSalary()*12 + ((Engineer) e).getBonus()));
			 System.out.println("-----------------------------");
			 
		 }if(e instanceof Manager) {
			 ((Manager) e).changeDept("교육부");
			 System.out.println("Information Manager:" +e.getDetails());
			 System.out.println("-----------------------------");
			 
		 }else {
		 System.out.println("Information :" +e.getDetails());// 추가 1
		 System.out.println("Annual Salary :"+ e.getSalary()*12); 
		 System.out.println("-----------------------------");
		 }
		 
	 }

	}//main

}//class
