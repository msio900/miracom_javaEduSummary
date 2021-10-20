package com.edu.cons;

public class ProgrammerTest1 {

	public static void main(String[] args) {
		//1. NoteBook 객체를 2개 생성...nb1, nb2
		// 이때 값의 주입의 통로를 생성자로....setNoteBook() 사용안함.
		NoteBook nb1 = new NoteBook("apple", 270, 3324);
		NoteBook nb2 = new NoteBook("samsung", 230, 4500);

		
		//2. Programmer 객체를 2개 생성...pro1, pro2
		// 이때 값의 주입의 통로를 생성자로...setProgrammer() 사용안함.
		Programmer pro1 = new Programmer("Tom", "Newyork","JAVA",4500);
		Programmer pro2 = new Programmer("Gosling", "Seattle","C",6500);
		
		//3. nb1, nb2의 정보를 출력
		nb1.printInfo();
		nb2.printInfo();
		//4. pro1, pro2의 정보를 출력
		System.out.println(pro1.getProgrammerInfo());
		System.out.println(pro2.getProgrammerInfo());
	}

}
