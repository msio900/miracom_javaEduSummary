package com.edu.cons.test;

import com.edu.cons.NoteBook;
import com.edu.cons.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		/*
		 * 1. Programmer ��ü�� ����..�̸��� james��
		 * 2. james�� �Ｚ ��Ʈ�� �Ѵ븦 ������.
		 * 3. james�� ������ ��Ʈ���� ������ �����.
		 *    �̶�, james�� �����(mainSkill)�� �Բ� �����.
		 */
		Programmer james = new Programmer("james", "NY","JAVA", 300000);
		
		//james�� ��Ʈ���� ����...has a relation
		
		/*NoteBook nb = new NoteBook("SAMSUNG", 200, 1234);
		james.buyNoteBook(nb);*/
		
		//���� �ٷ� ����.
		james.buyNoteBook(new NoteBook("SAMSUNG", 200, 1234));// ������ james�� samsung��Ʈ���� ���� ����.
		
		System.out.println("James�� �ַ� ����� "+james.getMainSkill()+"!!!");
		//james�� ������ ��Ʈ�� ������ ���...
		james.getNoteBook().printInfo();//��Ʈ���� return��.printInfo()�� ���� ���
	}

}
