package com.edu.bank;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
	//입금 구현 : 잔액 1만원 5천원 입금 -> 잔액1만5천원
	public void deposit(int amt) {
		// balance = balance + amt;
		balance += amt; //성능상 더 좋음.
	}
	//출금 구현
	public void withdraw(int amt) {
		// balance = balance - amt;
		balance -= amt; //성능상 더 좋음.
	}

}
