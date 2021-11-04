package jdbc.simple.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;

/*
 * JDBC 프로그램을 조금더 구조적으로 이해해보는 단계를 거치겠다.
 * Business Logic : 중요한 로직...DAO(Database Access Logic
 * method 단위 마다마다
 * 	1. Connection return DB Server연결
 *  2. 쿼리문 인자값으로 PreparedStatement 생성
 *  3. 바인딩
 *  4. 쿼리문 실행
 *  5. 자원 닫고
 *  이 부분이 1~5번 까지가 반복되어져서 작성된다.
 *  
 *  1~5번 중에서
 *  고정적인 부분 ----- 공통의 기능으로 뽑아놓고 재사용 O
 *  	vs
 *  가변적인 부분 ----- 공통의 기능으로 따로 작성 X
 *  
 */

public class SimpleCustomTest {
	// === method 단위 마다 반복되는 기능을 정의 ===
	public Connection getConnect() throws SQLException {
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
		System.out.println("DBServer Connect....");
		return conn;
	}
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close();
	}
	//Method Overloading :: 하는일은 큰 틀에서는 같지만 / 처리하는 데이타를 달리할때 사용하는 기법

	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException{
		if(rs != null) rs.close();
		closeAll(ps, conn);
	}
	
	//DML에 해당하는 기능들을 정의...
	SimpleCustomTest(){ 
		//
	}
	//DML에 해당하는 기능  - > VO
	//INSERT...
	public void addCustom(int num, String name, String addr) throws SQLException{
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			
			String query = "INSERT INTO custom (num, name, addr) VALUES(?,?,?)";
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, num);
			ps.setString(2, name);
			ps.setString(3, addr);
			
			ps.executeUpdate();
			System.out.println(name+"님, 회원 가입 되셨습니다...^^");
		}finally {
			closeAll(ps, conn);
		}		
	}//addCustom
	
	//DELETE
	public void removeCustom(int num) throws SQLException{
		//이 부분은 반드시 스스로 힘으로 완벽하게 작성 addCustom()참조
		/*
		 * 선언
		 * try/catch
		 * throws
		 * DB 연결
		 * 
		 */
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
			System.out.println("DBServer Connect...");
			
			String query = "DELETE FROM custom WHERE num=?";
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, num);
			
			ps.executeUpdate();
			System.out.println(num+"번호의 회원님이 탈퇴하셨습니다. ");
		}finally {
			ps.close();
			conn.close();
		}//removeCustom
	}
	//UPDATE
	public void	update(int num, String name, String addr) throws SQLException{
		Connection conn = null;
		PreparedStatement ps= null;
		try {
			conn = getConnect();
			
			String query = "UPDATE custom SET name=?, addr=? WHERE num=?";
			ps = conn.prepareStatement(query);
			ps.setString(1, name);
			ps.setString(2, addr);
			ps.setInt(3, num);
			
			ps.executeUpdate();
			System.out.println(name+"님의 정보가 수정되었습니다.");
			
		}finally {
			closeAll(ps, conn);
		}
		
		
	}
	//SELECTALL...SELECT...executeQuery() ResultSet
	public void printAllCustom() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs =null;
		try {
			conn = getConnect();
			
			String query ="SELECT * FROM custom";
			ps = conn.prepareStatement(query);
			
			rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("num")+" "
						  +rs.getString("name")+" "
						  +rs.getString("addr"));
			}
		} finally {
			closeAll(rs, ps, conn);
		}
	}
	
	public static void main(String[] args) throws Exception {
		SimpleCustomTest service = new SimpleCustomTest();
		// 이부분은 나중에 클라이언트의 화면 부분이 될 것 이다.
		//service.addCustom(333, "John", "Beadon");
		
		//service.removeCustom(444);
		service.update(444, "Tom", "Brandon");

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
