package servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

@WebServlet("/SMS")
public class SearchMemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 로직은 여기에 작성...
		/*
		 * 1. 폼값 받아서
		 * 2. (vo 생성....)
		 * 3. DAO 리턴받아서...Business Logic 호출...
		 * 4. 반환값 바인딩
		 * 5. 네비게이션...result_view.jsp
		 */
		
		String path = "index.html";
		String id = request.getParameter("id");
		MemberDAOImpl dao = MemberDAOImpl.getInstance();
		try {
		MemberVO vo = dao.findByIdMember(id);
		if(vo != null) { //id에 해당하는 Member가 있다면
			request.setAttribute("vo", vo);
			path = "result_view.jsp";
		}
		
		}catch(Exception e) {

		}
		request.getRequestDispatcher(path).forward(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
