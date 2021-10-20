package com.edu.cons;

class Person{
	String name;
	int age;
	// person
	Person(String name, int age){
		//�ʵ��ʱ�ȭ
		this.name = name;
		this.age = age;
	}
	//set
	public void setPerson(String name, int age) {
		//�ʵ��ʱ�ȭ
		this.name = name;
		this.age = age;
	}
	//get
	public String getPerson() {
		return name+", "+age;
	}
}

public class PersonTest {

	public static void main(String[] args) {
		/*
		 * �����ڶ�?
		 * ��ü�� �����ɶ� ���� �����ϴ� �� -> "������"!!!!!
		 * 
		 * 1. ��� Ŭ�������� �ϳ��̻��� �����ڰ� ������ �����Ѵ�.
		 * 2. �⺻�����ڴ� �����ڰ� �ۼ����� �ʾƵ� ������ Ŭ������ �����Ѵ�.
		 * 	Default Constructor �� ���ڰ�X, {}�����ο��� �ƹ��� �ϵ� ���� ���� ������
		 * 
		 * 3. ����� �����ڴ� ���ڰ��� �ϳ� �̻�
		 * �ϴ� ���� "�ʵ� �ʱ�ȭ"
		 * 
		 * 4. Ŭ������ ����� �����ڸ� �ۼ��س�����
		 * �����Ϸ��� �⺻ �����ڸ� �־��ִ� �۾��� ���� �ʴ´�.
		 * 
		 * ::
		 * 
		 * �ʵ忡 ���� ���ԵǴ� ��δ� �� 2�� �̴�.
		 * 1) ����� ������..��ü�� �����Ǵ� �Ͱ� ���ÿ� ���� ���Ե�.
		 * 2) setter()..��ü�� ������ ���Ŀ� ���� ���Ե�.
		 */
		//�̻��¿��� ���� null, 0
		//Person p1 = new Person();// �����ڰ� ȣ��(calling)�Ǵ� �κ�
		//Person p2 = new Person();// �����ڰ� ȣ��(calling)�Ǵ� �κ�
		//Person p3 = new Person();// �����ڰ� ȣ��(calling)�Ǵ� �κ�
		// ��ü�� 3�� ��������ٴ� �ǹ̸� ����. ��ü�� ��ü�� ���(member)
		
		//��ü ������ ���ÿ� ����� ���� �Ҵ�...
		// ������ ȣ���.
		Person p1 = new Person("James", 65);// �����ڰ� ȣ��(calling)�Ǵ� �κ�
		Person p2 = new Person("������", 30);// �����ڰ� ȣ��(calling)�Ǵ� �κ�
		Person p3 = new Person("���84", 35);// �����ڰ� ȣ��(calling)�Ǵ� �κ�
		
		
		/*p1.setPerson("James", 65);
		p2.setPerson("������", 30);
		p3.setPerson("���84", 35);*/

		
		System.out.println(p1.getPerson());
		System.out.println(p2.getPerson());
		System.out.println(p3.getPerson());


	}

}
