/*package com.edu.condition.test;

public class GradeIfTest1 {
	public static void main(String[] args) {
		int grade =88; //Local Variable
		
		if(grade >= 90 & grade <= 100)//false가 떨어져서 안돌아감. 
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
		//이렇게 되면 컴파일시 하드코딩되어 변수가 넣어짐.
		System.out.println("당신의 점수를 입력하세요 >>>>>>>");
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

