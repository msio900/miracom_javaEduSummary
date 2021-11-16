package servlet.controller;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;

public class ControllerFactory {
	private static ControllerFactory factory = new ControllerFactory();
	private ControllerFactory() {}
	public static ControllerFactory getInstance() {
		return factory;
	}
	
	//command 값에 따라서 Component를 생성하는 기능...
	public Controller createController(String command) {
		Controller controller  =null;
		
		if(command.equals("find")) {
			controller = new FindController();
		}else if (command.equals("register")) {
			controller = new RegisterController();
			
		}
		return controller;

	}
}
