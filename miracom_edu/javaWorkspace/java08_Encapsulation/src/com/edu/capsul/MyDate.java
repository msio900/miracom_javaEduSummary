package com.edu.capsul;
//���� ��¥ ������ ������ �ִ� Ŭ����...
/*
 * Encapsulation Pattern
 * 1. field�տ� private�� ���� -- �ٸ� Ŭ�������� �ʵ忡 ���Ҵ� ����(�������� ������ ���´�.)
 * 2. void setXxxx(0,0)  / int returnŸ������ getXxxx() �� public���� ����
 * 3. setXxxx() method���� �ʵ� �ʱ�ȭ �Ǳ� ������ ���� ���� Ÿ���� �������� ���� ��ȿ�� �˻�
 */
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
		// field�� Ÿ���� ���� ������ ��ȿ�� �˻� ����
		if(month >= 1 & month <= 12) {
			this.month = month;//1~12
		}else {
			System.out.println("�߸��� �� �Է��Դϴ�.");
			System.exit(0); //���� ����, -1(����������)
		}
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		switch(month) {
			case 2:
				if(day >= 1 & day <= 28) {
					this.day = day;
				}else { 
					System.out.println("�߸��� �� �Է��Դϴ�.");
					System.exit(0); //���⼭ ���α׷��� ��������...�ٽ� Test�� ���ư��� �ʵ���
				}
					break;
				case 4:
				case 6:
				case 9:
				case 11:
					if(day >= 1 & day <= 30) {
						this.day = day;
					}else { 
						System.out.println("�߸��� �� �Է��Դϴ�.");
						System.exit(0); //���⼭ ���α׷��� ��������...�ٽ� Test�� ���ư��� �ʵ���
						}
						break;
				default:
					if(day >= 1 & day <= 31) {
						this.day = day;
					}else {
						System.out.println("�߸��� �� �Է��Դϴ�.");
						System.exit(0); //���⼭ ���α׷��� ��������...�ٽ� Test�� ���ư��� �ʵ���
					}
					break;
				}//switch
		/*
		 * switch���� ���
		 * 1,3,5,7,8,10,12���ϋ��� day�� 1~31��
		 * 4,6,9,11���϶��� day�� 1~30��
		 * 2���϶��� day�� 1~28�ϱ����� ���� ������ ������ �����ϼ���
		 */
	}//setDay

}
