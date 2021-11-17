package servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="*.do", loadOnStartup=1)
public class FrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;
    
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doProcess(request, response);
   }
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doProcess(request, response);
   }
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String requestURI =  request.getRequestURI(); //web18_FactoryMethodPattern/find.do
      System.out.println("RequestURI :: " +requestURI);
      String contextPath = request.getContextPath();
      System.out.println("contextPath :: " +contextPath); 
      
      
	  String command = requestURI.substring(contextPath.length()+1); // find.do
	  System.out.println("command :: " +command); 
	  
	  
      ControllerFactory factory = ControllerFactory.getInstance();
      Controller controller = factory.createController(command);
      
      ModelAndView mv = controller.requestHandle(request, response);
      String path = mv.getPath();
      if(mv!=null) { 	  
		if(mv.isRedirect()) response.sendRedirect(path);
		else request.getRequestDispatcher(path).forward(request, response);
      }
   }
   
}