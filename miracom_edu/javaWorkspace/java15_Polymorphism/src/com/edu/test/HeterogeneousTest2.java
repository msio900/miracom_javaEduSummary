package com.edu.test;

import com.edu.child.Engineer;
import com.edu.child.Manager;
import com.edu.child.Secretary;
import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * Heterogeneous Collection <-> Homogeneous Collection
 * ::
 *  ���� �ٸ� Ÿ���� ������ �̱��� ���� ����ü
 *  
 */
public class HeterogeneousTest2 {
	// �迭���� ���� �߿��� ���ӵ�����Ÿ���� ���ʠ���.
	// �̱������� �پ��� �ڽ�Ŭ�������� �����ϰ� �����ϱ� ���ؼ��� �θ�Ÿ���� [�迭]�� ��Ҵ�.
	public static void main(String[] args) {
		Employee[ ] emps= {
				new Manager("James", new MyDate(1990,1,1), 30000.0, "IT"),
				new Engineer("Tom", new MyDate(1980,1,1), 400000.0, "AI", 1000),
				new Secretary("Jane", new MyDate(1985,1,1), 350000.0,"Tom"),
				new Manager("Peter", new MyDate(1982,2,11), 30000.0, "python"),
				new Manager("Juliet", new MyDate(1992,3,1), 30000.0, "education")				
		};
	 for(Employee e : emps)System.out.println(e.getDetails());
		
	 System.out.println("\n ===��� ����ε��� ������ ����ϱ�===");
	 int total=0;
	 // emps�߿��� ���������� ������ �ڽİ�ü Ÿ���� �˾ƾ� �� �ʿ䰡 �ִ�.
	 // �θ�Ÿ������ ������ ��ü��  Manager, Engineer,Secretary ���� �˾� �Ѵ�.
	 // �̷��� ����ϴ� Ű���尡 instansof Ű�����̴�.
	 
	 for(Employee e: emps) {
		 if(e instanceof Engineer) {//eŸ������ ������ ��üŸ���� Engineer�� �´ٸ�
			 System.out.println("Information :" +e.getDetails());
			 System.out.println("Annual Salary :"+ (e.getSalary()*12 + ((Engineer) e).getBonus()));
			 System.out.println("-----------------------------");
			 
		 }if(e instanceof Manager) {
			 ((Manager) e).changeDept("������");
			 System.out.println("Information Manager:" +e.getDetails());
			 System.out.println("-----------------------------");
			 
		 }else {
		 System.out.println("Information :" +e.getDetails());// �߰� 1
		 System.out.println("Annual Salary :"+ e.getSalary()*12); 
		 System.out.println("-----------------------------");
		 }
		 
	 }

	}//main

}//class
