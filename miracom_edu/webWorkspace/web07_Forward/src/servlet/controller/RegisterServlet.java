package servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.Member;


@WebServlet("/Register")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegisterServlet() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * 1. 폼 값 받아서
		 * 2. (받은 값으로 VO 생성)
		 * 3. DAO 리턴받아서
		 * 4. 결과값 바인딩
		 * 5. 네비게이션
		 * 
		 */
		
		String name = request.getParameter("name");
		int age = Integer.parseInt(request.getParameter("age"));
		String address = request.getParameter("address");
		
		Member vo = new Member(name, age, address);
		
		//dao는 여기서 생략...바로 바인딩
		request.setAttribute("vo", vo);
		
		//네비게이션 : 서버상에서 바로 jsp페이지로 이동
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}

}
