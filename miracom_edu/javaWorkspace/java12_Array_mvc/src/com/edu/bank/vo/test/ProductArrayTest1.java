package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;

public class ProductArrayTest1 {
	public static void main(String[] args) {
		Product[ ] pros = {
			new Product("신라면", 3000, 4, "농심"),
			new Product("흥부네생수", 12000, 10, "농심"),	
			new Product("옥시크린", 23000, 1, "LG"),	
			new Product("정수기", 440000, 1, "대우")
		};
		System.out.println("=== 상품 정보를 출력합니다. ===");
		
		for(Product pro : pros)
			System.out.println(pro.getDetails());

	}

}
