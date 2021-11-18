package spring.service.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import spring.service.domain.User;

public class UserTestApp01 {
	public static void main(String[] args) {
		/*
		 * BeanFactory는 객체를 getBean() 하는 순간에 생성함...
		 * 클라이언트가 서비스를 요청할 때, 그때 bean을 급하게 생성하고 요청을 처리하는 것과 동일한 결과 
		 * "Lazy Loading"
		 * 밑에꺼랑 비교해서 살펴보자!!! 호출되는 순서!!!
		 * 이 부분에서 BeanFactory와 ApplicationContext에 대해서 비교 설명하고 넘어가자
		 * (특히, PreLoading 하는게 왜 더 좋은지..was Servlet떄 우리는 이미 봤다. 서버 구동시 서블릿이 미리 로딩되어 있었다)
		 */
/*		BeanFactory factory = 
				new XmlBeanFactory(new FileSystemResource("./src/main/resources/config/userservice01.xml"));*/
		/*
		 * 메타데이타를 읽어올떄 미리 인스턴스 생성해서 읽어온다...
		 * 다시 말해서 PreLoading하는데..이게 더 나은 방식.(현업에서는 BeanFactory 안쓴다)
		 * Was 의 경우에서 처럼, 서버 구동할때 DD 파일 읽어서 한번에 서블릿을 다 미리 만들어 놓는다...그것과 같은 방식이다.
		 * 이처럼 ApplicationContext는 BeanFactory의 자식으로 더 나은 기능들이 있는데...하나씩 차차 보게될것이다.
		 * 특히나 파일 시스템이 아니라 바로 클래스 패스 잡혀진 곳으로 파일이 들어오기에 바로 소스 밑부터 찾으면 된다..자바의 기본 방식.
		 */
		ApplicationContext factory = new ClassPathXmlApplicationContext("/config/userservice01.xml");
		
		System.out.println("\n=============================================================================");
		User user01 = (User)factory.getBean("user01");
		System.out.println(user01);
		
		System.out.println("\n=============================================================================");
		User user02 = (User)factory.getBean("user02");
		System.out.println(user02);
		
		System.out.println("\n=============================================================================");
		User user03 = (User)factory.getBean("user03");
		System.out.println(user03);
		
		System.out.println("\n=============================================================================");
		User user04 = (User)factory.getBean("user04");
		System.out.println(user04);
		
		System.out.println("\n=============================================================================");
		User user05 = (User)factory.getBean("user05");
		System.out.println(user05);
	}
}
