package com.edu.bank.vo.test;
/*
 * ~Test 클래스는
 * 1) 객체를 생성 (==클래스의 멤버를 메모리에 올리고)
 * 2) 멤버에 접근 (필드 접근이 막혔기 때문에 메소드 접근만 가능...) == 메소드 호출
 * ---------------------------------------------------------------
 * ProductService에서 모든 메소드를 정의해두었기 때문에
 * ProductService객체를 생성 --> 메소드 호출
 */


import com.edu.bank.service.ProductService;
import com.edu.bank.vo.Product;

public class ProductArrayServiceTest3 {

	public static void main(String[] args) {
		Product[ ] pros = {
				new Product("신라면", 3000, 1, "농심"),
				new Product("흥부네생수", 12000, 1, "농심"),	
				new Product("옥시크린", 23000, 1, "LG"),	
				new Product("정수기", 440000, 1, "대우")
			};
			//1. Service 객체 생성
			ProductService service = new ProductService();
			
			//2. Service의 구현된 메소드를 하나씩 호출...
			service.printAllProductMaker(pros);
			System.out.println(service.getTotalPrice(pros)+"원");
			
			Product[ ] returnPros=service.getMorePrice(pros, 20000);
			// |  P  |  P  | null | null |
			//
			for(Product p : returnPros) {
				if(p==null) continue;
				System.out.println(p.getDetails());
			}
			Product[ ] returnPros2=service.getcertainCompany(pros, "농심");
			for(Product p : returnPros2) {
				if(p==null) continue;
				System.out.println(p.getDetails());
			}
			System.out.println(service.getAvgPrice(pros)+" 원");
	}//main

}//class
