package com.edu.array.test;
/*
 * �迭�� ������ �ִ� �߿��� ����...
 * 
 * "�ٸ� ����� ���� �迭�� ������ Copy�� �ü��� �ִ�."
 * System.arraycopy()
 * 
 */

public class BasicArrayCopyTest5 {
	public static void main(String[] args) {
		
		int[ ] target = {1, 2, 3, 4, 5, 6};//6
		int[ ] source = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};//10
		
		// target������ �����....8, 7, 6, 5, 4, 3
		
		//System.arraycopy(); static�� ������ ��ü ������ ���ص� ��.
		//for�̿��ؼ� target�� �����͸� ��� �޾Ƽ� Ȯ���غ�����...
		//arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
		//Copies an array from the specified source array, beginning at the specified position, to the specified position of the destination array.
		System.arraycopy(source, 2, target, 0, target.length);
		for(int i : target) System.out.print(i+" ");
	}

}
