package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Ex05_Statement_delete {

	public static void main(String[] args) {
		// 접속하고 처리하기 위해서 3개의 클래스
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int result = 0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##SIMBA";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			// 이름이 이강인 삭제
			String sql = "delete from customer where name = '이강인' ";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if (result > 0) {
				sql = "select * from customer order by custid asc";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\t");
				}
			} else {
				System.out.println("삭제 실패");
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
