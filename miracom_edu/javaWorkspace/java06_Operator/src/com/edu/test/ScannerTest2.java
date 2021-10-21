package com.edu.test;

import java.util.Scanner;

/*
 * Scanner class
 * ::
 * 실행시 코드에 값을 직접 입력받는 것이 아니라(compile시점에 값이 하드코딩 되어져 있다....)
 * new Account(10000);
 * 
 * 실행시점에서 값을 입력받을 수 있도록 할때, 필요한 class가 Scanner
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.println("=====키보드로 숫자를 입력하세요 >>>>>>>");
		//1. Scanner 객체를 생성...메모리에 올린다.
		// System.in(콘솔창) Sysyem.out(키보드)
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();//키보드로 입력한 것을 알아서 받아옴
		//nextInt()공백을 기준으로 데이터를 반환함.
		int j = sc.nextInt();//키보드로 입력한 것을 알아서 받아옴
		String name = sc.next();// 공백을 기준으로 데이터를 반환함.
		
		System.out.println("숫자값 : "+i+","+j);
		System.out.println("당신의 이름은 "+name);
	}

}
