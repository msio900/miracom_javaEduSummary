package com.edu.array.test;


public class BasicArrayTest3 {
	public static void main(String[] args) {
		
		//1. �迭 ����� ������  �ʱ�ȭ�� �ѹ���
		int[ ] arr = {11, 22, 33};
		int[ ] arr2 = {1,2,3};
		
		System.out.println("�迭 ������ ĭ�� ��� �ִ� ��....");
		for(int i=0; i < arr.length; i++)
			System.out.print(arr[i]+" ");
		System.out.println("�迭 ��ü�� �����ϴ� �ּҰ� ::"+arr);
		
		System.out.println("\n===================================\n");
		//�߰�....�޸𸮿��� � ���� �������� ���� �� �����غ��ñ� �ٶ��ϴ�.
		//�����ϴٸ� ���� �׸�!!! �׷��ּ���!!!
		arr2 = arr;
		System.out.println("�迭 ������ ĭ�� ��� �ִ� ��....");
		for(int i=0; i < arr2.length; i++)
			System.out.print(arr2[i]+" ");
		System.out.println("�迭 ��ü�� �����ϴ� �ּҰ� ::"+arr2);
		//toString()...�ּҰ��� ���ڿ��� �����ϴ� ���
		System.out.println("�迭 ��ü�� �����ϴ� �ּҰ� ::"+arr2.toString());//���۷��� ������ ������ ������ ...
	}
}
