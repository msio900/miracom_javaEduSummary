package com.edu.spring.model;
/*
 * 데이터 가공과 관련있는 레이어
 * 주로 Service layer에서 트랜잭션 처리를 한다.
 */
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.edu.spring.domain.MyProduct;

@Service
@Transactional
public class MyProductServiceImpl implements MyProductService {
	
	@Autowired
	private MyProductDAO myProductDAO;
	
	@Transactional
	@Override
	public void addProduct(MyProduct vo) throws Exception {
		myProductDAO.addProduct(vo);
	}

	@Override
	public List<MyProduct> findProducts() throws Exception {
		return myProductDAO.findProducts();
	}

	@Override
	public List<MyProduct> findProductByName(String name) throws Exception {
		return myProductDAO.findProductByName(name);
	}

	@Override
	public List<MyProduct> findProductByMaker(String maker) throws Exception {
		return myProductDAO.findProductByMaker(maker);
	}

}
