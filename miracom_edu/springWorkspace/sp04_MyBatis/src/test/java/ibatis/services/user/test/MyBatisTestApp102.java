package ibatis.services.user.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import ibatis.services.domain.User;
import ibatis.services.user.impl.MyBatisUserDAOImpl10;
import ibatis.services.user.impl.MyBatisUserDAOImpl10;

/*
 * FileName : MyBatisTestApp102.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping10.xml
  * ㅇ MyBatisUserDAOImpl10
  * ㅇ TestUtil.java 을 이용 Test . 
  * ㅇ Persistance Logic Layer 단위 Test..여기서 에러난다고해도 mybatis-userservice-mapping10.xml는 볼 필요없다.
  *   ::Persistence Layer의 단위테스트 마무리
  *  
  *  ㅇ 다음은 Service Layer 단위 테스트 : MyBatisTestApp11.java
  */
public class MyBatisTestApp102 {
	///Main method
	public static void main(String[] args) throws Exception{

		SqlSession session = null;
		//==> TestUtil 의 getSqlSessionFactory()을 이용 SqlSessionFactory instance GET
		SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
		session=factory.openSession();
		
			
		//==> MyBatisUserDAOImpl10 생성 및 sqlMapClient 객체 setter injection
		MyBatisUserDAOImpl10 dao = new MyBatisUserDAOImpl10();
		dao.setSqlSession(session);
		
		//==> Test 용 User instance 생성  
		User user = new User("user04","주몽","user04",null,1);
			
		//1. MyBatisUserDAOImpl10.addUser Test  
		System.out.println(":: 1. addUser(INSERT)  ? "	+ dao.addUser(user) );
		
		//2. MyBatisUserDAOImpl10.getUser Test :: 주몽 inert 확인 
		System.out.println(":: 2. getUser(SELECT)  ? \n " + dao.getUser(user.getUserId()) );

		//3. MyBatisUserDAOImpl10.uadateUser Test  
		//                                                    :: 주몽 ==> 온달 수정
		user.setUserName("온달");
		System.out.println(":: 3. update(UPDATE)  ? "+dao.updateUser(user) );
		
		//4. MyBatisUserDAOImpl10.getUserList Test::Dynamic Query 확인 id=user04/name=온달 검색
		System.out.println(":: 4. getUserList(SELECT)  ? ");
		TestUtil.printList( dao.getUserList(user) );
		
		//5. MyBatisUserDAOImpl10.removeUser Test
		System.out.println(":: 5. Use10.removeUser (DELETE)  ? "
															+dao.removeUser(user.getUserId()) );
		
		//6. MyBatisUserDAOImpl10.getUserList Test 
		System.out.println(":: 6. getUserList(SELECT)  ? ");
		TestUtil.printList( dao.getUserList(user) );
		
		//7. MyBatisUserDAOImpl10.getUserList Test 
		user.setUserId(null);
		user.setUserName(null);
		System.out.println(":: 7. getUserList(SELECT)  ? ");
		TestUtil.printList( dao.getUserList(user) );
		
	}//end of main
}//end of class