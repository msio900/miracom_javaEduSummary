package com.edu.spring.model.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.spring.domain.Item;
import com.edu.spring.model.ItemCatalog;
import com.edu.spring.model.ItemDAO;

@Service
public class ItemCatalogImpl implements ItemCatalog {
	
	@Autowired
	private ItemDAO itemDAO;

	@Override
	public List<Item> getItemList() throws Exception {
		
		return itemDAO.getItemList();
	}

	@Override
	public Item getItem(Integer itemId) throws Exception {

		return itemDAO.getItem(itemId);
	}
	

}
