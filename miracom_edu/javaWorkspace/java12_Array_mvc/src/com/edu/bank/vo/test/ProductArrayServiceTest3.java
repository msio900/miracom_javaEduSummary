package com.edu.bank.vo.test;
/*
 * ~Test Ŭ������
 * 1) ��ü�� ���� (==Ŭ������ ����� �޸𸮿� �ø���)
 * 2) ����� ���� (�ʵ� ������ ������ ������ �޼ҵ� ���ٸ� ����...) == �޼ҵ� ȣ��
 * ---------------------------------------------------------------
 * ProductService���� ��� �޼ҵ带 �����صξ��� ������
 * ProductService��ü�� ���� --> �޼ҵ� ȣ��
 */


import com.edu.bank.service.ProductService;
import com.edu.bank.vo.Product;

public class ProductArrayServiceTest3 {

	public static void main(String[] args) {
		Product[ ] pros = {
				new Product("�Ŷ��", 3000, 1, "���"),
				new Product("��γ׻���", 12000, 1, "���"),	
				new Product("����ũ��", 23000, 1, "LG"),	
				new Product("������", 440000, 1, "���")
			};
			//1. Service ��ü ����
			ProductService service = new ProductService();
			
			//2. Service�� ������ �޼ҵ带 �ϳ��� ȣ��...
			service.printAllProductMaker(pros);
			System.out.println(service.getTotalPrice(pros)+"��");
			
			Product[ ] returnPros=service.getMorePrice(pros, 20000);
			// |  P  |  P  | null | null |
			//
			for(Product p : returnPros) {
				if(p==null) continue;
				System.out.println(p.getDetails());
			}
			Product[ ] returnPros2=service.getcertainCompany(pros, "���");
			for(Product p : returnPros2) {
				if(p==null) continue;
				System.out.println(p.getDetails());
			}
			System.out.println(service.getAvgPrice(pros)+" ��");
	}//main

}//class
