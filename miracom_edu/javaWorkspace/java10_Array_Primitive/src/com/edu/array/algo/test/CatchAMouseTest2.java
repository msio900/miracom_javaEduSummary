package com.edu.array.algo.test;

import java.util.Scanner;

public class CatchAMouseTest2 {
	
	private static String solve(int x, int y, int z) {
		//�����ϼ���..
		return "";//�� �κ��� ���߿� �˾ ��ȯ ��������..
	}	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���� ������� 3��..catA, catB, Mouse
		int cata = sc.nextInt();
		int catb = sc.nextInt();
		int mouse = sc.nextInt();
		
		sc.close();
		
		String result=solve(cata, catb,mouse);
		System.out.println("Result :: "+result);
	}
}

