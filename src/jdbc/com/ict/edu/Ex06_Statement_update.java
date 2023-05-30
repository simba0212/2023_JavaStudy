package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// 박세리의 주소를 대한민국 제주도, 전화번호
public class Ex06_Statement_update {
	public static void main(String[] args) {
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
			String sql = "update customer set address = '대한민국 제주도', phone='010-4245-0212' where name ='박세리'";
			stmt = conn.createStatement();
			result = stmt.executeUpdate(sql);
			if (result > 0) {
				sql = "select * from customer order by custid asc";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			} else {
				System.out.println("변경 실패");
			}

		} catch (Exception e) {
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
