package ibatis.services.user.test;

import ibatis.services.domain.User;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


/**
 * FileName : MyBATISTestApp.java
  * ㅇ JBDCTestApp.java 와 비교 이해.
  * ㅇ mybatis Framework 에서 제공하는 API을 사용 users table 의 정보 SELECT   
 */
public class MyBatisTestApp {
	///Main method
	public static void main(String[] args) throws Exception{
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");		
		
		//==> 2. Reader 객체를 이용 xml metadata 에 설정된 각정 정보를 접근, 사용가능한 
		//==>    읽어들인 reader를 바탕으로 SqlSessionFactory를 리턴받는다.
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		//==> 3.factory의 openSession()을 통해서 SqlSession을 리턴 받는다.
		SqlSession session=factory.openSession();
		///////////////////////////////////////////////////////////////////////		
		List<User> list=session.selectList("UserMapper.getUserList");
		System.out.println("#####################################");
		System.out.println(":: 회원정보 출력");
		
		for (User user : list) {
			System.out.println(user) ;
		}
		System.out.println("#####################################");
	}// end of main
}//end of class

/*
 * ■ MyBATISTestApp / JDBCTestApp 를 통한 MyBATIS Framework 의 이해
 * ㅇ SQL,커넥션,트랜잭선 를 메타데이타 캡술화였으며, 
 *     :: 참조 => SqlMapConfig.xml / mybatis-userservice-mapping.xml
 * ㅇ JDBC철차 :  Connection => Statement => ResultSet
 *      resource 관리 : close
 *      query 수행 결과 비지니스객체(VO) 바인딩 JDBC API 를 사용하여 수행시 반복적으로 반드시
 *      수행하는 일련의 과정을 수행함.
 *      :: 참조 =>List<User> list = session.selectList("User.getUserList");
 *  
 *  ■ MyBATIS Framework 의 장점
 *  ㅇ 작고 간단하다 ( mybatis-3.2.8.jar / 약 400kb / 다른 라이브러리와 의존관계 없다. )
 *  ㅇ 기존 애플리케이션/테이터베이스 변경 불필요 
 *      (SQL Mapper(Data Mapper) =>SQL 과 비지니스 객체와의 바인딩)
 *  ㅇ 생산성 / 성능 / 작업의 분배 (소스코드와 SQL 의 분리)
 *  ㅇ 관심사의 분리 
 *       ( DBMS 에 독립적인 API제공 및 JDBC API가 아닌 비지니스 객체만 가지고 작업가능)
 *        
  *  ■ MyBATIS Framework 은 JDBC 절차를 간결화한 lib 이다
  *     ( JDBC를 절차 은익한 lib)        
*/
