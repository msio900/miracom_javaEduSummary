package com.edu.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.edu.spring.domain.MyProduct;
import com.edu.spring.model.MyProductService;

@Controller
public class MyProductController {
	
	@Autowired
	private MyProductService myProductService;
	
	@RequestMapping("myProduct.do")
	public ModelAndView insert(MyProduct pvo) throws Exception{
		System.out.println("DB입력 전..."+pvo.getId());
		myProductService.addProduct(pvo); //DAO --> sqlSession --> DB에 insert
		System.out.println("DB입력 후..."+pvo.getId());
		//ServletRequset에 바인딩 되어지고 insert_result.jsp에 forward되어진다.
		return new ModelAndView("insert_result", "info", pvo);
	}
	
	@RequestMapping("myProductSearch.do")
	public ModelAndView search(String word, String command) throws Exception{
		List<MyProduct> list = null;
		String viewName = "";
		
		if(command.equals("findByProductName")) {
			list = myProductService.findProductByName(word);
			viewName = "find_result";
		}else if (command.equals("findByProductMaker")) {
			list = myProductService.findProductByMaker(word);
			viewName = "find_result";
		}
		
		return new ModelAndView(viewName,"list", list);

		}
		
	}

