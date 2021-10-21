package com.edu.cons;

// Programmer �� NoteBook�� ������ ���踦 ����...Has A Relation..
/*
 * 1. �ʵ� ������ �߰��ϰ��� �ϴ� Ŭ������ ����
 * 2. �߰��� �ʵ带 �����ϴ� ��θ� �ϳ� ����
 *    ������ Ȥ�� setter()
 */

public class Programmer {
	String name;
	String address;
	String mainSkill;
	int	salary;
	
	// !Hasing! NoteBook nb; //���α׷����� ��¥!
	//���� ���� ��������
	NoteBook noteBook;
	
	
	
	public Programmer(){}
	public Programmer(String name, String address, String mainSkill, int salary){
		this.name = name;
		this.address = address;
		this.mainSkill = mainSkill;
		this.salary = salary;
	}
	
	//!Hasing! setter()�� �߰�
	public void buyNoteBook(NoteBook noteBook)//õõ�� ������ ������ �����ϰ� ���� ��.
	{
		this.noteBook = noteBook;
	}
	//������ ��Ʈ���� �ٽ� �޾ƿ��� ��Ʈ�� �߰��Ѵ�.
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
