package ibatis.services.user.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import ibatis.services.domain.User;
/*
 * FileName : MyBatisTestApp101.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping10.xml
  * ㅇ TestUtil.java 을 이용 Test . 
  * ㅇ 이거 돌아가면 MyBatis Framework 단위테스트는 잘 된거다...mybatis-userservice-mapping10.xml은 문제 없다.
  * 
  * ㅇ 다음은 Persistance Logic 단위테스트 : MyBatisTestApp102.java
  * ㅇ MyBatisUserDAOImpl10 / UserADO 추가해야한다.
  */
public class MyBatisTestApp101 {
	///Main method
	public static void main(String[] args) throws Exception{
		
		SqlSession session = null;
		//==> TestUtil 의 getSqlSessionFactory()을 이용 SqlSessionFactory instance GET
		SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
		session=factory.openSession();
		
		//==> Test 용 User instance 생성  
		User user = new User("user04","주몽","user04",null,1);		
		
		//1. User10.addUser Test  :: users table age/grade/redDate 입력값 확인할것 : OK 
		System.out.println(":: 1. addUser(INSERT)  ? "
													+ session.insert("User10.addUser",user)); //1
													  session.commit();
		//2. User10.getUser Test :: 주몽 inert 확인 
		System.out.println(":: 2. getUser(SELECT)  ? ");
		System.out.println(" :: "+session.selectOne("User10.getUser",user.getUserId()) );
		
		
		//3. User10.uadateUser Test  :: users table age/redDate 입력값 확인할것 : OK
		//                                                    :: 주몽 ==> 온달 수정
		user.setUserName("온달");
		System.out.println(":: 3. update(UPDATE)  ? "
													+ session.update("User10.updateUser",user));//1
											  		  session.commit();
		 
		//4. User10.getUserList Test  :: Dynamic Query 확인 id=user04/name=온달 검색
		System.out.println(":: 4. getUserList(SELECT)  ? ");
		TestUtil.printList( (List)session.selectList("User10.getUserList",user) );
		
		//5. User10.removeUser Test
		System.out.println(":: 5. Use10.removeUser (DELETE)  ? "
								+session.delete("User10.removeUser",user.getUserId()) );//1
								 session.commit();
		
		//6. User10.getUserList Test  :: Dynamic Query 확인 id=user04/name=온달 검색
		System.out.println(":: 6. getUserList(SELECT)  ? ");
		TestUtil.printList((List) session.selectList("User10.getUserList",user) ); //이때 위의 기능 리턴타입이 0인걸 확인하자
	
		//7. User10.getUserList Test  :: Dynamic Query 확인 id=null/name=null 인경우
		user.setUserId(null);
		user.setUserName(null);
		System.out.println(":: 7. getUserList(SELECT)  ? ");
		TestUtil.printList( (List) session.selectList("User10.getUserList",user) );
		
	}//end of main
}//end of class




