package com.edu.test;
//1,2,3에 대한 설명...
class Member{
	static String name = "길똥이"; //static V
	static int age = 19; //static V
	int count = 1; //field
	
	public static void getMember() {
		System.out.println("우/유/빛/깔 /"+name);
	}
	
	//non-static
	public void getMember2() {
		//static String address = "한남동"; //static은 local레벨로 사용할 수 없다
		System.out.println("우/유/빛/깔 /"+name);
	}
	
	//static은 static 끼리 통한다.
	public static void getMember3() {
		System.out.println("우/유/빛/깔 /"+name);
		//count++;
	}
}
public class StaticExamTest1 {
	public static void main(String[] args) {
		//Member에 있는 getMember()를 사용...호출...
		//객체생성 필요없이 클래스이름.으로 바로 사용가능..
		Member.getMember();
		
		//static 영역에서 non-static한 멤버 사용 못함...할려면 객체를 생성해서 사용해야한다.
		//static은 static끼리 통한다.
		Member m = new Member();
		m.getMember2();

	}
}



