package com.edu.spring.model;
//Persistence Layer Bean --> @Component < @Repositiry

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.spring.domain.MyProduct;

@Repository 
public class MyProductDAOImpl implements MyProductDAO{
	
	@Autowired
	private SqlSession sqlSession;
	
	private final static String NS = "ns.sql.MyProductMapper";

	@Override
	public int addProduct(MyProduct vo) throws Exception {		
		int result=sqlSession.insert(NS+".addProduct", vo);
		return result;
	}
	@Override
	public List<MyProduct> findProducts() throws Exception {		
		return sqlSession.selectList(NS+".findProducts");
	}
	@Override
	public List<MyProduct> findProductByName(String name) throws Exception {		
		return sqlSession.selectList(NS+".findProductByName",name);
	}
	@Override
	public List<MyProduct> findProductByMaker(String maker) throws Exception {		
		return sqlSession.selectList(NS+".findProductByMaker",maker);
	}
}













