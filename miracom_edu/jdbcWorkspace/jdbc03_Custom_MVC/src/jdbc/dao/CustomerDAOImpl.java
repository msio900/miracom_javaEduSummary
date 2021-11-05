package jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.ServerInfo;
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
		Connection conn = DriverManager.getConnection(ServerInfo.URL, ServerInfo.USER, ServerInfo.PASS);
		System.out.println("DB Server Connection...OK!!");
		return conn;
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException {
		if(ps != null)ps.close();
		if(conn != null)conn.close();
		
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException {
		if (rs != null) rs.close();
		closeAll(ps, conn);
		
	}

	@Override
	public void registerCustomer(Customer vo) throws SQLException {
		Connection conn = null;
		PreparedStatement ps =null;
		try {
			conn = getConnect();
			String query = "INSERT INTO custom (num, name, addr) VALUES(?,?,?)";
			ps = conn.prepareStatement(query);
			
			ps.setInt(1, vo.getNum());
			ps.setString(2, vo.getName());
			ps.setString(3, vo.getAddr());
			
			ps.executeUpdate(); // 이 시점에 DB서버의 테이블로 값이 들어간다.
			System.out.println(vo.getName()+" 님이 회원가입 되셨습니다..");
			
			
			
		} finally {
			closeAll(ps, conn);
		}
		
	}

	@Override
	public void deleteCustomer(int num) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			String query = "DELETE FROM custom WHERE num=?";
			ps= conn.prepareStatement(query);
			ps.setInt(1, num);
			
			System.out.println(ps.executeUpdate()+"번의 회원님이 탈퇴하셨습니다");
		} finally {
			closeAll(ps, conn);
		}
		
	}

	@Override
	public void updateCustomer(Customer vo) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			conn = getConnect();
			String query = "UPDATE custom SET name=? , addr=? WHERE num=?";
			ps = conn.prepareStatement(query);
			
			ps.setString(1, vo.getName());
			ps.setString(2, vo.getAddr());
			ps.setInt(3, vo.getNum());
			
			System.out.println(ps.executeUpdate()+"분의 회원정보가 수정되었습니다.");
					
		} finally {
			closeAll(ps, conn);
		}
		
	}

	@Override
	public Customer getCustomer(int num) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Customer cust = null;
		try {
			conn = getConnect();
			String query = "SELECT * FROM custom WHERE num=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, num);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				cust = new Customer(num, 
						rs.getString("name"),
						rs.getString("addr"));
			}
		} finally {
			closeAll(rs, ps, conn);
		}
		return cust;
	}

	@Override
	public ArrayList<Customer> getAllCustomer() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<Customer> list = new ArrayList<>();
		try {
			conn = getConnect();
			String query = "SELECT * FROM custom";
			ps = conn.prepareStatement(query);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Customer(rs.getInt("num"),
										rs.getString("name"),
										rs.getString("addr")));
			}
			
		} finally {
			closeAll(rs, ps, conn);
		}
		
		return list;
	}

}
