package servlet.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;


@WebServlet("/front.do")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	/*
	 * 1.폼값 받아서
	 * 2. VO생성
	 * 3. DAO리턴받아서 ...비지니스 로직 호출
	 * 4. 결과값 반환...
	 * 5. 바인딩
	 * 6. 네비게이션..
	 */
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get, post건 모두 여기서 로직을 처리...
		//1. 가장 먼저 해야하는 일이 어떤 요청이 들어왔는지를 알아야 한다...hidden 넘어온 값을 받는다.
		String command = request.getParameter("command"); //register, find, login...
		String path ="index.html";
		
		if(command.equals("register")) { //회원가입 요청..결과 페이지 연결
			//
			path=register(request,response);		
			
		}else if(command.equals("find")) { //회원검색 요청..결과 페이지 연결
			//			
			path=find(request,response);
		}else if(command.equals("login")) { //로그인 요청..결과 페이지 연결
			//
			path=login(request,response);
			
		}else if(command.equals("showAll")) { //전체회원 보기 요청..결과 페이지 연결
			path=showAll(request,response);
		}
		
		request.getRequestDispatcher(path).forward(request, response);
		//? 
	}//doProcess
	protected String showAll(HttpServletRequest request, HttpServletResponse response) {
		MemberDAOImpl dao = MemberDAOImpl.getInstance();
		String path = "index.html";
		try {
			ArrayList<MemberVO>list = dao.showAllMember();
			request.setAttribute("list", list);
			path = "allView.jsp";
		} catch (SQLException e) {

		}
		return path;
	}
	protected String login(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String path = "index.html";
		//pvo
		try {
			MemberVO rvo=MemberDAOImpl.getInstance().login(id, password);
			//로그인, 회원정보수정하기 로직은 무조건 정보를 Session Attrubute에 바인딩한다.
			//Session은 생성하는 것이 아니라...클라이언트가 요청시에 서버에서 자동적으로 만들어진다.
			HttpSession session=request.getSession(); //이렇게 세션을 받아온다.
			if(rvo!=null) { //id, password에 해당하는 vo가 있다면
				session.setAttribute("vo", rvo);
				System.out.println("JSESSIONID: "+session.getId());	
				path = "login_result.jsp";
			}
		}catch(Exception e) {
			
		}
		return path;
	}
	protected String find(HttpServletRequest request, HttpServletResponse response) {
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
		return path;
	}
	protected String register(HttpServletRequest request, HttpServletResponse response) {
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		
		MemberVO vo = new MemberVO(id, password, name, address);
		String path = "index.html";
		try {
			MemberDAOImpl.getInstance().registerMember(vo);
			request.setAttribute("vo", vo);
			path = "result_view.jsp";
			//바인딩할 필요가 없는 경우...대부분 redirect페이지 연결인 경우가 많다.
			path = "result_view.jsp";
		} catch (Exception e) {

		}
		return path;
	}
	
	

}












