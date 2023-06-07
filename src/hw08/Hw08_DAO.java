package hw08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import jdbc.com.ict.edu4.DAO;

// DAO(Data Access Object) : 데이터베이스의 data에 접근하기 위한 객체
//                           비즈니스 로직을 분리하기 위해 사용한다.

// DB에 접속해서 각종 SQL를 처리하는 클래스이다.
// 싱글턴 패턴 : 소프트웨어 디자인 패턴에서 사용하는 패턴 중 하나이다.
//			  생성자가 여러차례 호출 되더라도 실제 생성되는 객체는 하나이고, 
//			  최초 생성 이후에, 생성자가 호출되면 최초 생성자가 생성한 객체를 리턴한다.
//			  가장 대표적인 것이 SPRING 이 기본적으로 싱글턴 패턴을 사용한다.
public class Hw08_DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int res = 0;

	private static Hw08_DAO dao = new Hw08_DAO();

	public static Hw08_DAO getInstance() {
		return dao;
	}

	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##simba";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			return conn;
		} catch (Exception e) {
		}
		return null;

	}

	// DB에 접근후 원하는 메서드를 만들어서 사용

	// 전체보기 메서드
	public ArrayList<Hw08_VO> getSelectAll() {
		ArrayList<Hw08_VO> list = null;
		try {
			conn = getConnection();
			String sql = "select * from customer order by custid asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				Hw08_VO vo = new Hw08_VO();
				vo.setCustid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setAddress(rs.getString(3));
				vo.setPhone(rs.getString(4));
				list.add(vo);
			}
			return list;

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return null;
	}

	public Hw08_VO getSelectOne(String c_id) {
		try {
			Hw08_VO vo = new Hw08_VO();
			conn = getConnection();
			String sql = "select * from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c_id);
			rs = pstmt.executeQuery();
			rs.next();
			vo.setCustid(rs.getString(1));
			vo.setName(rs.getString(2));
			vo.setAddress(rs.getString(3));
			vo.setPhone(rs.getString(4));
			return vo;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return null;
	}

	public int getInsert(Hw08_VO vo) {
		try {
			conn = getConnection();
			String sql = "insert into customer values(?,?,?,?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getCustid());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getAddress());
			pstmt.setString(4, vo.getPhone());
			res = pstmt.executeUpdate();
			return res;

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return 0;
	}

	public int getDelete(String c_id) {
		try {
			conn = getConnection();
			String sql = "delete from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c_id);
			res = pstmt.executeUpdate();
			return res;
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		return 0;
	}

	public boolean getIdChk(String custid) {
		boolean idchk = false;
		try {
			conn = getConnection();
			String sql = "select * from customer where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, custid);
			int cnt = pstmt.executeUpdate();
			if (cnt == 0) {
				idchk = true;
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

		return idchk;
	}

	public void getUpdate(Hw08_VO vo) {
		try {
			conn = getConnection();
			String sql = "update customer set name = ?, address = ?, phone = ? where custid = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getAddress());
			pstmt.setString(3, vo.getPhone());
			pstmt.setString(4, vo.getCustid());
			res = pstmt.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
