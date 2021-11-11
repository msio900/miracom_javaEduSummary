package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Redirect2")
public class RedirectServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String choose = request.getParameter("choose");
	if(choose == null) {
		//error page...redirect
		response.sendRedirect("./error/error.html"); //정적인 문서 html파일
	}else{ //이때 서버상의 결과 페이지로 바로 이동...
		request.getRequestDispatcher("redirect2.jsp").forward(request, response);
	}
	
	}


}
