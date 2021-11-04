package jdbc.dao;
/*
 * 비즈니스 로직의 Template....
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.vo.Customer;


public interface CustomerDAO {
	Connection getConnect() throws SQLException;//public abstract
		void closeAll(PreparedStatement ps, Connection conn)throws SQLException;
		void closeAll(ResultSet rs, PreparedStatement ps, Connection conn)throws SQLException;

		//===
		void registerCustomer(Customer vo) throws SQLException;
		void deleteCustomer(int num)throws SQLException;
		void updateCustomer(Customer vo) throws SQLException;
		
		Customer getCustomer(int num)throws SQLException;
		ArrayList<Customer> getAllCustomer()throws SQLException;


		
	}

