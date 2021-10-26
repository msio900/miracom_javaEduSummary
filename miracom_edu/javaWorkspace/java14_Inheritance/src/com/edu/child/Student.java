package com.edu.child;

import com.edu.parent.Person;

//��ӿ��� �ڽ��� ������ �θ��� ������ ���� ������������ �Ѵ�.
//�θ� �����Ǿ� ���� �ʰ��� ���� �ڽ��� ����� ����.
//�θ�� �ڽ�Ŭ������ ���� �ٸ� Ŭ���� ������, �޸𸮿����� �Ѹ����� �ö󰣴�.
public class Student extends Person{
	private int stuId;

	public Student(String name, int age, String address,int stuId) {
		super(name,age, address); //null, 0,null
		this.stuId = stuId;
	}

	
	
	/*
	 1 step : �θ� ���� �޼ҵ带 �����޴´�.
	 2 step : �װ� �ڽ����� �°� ���ľ���..
	 --> �θ��� ��ɰ� �ڽ��� ����� �޶�����.
	 --> �ڽĿ��� �´� ������� �ٽ� ���Ľ��.
	 */
	@Override
	public String getDetails() {
		// TODO Auto-generated method stub
		return super.getDetails()+" StuId : "+stuId;
	}
	@Override
	public String toString() {
		return super.toString()+" StuId : "+stuId;
	}
	

}//class
