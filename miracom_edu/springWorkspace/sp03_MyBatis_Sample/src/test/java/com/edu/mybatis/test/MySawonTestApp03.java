package com.edu.mybatis.test;

import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.edu.mybatis.vo.MySawon;
/*
 * SqlSessionFactory 생성부분과
 * SqlSessiono 반환받아서 로직 호출하는 부분을 나눠서 작성...로직의 모듈화!!!
 * 
 * 
 */
public class MySawonTestApp03 {

	public static void main(String[] args) throws Exception{
		// 설정 문서를 읽어들여, SqlSessionFactory를 생성하는 로직을....Factoryservice에서 받아온다....
		SqlSessionFactory factory = FactoryService.getFactory();
		
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