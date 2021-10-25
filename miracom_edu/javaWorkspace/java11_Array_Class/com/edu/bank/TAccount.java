package com.edu.bank;
/*
 * ���忡 ���� ������ ������ �ִ� Ŭ����..
 * balance, bankName �ʵ带 �����ϰڴ�.
 * �ڹٿ����� ��� Ŭ������ �ۼ��Ҷ� �ݵ�� Encapsulation����� ���� �ۼ��Ѵ�.
 * �ʵ�--> private
 * �޼ҵ� --> public
 */
public class TAccount {
	//1.�ʵ� ����
	private double balance;
	private String bankName;
	
	//2.������θ� ����
	public TAccount(double balance, String bankName) {
		super();
		this.balance = balance;
		this.bankName = bankName;
	}
	
	//3. �ʵ带 ��ȯ..
	public String getDetails() {
		return balance+","+bankName;
	}
	
	//�߰�..
	public String getBankName() {
		return bankName;
	}
	
	//������ ��ɵ��� �ۼ�..
	public void deposit(double amt) {
		if(amt>=1000.0) {
			balance +=  amt; //1õ�� �̻��� �ݾ׸� �Աݰ�����
		}else {
			System.out.println("�Աݾ��� 1õ�� �̻����� �ϼž� �մϴ�..");
			return;//ȣ���� �������� �ٽ� �ǵ���...Ÿ���� ���� �ٽ� �Է��ϵ��� ����
		}
	}
	
	public void withdraw(double amt) {
		if(balance>=amt) {
			balance -=amt;
		}else {
			System.out.println("�ܾ׺��� ��ݾ��� ���Ƽ� ����� �ȵ˴ϴ�..");
			return;
		}
	}
	
	public double getBalance() {
		return balance;
	}	
}




