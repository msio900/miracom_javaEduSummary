package com.edu.spring.model;

import java.util.List;

import com.edu.spring.domain.MyProduct;

/*
 * 비즈니스로직 5개
 * 비즈니스 로직의 이름...mapping.xml의 id이름과 동일하게 정의한다.
 */
public interface MyProductDAO {
	int addProduct(MyProduct vo) throws Exception;
	List<MyProduct> findProducts() throws Exception;
	List<MyProduct> findProductByName(String name) throws Exception;
	List<MyProduct> findProductByMaker(String maker) throws Exception;
}
