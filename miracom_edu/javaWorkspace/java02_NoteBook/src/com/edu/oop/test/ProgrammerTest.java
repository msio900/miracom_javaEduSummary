package com.edu.oop.test;
import com.edu.oop2.Programmer;
/*
 * 1. Programmer�� 2�� ����...pro1, pro2
 * 2. ������ programmer�� ���� �Է�
 *    �Էµ� ������ ���� �ַܼ� ���
 */

public class ProgrammerTest {

	public static void main(String[] args) {
		
		Programmer pro1 = new Programmer();
		Programmer pro2 = new Programmer();
		
		pro1.setProgrammerInfo("Tom", "Newyork", "D/L", 4000);
		pro2.setProgrammerInfo("LEE", "Beijing", "AI", 8000);
		
		System.out.println(pro1.getProgrammerInfo());
		System.out.println("=======================");
		System.out.println(pro2.getProgrammerInfo());

	}

}
