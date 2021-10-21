package com.edu.capsul.test;
/*
 * Encapsulation Pattern
 * 1. 
 * 2.
 * 3. set() method 어디에 제어문을 달아야 하는지.
 */
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md = new MyDate(); //Ctrl+ Shift + o
		//필드에 직접적인 접근은 막아둔다.
		/*md.month = 33;	// invalid 값이 들어감.
		md.day = 33;	// invalid 값이 들어감.
*/	
		md.setMonth(33);
		md.setDay(33);
		//출력될때 0월 21일
		//10월 0일 ...이런 값이 최종적으로 출력이 안되도록 하시기 바랍니다.
		
		System.out.println("오늘은 "+md.getMonth()+"월 "+md.getDay()+"일");
		}

}
