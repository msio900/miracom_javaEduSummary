package ibatis.services.user.test;

import ibatis.services.domain.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * FileName : JDBCTestApp.java
 *   ㅇ JDBC 철차에 따라 DBMS users table 의 정보 SELECT  :: 기존방식 
 */
public class JDBCTestApp {
	///Main method
	public static void main(String[] args) {
		//DBMS 접근정보
		String dburl = "jdbc:mysql://127.0.0.1:3306/scott?serverTimezone=UTC&useUniCode=yes&characterEncoding=UTF-8";
		String dbuser ="root";
		String dbpwd = "1234";

		//JDBC을 이용하기 위한 객체 생성
		Connection con = null;
		PreparedStatement pStmt = null;
		ResultSet selectResult = null;
		
		//==> DB 에 저장된 모든 회원정보를 ArrayList에 저장하기 위한....  
		List<User> list = null; 

		try{		
			//1단계 connection
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(dburl,dbuser,dbpwd);
			
			//2단계 SELECT 문 생성 및 전송 
			StringBuffer  userSelectAll = new StringBuffer();
			userSelectAll.append("SELECT ");
			userSelectAll.append("user_id, user_name, password, age, grade, reg_date ");
			userSelectAll.append("FROM USERS ");
			pStmt = con.prepareStatement( userSelectAll.toString() );

			//3단계 SELECT 실행
			selectResult = pStmt.executeQuery();
			//==> 실행시킨 SQL 확인
			System.out.println( "[userSelectAll SQL] :: "+ userSelectAll.toString() );
			
			//==> DB 에 저장된 모든 회원정보를 ArrayList에 저장하기 위한....  
			list = new ArrayList<User>();
			
			 while( selectResult.next() ){
				 //==> 1EA의 User 객체가 1EA의 user 정보를 갖는다 
				User user = new User();
				System.out.println("::"+selectResult.getString("user_id")+"정보 ArrayList 저장..");
				 user.setUserId( selectResult.getString("user_id") );
				 user.setUserName( selectResult.getString("user_name") );
				 user.setPassword( selectResult.getString("password") );
				 user.setAge( selectResult.getInt("age") );
				 user.setGrade( selectResult.getInt("grade") );
				 user.setRegDate( selectResult.getTimestamp("reg_date"));
				 list.add( user );
			 }
			
		}catch(ClassNotFoundException e){		
			throw new RuntimeException(e.getMessage(), e);
		}catch(SQLException e){		
			throw new RuntimeException(e.getMessage(), e);
		}finally{
			//각각의 DB와 관련된 객체 close
			if(selectResult != null){
				try{	
					selectResult.close();		
				}catch(Exception e1){  }
			}
			if(pStmt != null){
				try{	
					pStmt.close();	
				}catch(Exception e2){  }
			}
			if(con != null){
				try{	
					con.close();		
				}catch(Exception e3){  }
			}
		}//end of finally
		
		System.out.println("\n#####################################");
		System.out.println(":: 회원정보 출력");
		
		for (User user : list) {
			System.out.println( user.toString() ) ;
		}
		//==>위와 동일
		//for (int i =0 ; i < list.size() ; i++){ 
		//	System.out.println(   list.get( i ).toString() ) ;
		//}
		System.out.println("#####################################\n");
	}//end of main
}//end of class