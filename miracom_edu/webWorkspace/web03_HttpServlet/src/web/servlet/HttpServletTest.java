package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HttpServletTest
 */
//annotation... was이 이걸보고 xml로 변경 HttpServletTest(클라이언트 요청) -- 서버 내부에 HttpServletTest 인스턴스-- web.servlet.HttpServletTest
@WebServlet("/HttpServletTest")
public class HttpServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	//서블릿 객체가 생성될 때 호출... 언제? ..누가? --was가 알아서 생성
    public HttpServletTest() {
           System.out.println("HttpServletTest Servlet Creating...");
    }

	
    //언제? --클라이언트가 요청을 하면 호출  누가--was가 알아서 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//클라이언트의 요청을 처리하는 코드를 작성
				//클라이언트의 요청을 처리할려면..요청정보(request),처리된 결과(response)를 전달..
				
				
				//브라우저로 받은 id를 출력
				PrintWriter out=response.getWriter();
				System.out.println("service()....call...");
				
				//request...id값
				//폼값 받아서..처리한다.
				String id=request.getParameter("userId");
				
				
				out.println("<html><body><h2>");
				out.println("User ID :: "+ id);
				out.println("</h2></body></html>");
	}
}

