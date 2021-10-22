package com.edu.array.test;


public class BasicArrayTest2 {
	public static void main(String[] args) {
		
		//1. 배열 선언과 생성
		int[ ] arr = new int[3]; //한 줄로!
		
		//2. 초기화
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		System.out.println("배열 각각의 칸에 들어 있는 값....");
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("배열 객체를 참조하는 주소값 ::"+arr);
	}
}
