package com.edu.bank;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	//�Ա� ���� : �ܾ� 1���� 5õ�� �Ա� -> �ܾ�1��5õ��
	public void deposit(int amt) {
		// balance = balance + amt;
		balance += amt; //���ɻ� �� ����.
	}
	//��� ����
	public void withdraw(int amt) {
		// balance = balance - amt;
		balance -= amt; //���ɻ� �� ����.
	}

}
