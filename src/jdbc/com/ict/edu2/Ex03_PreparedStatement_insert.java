package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex03_PreparedStatement_insert {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("CUSTID\t: ");
		int custid = sc.nextInt();
		System.out.print("NAME\t: ");
		String name = sc.next();
		System.out.print("ADDRESS\t: ");
		String address = sc.next();
		System.out.println("phone\t: ");
		String phone = sc.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##simba";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			String sql = "insert into customer (custid,name,address,phone) values(?,?,?,?)";
			// ? => 바인딩변수
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			
			res = pstmt.executeUpdate();
			if (res > 0) {
				
				sql = "select * from customer order by custid asc";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getString(1) + "\t");
					System.out.print(rs.getString(2) + "\t");
					System.out.print(rs.getString(3) + "\t");
					System.out.print(rs.getString(4) + "\n");
				}
			}

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
