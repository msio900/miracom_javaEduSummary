package ibatis.services.user.test;

import ibatis.services.domain.User;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/*
 * FileName : MyBatisTestApp03.java
  * ㅇ SqlMapConfig.xml / mybatis-userservice-mapping03.xml
  * ㅇ My Framework 이용 QUERY ( SELECT ) TEST 
  */
public class MyBatisTestApp03 {
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
		
		//0. User01.getUserList 
		System.out.println(":: 0. getUserList(SELECT)  ? ");
		List<User> list = session.selectList("UserMapper.getUserList");
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");
		
		//==> Test 용 UserVO instance 생성
		User user = new User("user04","주몽","user04",40,4);
		
		//1.User03.addUser Test
		/*Object obj = session.insert("UserMapper03.addUser", user);
		session.commit(); //이 부분 반드시 해줘야 한다....mvc에서는 생략가능.
		//iBatis와 다르게 insert문의 리턴타입은 insert된 row수를 반환한다.
		System.out.println(":: 1. addUser(INSERT)  result ? "+obj); //1
		System.out.println("\n");*/
		
		
		
		//2.User01.findUserId Test
		String userName = (String)session.selectOne("UserMapper01.findUserId", user);
		System.out.println(":: 2. findUserId(SELECT)  ? "+userName); //주몽
		System.out.println("\n");
			
	
		//3.User03.updateUser Test
		/*user.setUserName("장보고");
		int updateResult = session.update("UserMapper03.updateUser", user);
		session.commit(); //이부분 반드시 해줘야 한다.
		System.out.println(":: 3. updateUser(UPDATE) result ? "+updateResult);//1
		System.out.println("\n");*/
		
		//4.User01.findUserId Test
		userName = (String)session.selectOne("UserMapper01.findUserId", user);
		System.out.println(":: 4. findUserId(SELECT)  ? "+userName); //장보고
		System.out.println("\n");
		
		
		//5.User03.removeUser Test
		int deleteResult = session.delete("UserMapper03.removeUser", user.getUserId());
		session.commit(); //이 부분 반드시 해줘야 한다.
		System.out.println(":: 5. removeUser(DELETE) result ? "+deleteResult);
		System.out.println("\n");
		
		
		
		//6. User01.getUserList 
		System.out.println(":: 6. getUserList(SELECT)  ? ");
		 list = session.selectList("UserMapper.getUserList");
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
	}//end of main
}//end of class




















