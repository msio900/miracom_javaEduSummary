package com.edu.mybatis.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.edu.mybatis.vo.MySawon;
/*
 * SELECT문을 실행시키는 Test
 */
public class MySawonTestApp02 {

	public static void main(String[] args) throws Exception{
		//1. 핵심이 되는 설정문서를 읽어들인다.
		Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
		
		//2. MyBatis 라이브러리..순서는 천천히 외우시면 됩니다.
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(r);
		
		//3. session 여기에 쿼리문 실행하는 기능이 다 들어있다.
		SqlSession session = factory.openSession();
		
		List<MySawon> list = session.selectList("sawonMapper.sawonList"); // namespace.
		for (MySawon vo :list) {
			System.out.println(vo);
		}
	}
}
/*
 * 						SqlSessionFactory --> SqlSession
 * 									SqlSession
 * 	sql query									execute method
 * INSERT INTO ~			===			insert("namespace이름.id, vo);
 * DELETE FROM ~			===			delete("namespace이름.id, PK);
 * UPDATE table ~			===			update("namespace이름.id, vo);
 * ------------------------------------------------------------------------------------
 * SELECT * FROM			===			List<T> selectList("namespace이름.id");
 * 										List<T> selectList("namespace이름.id", "서울");
 * SELECT * FROM where		===			Object	selectOne("namespace이름.id", PK);
 */