package com.edu.test;

import com.edu.child.Student;
import com.edu.child.Teacher;

public class PersonTest1 {

	public static void main(String[] args) {
		Student s = new Student("������", 28, "�Ż絿", 123);
		Teacher t = new Teacher("��ȣ��", 45, "�Ÿ���", "Java");
		
		System.out.println(s.getDetails());
		System.out.println(t.getDetails());
		System.out.println("===============");
		System.out.println(s); 					//toString() ����
		System.out.println(t); 					//toString() ����

	}

}
