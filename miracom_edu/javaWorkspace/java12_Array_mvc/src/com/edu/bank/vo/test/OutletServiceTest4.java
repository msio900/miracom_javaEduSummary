package com.edu.bank.vo.test;

import com.edu.bank.service.CustomerService;
import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;

public class OutletServiceTest4 {

	public static void main(String[] args) {
		Product[ ] pros1 = {
				new Product("�Ŷ��", 3000, 5, "���"),
				new Product("��γ׻���", 12000, 10, "���"),	
				new Product("����ũ��", 23000, 1, "LG"),	
				new Product("������", 440000, 1, "���")
			};
		Product[ ] pros2 = {
				new Product("�׿�ġ��", 8000, 3, "LG"),
				new Product("�����", 1000, 2, "���"),	
				new Product("����Ÿ��", 50000, 1, "LG")
		};
		
		Customer[ ] cust = {
				new Customer(111,"����", "��赿"),
				new Customer(222, "������", "�Ż絿")
		};
		
		//������ ���� ��ǰ�� �����Ѵ�....
		cust[0].buyProducts(pros2);
		cust[1].buyProducts(pros1);
		
		CustomerService service = new CustomerService();
		//////////////// �Ʒ������� Service Ŭ���� �޼ҵ带 ȣ���� ���Դϴ�./////////////
	}//main

}//class
