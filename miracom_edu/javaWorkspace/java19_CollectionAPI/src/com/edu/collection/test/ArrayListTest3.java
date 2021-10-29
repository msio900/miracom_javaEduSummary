package com.edu.collection.test;

import java.util.ArrayList;
import java.util.List;

/*
 * 		List
 *  	 |
 * 		ArrayList
 * 
 * 	������ �����鼭(���������� index�� �����ȴ�.)
 * 	������ �ߺ��� ����Ѵ�.
 */
public class ArrayListTest3 {
	public static void main(String[] args) {
		//java.awt�� ���� �ȵ�.
		List<String> list = new ArrayList<String>();
		list.add("��ȣ��");
		list.add("�̼���");
		list.add("��ȣ��");
		list.add("�迵ö");
		list.add("������");
		
		System.out.println(list);//������ �ִ�.(�Է��� ������� ���) / �ߺ� ���
		
		//2��°(index 1)�����͸� ����...���� ������ �Ǿ����� ���?
		//�ε����� �ְ� �Ǹ� ��ü�� ����, ��ü�� ������ boolean�� ����
		String removeName = list.remove(1);
		
		System.out.println(removeName+"���� �����Ͽ����ϴ�.");
		System.out.println(list);
		
		//���� ù��°�� �������� �߰�
		list.add(0, "������");
		System.out.println(list);
		
		//list�߿� �ִ� ��� ����� �߿��� ����̸��� �������� ����� ã�Ƽ� ���
		//for, equals(), get()�� ���!
		for(int i=0; i < list.size(); i++) {
			if (list.get(i).equals("������"))
				System.out.println(list.get(i));
		}
	}//main
}//class
