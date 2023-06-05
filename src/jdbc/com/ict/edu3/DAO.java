package jdbc.com.ict.edu3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
		} catch (Exception e) {
		}
		return null;

	}

	// DB에 접근후 원하는 메서드를 만들어서 사용

	// 전체보기 메서드
	public void getSelectAll() {
		try {
			conn = getConnection();
			String sql = "select * from 고객테이블";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("고객아이디\t고객이름\t나이\t등급\t직업\t적립금");
			while (rs.next()) {
				System.out.println(rs.getString(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getString(4));
				System.out.println(rs.getString(5));
				System.out.println(rs.getString(6));
			}
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
	}

}
