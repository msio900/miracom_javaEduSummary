package ibatis.services.user.test;

import ibatis.services.domain.User;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * FileName : MyBatisTestApp02.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping02.xml
  * ㅇ My Framework 이용 QUERY ( SELECT ) TEST 
  */
public class 	MyBatisTestApp02 {
	///Main method
	public static void main(String[] args) throws Exception{
		
		///==> SqlMapConfig01.xml : MyBATIS Framework 의 핵심 환경설정화일 (MetaData)
		//==> mybatis-userservice-mapping02.xml : SQL 를 갖는 설정화일 (MetaData) 
				
		
		//==> 1. xml metadata 읽는 Stream 생성
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		//==> 2. Reader 객체를 이용 xml metadata 에 설정된 각정 정보를 접근, 사용가능한 
		//==>     SqlMapClient  객체 생성
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=factory.openSession();
		
		//0. getUser :: # 대입자를 이용한 like 연산자 검색 ==> 검색결과 없는것 확인
		System.out.println(":: 0. user로시작하는 userId User(SELECT)  ? ");
		List<User> list = session.selectList("UserMapper02.getUser01","user");
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");
		
		//1. getUser :: # 대입자를 이용한 like 연산자 검색 
		// ==> 검색결과 존재 확인 :: %와일드카드 직접입력경우 --> 쿼리문이 아닌 값에 입력한 경우
		System.out.println(":: 1. user로시작하는 userId User(SELECT)  ? ");
		list = session.selectList("UserMapper02.getUser01","user%");
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");
		
	
		//2.  getUser :: # 대입자를 이용한 like 연산자 검색 ==> 검색결과 없는것 확인
		User user = new User();
		user.setUserId("01");
		
		System.out.println(":: 2. 01로 끝나는 userId User(SELECT)  ? ");
		 list = session.selectList("UserMapper02.getUser02",user);
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");
		
		
		//3. getUser :: # 대입자를 이용한  like 연산자 검색 
		//				==> 검색결과 존재 확인 :: %와일드카드 직접입력경우
		user.setUserId("%01"); // 값에 와일드 카드를 입력...user_id가 01로 끝나는 회원을 검색...
		System.out.println(":: 3. 01로 끝나는 userId User(SELECT)  ? ");
		list = session.selectList("UserMapper02.getUser02",user);
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");
		
		
		//4. getUser :: $ 대입자를 이용한 like 연산자 검색==> 검색결과 존재 확인 
		System.out.println(":: 4. user로시작하는 userId User(SELECT)  ? ");
		list = session.selectList("UserMapper02.getUser03","user");
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");
		
		
	
		//6. getUser :: $ 대입자를 이용한 like 연산자 검색==> 검색결과 존재 확인 
		user.setUserId("01");
		System.out.println(":: 5. 01로 끝나는 userId User(SELECT)  ? ");
		 list = session.selectList("UserMapper02.getUser04",user);
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");
	
	}//end of main
}//end of class






