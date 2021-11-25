package com.edu.spring.model;

import java.util.List;

import com.edu.spring.domain.Item;

public interface ItemCatalog {
	List<Item> getItemList() throws Exception;
	Item getItem(Integer itemId) throws Exception;
}
