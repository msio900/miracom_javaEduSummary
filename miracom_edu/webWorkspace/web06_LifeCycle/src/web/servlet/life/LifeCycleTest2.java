package web.servlet.life;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * LIFE1의 문제점
 * 1. READY ON 상태 부분이 요청할때 함께 진행되었다...
 * --> load on startup 옵션을 지정해야한다.
 * --> xml, annotation 기반..
 * 
 * 2. 서블릿이 처리한 결과를 직접 클라이언트에게 출력하고 있다.
 * 직접 출력하기 때문에 PrintWriter 객체를 반환받았고
 * println()메소드 안에서 html태그까지 사용하는 무리수를 두고 있다.
 * --> 결과 페이지의 역할은 jsp파일에게 넘긴다.
 * --> 아직 네비게이션(페이지 이동방법)에 대해서는 배우지 않았기 때문에 우리가 알고 있는 a태그를 이용하자.
 */
@WebServlet(urlPatterns= {"/LIFE2"}, loadOnStartup=1)
public class LifeCycleTest2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private int count=0;

    public LifeCycleTest2() {
        System.out.println("1. Servlet생성됨...");
    }


	public void init(ServletConfig config) throws ServletException {
		System.out.println("2. init() call ...by container");
	}


	public void destroy() {
		System.out.println("4. destroy() call ...by container");
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("3. service() doGet() call ...by container");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();

		count++;//카운터 증가
		out.println("<a href=life2.jsp?cnt="+count+">jsp 결과 페이지로 이동</a>");
		
		
		
	}

}
