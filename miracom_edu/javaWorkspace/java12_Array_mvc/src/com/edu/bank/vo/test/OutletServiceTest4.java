package com.edu.bank.vo.test;

import com.edu.bank.service.CustomerService;
import com.edu.bank.vo.Customer;
import com.edu.bank.vo.Product;

public class OutletServiceTest4 {

	public static void main(String[] args) {
		Product[ ] pros1 = {
				new Product("신라면", 3000, 5, "농심"),
				new Product("흥부네생수", 12000, 10, "농심"),	
				new Product("옥시크린", 23000, 1, "LG"),	
				new Product("정수기", 440000, 1, "대우")
			};
		Product[ ] pros2 = {
				new Product("죽염치약", 8000, 3, "LG"),
				new Product("새우깡", 1000, 2, "농심"),	
				new Product("하이타이", 50000, 1, "LG")
		};
		
		Customer[ ] cust = {
				new Customer(111,"원빈", "방배동"),
				new Customer(222, "아이유", "신사동")
		};
		
		//각각의 고객이 상품을 구매한다....
		cust[0].buyProducts(pros2);
		cust[1].buyProducts(pros1);
		
		CustomerService service = new CustomerService();
		//////////////// 아래에서는 Service 클래스 메소드를 호출할 것입니다./////////////
	}//main

}//class
