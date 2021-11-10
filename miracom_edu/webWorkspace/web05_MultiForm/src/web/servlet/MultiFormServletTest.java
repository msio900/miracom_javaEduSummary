package web.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MultiFormServletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//여기다 로직을 작성...
    	/*
    	 * 1. 한글처리...양방향
    	 * 2. PrintWriter 객체 리턴받는다.
    	 * 3. 폼에 입력된 모든 값들을 받아온다...이때 checkbox에 입력된 값은...getParameterValues()사용!!!
    	 * 4. client가 전달한 모든 값들을 다시 브라우저로 출력
    	 * 5. PrinterWriter를 닫아주는 것으로 close()
    	 */
		
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request,response);
	}
}

