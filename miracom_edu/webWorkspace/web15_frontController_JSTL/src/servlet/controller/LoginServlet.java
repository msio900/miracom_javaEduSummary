package servlet.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	/*
	 * 1. 폼값 받는다.
	 * 2. DAO 리턴 받고
	 * 3. 메소드 호출...이때 폼으로부터 받은 인자값 넣는다.
	 * 4. VO객체 리턴
	 * 5. 바인딩
	 * 6. 네비게이션
	 */
    String id  = request.getParameter("id");
    String password  = request.getParameter("password");
    String path = "login.html";
    try {
		MemberVO rvo =  MemberDAOImpl.getInstance().login(id, password);
		//로그인, 정보수정하기 로직은 무조건 정보를 Session Attribute에 바인딩한다.
		//Session은 생성하는 것이 아니라...클라이언트가 요청시에 서버에서 자동적으로 만들어진다.
		HttpSession session = request.getSession();//이렇게 세션을 받아온다.
		if(rvo != null) { //id, password에 해당하는 vo가 있다면
			session.setAttribute("vo", rvo);
			System.out.println("JSESSIONID"+session.getId());
			path = "login_result.jsp";
		}
	} catch (Exception e) {
		
	}
    request.getRequestDispatcher(path).forward(request, response);
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}


}
