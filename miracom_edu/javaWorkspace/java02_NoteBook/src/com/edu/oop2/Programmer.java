package com.edu.oop2;
/*
 *  Programmer�� ����(�ʵ�, ���)�� ��� �ִ� Ŭ����
 *  field(4) :: �̸�, ��� ��, ��ǥ ���(AI, M/L), ����(String, int)
 *  method(2) ::
 *  1) �ʵ��ʱ�ȭ
 *  2) �ʵ��� ��� ���� �����ϴ� ���
 */
public class Programmer {
	String name;
	String address;
	String mainSkill;
	int	salary;
	
	public void setProgrammerInfo(String name,
			String address, String mainSkill, int salary) {
		//field initialization �ʵ��ʱ�ȭ
		this.name=name;
		this.address=address;
		this.mainSkill=mainSkill;
		this.salary=salary;
	}
	public String getProgrammerInfo() {
		return "name :: "+name+"\t livingPlace :: "+address+"\t mainSkill :: "+mainSkill+"\t salary :: "+salary; 
	}
	//������ �����ϴ� ����� �ۼ�
	public int getAnnualSalary() {
		// ������ ����� �޼ҵ� �� �� �µ��� �˾Ƽ� �����Ѵ�...�˰��� ����
		return salary * 12;
		
	}
}
