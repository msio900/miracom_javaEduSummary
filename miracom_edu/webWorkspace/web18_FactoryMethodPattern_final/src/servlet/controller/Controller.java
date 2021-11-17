package servlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 기능의 template...
public interface Controller {
	//결과페이지 이름...path
	ModelAndView requestHandle(HttpServletRequest request, HttpServletResponse response);
}
