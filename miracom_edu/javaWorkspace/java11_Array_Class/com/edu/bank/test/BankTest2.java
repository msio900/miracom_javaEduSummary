package com.edu.bank.test;

import com.edu.bank.Account;
import com.edu.bank.Customer;

/*
 * 1. ����, ���� , �ʱ�ȭ...�Ѳ�����
 * acc1, acc2, acc3 ��� �̸�����
 * 	  ���� ���� �츮���� ������ ���� ����
 * 2. James��� �̸��� ���� �ϳ� ����
 * 3. James���� ���� ���� �츮���� ������ ������.
 * 4. James ���� ������ �ִ� ���� �߿���
 * 		�������� ������ �ϳ� �޾ƿͼ�...equals() �Լ��� ���
 * 		�������� ���忡 900, 30000�� �Ա� --> 900�� �Ա��� �ȵǴ� ���� Ȯ��
 * 		5000, 50000�� ��� --> 50000���� ��� �ȵǴ� ���� Ȯ��
 * 		�ܾ��� Ȯ��
 * 
 */
public class BankTest2 {
	public static void main(String[] args) {
		//1. AccountŸ���� �迭 ����
		Account[ ] accounts = {
				new Account(1000.0, "����"),
				new Account(2000.0, "����"),
				new Account(3000.0, "�츮"),
		};
		
		//2. James��� ���� ����
		Customer james = new Customer(1234, "James");
		
		//3. james�� 3���� ������ ����.
		james.setAccounts(accounts);//Has a Relation�� �̷���
		
		//4. james�� ������ �ִ� ���� �߿��� ...�������� ���� �ϳ��� �޾ƿ´�.
		Account[ ] reAcc=james.getAccounts();
		Account choice = null;
		for (Account acc: reAcc) {//�迭�� �ް�
			if(acc.getBankName().equals("����")) choice = acc;//���ú��� ����
				
		}//
		
		System.out.println("====�������� ���忡 �Ա��� �����մϴ�.====");
		choice.deposit(900.0); //�̰� return
		choice.deposit(30000.0); 
		
		System.out.println("====�������� ���忡 ����� �����մϴ�.====");
		choice.withdraw(5000.0);
		choice.withdraw(50000.0);//�̰� return
		
		

		
		
		System.out.println("===�������� ���忡 �ܾ��� Ȯ���մϴ�.===");
		System.out.println("Balance ::"+choice.getBalance());
		
		
		
		

	}

}
