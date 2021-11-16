package servlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 기능의 template...
public interface Controller {
	String requestHandle(HttpServletRequest request, HttpServletResponse response);
}
