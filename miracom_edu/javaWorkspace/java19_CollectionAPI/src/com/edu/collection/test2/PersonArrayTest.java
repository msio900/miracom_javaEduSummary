package com.edu.collection.test2;

import java.util.ArrayList;

import com.edu.collection.vo.Person;

public class PersonArrayTest {

	public static void main(String[] args) {
		//1. ArrayList ��ü�� ����...list
		ArrayList<Person> list = new ArrayList<>();
		
		//2. list�� Person��ü�� �߰�...add
		list.add(new Person("��ȣ��", "��赿",46));
		list.add(new Person("�̼���", "�Ÿ���",42));
		list.add(new Person("������", "���ʵ�",39));
		list.add(new Person("�迵ö", "�ٻ굿",40));
		
		//3. list�� ����� ������� ��տ����� ���
		int total =0;
		for(Person p : list) total += p.getAge();
		System.out.println("������� ��� ���̴� "+total/list.size()+"�� �Դϴ�.");
		
		//4. ���ʵ��� ��� ����� ������ ���
		System.out.println("���ʵ��� ��� �ִ� ��� �����Դϴ�.");
		for (Person p : list) {
			if (p.getAddress().equals("���ʵ�"))
				System.out.println(p.getName()+" "+p.getAddress());
		}

	}

}
