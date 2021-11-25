package com.edu.spring.model.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.spring.domain.Item;
import com.edu.spring.model.ItemDAO;

@Repository
public class ItemDAOImpl implements ItemDAO {
	
	private final static String NS = "ns.sql.ItemMapper.";
	
	@Autowired
	private SqlSession sqlSession;
	
	@Override
	public List<Item> getItemList() throws Exception {
		return sqlSession.selectList(NS+"getItemList");
	}
	@Override
	public Item getItem(Integer itemId) throws Exception {
		return sqlSession.selectOne(NS+"getItem",itemId);
	}
}
