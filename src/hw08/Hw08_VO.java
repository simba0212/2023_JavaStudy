package hw08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

// VO(Values Object)	: DB 정보를 받거나 전달하기 위해서 사용한다.
//						: 컬럼명과 무조건 일치 시키자.
//						: 
public class Hw08_VO {
	private String custid, name, address, phone;

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
