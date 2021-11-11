package servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;


@WebServlet("/RMS")
public class RegisterMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 주석부터 달아주세요...
		 * 주석에 해당하는 로직을 작성하세요.
		 * 해당 서블릿의 결과페이지는 어떻게 되어야 할까요?
		 * 
		 * 1. 폼값 받는다.
		 * 2. VO객체 생성
		 * 3. dao 비지니스 로직 호출
		 * 4. 네비게이션...
		 */
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		
		try {
			MemberDAOImpl.getInstance().registerMember(vo);
			//바인딩할 필요가 없는 경우...대부분 redirect페이지 연결인 경우가 많다.
			response.sendRedirect("AllMember");
		} catch (Exception e) {

		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
