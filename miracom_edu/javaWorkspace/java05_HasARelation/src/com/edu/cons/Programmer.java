package com.edu.cons;

// Programmer 가 NoteBook을 가지는 관계를 설정...Has A Relation..
/*
 * 1. 필드 레벨에 추가하고자 하는 클래스를 선언
 * 2. 추가한 필드를 주입하는 통로를 하나 생성
 *    생성자 혹은 setter()
 */

public class Programmer {
	String name;
	String address;
	String mainSkill;
	int	salary;
	
	// !Hasing! NoteBook nb; //프로그래밍의 초짜!
	//가장 좋은 변수명은
	NoteBook noteBook;
	
	
	
	public Programmer(){}
	public Programmer(String name, String address, String mainSkill, int salary){
		this.name = name;
		this.address = address;
		this.mainSkill = mainSkill;
		this.salary = salary;
	}
	
	//!Hasing! setter()를 추가
	public void buyNoteBook(NoteBook noteBook)//천천히 가더라도 내껄로 이해하고 가야 함.
	{
		this.noteBook = noteBook;
	}
	//주입한 노트북을 다시 받아오는 루트도 추가한다.
	public NoteBook getNoteBook() {
		return noteBook;
	}
	
	public void setProgrammerInfo(String name,
			String address, String mainSkill, int salary) {
		this.name=name;
		this.address=address;
		this.mainSkill=mainSkill;
		this.salary=salary;
	}
	public String getProgrammerInfo() {
		return "name :: "+name+"\t livingPlace :: "+address+"\t mainSkill :: "+mainSkill+"\t salary :: "+salary; 
	}
	public int getAnnualSalary() {
		return salary * 12;
		
	}
	//
	public String getMainSkill() {
		return mainSkill;
	}
}
