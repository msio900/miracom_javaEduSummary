package com.edu.test;
/*
 * staticŰ�����
 * ������� �����Ҷ� ���̴� final Ű����� �Բ� ���Ǵ� ��찡 ����.
 * ::
 * Usage Modifier
 * final static  abstract..
 * ::
 * final
 * ::
 * "���� �������̾�~~"  ��� �ǹ̸� ������ Ű�����̴�.
 * final + ���� : ���� �������̾� ������~ --> �����
 * final + �޼ҵ� : ���� �������̾� �޼ҵ��~ --> �������̵� ����
 * final + Ŭ���� : ���� �������̾� Ŭ������~ --> ��ӱ���
 */
class A{
	public final static  int BASIC_SALARY = 1000; //���(�� ���� �ȵ�)
	public final String test() {
		return "Overriding ����";
	}
}
final class B{ //��ӱ���
	
}
//class C extends B{}
class D extends A{
	/*public String test() {
		return "Overriding ����"+100;
	}*/
	
	//BASIC_SALARY = 2000;
}
public class StaticExamTest3 {
	public static void main(String[] args) {		

	}
}







