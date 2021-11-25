package com.edu.spring.model;
/*
 * 템플릿 메소드 2개
 * 템플릿 메소드 이름은...mapping.xml의 태그의 아이디값
*/

import java.util.List;

import com.edu.spring.domain.Item;

public interface ItemDAO {
	List<Item> getItemList() throws Exception;
	Item getItem(Integer itemId) throws Exception;
}
