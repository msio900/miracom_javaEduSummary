/*package com.edu.condition.test;

public class GradeIfTest1 {
	public static void main(String[] args) {
		int grade =88; //Local Variable
		
		if(grade >= 90 & grade <= 100)//false�� �������� �ȵ��ư�. 
		{
			System.out.println("A grade..");
		}else if(grade>=80 & grade<90) {
			System.out.println("B grade..");
		
		}else if(grade>=70 & grade<80) {
			System.out.println("C grade..");
		}else{
			System.out.println("Try Again...!");
		}
	}

}
*/
package com.edu.condition.test;

import java.util.Scanner;

public class GradeIfTest1 {
	public static void main(String[] args) {
		//int grade = 88; // Local V
		//�̷��� �Ǹ� �����Ͻ� �ϵ��ڵ��Ǿ� ������ �־���.
		System.out.println("����� ������ �Է��ϼ��� >>>>>>>");
		Scanner sc = new Scanner(System.in);
		int grade = sc.nextInt();
		sc.close();
		
		if(grade>=90 & grade <=100) 
			System.out.println("A grade..");			
		else if(grade>=80 & grade<90) 
			System.out.println("B grade..");
		else if(grade >=70 & grade<80)
			System.out.println("C grade..");
		else 
			System.out.println("Try Again...!!");				
		
	}//main
}//clas

