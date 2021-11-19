package ibatis.services.user.test;

import ibatis.services.domain.User;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * FileName : MyBatisTestApp01.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping01.xml
  * ㅇ MyBATIS Framework 이용 QUERY ( SELECT ) TEST 
  */
public class MyBatisTestApp01 {
	public static void main(String[] args) throws Exception{
		
		///==> SqlMapConfig01.xml : MyBATIS Framework 의 핵심 환경설정화일 (MetaData)
		//==> mybatis-userservice-mapping.xml : SQL 를 갖는 설정화일 (MetaData) 
		
		//==> 1. xml metadata 읽는 Stream 생성
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");
		//==> 2. Reader 객체를 이용 xml metadata 에 설정된 각정 정보를 접근, 사용가능한 
		//==>     SqlMapClient  객체 생성
		
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		
		
		SqlSession session=factory.openSession();
		List<User> list=session.selectList("UserMapper.getUserList");
		
		//0. getUserList :: 모든 user 정보
		System.out.println(":: 0. all User(SELECT)  ? ");
		
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");

		//1. getUser :: 특정 userid 정보
		User user = (User)session.selectOne("UserMapper01.getUser", "user01");
		//id가 user01인 user를 찾음. return name
		System.out.println(":: 1. get(SELECT)  ? "+user.toString());
		System.out.println("\n");
		
		//2. findUserId :: 특정 userid / password 정보
		user.setUserId("user03");
		user.setPassword("user03");
		String name = (String)session.selectOne("UserMapper01.findUserId", user);
		//id가 user03이면서 pass가 user03인 사람을 찾는 것. return name
		System.out.println(":: 2. get(SELECT)  ? "+name);
	}//end of main
}//end of class


















