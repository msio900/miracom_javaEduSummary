package com.edu.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class FormController implements Controller {

	@Override
	public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		/*
		 * 폼값 받아서
		 * vo 생성
		 * DAO 리턴받아서
		 * Biz로직 메소드 호출
		 * 리턴되는 값 바인딩
		 * 네비게이션
		 */
		String name  = request.getParameter("name");
		String addr = request.getParameter("addr");
		//InternalResuouceViewResolver
		/*
		 * 1. 
		 * info라는 이름으로
		 * ServletRequest Attribute에 이름과 주소를 바인딩함.
		 * 
		 * 2.
		 * /WEB_INF/views폴더 아래에
		 * form_result.jsp 결과 페이지로
		 * 기본 이동(forward)한다.
		 */
		return new ModelAndView("/WEB-INF/views/form_result.jsp", "info", name+"님의 주소는"+addr);
	}

}
