package com.edu.bank.service;

import com.edu.bank.vo.Product;

/*
 * Product ��ü���� �ڵ鸵�ϴ� ���(�˰���)������ �ۼ��� Ŭ����...
 * ::
 * 1) ��� ��ǰ���� maker�� ����ϴ� ���
 * 2) ��ǰ���� �� ���Ծ��� �����ϴ� ���
 * 3) Ư�� �ݾ� �̻��� �Ǵ� ��ǰ���� �����ϴ� ���
 * 4) ������ ȸ���� ��ǰ�鸸 �����ϴ� ���
 * 5) ������ ��ǰ�� ��հ��� �����ϴ� ���
 */
public class ProductService {
/*	private Product[ ] pros;
	
	public ProductService(Product[] pros) {
		super();
		this.pros = pros;
	}*/
	// �޼ҵ� ���� = �޼ҵ� �����(identifier) + �޼ҵ� ������
	//identifier�� �󸶳� �� �������...!
	//1)��� ��ǰ���� maker�� ����ϴ� ���
	public void printAllProductMaker(Product[ ] pros) { // ����� ������, allȤ�� �ڿ� s�� ����.
		//����� �� �κп��� ����...��ȯ�Ǵ� ���� ����.
		System.out.println("1. ��� ��ǰ�� ��ǰ���Դϴ�...");
		for(Product p:pros)System.out.println(p.getMaker());
		
		
	}
	// 2) ��ǰ���� �� ���Ծ��� �����ϴ� ���
	public int getTotalPrice(Product[ ] pros) {
		int total = 0;
		for(Product p : pros) total += p.getPrice() * p.getQuantity();
		return total;
	}
	
	// 3) Ư�� �ݾ� �̻��� �Ǵ� ��ǰ���� �����ϴ� ���
	public Product[ ] getMorePrice(Product[ ] pros, int price) {
		Product[ ] temp = new Product[pros.length];//temp �Ͻ������� ����������!
		int index = 0;
		for(Product p : pros) {
			if(p.getPrice()>=price) {
				temp[index++] = p; //1�ٷ�
				//   [0]	[1]	   [2]	  [3] 
				// | null | null | null | null |
				//�迭�� ��ü�� �߰�
				//temp[index] = p; 2����
				// index++;
				
			}
		}
		
		return temp;
		
	} 
	// 4) ������ ȸ�� ��ǰ�鸸 �����ϴ� ���
	public Product[] getcertainCompany(Product[] pros, String company) {
		Product[] temp = new Product[pros.length];
		int index = 0;
		for(Product p : pros) {
			if(p.getCompany().equals(company)) {
				temp[index++] = p;
				//index++;
			}
		}		
		return temp;
	}
	// 5) ������ ��ǰ�� ��հ��� �����ϴ� ���
	public int getAvgPrice(Product[ ] pros) {
		//������ �̸� �������� �Լ��� ��������
		return getTotalPrice(pros)/pros.length;
	} 

}
