package jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.vo.Customer;
/*
 * DAO 실체 클래스 
 * 클라이언트 요청에 해당하는 비즈니스 로직들이 정의되어져 있는 DAO 클래스 
 * 우리는 VO와 함께 이런 클래스들을 model이라 부른다. 
 * 
 * 아무리 클라이언트의 요청이 요청이 많더라도
 * 서버상에서 오직 하나의 인스턴스만 생성되어지도록 싱글톤 패턴으로 작성
 * 
 */
public class CustomerDAOImpl implements CustomerDAO{
	private static CustomerDAOImpl dao = new CustomerDAOImpl();
	private CustomerDAOImpl() {
		System.out.println("DAOImple...Creating...");
	}
	public static CustomerDAOImpl getInstance() {
		return dao;
	}
	@Override
	public Connection getConnect() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void registerCustomer(Customer vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteCustomer(int num) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCustomer(Customer vo) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer getCustomer(int num) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Customer> getAllCustomer() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

}
