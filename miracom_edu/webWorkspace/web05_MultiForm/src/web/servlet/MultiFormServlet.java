package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MultiFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MultiFormServlet() {
    	System.out.println("1. 서블릿 생성....MultiFormSevlet()호출...by container..");
    	
    }
    
    
    
    
    protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	System.out.println("2. 쓰레드 생성...service() --> doGet()/doPost().....by container..클라이언트 요청시");
    	
    	//실질적인 로직은 여기서 작성...get, post방식 요청이건 다 수행할 수 있다
    	// 한글처리....양방향 다 해줘야 한다....PrintWriter반환받기 전에 해야 한글처리 가능...
    	request.setCharacterEncoding("utf-8");
    	response.setContentType("text/html;charset=utf-8");
    	
    	PrintWriter out = response.getWriter();
    	
		String name = request.getParameter("name");
		String addr = request.getParameter("addr");
		
		out.println("<html><body><h3>");
		out.println("당신의 정보입니다....</h3><br>");
		out.println("<li> Name "+name+"<br>");
		out.println("<li> Address "+addr);
		out.println("</body></html>");
		
		out.close();
    	
	}


	// 클라이언트에서 get요청이 들어올때 이부분이 호출
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	// 클라이언트에서 post요청이 들어올때 이부분이 호출
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

}
