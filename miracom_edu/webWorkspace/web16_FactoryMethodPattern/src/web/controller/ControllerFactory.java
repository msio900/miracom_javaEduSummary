package web.controller;
/*
 * Controller를 생성하는 Factory...일종의 공장..
 * ControllerFactory에서는 몇개의 Controller를 생성할 수 있을까요?...원하는 만큼..10개의 Controller를 생성
 * 10개의 Controller를 생성하기 위해서는 몇개의 공장이 필요한가요?
 * 
 * 단, 한개의 Factory만 필요...=== 싱글톤 패턴 ===
 */
public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {
		System.out.println("Only One Factory Creating...");
	}
	public static ControllerFactory getInstance() {
		return factory;
	}
	// AddController, UpdateController, DeleteController, LoginController를 생성..
	// 이때 클라이언트에서 요청하는 값에 따라서 Controller객체를 생성...
	public Controller createController(String command) {//부모타입으로 자식 객체 생성...
		Controller controller = null;
		if(command.equals("INSERT")){
			controller = new AddController();
			System.out.println("AddController Creating...OK...");
		}else if(command.equals("DELETE")){
			controller = new DeleteController();
			System.out.println("DeleteController Creating...OK...");
		}else if(command.equals("LOGIN")){
			controller = new LoginController();
			System.out.println("LoginController Creating...OK...");
		}else if(command.equals("UPDATE")){
			controller = new UpdateController();
			System.out.println("UpdateController Creating...OK...");
		}
		return controller;
	}
		
	}
	
