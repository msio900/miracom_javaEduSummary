package com.edu.test;

import java.util.Scanner;

/*
 * Scanner class
 * ::
 * ����� �ڵ忡 ���� ���� �Է¹޴� ���� �ƴ϶�(compile������ ���� �ϵ��ڵ� �Ǿ��� �ִ�....)
 * new Account(10000);
 * 
 * ����������� ���� �Է¹��� �� �ֵ��� �Ҷ�, �ʿ��� class�� Scanner
 */
public class ScannerTest2 {
	public static void main(String[] args) {
		System.out.println("=====Ű����� ���ڸ� �Է��ϼ��� >>>>>>>");
		//1. Scanner ��ü�� ����...�޸𸮿� �ø���.
		// System.in(�ܼ�â) Sysyem.out(Ű����)
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();//Ű����� �Է��� ���� �˾Ƽ� �޾ƿ�
		//nextInt()������ �������� �����͸� ��ȯ��.
		int j = sc.nextInt();//Ű����� �Է��� ���� �˾Ƽ� �޾ƿ�
		String name = sc.next();// ������ �������� �����͸� ��ȯ��.
		
		System.out.println("���ڰ� : "+i+","+j);
		System.out.println("����� �̸��� "+name);
	}

}
