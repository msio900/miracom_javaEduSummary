package com.edu.capsul.test;
/*
 * Encapsulation Pattern
 * 1. 
 * 2.
 * 3. set() method ��� ����� �޾ƾ� �ϴ���.
 */
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md = new MyDate(); //Ctrl+ Shift + o
		//�ʵ忡 �������� ������ ���Ƶд�.
		/*md.month = 33;	// invalid ���� ��.
		md.day = 33;	// invalid ���� ��.
*/	
		md.setMonth(33);
		md.setDay(33);
		//��µɶ� 0�� 21��
		//10�� 0�� ...�̷� ���� ���������� ����� �ȵǵ��� �Ͻñ� �ٶ��ϴ�.
		
		System.out.println("������ "+md.getMonth()+"�� "+md.getDay()+"��");
		}

}
