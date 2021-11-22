package ibatis.services.user.test;

import ibatis.services.domain.User;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * FileName : MyBatisTestApp05.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping05.xml
  * ㅇ My Framework 이용 QUERY ( SELECT ) TEST 
  */
public class MyBatisTestApp05 {
	///Main method
	public static void main(String[] args) throws Exception{
		
		///==> SqlMapConfig.xml : MyBATIS Framework 의 핵심 환경설정화일 (MetaData)
		//==> mybatis-userservice-mapping.xml : SQL 를 갖는 설정화일 (MetaData) 
		
		//==> 1. xml metadata 읽는 Stream 생성
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");
		//==> 2. Reader 객체를 이용 xml metadata 에 설정된 각정 정보를 접근, 사용가능한 
		//==>   SqlSession  객체 생성
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=factory.openSession();
		
		//==> Test 용 User instance 생성 및 age / regData null setting
		//==>@@@ null값을 허용할려면 SqlMapConfig01.xml에 Settings 태그를 부착해야한다.@@@
		User user = new User("user04","주몽","user04",null,1);
		user.setRegDate(null);
		
	
		//1. User05.addUser Test  :: users table age/grade/redDate 입력값 확인할것 : OK 
		System.out.println(":: 1. addUser(INSERT)  ? "
												+ session.insert("UserMapper05.addUser",user)); //1.
		session.commit();
		
		System.out.println("\n");
		
		//2. User05.addUser Test :: users table age/grade/redDate 입력값 확인할것 : OK
		user.setUserId("user05");
		System.out.println(":: 2. addUser(INSERT)  ? "
										+ session.insert("UserMapper05.addUser",user));//1
		session.commit();
		System.out.println("\n");
		
		//3. User05.uadateUser Test  :: users table age/redDate 입력값 확인할것 : OK
		//                                                    :: 주몽 ==> 온달 수정
		user.setUserName("온달");
		System.out.println(":: 2. update(UPDATE)  ? "
													+ session.update("UserMapper05.updateUser",user));//1
		session.commit();
	}//end of main
}//end of class








