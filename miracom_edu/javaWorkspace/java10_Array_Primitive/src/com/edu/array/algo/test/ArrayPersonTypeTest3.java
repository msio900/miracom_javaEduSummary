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
		int num = sc.nextInt();//�迭�� ����� �ȴ�.6
		
		int[ ] people = new int[num]; //6ĭ ¥�� �迭�� �������
		for(int i=0; i<people.length; i++) {
			people[i] = sc.nextInt();//�� ����� ���������� �Է� 1~5
		}
		
		//���, for���� ����ؼ� ���� ���� ������ Ÿ���� ���� ���
		
		
		//����
		
		//System.out.println("Result :: "+);

	}
}
