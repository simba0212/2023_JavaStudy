package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex01_PreparedStatement_select {
	public static void main(String[] args) {
		// 오라클에 접속해서 처리하는 클래스는 3개가 있다
		Connection conn = null;
		// Statement stmt = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;
		try {
			// 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 오라클에 접속할 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##simba";
			String password = "1111";
			
			//오라클에 접속
			conn = DriverManager.getConnection(url, user, password);
			
			// SQL을 짜보자
			String sql = "select * from 고객테이블"; // 이때 sql문장은 stmt와 pstmt가 차이가 없다.
			
			// prepareStatement에서는 쿼리를 바로 보낸다.
			pstmt = conn.prepareStatement(sql);
			// 바인딩변수('?') 가 있으면 처리하자
			
			// 
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.print(rs.getString(1)+"\t");
				System.out.print(rs.getString(2)+"\t");
				System.out.print(rs.getString(3)+"\t");
				System.out.print(rs.getString(4)+"\t");
				System.out.print(rs.getString(5)+"\t");
				System.out.print(rs.getString(6)+"\n");
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

	}
}
