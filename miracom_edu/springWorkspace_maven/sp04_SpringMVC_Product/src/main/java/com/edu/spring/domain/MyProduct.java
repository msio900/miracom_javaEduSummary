package com.edu.spring.domain;

public class MyProduct {
	
	private int id;
	private String name;
	private String maker;
	private int price;
	
	public MyProduct() {	}

	public MyProduct(int id, String name, String maker, int price) {
		super();
		this.id = id;
		this.name = name;
		this.maker = maker;
		this.price = price;
	}
	//인자값 3개짜리로 오버로딩
	public MyProduct(String name, String maker, int price) {
		this.name = name;
		this.maker = maker;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "MyProduct [id=" + id + ", name=" + name + ", maker=" + maker + ", price=" + price + "]";
	}
	
	
	
}
