package com.edu.test;
//1,2,3�� ���� ����...
class Member{
	static String name = "�����"; //static V
	static int age = 19; //static V
	int count = 1; //field
	
	public static void getMember() {
		System.out.println("��/��/��/�� /"+name);
	}
	
	//non-static
	public void getMember2() {
		//static String address = "�ѳ���"; //static�� local������ ����� �� ����
		System.out.println("��/��/��/�� /"+name);
	}
	
	//static�� static ���� ���Ѵ�.
	public static void getMember3() {
		System.out.println("��/��/��/�� /"+name);
		//count++;
	}
}
public class StaticExamTest1 {
	public static void main(String[] args) {
		//Member�� �ִ� getMember()�� ���...ȣ��...
		//��ü���� �ʿ���� Ŭ�����̸�.���� �ٷ� ��밡��..
		Member.getMember();
		
		//static �������� non-static�� ��� ��� ����...�ҷ��� ��ü�� �����ؼ� ����ؾ��Ѵ�.
		//static�� static���� ���Ѵ�.
		Member m = new Member();
		m.getMember2();

	}
}



