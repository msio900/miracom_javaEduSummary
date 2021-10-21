package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		// 1. ���� ����
		Customer  custom = new Customer("James", "Gosling");
		
		// 2. James�� ������ �ϳ� ����...Has a Relation...
		custom.setAccount(new Account(10000.0));
		
		// 3. James�� ������ ������ �ϳ� �޾Ƽ�....
		//CustomerŬ������ �ִ� getAccount()�� ȣ��...
		Account jamesAcc = custom.getAccount(); // balance�� 1����
		//return�� ���� ������ ����Ϸ���, 
		
		// 4. ���� james�� ������ ������ ����� �� �ִ�.
		// 5000��, 3000��, 20000���� �Ա� / 25000�� �� ��� / �ܾ� 13000��
		jamesAcc.deposit(5000);
		jamesAcc.deposit(3000);
		jamesAcc.deposit(20000);
		/////
		jamesAcc.withdraw(25000);
		
		System.out.println("James Account Balance :: "+jamesAcc.getBalance());
		

	}

}
