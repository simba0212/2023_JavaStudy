package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex02_Statement_select {
	public static void main(String[] args) {
		// 1. java를 오라클에 접속할 수 있도록 도와주는 클래스
		Connection conn = null;
		// 2. SQL 구문 작성을 도와주는 클래스
		Statement stmt = null;
		// 3. 결과를 받아오는 클래스
		// 3.1 select문의 결과를 받는 클래스
		ResultSet rs = null;
		// 3.2 select 문이 아닌경우 결과를 받는 클래스(int)
		int res = 0;
		try {
			// 4.JDBC Driver Loading : Oracle, MySQL 등 각각 내용이 다르다.
			Class.forName("oracle.jdbc.driver.OracleDriver");

			// 5. 접속하기 위한 정보 저장
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##SIMBA";
			String password = "1111";

			// 6. 접속하기
			conn = DriverManager.getConnection(url, user, password);

			// 7. SQL 작성하기
			String sql = "select * From book";

			// 8. SQL을 보낼 수 있는 구문 만들기
			stmt = conn.createStatement();

			// 9. SQL을 담아서 보내고, 결과받기
			// 9.1 select 문으로 받은경우 (ResultSet);
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.print(rs.getString(1) + "\t");
				System.out.printf("%-15s" + "\t", rs.getString(2));
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\t\n");
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
