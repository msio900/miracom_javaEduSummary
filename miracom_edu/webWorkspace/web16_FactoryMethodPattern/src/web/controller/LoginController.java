package web.controller;
/*
 * Component
 * ::
 * 인터페이스 기반의 재사용성 강한 자바 클래스
 * ::
 * CBD(Component based Development) 기반의 프로젝트
 */
//mvc pattern의 RegisterServlet --> front Controller pattern의 register() --> CBD기반
public class LoginController implements Controller {
	@Override
	public String handle() {
		/*
		 * 1. 폼값을 받아서...
		 * 2. vo새성
		 * 3. DAO 비지니스 로직 호출...인자값 VO 넣고
		 * 4. 리턴값 받아서...바인딩
		 * 5. 네비게이션
		 */
		System.out.println("LoginController...login logic...");
		return "login_result.jsp";
	}
}
