package com.edu.bank.service;

import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;

/*
 * �ƿ﷿���� ��ǰ�� �����ϴ� ���� ���� ����� �ٷ�� Service Ŭ����
 * ��ɵ鸸 ���ǵǾ��� �ִ�....
 */
public class CustomerService {
	//1. Ư�� ���� ������ ��ǰ�� �����ϴ� ���
	public Product[ ] getProduct(Customer c) {
		return c.getProducts();
	}
	//2. Ư�� ���� ������ ��ǰ�� maker�鸸 �����ϴ� ���
	public String[ ] getAllProductMaker(Customer c) {
		return null;
	}
	
	//3. Outlet�ȿ� �ִ� ��� ���� �����ϴ� ���
	public Customer[ ] getAllCustomer(Customer[ ] custs) {
		return null;
	}
	//4. ��� ���� �߿��� Ư���� ���� �˻��ϴ� ���...ssn���� �˻�
	public Customer getCustomer(Customer[ ] custs, int ssn) {
		return null;
	}
	//5. Ư�� ���� ������ ���� �� �ְ��� �ش��ϴ� ������ ������ �����ϴ� ���
	public int maxPriceProduct(Customer c) {
		return 0;
	}
	//6. ��� ���� ������ ���� �� Ư������ �̻�Ǵ� ��ǰ���� �����ϴ� ���
	public Product[ ] getMorePriceProducts(Customer[ ] custs, int price) {
		return null;
	}
	//7. ������ ���׿� ��� �ִ� ������ �����ϴ� ���
	public Customer[ ] findSameAddressCustomer(Customer[ ] custs, String address) {
		return null;
	}
	
	
}
