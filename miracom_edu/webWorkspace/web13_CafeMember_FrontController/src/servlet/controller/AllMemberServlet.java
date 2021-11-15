package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;


@WebServlet("/AllMember")
public class AllMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로직은 여기다 작성...
		/*
		 * 직접 주석부터 달고...
		 * 아래에 로직을 작성합니다.
		 * 1. DAO 리턴받아서 비즈니스 로직 호출
		 * 2. 결과값 리턴 받은
		 * 3. 바인딩
		 * 4. 네비게이션
		 */
		MemberDAOImpl dao = MemberDAOImpl.getInstance();
		try {
			ArrayList<MemberVO>list = dao.showAllMember();
			request.setAttribute("list", list);
			request.getRequestDispatcher("allView.jsp").forward(request,response);
		} catch (SQLException e) {

		}
		
	}
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
		
	}

}
