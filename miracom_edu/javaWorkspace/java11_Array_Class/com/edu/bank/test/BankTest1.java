package com.edu.bank.test;

import com.edu.bank.Account;

public class BankTest1 {

	public static void main(String[] args) {
		//1. account��� �̸����� Account Ÿ���� �迭 ����...������ 3
		
		//2. ������ ĭ�� ����, ����, �츮���� ������ ����
		
		//3. for���� �̿��ؼ� �迭�ȿ� �ִ� Account������ ���
		/*Account[ ] accounts = new Account[3];

		accounts[0] = new Account(10000.0, "��������");
		accounts[0] = new Account(5000.0, "��������");
		accounts[0] = new Account(7000.0, "�츮����");*/
		
		// �迭�� ���� + ���� + �ʱ�ȭ�� �Ѳ�����...
		/*
		 * �⺻�� Ÿ���� �迭������ ���� ������ ��ü�� �ǹ�������
		 * Ŭ���� Ÿ���� �迭������ ���� ������ ��ü�� �ȴ�.
		 */
		Account[ ] accounts = {
			new Account(10000.0, "��������"),
			new Account(5000.0, "��������"),
			new Account(7000.0, "�츮����")
			
				
		};
		
		for (Account account : accounts) System.out.println(account.getDetails()+" ");
		
		

	}

}
