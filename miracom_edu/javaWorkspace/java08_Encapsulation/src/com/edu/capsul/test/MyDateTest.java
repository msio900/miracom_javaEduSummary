package com.edu.capsul.test;
import java.util.Scanner;

/*
 * Encapsulation Pattern
 * 1. 외부(다른 class)로부터 직접적인 접근을 막을때 
 * `private`을 설정 - 저장은 되지만,,, 접근이 불가함.
 * 2.field값을 set() / get() method로 소통 public으로 열어 놓음.
 * 3. set() method 어디에 제어문을 달아야 하는지.
 */
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("오늘 날짜를 입력하세요.");
		MyDate md = new MyDate(); //Ctrl+ Shift + o
		
		System.out.println("월 입력>>");
		int month = sc.nextInt();
		
		System.out.println("날짜 입력>>");
		int day = sc.nextInt();
		
		sc.close();
		//필드에 직접적인 접근은 막아둔다.
		/*md.month = 33;	// invalid 값이 들어감.
		md.day = 33;	// invalid 값이 들어감.
		 */
		//method...call setMonth()를 먼저...(월에 따라서 날짜가 달라지기 때문)
		md.setMonth(month);
		md.setDay(day);
		//출력될때 0월 21일
		//10월 0일 ...이런 값이 최종적으로 출력이 안되도록 하시기 바랍니다.
		//1. case 0을 추가한다.
		//2. system.exit(0)

		System.out.println("오늘은 "+md.getMonth()+"월 "+md.getDay()+"일");
		}

}
