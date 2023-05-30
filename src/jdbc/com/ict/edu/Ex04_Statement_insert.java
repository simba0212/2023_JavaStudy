package jdbc.com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04_Statement_insert {
	public static void main(String[] args) {
		// 접속을 위해 처리하는 Class 3개
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int res = 0;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##SIMBA";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);
			
			// insert (6번, 이강인, 대한민국 서울, 000-9000-0001) 추가
			String sql = "insert into customer values(6,'이강인','대한민국 서울','000-9000-0001')";
			stmt = conn.createStatement();
			
			res = stmt.executeUpdate(sql);
			if(res >0) {
				sql = "select * from CUSTOMER order by custid asc";
				rs = stmt.executeQuery(sql);
				while(rs.next()) {
					System.out.print(rs.getString(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				// TODO: handle exception
			}
			// TODO: handle finally clause
		}

	}

}
