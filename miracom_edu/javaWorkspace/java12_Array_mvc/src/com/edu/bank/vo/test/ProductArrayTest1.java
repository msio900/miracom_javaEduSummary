package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;

public class ProductArrayTest1 {
	public static void main(String[] args) {
		Product[ ] pros = {
			new Product("�Ŷ��", 3000, 4, "���"),
			new Product("��γ׻���", 12000, 10, "���"),	
			new Product("����ũ��", 23000, 1, "LG"),	
			new Product("������", 440000, 1, "���")
		};
		System.out.println("=== ��ǰ ������ ����մϴ�. ===");
		
		for(Product pro : pros)
			System.out.println(pro.getDetails());

	}

}
