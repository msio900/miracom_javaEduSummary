package com.edu.collection.test;

import java.util.HashSet;

/*
 * 		Set
 * 		 |
 * 		HashSet�� ������ �������� �˾ƺ��� ������ �ۼ�
 * 		
 * 		������ ���� : ���������� index ������ �ȵȴ�.
 * 		�ߺ��� ������� �ʴ´� : ���� �ߺ��� �Ǿ��� �ϴ��� ������� �ʴ´�.
 * 		add(E )
 * 		size()
 * 		remove(E) boolean
 * 		clear()
 * 		isEmpty()
 * 		contains()
 */
public class HashSetTest2 {
	public static void main(String[] args) {
		// < >���ʸ��� : Set�ȿ� ����ִ� ��ü Ÿ���� �̸� ������ �� �ִ�.
		HashSet<String> set = new HashSet<>();
		
		set.add("������");
		set.add("�̼���");
		set.add("��ȣ��");
		set.add("��ȣ��");
		set.add("����ö");
		
		System.out.println("����ΰ�? "+set.size());//4...�ߺ���� ����.
		
		//Set�ȿ� ����ִ� �����͸� ���
		//1. �Էµ� ������� ��µ��� �ʴ´�....������ ������ Ȯ��
		//2. Collection������ toString()�� ������ return�ϵ��� ��ü������ Overriding�Ǿ� �ִ�.
		System.out.println(set.toString());
		//[������, ��ȣ��, �̼���, ����ö]...������ ����.
		System.out.println(set);
		
		//�迵ö�� ���ԵǾ��� �ִ��� ���θ�...
		System.out.println("�迵ö�� ����ֳ���? "+set.contains("�迵ö"));
		set.remove("��ȣ��");
		System.out.println(set);//overriding�� �Ǿ��⿡ []�� ���
		
		//set�� ����� ��� �����͸� ����
		set.clear();
		
		System.out.println("set���� �� ����� �ֳ���? "+set.isEmpty());//True
		System.out.println(set);
	}//main
}//class
