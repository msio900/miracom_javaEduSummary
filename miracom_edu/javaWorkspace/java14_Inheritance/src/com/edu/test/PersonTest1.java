package com.edu.test;

import com.edu.child.Student;
import com.edu.child.Teacher;

public class PersonTest1 {

	public static void main(String[] args) {
		Student s = new Student("아이유", 28, "신사동", 123);
		Teacher t = new Teacher("강호동", 45, "신림동", "Java");
		
		System.out.println(s.getDetails());
		System.out.println(t.getDetails());
		System.out.println("===============");
		System.out.println(s); 					//toString() 생략
		System.out.println(t); 					//toString() 생략

	}

}
