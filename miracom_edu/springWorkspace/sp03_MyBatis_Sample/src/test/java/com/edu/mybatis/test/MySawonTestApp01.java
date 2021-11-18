package com.edu.mybatis.test;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.edu.mybatis.vo.MySawon;

/*
 * MyBatis 프레임워크의 가장 핵심이 되는 설정 문서를 만들었다.
 * SqlMapConfig.xml
 * 
 * 이제 MyBatis프레임워크에서 제공하는 라이브러리 클래스를 이용해서
 * SqlMapConfig.xml을 읽어들이고
 * 쿼리문을 동작시켜보도록 하자.
 */
public class MySawonTestApp01 {

	public static void main(String[] args) throws Exception{
		// 1. 화면의 폼을 통해서 vo를 생성한다는 가정으로...
		MySawon vo = new MySawon();
		vo.setId("ddd");
		vo.setPwd("1224");
		vo.setName("도로시");
		vo.setAge(22);
		
		//2. 핵심이 되는 설정문서를 읽어들인다.
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		//3. MyBatis 라이브러리..순서는 천천히 외우시면 됩니다.
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		//session 여기에 쿼리문 실행하는 기능이 다 들어있다.
		SqlSession session = factory.openSession();
		
		session.insert("sawonMapper.sawonAdd", vo);
		session.commit();
		
		session.close();
		
		System.out.println(vo.getName()+" 님이 회원등록 성공^^");

	}

}
