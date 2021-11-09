package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//Annotation... 어노테이션 한 줄을 xml 여러 줄로 바꿀 수 있어야 한다. 이게 xml에서 어떤 의미인지 알아야 돼~~
/*
  <servlet>
    <servlet-name>MyServlet2</servlet-name>
    <servlet-class>web.servlet.MyServlet2</servlet-class>
  </servlet>
  <servlet-mapping>
    <servlet-name>MyServlet2</servlet-name>
    <url-pattern>/MS2</url-pattern>
  </servlet-mapping>
  
  -- 이 8 줄이 밑에 한 줄의 어노테이션을 의미하고 있다.
*/
//http://서버 주소(ip):포트/프로젝트명/매핑주소
//http://127.0.0.1:7777/web02/MS2   --> 통합 개발 툴의 파워풀한 서비스야!! 즉 어노테이션의 편리함을 느낄 수 있지?
@WebServlet("/MS2") public class MyServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service2 call...");
		
		//클라이언트의 브라우저로 출력하기 위한 객체를 리턴
		PrintWriter out=response.getWriter();
		out.println("<html><body bgcolor=yellow><h2>");
		out.println("hello Myservlet2...");
		out.println("</h2></body></html>");
		
		out.close();
	}

}
