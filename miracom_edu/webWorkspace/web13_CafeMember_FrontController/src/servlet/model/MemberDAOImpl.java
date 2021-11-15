package servlet.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class MemberDAOImpl implements MemberDAO{
	//추가
	private DataSource ds;
	
	//싱글톤...
	private static MemberDAOImpl dao = new MemberDAOImpl();
	private MemberDAOImpl() {
		//Connection Factory에 이미 만들어져 있는 Connection을 하나 Rent해오는 로직
		//기존에 서비스가 요청되면 디비서버 직접 연결해서 Connection을 생성하는 방식이 아니라...
		try {
			InitialContext ic = new InitialContext();
			//jdbc/mysql이름으로 등록된 공장(Connection Factory)을 찾아옴.
			ds = (DataSource)ic.lookup("java:comp/env/jdbc/mysql");
			
			System.out.println("DataSource Lookup OK...");
		} catch (Exception e) {
			System.out.println("DataSource Lookup Fail...");
		}
		
	}	
	
	public static MemberDAOImpl getInstance() {
		return dao;
	}
	@Override
	public Connection getConnection() throws SQLException {		
		System.out.println("디비연결 성공....");
		return ds.getConnection();  // Connection 하나씩 pool에서 받아온다.
	}

	@Override
	public void closeAll(PreparedStatement ps, Connection conn) throws SQLException{
		if(ps!=null) ps.close();		
		if(conn != null) conn.close();
	}

	@Override
	public void closeAll(ResultSet rs, PreparedStatement ps, Connection conn) throws SQLException{		
		if(rs != null)	rs.close();
		closeAll(ps, conn);		
	}

	@Override
	public void registerMember(MemberVO vo) throws SQLException {		
		Connection conn = null;
		PreparedStatement ps = null;
		try{
			conn=  getConnection();
			String query = "INSERT INTO member VALUES(?,?,?,?)";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement 생성됨...registerMember");
			
			ps.setString(1, vo.getId());
			ps.setString(2, vo.getPassword());
			ps.setString(3, vo.getName());
			ps.setString(4, vo.getAddress());
			
			System.out.println(ps.executeUpdate()+" row INSERT OK!!");
		}finally{
			closeAll(ps, conn);
		}
	}

	@Override
	public ArrayList<MemberVO> showAllMember() throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		ArrayList<MemberVO> list = new ArrayList<>();
		try {
			conn = getConnection();
			String query = "SELECT id, password, name, address FROM member";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement....showAllMember()..");
			
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new MemberVO(
						rs.getString("id"), 
						rs.getString("password"), 
						rs.getString("name"), 
						rs.getString("address")));
			}
		}finally {
			closeAll(rs, ps, conn);
		}
		return list;
	}

	@Override
	public MemberVO findByIdMember(String id) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try{
			conn = getConnection();
			//
			String query = "SELECT id, password, name, address FROM member WHERE id=?";
			ps = conn.prepareStatement(query);
			System.out.println("PreparedStatement....findByIdMember()..");
			
			ps.setString(1,id);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				vo =  new MemberVO(id, 
								   rs.getString("password"), 
								   rs.getString("name"),
								   rs.getString("address"));
			}
		}finally{
			closeAll(rs, ps, conn);
		}
		return vo;
	}

	@Override
	public MemberVO login(String id, String password) throws SQLException {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		MemberVO vo = null;
		try {
			conn = getConnection();
			String query ="SELECT id, password, name, address FROM member WHERE id=? AND password=?";
		
			ps = conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, password);
			
			rs = ps.executeQuery();
			if(rs.next()) {
				vo = new MemberVO(id, 
								  password, 
								  rs.getString("name"), 
								  rs.getString("address"));
			}
		}finally {
			closeAll(rs, ps, conn);
		}

		return vo;
	}	

	// 일종의 DAO 단위 테스트
//	public static void main(String[] args)throws Exception{
//		MemberDAOImpl dao=MemberDAOImpl.getInstance();
////		MemberVO VO=dao.findByIdMember("encore");
////		System.out.println(VO);
//		
//		ArrayList<MemberVO> list=dao.showAllMember();
//		System.out.println(list);
//	}
}





