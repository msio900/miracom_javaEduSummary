package ibatis.services.user.test;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import ibatis.services.domain.User;
import ibatis.services.user.impl.MyBatisUserDAOImpl10;
import ibatis.services.user.impl.MyBatisUserServiceImpl11;

/*
 * FileName : MyBatisTestApp11.java
  * ㅇ SqlMapConfig01.xml / mybatis-userservice-mapping10.xml
  * ㅇ MyBatisUserServiceImpl11
  * ㅇ TestUtil.java 을 이용 Test . 
  * ㅇ Business Logic Layer 단위 Test..여기서 에러난다고해도 mybatis-userservice-mapping10.xml는 볼 필요없다.
  * ㅇ MyBatisUserDAOImpl10(UserADO), MyBatisUserServiceImpl11(UserService)를 직접 작성한다.
  * 
  * ㅇ해당 코드에서 여전히 new가 보인다...결국 아직까지 Spring과 연동하지 않았다는 것이다.
  * ㅇ다음은 MyBatisTestApp12.java에서 메타데이타를 추가하겠다.
  */
public class MyBatisTestApp11 {
	///Main method
	public static void main(String[] args) throws Exception{

		SqlSession session = null;
		//==> TestUtil 의 getSqlSessionFactory()을 이용 SqlSessionFactory instance GET
		SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
		session=factory.openSession();
		
		//==> MyBatisUserDAOImpl10 생성 및 SqlSession 객체 setter injection
		MyBatisUserDAOImpl10 dao = new MyBatisUserDAOImpl10();
		dao.setSqlSession(session);
		
		//==> IBatisUserServiceImpl11 생성 및 IBatisUserDAOImpl10 객체 setter injection
		MyBatisUserServiceImpl11 userService = new  MyBatisUserServiceImpl11();
		userService.setUserDAO(dao);
		
		//==> Test 용 User instance 생성  
		User user = new User("user04","주몽","user04",null,1);
		
		
		//1. MyBatisUserServiceImpl11.addUser Test  
		System.out.println(":: 1. addUser(INSERT)  ? ");
		userService.addUser(user);
		
		//2. MyBatisUserServiceImpl11.getUser Test :: 주몽 inert 확인 
		System.out.println(":: 2. getUser(SELECT)  ? \n " + dao.getUser(user.getUserId()) );

		//3. MyBatisUserServiceImpl11.uadateUser Test  
		//                                                    :: 주몽 ==> 온달 수정
		user.setUserName("온달");
		System.out.println(":: 3. update(UPDATE)  ? ");
		userService.updateUser(user) ;
	
		//4. IBatisUserServiceImpl11.getUserList Test::Dynamic Query 확인 id=user04/name=온달 검색
		System.out.println(":: 4. getUserList(SELECT)  ? ");
		TestUtil.printList( userService.getUserList(user) );
		
		//5. MyBatisUserServiceImpl11.removeUser Test
		//==> UserService 에는 removeUser가 없으므로, DAO에서 직접 호출 Test
		System.out.println(":: 5. Use10.removeUser (DELETE)  ? "
													+dao.removeUser(user.getUserId()) );
		
		//6. MyBatisUserServiceImpl11.getUserList Test 
		System.out.println(":: 6. getUserList(SELECT)  ? ");
		TestUtil.printList( userService.getUserList(user) );
		
		//7. MyBatisUserServiceImpl11.getUserList Test 
		user.setUserId(null);
		user.setUserName(null);
		System.out.println(":: 7. getUserList(SELECT)  ? ");
		TestUtil.printList( userService.getUserList(user) );
		
	}//end of main
}//end of class