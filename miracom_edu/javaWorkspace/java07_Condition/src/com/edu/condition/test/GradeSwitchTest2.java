package com.edu.condition.test;

import java.util.Scanner;

/*
 * ~ Test1���� if �����
 *   switch������ �����ؼ� �ۼ��� ���ڴ�..
 */

public class GradeSwitchTest2 {

	public static void main(String[] args) {
		System.out.println("����� ������ �Է��ϼ���>>>>");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		//�پ��� ������ ���� ����� �ڵ带 �ۼ�...
		switch(grade) {
			case 95:
			case 90:
				System.out.println("Grade A...");
				break;
			case 80:
			case 85:
				System.out.println("Grade B...");
				break;
			case 70:
			case 75:
				System.out.println("Grade C...");
				break;
			default:
				System.out.println("Nuts~~!!");
				
		
		}//switch
	}//main

}//class
