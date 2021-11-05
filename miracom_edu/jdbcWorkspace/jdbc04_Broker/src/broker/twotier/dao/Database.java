package broker.twotier.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;

import broker.twotier.exception.DuplicateSSNException;
import broker.twotier.exception.InvalidTransactionException;
import broker.twotier.exception.RecordNotFoundException;
import broker.twotier.vo.CustomerRec;
import broker.twotier.vo.SharesRec;
import broker.twotier.vo.StockRec;

public class Database implements DatabaseTemplate {
	
	// 공통적인 기능
	@Override
	public Connection getConnect() throws SQLException {
		
		return null;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		
		
	}
	// Business Logic Methods
	@Override
	public void addCustomer(CustomerRec cust) throws SQLException, DuplicateSSNException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(String ssn) throws SQLException, RecordNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(CustomerRec cust) throws SQLException, RecordNotFoundException {
		// TODO Auto-generated method stub
		
	}
	// 특정한 사람이 보유하고 있는 주식 정보를 받아오는 기능
	// Vector<SharesRec>?
	/*+---------+---------+---------+
	  |		    |	   	|		  |
	  +---------+---------+---------+*/
	@Override
	public Vector<SharesRec> getPortfolio(String ssn) throws SQLException {
		
		return null;
	}

	@Override
	public CustomerRec getCustomer(String ssn) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<CustomerRec> getAllCustomers() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<StockRec> getAllStocks() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void buyShares(String ssn, String symbol, int quantity) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellShares(String ssn, String symbol, int quantity)
			throws SQLException, InvalidTransactionException, RecordNotFoundException {
		// TODO Auto-generated method stub
		
	}

}
