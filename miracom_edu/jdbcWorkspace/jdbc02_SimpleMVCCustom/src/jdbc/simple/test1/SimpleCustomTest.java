package jdbc.simple.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import config.ServerInfo;

/*
 * JDBC 프로그램을 조금더 구조적으로 이해해보는 단계를 거치겠다.
 */

public class SimpleCustomTest {
	//DML에 해당하는 기능들을 정의...
	SimpleCustomTest(){ 
		//
	}
	//INSERT...
	public void addCustom(int num, String name, String addr) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
			System.out.println("DBServer Connect...");
			
			String query = "INSERT INTO custom (num, name, addr) VALUES(?,?,?)";
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, num);
			ps.setString(2, name);
			ps.setString(3, addr);
			
			ps.executeUpdate();
			System.out.println(name+"님, 회원 가입 되셨습니다...^^");
		}finally {
			ps.close();
			conn.close();
		}		
	}//addCustom
	
	//DELETE
	public void removeCustom(int num) {
		
	}
	//UPDATE
	public void	update(int num, String name, String addr) {
		
	}
	//SELECTALL
	public void printAllCustom() {
		
	}
	
	public static void main(String[] args) {
		SimpleCustomTest test = new SimpleCustomTest();

	}//
	//static initialization ...main 보다 먼저 실행된다....
	static {
		try {
			Class.forName(ServerInfo.DRIVER_NAME);
			System.out.println("Driver Loading Success...");
		}catch(ClassNotFoundException e) {
			System.out.println("Driver Loading Fail...");
		}
	}
}
