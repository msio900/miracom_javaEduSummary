package com.edu.array.algo.test;

import java.util.Scanner;

public class CatchAMouseTest2 {
	
	private static String solve(int x, int y, int z) {
		//구현하세요..
		return "";//이 부분은 나중에 알어서 반환 받으세요..
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//값을 순서대로 3개..catA, catB, Mouse
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		sc.close();
		
		String result=solve(cata, catb,mouse);
		System.out.println("Result :: "+result);
	}
}

