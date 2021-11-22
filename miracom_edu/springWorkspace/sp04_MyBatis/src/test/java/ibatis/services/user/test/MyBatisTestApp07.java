package ibatis.services.user.test;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import ibatis.services.domain.User;
/*
 * FileName : MyBatisTestApp07.java
  * ㅇ SqlMapConfig.xml / mybatis-userservice-mapping07.xml
  * ㅇ MyBATIS Framework 이용 Dynamic query ( SELECT ) TEST
  * ㅇ TestUtil.java 을 이용 Test . 
  * 	--> SqlSessionFactory를 반환하는 로직의 모듈화
  */
public class MyBatisTestApp07 {
	///Main method
		public static void main(String[] args) throws Exception{
			SqlSession session = null;
			
			//==> TestUtil 의 getSqlSessionFactory()을 이용 SqlSessionFactory instance GET
			SqlSessionFactory factory = TestUtil.getSqlSessionFactory();
			session=factory.openSession();
			
			//==> Test 용 UserVO instance 생성  
			User user = new User("user01","홍길동","user01",new Integer(30),1);
		
			//1. User07.getUserList01 Test 
			/*System.out.println(":: 1. getUserList01(SELECT)  ? ");
			TestUtil.printList((List)session.selectList("UserMapper07.getUserList01",user));*/
			
			//2. User07.getUserList01 Test ..여기서 부터 동적인 쿼리
			/*System.out.println(":: 2. getUserList01(SELECT)  ? ");
			user.setUserName(null);
			TestUtil.printList((List)session.selectList("UserMapper07.getUserList",user) );*/
			
			//3. User07.getUserList01 Test 
			System.out.println(":: 3. getUserList01(SELECT)  ? ");
			user.setUserName("홍길동");
			user.setAge(null);
			TestUtil.printList((List)session.selectList("UserMapper07.getUserList",user) );
		
			//4. User07.getUserList01 Test ..이경우는 조건을 안준거와 동일한 결과가 나온다..
			System.out.println(":: 4. getUserList01(SELECT)  ? ");
			user.setUserName(null);
			user.setAge(null);
			TestUtil.printList((List)session.selectList("UserMapper07.getUserList",user) );
		
		}//end of main
	}//end of class







