package com.edu.oop.test;

import com.edu.oop.Greeting;

/*
 * main �޼ҵ带 ���� ���� Ŭ����
 * ~~Test.java
 * ::
 * 
 * 1)��ü�� �����Ѵ�. ==Ŭ������ ��� ��Ҹ� �޸𸮿� �ø���.
 * 2) �޸𸮿� �ö� ������ �޼ҵ忡 �����Ѵ�.
 * ������ ���� ----> �� �Ҵ�(assign)
 * �޼ҵ� ���� ----> ȣ��(calling)
 */
public class GreetingTest {

	public static void main(String[] args) {
		//��ü ���� == Greeting Ŭ������ ��� ��Ұ� �޸𸮿� �ö�. - ����Ϸ��� �޸𸮿� �ø��ϴ�.
		Greeting g = new Greeting(); // �޽����� ���� �ƴ϶� ����
		
		//�޸𸮿� �ö� ���(������ �޼ҵ�)�� ����
		g.message = "�ȳ�^^ �����ο�~~"; // �� �Ҵ�
		//(message)������ (�ȳ�^^...)���� �ְڴ�! 
		//literal value(��-���� ��) 
		//= assign(�Ҵ�)
		g.printMessage(); // �޽����� ȣ���Ѵ�.(calling) ȣ������ ������ ��ŷ�� ���� ����.
	}

}
