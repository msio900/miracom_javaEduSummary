package com.edu.child;
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


import com.edu.parent.Employee;
import com.edu.util.MyDate;

/*
 * Employee�� �ڽ� Ŭ����...
 * �θ� ���� ��� ������ �����ް�
 * 
 * �ڽ��� ������� �߰�
 * ::
 * ��ӿ��� �ڽ� Ŭ����
 * �ʵ� --> 
 */


//�θ�Employ�� ���� Ȯ��� �ڽ� Ŭ����Manager�� ����
public class Manager extends Employee{
	private String dept;//�μ�
	
	public Manager(String name, MyDate birthDate, double salary, String dept) {
		/*this.name = name;
		this.bitrhDate = birthDate;
		this.salary = salary;*/

		//super();//Employee();//null, null, 0.0 - �ʵ��ʱ�ȭ�� ���� ����.
		super(name, birthDate, salary); //��������� ����.
		this.dept = dept;
	}
	/*
	 * ��Ӱ��迡 �ִ� 2���� Ŭ�������� method�� ��ӵɶ� �Ͼ�� ��
	 * Method Overiding
	 * Step 1. �θ� ���� method�� �״�� �����޴´�.
	 * Stpe 2. �װ� ��ģ��. 
	 * 
	 * �θ� ���� �޼ҵ带 �����޾Ƽ�
	 * ����� �ڽĿ��� �°� �ٽ� ���ļ� ����ϴ� ��.
	 * :
	 * ����� �ٲ���� ������ ���ο� �޼ҵ尡 ��������ٰ� �����ص� �ȴ�....!
	 * method ������
	 * Rule
	 * 1. �޼ҵ� ����δ� ��� ��ġ - �̸�, ���ڰ�, ����Ÿ��.
	 * 2. �޼ҵ� �����δ� �޶���Ѵ�. - ����� �޶�����.
	 * 3. ���� �ٸ� ��Ӱ����� Ŭ�������� �߻��Ѵ�.
	 */
	public String getDetails() {
		return super.getDetails()+", "+dept;
	}
	public void chageDept(String dept) { //�ڽĸ��� ����� �߰���. Overiding�� ������.
		this.dept = dept;
	}

	public String getDept() {
		return dept;
	}

}
