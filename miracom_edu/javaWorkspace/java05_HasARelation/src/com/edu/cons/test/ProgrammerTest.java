package com.edu.cons.test;

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
		
		//jamesrk ��Ʈ���� ����...has a relation
		james.buyNoteBook(noteBook);
	}

}
