package com.edu.array.test;
/*
 * Array란?
 * 같은 데이터 타입을 가지는 서로 다른 값들을
 * 하나의 변수로 처리하는 것
 * 
 * 11 12 13 14 15 16...99 value 100개
 * 원래는,,,하나의 변수(variable)에는 하나의 값(value) 뿐 저장이 안됨.
 * 
 * Array 선언, 생성, 초기화
 * 1. 선언			2. 생성(new)반드시 사이를 명시!		3. 초기화(initialization
 * int[  ] arr;		arr = new int[3];	
 */

public class BasicArrayTest1 {
	public static void main(String[] args) {
		//1. 배열선언
		int[ ] arr;
		
		//2. 배열 생성
		arr  = new int[3];
		
		//3. 초기화
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		System.out.println("배열 각각의 칸에 들어 있는 값....");
		for(int i=0; i < arr.length; i++) // arr.length 배열의 사이즈를 나타내는 필드 .int반환
			System.out.print(arr[i]+" ");
		System.out.println("배열 객체를 참조하는 주소값 ::"+arr);
	}
}
