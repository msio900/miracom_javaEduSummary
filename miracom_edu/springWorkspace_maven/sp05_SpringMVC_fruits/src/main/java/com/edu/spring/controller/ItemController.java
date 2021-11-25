package com.edu.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edu.spring.domain.Item;
import com.edu.spring.model.ItemCatalog;

@Controller
public class ItemController {
	
	@Autowired
	private ItemCatalog itemCatalog;
	
	@RequestMapping("list.do")
	   public ModelAndView list() throws Exception{
	      List<Item> list = itemCatalog.getItemList();
	      
	      return new ModelAndView("itemList", "list", list);
	   }
	
	@RequestMapping("itemView.do")
	public ModelAndView itemView(int itemnumber) throws Exception {
		Item item = itemCatalog.getItem(itemnumber);
		return new ModelAndView("itemView", "item", item);
	}
	
}
	