package com.edu.bank.service;

import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;

/*
 * �ƿ﷿���� ��ǰ�� �����ϴ� ���� ���� ����� �ٷ�� Service Ŭ����
 * ��ɵ鸸 ���ǵǾ��� �ִ�..
 */
public class CustomerService {
	//1. Ư�� ���� ������ ��ǰ�� �����ϴ� ���
	public Product[ ] getProduct(Customer c) {
		return c.getProducts();
	}
	
	//2.Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
	public String[ ] getAllProductMaker(Customer vo) {
		String[ ] temp = new String[vo.getProducts().length];
		Product[ ] pros=vo.getProducts();
		int cnt = 0;
		for(Product p : pros) temp[cnt++] = p.getMaker();		
		return temp;
	}
	//3. Outlet�ȿ� �ִ� ��� ���� �����ϴ� ���
	public Customer[ ] getAllCustomer(Customer[ ] custs) {
		Customer[ ] temp = new Customer[custs.length];
		int cnt = 0;
		for(Customer c : custs) temp[cnt++] = c;		
		return temp;
	}
	// ### method overloading
	
	//4. ��� ���� �߿��� Ư���� ���� �˻��ϴ� ���...ssn���� �˻�
	public Customer findCustomer(Customer[ ] custs, int ssn) {
		Customer customer=  null;
		for(Customer c : custs) {
			if(c.getSsn()==ssn) customer = c;
		}
		return customer;
	}	
	// �̸��� ������ error�� ���� ����. �ֳ��ϸ� ���� ���� �ٸ��� ����
	// identifier(�̸� ���� ��� --> � ���� �ϴ��� �ٷ� �˼� �ֵ���
	//7. ������ ���׿� ����ִ� ������ �����ϴ� ���....findSameAddressCustomer
	public Customer[ ] findCustomerByAddr(Customer[ ] custs, String address) {
		Customer[ ] temp = new Customer[custs.length];
		int cnt = 0;
		for(Customer c : custs) {
			if(c.getAddress().equals(address)) temp[cnt++] = c;
		}
		return temp;
	}
	//5. Ư�� ���� ������ ������ �ְ��� �ش��ϴ� ������ ������ �����ϴ� ���
		public int maxPriceProduct(Customer c) {
			int maxPice = 0;
			Product[ ] pros = c.getProducts();
			for(Product p : pros) {
				if(p.getPrice()>maxPice) maxPice = p.getPrice();
			}
			return maxPice;
	}
	//6. ��� ���� ������ ������ Ư������ �̻�Ǵ� ��ǰ���� �����ϴ� ���
	public Product[ ] getMorePriceProducts(Customer[ ] custs, int price) {
		int len = 0;
		int cnt = 0;
		for(Customer c : custs) len+= c.getProducts().length;
				
		Product[ ] temp = new Product[len];
		
		for(Customer c : custs) {
			for(Product p : c.getProducts()) {
				if(p.getPrice()>price) temp[cnt++] = p;
			}
		}		
		return temp;	
	}
}

