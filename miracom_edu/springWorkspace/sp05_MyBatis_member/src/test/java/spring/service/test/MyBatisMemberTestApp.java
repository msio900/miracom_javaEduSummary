package spring.service.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import ibatis.services.domain.User;

public class MyBatisMemberTestApp {
	public static void main(String[] args) {
		
		Reader reader=Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=factory.openSession();
		
		//0. User01.getUserList 
		System.out.println(":: 0. getUserList(SELECT)  ? ");
		List<User> list = session.selectList("UserMapper.getUserList");
		for (int i =0 ;  i < list.size() ; i++) {
			System.out.println( "<"+ ( i +1 )+"> 번째 회원.."+ list.get(i).toString() );
		}
		System.out.println("\n");

	}

}
