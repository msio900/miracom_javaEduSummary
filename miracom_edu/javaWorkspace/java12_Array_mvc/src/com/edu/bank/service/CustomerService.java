package com.edu.bank.service;
/*
 * 아울렛에서 상품을 구매하는 고객에 대한 기능을 다루는 Service 클래스
 * 기능들만 정의되어져 있다....
 */
public class CustomerService {
	//1. 특정 고객이 구입한 상품을 리턴하는 기능
	public Product[ ] getProduct(Customer c) {
		return c.getProducts();
	}
	//2. 특정 고객이 구입한 상품의 maker들만 리턴하는 기능
	
	//3. Outlet안에 있는 모든 고객을 리턴하는 기능
	
	//4. 모든 고객들 중에서 특정한 고객을 검색하는 기능...ssn으로 검색
	
	//5. 특정 고객이 구입한 물건 중 최고가에 해당하는 물건의 가격을 리턴하는 기능
	
	//6. 모든 고객이 구입한 물건 중 특정가격 이상되는 제품들을 리턴하는 기능
	
	//7. 동일한 동네에 살고 있는 고객들을 리턴하는 기능
	
	
}
