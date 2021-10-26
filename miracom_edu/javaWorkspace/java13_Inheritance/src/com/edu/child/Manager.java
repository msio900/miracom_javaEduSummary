package com.edu.child;
/*
 * Employee의 자식 클래스..
 * 부모가 가진 모든 성질을 물려받고
 *         +
 * 자신만의 멤버를 추가..
 * ::
 * 상속에서 자식크래스
 * 필드 --> 자신만의 필드를 추가
 * 메소드 --> 부모가 물려준 기능을 자기에게 맞게 고쳐쓴다
 * (상속관계에 있는 2개의 클래스에서만 적용..오버라이딩)
 */


import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * Employee의 자식 클래스...
 * 부모가 가진 모든 성질을 물려받고
 * 
 * 자신의 멤버만을 추가
 * ::
 * 상속에서 자식 클래스
 * 필드 --> 
 */


//부모Employ로 부터 확장된 자식 클래스Manager를 선언
public class Manager extends Employee{
	private String dept;//부서
	
	public Manager(String name, MyDate birthDate, double salary, String dept) {
		/*this.name = name;
		this.bitrhDate = birthDate;
		this.salary = salary;*/

		//super();//Employee();//null, null, 0.0 - 필드초기화가 되지 않음.
		super(name, birthDate, salary); //명시적으로 넣음.
		this.dept = dept;
	}
	/*
	 * 상속관계에 있는 2개의 클래스에서 method가 상속될때 일어나는 일
	 * Method Overiding
	 * Step 1. 부모가 가진 method를 그대로 물려받는다.
	 * Stpe 2. 그걸 고친다. 
	 * 
	 * 부모가 가진 메소드를 물려받아서
	 * 기능을 자식에게 맞게 다시 고쳐서 사용하는 것.
	 * :
	 * 기능이 바뀌었기 때문에 새로운 메소드가 만들어졌다고 생각해도 된다....!
	 * method 재정의
	 * Rule
	 * 1. 메소드 선언부는 모두 일치 - 이름, 인자값, 리턴타입.
	 * 2. 메소드 구현부는 달라야한다. - 기능이 달라진다.
	 * 3. 서로 다른 상속관계의 클래스에서 발생한다.
	 */
	public String getDetails() {
		return super.getDetails()+", "+dept;
	}
	public void chageDept(String dept) { //자식만의 멤버로 추가됨. Overiding과 무관함.
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

}
