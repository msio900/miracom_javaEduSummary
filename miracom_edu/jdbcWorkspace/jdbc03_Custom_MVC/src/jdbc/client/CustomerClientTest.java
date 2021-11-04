package jdbc.client;

import config.ServerInfo;
import jdbc.dao.CustomerDAOImpl;
import jdbc.vo.Customer;

public class CustomerClientTest {
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading Success...");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Fail...");
		}
	}
	public static void main(String[] args) throws Exception {
		//싱글통으로 하나 만들어 놓은 객체를 받아서 사용
		CustomerDAOImpl dao =  CustomerDAOImpl.getInstance();
		dao.registerCustomer(new Customer(444, "아이유", "방배동"));

	}

}
