package com.edu.oop2;
/*
 *  Programmer의 정보(필드, 기능)를 담고 있는 클래스
 *  field(4) :: 이름, 사는 곳, 대표 기술(AI, M/L), 연봉(String, int)
 *  method(2) ::
 *  1) 필드초기화
 *  2) 필드의 모든 값을 리턴하는 기능
 */
public class Programmer {
	String name;
	String address;
	String mainSkill;
	int	salary;
	
	public void setProgrammerInfo(String name,
			String address, String mainSkill, int salary) {
		//field initialization 필드초기화
		this.name=name;
		this.address=address;
		this.mainSkill=mainSkill;
		this.salary=salary;
	}
	public String getProgrammerInfo() {
		return "name :: "+name+"\t livingPlace :: "+address+"\t mainSkill :: "+mainSkill+"\t salary :: "+salary; 
	}
	//연봉을 리턴하는 기능을 작성
	public int getAnnualSalary() {
		// 구현부 기능은 메소드 명에 잘 맞도록 알아서 구현한다...알고리즘 가능
		return salary * 12;
		
	}
}
