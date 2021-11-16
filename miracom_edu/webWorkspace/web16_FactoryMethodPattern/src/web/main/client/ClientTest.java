package web.main.client;

import java.util.Scanner;

import web.controller.Controller;
import web.controller.ControllerFactory;

public class ClientTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Command값을 입력하세요>>>");
		String command = sc.next();
		
		//1. 공장을 하나 받아온다.
		ControllerFactory factory = ControllerFactory.getInstance();
		
		//2. 공장에 주문서를 넣는다...주문서를 받은 공장에서 Controller를 생성...
		Controller controller = factory.createController(command);
		
		//3. 공장에서 생성한 Controller를 가져와서 Controller의 메소드를 호출...자식의 메소드가 결과적으로 실행
		controller.handle();
	}

}



















