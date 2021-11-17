package servlet.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servlet.model.MemberDAOImpl;
import servlet.model.MemberVO;

//component...Based...
public class FindController implements Controller{

	@Override
	public ModelAndView requestHandle(HttpServletRequest request, HttpServletResponse response) {
		 String id = request.getParameter("id"); // 폼 값 받기
	     String path = "index.jsp";
	      try {
	         MemberVO vo = MemberDAOImpl.getInstance().findByIdMember(id); // 비지니스 로직 호출
	         if(vo!=null) { //id에 해당하는 회원이 존재한다면...
	            request.setAttribute("vo", vo);
	            path = "result_view.jsp";
	         }
	      }catch (Exception e) {
	         
	      }
	      
	      return new ModelAndView(path); //result_view.jsp / forward방식으로 페이지 이동

	}

}
