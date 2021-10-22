package com.edu.array.test;
/*
 * Array��?
 * ���� ������ Ÿ���� ������ ���� �ٸ� ������
 * �ϳ��� ������ ó���ϴ� ��
 * 
 * 11 12 13 14 15 16...99 value 100��
 * ������,,,�ϳ��� ����(variable)���� �ϳ��� ��(value) �� ������ �ȵ�.
 * 
 * Array ����, ����, �ʱ�ȭ
 * 1. ����			2. ����(new)�ݵ�� ���̸� ���!		3. �ʱ�ȭ(initialization
 * int[  ] arr;		arr = new int[3];	
 */

public class BasicArrayTest1 {
	public static void main(String[] args) {
		//1. �迭����
		int[ ] arr;
		
		//2. �迭 ����
		arr  = new int[3];
		
		//3. �ʱ�ȭ
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		
		System.out.println("�迭 ������ ĭ�� ��� �ִ� ��....");
		for(int i=0; i < arr.length; i++) // arr.length �迭�� ����� ��Ÿ���� �ʵ� .int��ȯ
			System.out.print(arr[i]+" ");
		System.out.println("�迭 ��ü�� �����ϴ� �ּҰ� ::"+arr);
	}
}
