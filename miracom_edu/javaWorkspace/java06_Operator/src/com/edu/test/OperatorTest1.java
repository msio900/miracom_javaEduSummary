package com.edu.test;
/*
 * �ڹٿ��� �˾ƾ��ϴ� �����ڸ� �����Ѵ�...
 */
class Operator{
	public boolean test1() {
		System.out.println("test1()...calling");
		return true;
	}
	public boolean test2() {
		System.out.println("test2()...calling");
		return true;
	}
}

public class OperatorTest1 {
	public static void main(String[] args) {
		//���� : ���(field), local ����
			int i = 10;//���ú��� method���� �ȿ����� ����� �� �ִ�.
			int j = 8;//���ú���
			// = �� assign�� �ǹ̸� ����. ������ �̸��� i 10�̶�� ���� i�� �Ҵ�.
			// == �� ����.
			/*
			 *  = :: �Ҵ�
			 *  == :: ����.
			 *  != :: ���� �ʴ�.
			 *  % :: modulars �������� ������.
			 */
			System.out.println(i==j); //False
			System.out.println(i!=j); //True
			System.out.println("==============================");
			System.out.println("������ % ::"+i % j); //2
			
			// ++ :: 1�� ���� ������Ű�� ������
			// -- :: 1�� ���� ���ҽ�Ű�� ������
			int k = 10; //Local V �ʱ�ȭ (���� + ���Ҵ�)
			System.out.println(k++); //10... 1�� ���߿� ����
			System.out.println(k);		//11
			
			int m = 10;
			System.out.println(++m);// 11...���� 1�� ������.
			System.out.println(m); //11
		}
//		i=100; ���ú����� �����ۿ��� ���� ������ ��.
}
