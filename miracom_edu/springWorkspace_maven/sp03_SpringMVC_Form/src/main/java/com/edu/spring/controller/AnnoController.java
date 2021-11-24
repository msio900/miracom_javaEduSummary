package com.edu.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
/*
 * Annotation을 사용하면은 인터페이스 상속받을 필요가 없다.
 * 오버라이딩 method가 없어진다.
 * 
 * anno.do라는 요청이 들어왔을때...어떤 메소드에서 요청을 작성해야하는지를 알수 없게 된다.
 * 메소드명은 사용자가 알아서 정하면 된다.
 */
import org.springframework.web.servlet.ModelAndView;
@Controller
public class AnnoController {//인터페이스 상속 받을 필요가 없다.
	
	//anno.do라는 요청이 들어오면...annoExecute()를 호출해서 실행시켜라...
	//@RequestMapping("anno.do")
	@RequestMapping(value = "anno.do", method = RequestMethod.GET)
	public ModelAndView annoExecute() {
		return new ModelAndView("WEB-INF/views/anno_result.jsp","message","Annotation Controller");
	}

}
