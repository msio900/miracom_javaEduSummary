package com.edu.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class MainController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result");//결과페이지의 이름
		mv.addObject("info","MainController...execute~~!!");
		
		// 자동적으로 forward방식으로 이동, ServletRequest에 바인딩이 이뤄진다.
		return mv;
	}

}
