package com.edu.array.algo.test;

import java.util.Scanner;
/*
Input Sample Data
6
1 4 4 4 5 3 
*/
public class ArrayPersonTypeTest3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();//배열의 사이즈가 된다.6
		
		int[ ] people = new int[num]; //6칸 짜리 배열이 만들어짐
		for(int i=0; i<people.length; i++) {
			people[i] = sc.nextInt();//각 사람의 성격유형이 입력 1~5
		}
		
		//제어문, for문을 사용해서 가장 많은 유형의 타입을 직접 출력
		
		
		//구현
		
		//System.out.println("Result :: "+);

	}
}
