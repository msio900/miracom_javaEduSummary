package com.edu.cons;

public class ProgrammerTest1 {

	public static void main(String[] args) {
		//1. NoteBook ��ü�� 2�� ����...nb1, nb2
		// �̶� ���� ������ ��θ� �����ڷ�....setNoteBook() ������.
		NoteBook nb1 = new NoteBook("apple", 270, 3324);
		NoteBook nb2 = new NoteBook("samsung", 230, 4500);

		
		//2. Programmer ��ü�� 2�� ����...pro1, pro2
		// �̶� ���� ������ ��θ� �����ڷ�...setProgrammer() ������.
		Programmer pro1 = new Programmer("Tom", "Newyork","JAVA",4500);
		Programmer pro2 = new Programmer("Gosling", "Seattle","C",6500);
		
		//3. nb1, nb2�� ������ ���
		nb1.printInfo();
		nb2.printInfo();
		//4. pro1, pro2�� ������ ���
		System.out.println(pro1.getProgrammerInfo());
		System.out.println(pro2.getProgrammerInfo());
	}

}
