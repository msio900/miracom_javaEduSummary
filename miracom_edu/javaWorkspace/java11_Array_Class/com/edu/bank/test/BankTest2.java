package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

/*
 * 1. 선언, 생성 , 초기화...한꺼번에
 * acc1, acc2, acc3 라는 이름으로
 * 	  신한 국민 우리은행 통장을 각각 생성
 * 2. James라는 이름의 고객을 하나 생성
 * 3. James고객이 신한 국민 우리은행 통장을 개설함.
 * 4. James 고객이 가지고 있는 통장 중에서
 * 		신한은행 통장을 하나 받아와서...equals() 함수를 사용
 * 		신한은행 통장에 900, 30000원 입금 --> 900원 입금이 안되는 것을 확인
 * 		5000, 50000원 출근 --> 50000원은 출금 안되는 것을 확인
 * 		잔액을 확인
 * 
 */
public class BankTest2 {
	public static void main(String[] args) {
		//1. Account타입의 배열 생성
		Account[ ] accounts = {
				new Account(1000.0, "신한"),
				new Account(2000.0, "국민"),
				new Account(3000.0, "우리"),
		};
		
		//2. James라는 고객을 생성
		Customer james = new Customer(1234, "James");
		
		//3. james가 3개의 통장을 가짐.
		james.setAccounts(accounts);//Has a Relation이 이뤄짐
		
		//4. james가 가지고 있는 통장 중에서 ...신한은행 통장 하나를 받아온다.
		Account[ ] reAcc=james.getAccounts();
		Account choice = null;
		for (Account acc: reAcc) {//배열로 받고
			if(acc.getBankName().equals("신한")) choice = acc;//로컬변수 선언
				
		}//
		
		System.out.println("====신한은행 통장에 입금을 진행합니다.====");
		choice.deposit(900.0); //이건 return
		choice.deposit(30000.0); 
		
		System.out.println("====신한은행 통장에 출금을 진행합니다.====");
		choice.withdraw(5000.0);
		choice.withdraw(50000.0);//이건 return
		
		

		
		
		System.out.println("===신한은행 통장에 잔액을 확인합니다.===");
		System.out.println("Balance ::"+choice.getBalance());
		
		
		
		

	}

}
