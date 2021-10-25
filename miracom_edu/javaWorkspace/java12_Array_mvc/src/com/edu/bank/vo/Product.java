package com.edu.bank.vo;
/*
 * 상품에 대한 정보를 가지고 있는 VO클래스...
 * 필드로 
 * String maker
 * int price
 * int quantity
 * String company
 * ::
 * 생성자 / setter / getter
 */
public class Product {
	private String maker;
	private int price;
	private int quantity;
	private String company;
	
	public Product(String maker, int price, int quantity, String company) {
		super();
		this.maker = maker;
		this.price = price;
		this.quantity = quantity;
		this.company = company;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getDetails() {
		return maker+" "+price+" "+quantity+" "+company;
		
	}
	

}
