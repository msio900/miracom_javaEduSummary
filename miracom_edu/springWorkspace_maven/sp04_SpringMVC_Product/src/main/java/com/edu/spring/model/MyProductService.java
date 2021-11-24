package com.edu.spring.model;

import java.util.List;

import com.edu.spring.domain.MyProduct;

public interface MyProductService {
	void addProduct(MyProduct vo) throws Exception;
	List<MyProduct> findProducts() throws Exception;
	List<MyProduct> findProductByName(String name) throws Exception;
	List<MyProduct> findProductByMaker(String maker) throws Exception;
}
