package web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("service call...");
		
		//Ŭ���̾�Ʈ�� �������� ����ϱ� ���� ��ü�� ����
		PrintWriter out=response.getWriter();
		out.println("<html><body><h2>");
		out.println("hello Myservlet...");
		out.println("</h2></body></html>");
		
		out.close();
	}
}
