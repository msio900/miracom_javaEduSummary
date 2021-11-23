package com.edu.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/*
 * Presentation Layer의 Component
 * 이후 Annotation 기법에서는 @Controller라고 마킹되어 질 것이다.
 * 일단 xml --> @Controller
 */
public class IndexController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * DAO의 method를 호출...
		 */
		ModelAndView mv = new ModelAndView();
		mv.setViewName("result"); //결과 페이지의 이름(결과 페이지 저장 위치와 확장자는 생략)
		mv.addObject("message","Hello SpringMVC~~!!");
		return mv;
	}

}
