package servlet.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/front.do")
public class FrontController extends HttpServlet {
   private static final long serialVersionUID = 1L;
    
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doProcess(request, response);
   }
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doProcess(request, response);
   }
   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String command = request.getParameter("command");
      ControllerFactory factory = ControllerFactory.getInstance();
      Controller controller = factory.createController(command);
      
      String path = controller.requestHandle(request, response);
      
      request.getRequestDispatcher(path).forward(request, response);
      
   }
   
}