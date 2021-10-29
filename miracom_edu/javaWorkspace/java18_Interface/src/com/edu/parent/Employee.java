package com.edu.parent;
/*
/*
 * 부모클래스 생성
 */
import com.edu.util.MyDate;

public class Employee {
	// 기본값에 해당하는 상수값을 지정..static final + 무조건 대문자
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public Employee() {
		super();//무조건 들어있으나 생략가능
	}//에러없어짐 
	
	public Employee(String name, MyDate birthDate, double salary) { //this(name,birthDate, BASIC_SALARY);
		//super 키워드는 상위클래스를 가리키는 키워드..
		super();
		this.name = name;//필드 와 로컬변수의 이름이 같을 때 구분해주려 필드에this를 붙혀준다.
		this.birthDate = birthDate;
		this.salary = salary;
	}
	public Employee(String name, MyDate birthDate) {//정보하나가 없을 떄
		//명시적으로 넘어온 salary  값이 없을때는 지정된 상수값을 연결해준다.
		//this(); 
		/*
		 * 생성자 앞의 this ::
		 * 한 클래스 내에서 또다른 생성자를 호출 
		 */
		
		this(name,birthDate, BASIC_SALARY);

	}

	public String getDetails() { 
		return name+"," + birthDate + "," + salary;
	}

	//추가1 HeterogeneousTest2
	public double getSalary() {
		return salary;
	}


}
