package com.edu.array.test;


public class BasicArrayTest2 {
	public static void main(String[] args) {
		
		//1. �迭 ����� ����
		int[ ] arr = new int[3]; //�� �ٷ�!
		
		//2. �ʱ�ȭ
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		System.out.println("�迭 ������ ĭ�� ��� �ִ� ��....");
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("�迭 ��ü�� �����ϴ� �ּҰ� ::"+arr);
	}
}
