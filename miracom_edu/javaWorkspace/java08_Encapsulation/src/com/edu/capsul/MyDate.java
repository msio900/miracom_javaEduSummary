package com.edu.capsul;
//���� ��¥ ������ ������ �ִ� Ŭ����...
public class MyDate {
	//private�� ���� Ŭ���������� ...���� ����... �ٸ� class���� ���� �Ұ�
	private int month;
	private int day;
	
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		// invalid�� ���� ���޵Ǵ��� �ʵ� �ʱ�ȭ �Ǳ� ������ �ɷ��� �� �ִ�.
		// month�� �ش��ϴ� ���� 1~12�� ��쿡�� �ʵ��ʱ�ȭ �ǵ����Ѵ�.
		if() {
			this.month = month;
		}else {
			System.out.println("�߸��� �� �Է��Դϴ�.");
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		/*
		 * switch���� ���
		 * 1,3,5,7,9,12�� �϶��� day�� 1~31��
		 * 2,4,6,8,
		 */
		this.day = day;
	}

}
