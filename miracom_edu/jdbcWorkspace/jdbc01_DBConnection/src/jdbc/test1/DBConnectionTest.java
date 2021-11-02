package jdbc.test1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * JDBC 4단계 작업
 * 1. 드라이버 로딩
 * 2. DB서버 연결
 * 3. PreparedStatement 생성
 * 4. 쿼리문 실행
 */
public class DBConnectionTest {
	DBConnectionTest(){
		//1. 드라이버 로딩...Fully Qualified Class Name
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("1. 드라이버 로딩 성공...");
			
			//2. DB 서버와 연결 시작
			String url = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUnicode=yes&characterEncoding=UTF-8";
			Connection conn = DriverManager.getConnection(url, "root", "1234");
			System.out.println("2. 서버 연결 성공");
			
			//3. PreparedStatement 객체 생성
			//INSERT
			/*String query = "INSERT INTO custom (num, name, addr) VALUES(?,?,?)";
			PreparedStatement ps = conn.prepareStatement(query);
			System.out.println("3. preparedStatement 객체 생성...");
			
			//4. ?값에 대한 바인딩, --> 쿼리문 실행 --> 1? , 2? , 3?
			ps.setInt(1, 333);
			ps.setString(2, "Tom");
			ps.setString(3, "NY");
			
			ps.executeUpdate();
			System.out.println("4. 쿼리문이 실행되었습니다.");*/
			//UPDATE
			//기본키는 절대로 수정의 대상이 될수 없다.
			/*String query = "UPDATE custom SET name=?, addr=? WHERE num=?";
			PreparedStatement ps = conn.prepareStatement(query);
			System.out.println("3. PreparedStatement 객체 생성....");
			
			ps.setString(1, "김주희");
			ps.setString(2, "행당동");
			ps.setInt(3, 222);
			
			int row = ps.executeUpdate();
			System.out.println(row+" row Update OK....");*/
			//DELETE
			/*String query = "DELETE FROM custom WHERE num=?";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ps.setInt(1, 222);
			int row = ps.executeUpdate();
			System.out.println(row+" row DELETE ok!!...");*/
			
			//SELECT
			String query = "SELECT * FROM custom";
			PreparedStatement ps = conn.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int num = rs.getInt("num");//컬럼명 혹은 1
				String name = rs.getString("name");
				String addr = rs.getString("addr");
				System.out.println(num+"\t|"+name+"\t|"+addr);
			}

			
					
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패...");
			e.printStackTrace();
		} catch(SQLException e) {
			System.out.println("서버 연결 실패...");
		}
		
		
	}
	public static void main(String[] args) {
		new DBConnectionTest();
	}

}
