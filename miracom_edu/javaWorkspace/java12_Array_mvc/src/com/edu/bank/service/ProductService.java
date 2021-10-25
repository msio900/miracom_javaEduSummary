package com.edu.bank.service;

import com.edu.bank.vo.Product;

/*
 * Product 객체들을 핸들링하는 기능(알고리즘)만으로 작성된 클래스...
 * ::
 * 1) 모든 상품들의 maker를 출력하는 기능
 * 2) 상품들의 총 수입액을 리턴하는 기능
 * 3) 특정 금액 이상이 되는 제품들을 리턴하는 기능
 * 4) 동일한 회사의 제품들만 리턴하는 기능
 * 5) 구입한 상품의 평균가를 리턴하는 기능
 */
public class ProductService {
/*	private Product[ ] pros;
	
	public ProductService(Product[] pros) {
		super();
		this.pros = pros;
	}*/
	// 메소드 정의 = 메소드 선언부(identifier) + 메소드 구현부
	//identifier를 얼마나 잘 만드는지...!
	//1)모든 상품들의 maker를 출력하는 기능
	public void printAllProductMaker(Product[ ] pros) { // 모든이 들어갈때는, all혹은 뒤에 s를 붙임.
		//출력이 이 부분에서 진행...반환되는 값은 없다.
		System.out.println("1. 모든 제품의 상품명입니다...");
		for(Product p:pros)System.out.println(p.getMaker());
		
		
	}
	// 2) 상품들의 총 구입액을 리턴하는 기능
	public int getTotalPrice(Product[ ] pros) {
		int total = 0;
		for(Product p : pros) total += p.getPrice() * p.getQuantity();
		return total;
	}
	
	// 3) 특정 금액 이상이 되는 제품들을 리턴하는 기능
	public Product[ ] getMorePrice(Product[ ] pros, int price) {
		Product[ ] temp = new Product[pros.length];//temp 일시적으로 만들어놓은것!
		int index = 0;
		for(Product p : pros) {
			if(p.getPrice()>=price) {
				temp[index++] = p; //1줄로
				//   [0]	[1]	   [2]	  [3] 
				// | null | null | null | null |
				//배열에 객체를 추가
				//temp[index] = p; 2줄을
				// index++;
				
			}
		}
		
		return temp;
		
	} 
	// 4) 동일한 회사 제품들만 리턴하는 기능
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
	// 5) 구입한 상품의 평균가를 리턴하는 기능
	public int getAvgPrice(Product[ ] pros) {
		//위에서 미리 만들어놓은 함수를 재사용하자
		return getTotalPrice(pros)/pros.length;
	} 

}
