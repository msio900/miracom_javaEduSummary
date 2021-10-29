package com.edu.parent;
/*
/*
 * �θ�Ŭ���� ����
 */
import com.edu.util.MyDate;

public class Employee {
	// �⺻���� �ش��ϴ� ������� ����..static final + ������ �빮��
	public static final double BASIC_SALARY = 100.0;
	
	private String name;
	private MyDate birthDate;
	private double salary;
	
	public Employee() {
		super();//������ ��������� ��������
	}//���������� 
	
	public Employee(String name, MyDate birthDate, double salary) { //this(name,birthDate, BASIC_SALARY);
		//super Ű����� ����Ŭ������ ����Ű�� Ű����..
		super();
		this.name = name;//�ʵ� �� ���ú����� �̸��� ���� �� �������ַ� �ʵ忡this�� �����ش�.
		this.birthDate = birthDate;
		this.salary = salary;
	}
	public Employee(String name, MyDate birthDate) {//�����ϳ��� ���� ��
		//��������� �Ѿ�� salary  ���� �������� ������ ������� �������ش�.
		//this(); 
		/*
		 * ������ ���� this ::
		 * �� Ŭ���� ������ �Ǵٸ� �����ڸ� ȣ�� 
		 */
		
		this(name,birthDate, BASIC_SALARY);

	}

	public String getDetails() { 
		return name+"," + birthDate + "," + salary;
	}

	//�߰�1 HeterogeneousTest2
	public double getSalary() {
		return salary;
	}


}
