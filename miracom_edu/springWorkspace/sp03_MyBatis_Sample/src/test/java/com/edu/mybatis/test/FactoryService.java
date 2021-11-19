package com.edu.mybatis.test;
/*
 * SqlSessionFactory 하나 받아오는 로직을 여기에다가 작성...
 */

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class FactoryService {
	//생성자보다 먼저 가동되는 블락?...main보다 먼저 작동하는 블락?
	//static initialization block...
	private static SqlSessionFactory factory;
	static {
		try {
			//1. 핵심이 되는 설정문서를 읽어들인다.
			Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
			
			//2. MyBatis 라이브러리..순서는 천천히 외우시면 됩니다.
			factory = new SqlSessionFactoryBuilder().build(r);
		} catch (Exception e) {
			
		}
	}//
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}	
