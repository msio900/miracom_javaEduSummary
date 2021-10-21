package com.edu.condition.test;
/*
 *  �տ��� ��� switch���� break Ű���带 ��� Ȱ���ϴ��Ŀ� ����
 *  �پ��� ����� ������ �� �ִ�.
 *  
 *  1) static�� ����� �����ϴ� ���
 *  2) break Ű���� ����
 *  ::
 *  Math m = new Math();
 *  m.random();
 *  random()�� static�� ������ ������� �ֱ� ������
 *  ��ó�� ��ü ������ �ʿ䰡 ����.
 *  �̸� �޸𸮿� �ö� �ִ�.
 *  --> 
 *  Math.random(); �̷��� className.���();
 */
public class SwitchNoBreakTest3 {
	public static void main(String[] args) {
		
		/*double time = Math.random(); //0~1������ �Ǽ��� return�Ѵ�.
		System.out.println(time);*/
		int time = (int)(Math.random()*4) + 8; //8~11������ ������ return�Ѵ�.
		System.out.println("[����ð� : "+time+" ��]");
		
		switch(time) {
			case 8: //8�� �ΰ��
				System.out.println("��� �غ� �մϴ�...");
			case 9: //9�� �ΰ��
				System.out.println("ȸ�� ����, ��ħ ȸ�Ǹ� �����ϴ�...");
			case 10: //10�� �ΰ��
				System.out.println("���� ������ ���ϴ�...");
			case 11: //11�� �ΰ��
				System.out.println("�ܱ��� �����ϴ�...");
				
		}//switch
		
	}//main

}//class
