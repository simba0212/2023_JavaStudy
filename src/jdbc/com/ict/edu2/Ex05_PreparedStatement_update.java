package jdbc.com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex05_PreparedStatement_update {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("업데이트 CUSTID\t: ");
		int custid = sc.nextInt();
		System.out.print("업데이트 NAME\t: ");
		String name = sc.next();
		System.out.print("업데이트 ADDRESS\t: ");
		sc.nextLine();
		String address = sc.nextLine();
		System.out.print("업데이트 phone\t: ");
		String phone = sc.next();

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##simba";
			String password = "1111";
			conn = DriverManager.getConnection(url, user, password);

			// 보통은 primary key를 이용해서 삭제한다.
			String sql = "update customer set name = ?, address=?,phone=? where custid = ?";
			// ? => 바인딩변수
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			
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
			} else {
				System.out.println("업데이트 실패");
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
