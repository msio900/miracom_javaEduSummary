package com.edu.array.test;
/*
 * �迭�� ������ �ִ� �߿��� ����...
 * 
 * "�迭�� Resizing�� �ȵ�..."
 * �ѹ� ���� �迭 ��ü�� ������ ����� �����ϰ� �Ǹ�
 * ���ο� ��ü�� ���������...�Ʊ� ����� ������ ��ü�� ��.
 * �ѹ� �迭�� ���鶧 ����� �˳��� ������!!!
 * 
 * "�ٸ� ����� ���� �迭�� ������ Copy�� �ü��� �ִ�."
 * System.arraycopy()
 * 
 */

public class BasicArrayCopyTest4 {
	public static void main(String[] args) {
		int[ ] target = {1, 2, 3, 4, 5, 6};
		for(int i=0;i<target.length;i++) System.out.print(target[i]+" ");
		
		//���� for��, for in "���� ��� ���ư���?"
		System.out.println(" ");
		for(int i : target) System.out.print(i+" ");

		//ȸ������ �þ���..�׷��� �迭�� ����� �÷��� �Ѵ�....
		target = new int[10]; //ĭ�� �÷ȴ�.
		target[6] = 11;
		target[7] = 22;
		target[8] = 33;
		target[9] = 44;
		
		System.out.println(" ");
		for (int i : target)System.out.print(i+" ");
	}

}
