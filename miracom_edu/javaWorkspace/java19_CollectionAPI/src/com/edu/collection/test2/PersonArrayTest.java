package com.edu.collection.test2;

import java.util.ArrayList;

import com.edu.collection.vo.Person;

public class PersonArrayTest {

	public static void main(String[] args) {
		//1. ArrayList 객체를 생성...list
		ArrayList<Person> list = new ArrayList<>();
		
		//2. list에 Person객체를 추가...add
		list.add(new Person("강호동", "방배동",46));
		list.add(new Person("이수근", "신림동",42));
		list.add(new Person("서장훈", "서초동",39));
		list.add(new Person("김영철", "다산동",40));
		
		//3. list에 저장된 사람들의 평균연령을 출력
		int total =0;
		for(Person p : list) total += p.getAge();
		System.out.println("멤버들의 평균 나이는 "+total/list.size()+"살 입니다.");
		
		//4. 서초동에 사는 사람의 정보를 출력
		System.out.println("서초동에 살고 있는 멤버 정보입니다.");
		for (Person p : list) {
			if (p.getAddress().equals("서초동"))
				System.out.println(p.getName()+" "+p.getAddress());
		}

	}

}
