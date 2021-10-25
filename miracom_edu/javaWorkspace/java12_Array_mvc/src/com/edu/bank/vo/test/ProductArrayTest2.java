package com.edu.bank.vo.test;

import com.edu.bank.vo.Product;

public class ProductArrayTest2 {

	public static void main(String[] args) {
		Product[ ] pros = {
				new Product("신라면", 3000, 4, "농심"),
				new Product("흥부네생수", 12000, 10, "농심"),	
				new Product("옥시크린", 23000, 1, "LG"),	
				new Product("정수기", 440000, 1, "대우")
			};
			System.out.println("=== 1. 상품들의 메이커를 출력합니다. ===");
			//
			for (Product p : pros) System.out.println(p.getMaker());
			
			System.out.println("\n=== 2. 특정 가격 이상 (10만원 이상)하는 제품들을 출력(상품명과 가격) ===");
			//
			for (Product p : pros) {
				if(p.getPrice()>=100000)
					System.out.println(p.getMaker()+", "+p.getPrice()+"원");
			}
			int total = 0;
			System.out.println("\n=== 3. 지금까지 구매한 모든 상품들의 총 가격을 출력 ===");
			//
			for (Product p : pros) {
				total += p.getPrice() * p.getQuantity();
			}
			System.out.println("상품의 총합은 "+total+"원입니다.");
	}

}
