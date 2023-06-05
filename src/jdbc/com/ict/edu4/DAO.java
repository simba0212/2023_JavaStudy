package jdbc.com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

// DAO(Data Access Object) : 데이터베이스의 data에 접근하기 위한 객체
//                           비즈니스 로직을 분리하기 위해 사용한다.

// DB에 접속해서 각종 SQL를 처리하는 클래스이다.
// 싱글턴 패턴 : 소프트웨어 디자인 패턴에서 사용하는 패턴 중 하나이다.
//			  생성자가 여러차례 호출 되더라도 실제 생성되는 객체는 하나이고, 
//			  최초 생성 이후에, 생성자가 호출되면 최초 생성자가 생성한 객체를 리턴한다.
//			  가장 대표적인 것이 SPRING 이 기본적으로 싱글턴 패턴을 사용한다.
public class DAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	int res = 0;

	private static DAO dao = new DAO();

	public static DAO getInstance() {
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
	public ArrayList<VO> getSelectAll() {
		ArrayList<VO> list = null;
		try {
			conn = getConnection();
			String sql = "select * from 고객테이블";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			list = new ArrayList<>();
			while (rs.next()) {
				VO vo = new VO();
				vo.set고객아이디(rs.getString(1));
				vo.set고객이름(rs.getString(2));
				vo.set나이(rs.getString(3));
				vo.set등급(rs.getString(4));
				vo.set직업(rs.getString(5));
				vo.set적립금(rs.getString(6));
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

	public VO getSelectOne(String c_id) {
		try {
			VO vo = new VO();
			conn = getConnection();
			String sql = "select * from 고객테이블 where 고객아이디 = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c_id);
			rs = pstmt.executeQuery();
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			while (rs.next()) {
				vo.set고객아이디(c_id);
				vo.set고객이름(rs.getString(2));
				vo.set나이(rs.getString(3));
				vo.set등급(rs.getString(4));
				vo.set직업(rs.getString(5));
				vo.set적립금(rs.getString(6));
			}
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

	public int getInsert(VO vo) {
		try {
			conn = getConnection();
			String sql = "insert into 고객테이블 values(?,?,?,?,?,?) ";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.get고객아이디());
			pstmt.setString(2, vo.get고객이름());
			pstmt.setString(3, vo.get나이());
			pstmt.setString(4, vo.get등급());
			pstmt.setString(5, vo.get직업());
			pstmt.setString(6, vo.get적립금());
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

	public VO getDelete(String c_id) {
		try {
			conn = getConnection();
			String sql = "delete from 고객테이블 where 고객아이디 = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, c_id);
			res = pstmt.executeUpdate();
			if (res > 0) {
				System.out.println("삭제성공");
				return null;
			} else {
				System.out.println("없는 아이디 입니다.");
			}
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

	public int getUpdate(VO vo) {
		try {
			conn = getConnection();
			String sql = "update 고객테이블 set 고객이름 = ?,나이 = ?,등급 = ?,직업 = ?,적립금 = ? where 고객아이디 = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.get고객이름());
			pstmt.setString(2, vo.get나이());
			pstmt.setString(3, vo.get등급());
			pstmt.setString(4, vo.get직업());
			pstmt.setString(5, vo.get적립금());
			pstmt.setString(6, vo.get고객아이디());
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

}
