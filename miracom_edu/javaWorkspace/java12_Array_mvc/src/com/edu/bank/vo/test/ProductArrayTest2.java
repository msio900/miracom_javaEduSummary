package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;

public class ProductArrayTest2 {

	public static void main(String[] args) {
		Product[ ] pros = {
				new Product("�Ŷ��", 3000, 4, "���"),
				new Product("��γ׻���", 12000, 10, "���"),	
				new Product("����ũ��", 23000, 1, "LG"),	
				new Product("������", 440000, 1, "���")
			};
			System.out.println("=== 1. ��ǰ���� ����Ŀ�� ����մϴ�. ===");
			//
			for (Product p : pros) System.out.println(p.getMaker());
			
			System.out.println("\n=== 2. Ư�� ���� �̻� (10���� �̻�)�ϴ� ��ǰ���� ���(��ǰ��� ����) ===");
			//
			for (Product p : pros) {
				if(p.getPrice()>=100000)
					System.out.println(p.getMaker()+", "+p.getPrice()+"��");
			}
			int total = 0;
			System.out.println("\n=== 3. ���ݱ��� ������ ��� ��ǰ���� �� ������ ��� ===");
			//
			for (Product p : pros) {
				total += p.getPrice() * p.getQuantity();
			}
			System.out.println("��ǰ�� ������ "+total+"���Դϴ�.");
	}

}
