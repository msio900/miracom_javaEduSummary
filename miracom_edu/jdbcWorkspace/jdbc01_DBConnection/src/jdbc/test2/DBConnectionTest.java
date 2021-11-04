package jdbc.test2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * JDBC 5단계
 * :
 * 1. 드라이버 로딩
 * 2. DB서버와 연결
 * 3. PreparedStatement 객체 생성 -- 이때, 쿼리문 인자값으로 들어간다.
 * 		값 바인딩
 * 4. 쿼리문...
 * 		int executeUpdate("") -- INSERT, DELETE, UPDATE  -- 0 / 1
 * 		ResultSet executeQuery("") -- SELECT 
 * 			BOE
 * 			ResultSet
 * 			EOE
 * 
 * 5. 자원을 닫아준다.
 * 		close...열은 순서 반대로 닫아준다.
 * 		Connection --> PreparedStatement --> ResultSet
 * 		
 * 		ResultSet 닫고 --> PreparedStatement닫고 --> Connection닫고
 * 
 * Step 2.
 * DB서버에 관련된 정보들...
 * 드라이브, 서버 주소, username, password...
 * 이런 정보들을 공유하는 정보로 상수로 지정했다.
 * -->
 * 프로그램상에서 서버 정보들이 하드코딩 되어지지 않게 했다. 
 */
public class DBConnectionTest {
	// 상수를 지정...URL, USER, PASS 상수를 지정하는 문자는 반드시 대문자여야함.
	public static final String DRIVER_NAME = "com.mysql.cj.jdbc.Driver";
	public static final String URL = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
	public static final String USER = "root";
	public static final String PASS = "1234";
	
	DBConnectionTest() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		ResultSet rs = null;
			
		try {
		Class.forName(DRIVER_NAME); //FQCN
		System.out.println("1. Driver Loading....");
		
		conn=DriverManager.getConnection(URL, USER, PASS);		
		System.out.println("2. DB Server Connect ....");
		
		/*String query = "INSERT INTO custom (num, name, addr) VALUES(?,?,?)";
		ps = conn.prepareStatement(query);
		System.out.println("3. PreparedStatement Creating....");
		
		//?에 값을 바인딩
		ps.setInt(1, 444);
		ps.setString(2, "Juliet");
		ps.setString(3, "LA");
		
		System.out.println(ps.executeUpdate()+" row INSERT OK...!");
		*/
		
		//delete문을 작성...
		String query1 = "DELETE FROM custom WHERE num-?";
		ps1 = conn.prepareStatement(query1);
		ps1.setInt(1, 444);
		System.out.println(ps1.executeUpdate()+" row DELETE OK!!");
		
		// 현재 DB테이블에 있는 데이터를 다 가져와서 출력...SELECT
		String query = "SELECT * FROM custom WHERE num=?";
		ps = conn.prepareStatement(query);
		
		ps.setInt(1, 444);
		
		rs = ps.executeQuery();
		if(rs.next()) {
			int num = rs.getInt("num");//컬럼명 혹은 1
			System.out.println(rs.getInt("num")+", "+rs.getString("name")+", "+rs.getString("addr"));
			}
		}finally {
			rs.close();
			ps.close();
			ps1.close();
			conn.close();
		}
	}
	public static void main(String[] args) throws ClassNotFoundException,SQLException{
		new DBConnectionTest();

	}

}
