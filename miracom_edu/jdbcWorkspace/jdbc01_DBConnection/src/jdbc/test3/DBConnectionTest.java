package jdbc.test3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.ServerInfo;

/*
 * Step 2. 에서의 문제점
 * 서버관련 정보를 상수로 지정해서
 * 코드에 직접 입력되는 것은 막았지만...
 * Program과 Server 정보가 분리되어 있지만 않다. 
 * 
 * Program과 상수정보를 분리해보자.
 * 상수 정보를 어디에 저장해서 분리할까?
 * 
 */
public class DBConnectionTest {
	// 상수를 지정...URL, USER, PASS 상수를 지정하는 문자는 반드시 대문자여야함.
	// --> Interface로 이동
	
	DBConnectionTest() throws ClassNotFoundException, SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		PreparedStatement ps1 = null;
		ResultSet rs = null;
			
		try {
		Class.forName(ServerInfo.DRIVER_NAME); //FQCN
		System.out.println("1. Driver Loading....");
		
		conn=DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);		
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
		String query1 = "DELETE FROM custom WHERE num=?";
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
