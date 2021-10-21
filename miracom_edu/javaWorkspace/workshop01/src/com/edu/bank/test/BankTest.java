package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

public class BankTest {

	public static void main(String[] args) {
		// 1. 고객을 생성
		Customer  custom = new Customer("James", "Gosling");
		
		// 2. James가 통장을 하나 개설...Has a Relation...
		custom.setAccount(new Account(10000.0));
		
		// 3. James가 개설한 통장을 하나 받아서....
		//Customer클래스에 있는 getAccount()를 호출...
		Account jamesAcc = custom.getAccount(); // balance가 1만원
		//return을 받은 이유는 사용하려고, 
		
		// 4. 이제 james가 개설한 통장을 사용할 수 있다.
		// 5000원, 3000원, 20000원을 입금 / 25000원 을 출금 / 잔액 13000원
		jamesAcc.deposit(5000);
		jamesAcc.deposit(3000);
		jamesAcc.deposit(20000);
		/////
		jamesAcc.withdraw(25000);
		
		System.out.println("James Account Balance :: "+jamesAcc.getBalance());
		

	}

}
