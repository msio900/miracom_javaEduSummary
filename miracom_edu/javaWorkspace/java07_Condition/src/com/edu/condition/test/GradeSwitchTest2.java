package com.edu.condition.test;

import java.util.Scanner;

/*
 * ~ Test1에의 if 제어문을
 *   switch문으로 변경해서 작성해 보겠다..
 */

public class GradeSwitchTest2 {

	public static void main(String[] args) {
		System.out.println("당신의 성적을 입력하세요>>>>");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		//다양한 성적에 따는 경우의 코드를 작성...
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
