package com.edu.child;

import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * Employee�� �ڽ� Ŭ����..
 * �θ� ���� ��� ������ �����ް�
 *         +
 * �ڽŸ��� ����� �߰�..
 * ::
 * ��ӿ��� �ڽ�ũ����
 * �ʵ� --> �ڽŸ��� �ʵ带 �߰�
 * �޼ҵ� --> �θ� ������ ����� �ڱ⿡�� �°� ���ľ���
 * (��Ӱ��迡 �ִ� 2���� Ŭ���������� ����..�������̵�)
 */

//�θ� Employee�� ���� Ȯ��� �ڽ� Ŭ���� Manager�� ����

public class Manager extends Employee {
	private String dept;
	// ������
	// �̺κ��� ������ �ȳ��� �Ϸ��� � �ڵ带 �߰��ؾ� �ұ�? 
	public Manager(String name, MyDate birthDate, double salary, String dept) {
//		this.name = name;
//		this.birthDate = birthDate;
//		this.salary = salary;

//		super();//������ȣ�� �Ǿ��ϱ� ������ //Employee();//null, null, 0.0
		//�θ� ��������� ����
		super(name, birthDate, salary);
		this.dept = dept;

	}
	
	/*
	 * ��Ӱ��迡 �ִ� �ΰ��� Ŭ�������� method�� ��ӵ� �� �Ͼ�� ��
	 * 
	 * Method overriding
	 * 1step. �θ� ���� �޼ҵ带 �״�� �����޴´�.
	 * 2step. �װ� ��ģ��.
	 * �θ� ���� �޼ҵ带 �����޾Ƽ� ����� �ڽĿ��� �°� �ٽ� ���ļ� ����ϴ� �� 
	 * ::
	 * ����� �ٲ���� ������ ���ο� �޼ҵ尡 ����� ���ٰ� �����ص� �ȴ�.
	 * << �޼ҵ� ������ >>
	 * Rule
	 * 1. �޼ҵ� ����δ� ��� ��ġ �ؾ��Ѵ� - �̸�, ���ڰ�, ����Ÿ�� ���δ�.
	 * 2. �޼ҵ� �����δ� �޶�� �Ѵ� - ����� �޶�����.
	 * 3. ���δٸ� ��Ӱ����� Ŭ�������� �߻��Ѵ�.
	 */
	
//	public String getDetails() {
//		return name+"," + birthDate.getDate() + "," + salary;
//	}�̰��� �Ʒ��� ���� ����.
	public String getDetails() {
		return super.getDetails() + "," +dept;
	}//�θ� ����ġ�� Ű���� (Ŭ���� �����ϰ� �� ���ϼ� ����)
	
	//�ڽĸ��� �ɹ��� ���Ӱ� �߰��� ���.. �������̵����� �������.
	public void changeDept(String dept) {
		this.dept = dept;
	}
	
	public String getDept() {
		return dept;
	}


}
