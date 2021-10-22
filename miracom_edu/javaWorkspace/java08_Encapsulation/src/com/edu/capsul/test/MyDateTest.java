package com.edu.capsul.test;
import java.util.Scanner;

/*
 * Encapsulation Pattern
 * 1. �ܺ�(�ٸ� class)�κ��� �������� ������ ������ 
 * `private`�� ���� - ������ ������,,, ������ �Ұ���.
 * 2.field���� set() / get() method�� ���� public���� ���� ����.
 * 3. set() method ��� ����� �޾ƾ� �ϴ���.
 */
import com.edu.capsul.MyDate;

public class MyDateTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ��¥�� �Է��ϼ���.");
		MyDate md = new MyDate(); //Ctrl+ Shift + o
		
		System.out.println("�� �Է�>>");
		int month = sc.nextInt();
		
		System.out.println("��¥ �Է�>>");
		int day = sc.nextInt();
		
		sc.close();
		//�ʵ忡 �������� ������ ���Ƶд�.
		/*md.month = 33;	// invalid ���� ��.
		md.day = 33;	// invalid ���� ��.
		 */
		//method...call setMonth()�� ����...(���� ���� ��¥�� �޶����� ����)
		md.setMonth(month);
		md.setDay(day);
		//��µɶ� 0�� 21��
		//10�� 0�� ...�̷� ���� ���������� ����� �ȵǵ��� �Ͻñ� �ٶ��ϴ�.
		//1. case 0�� �߰��Ѵ�.
		//2. system.exit(0)

		System.out.println("������ "+md.getMonth()+"�� "+md.getDay()+"��");
		}

}
