package hw10;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class DBService {
	// MyBatis를 사용하기 위해서 SqlSession Class가 필요하다.
	// SqlSessionFactory Class를 이용해 SqlSession Class를 정의한다.
	private static SqlSessionFactory factory;
	// resource 는 config.xml 의 위치로 설정한다. -> 이 파일을 읽어서 실행하려고 하는것
	static String resource = "hw10/config.xml";
	
	// static 초기화
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream(resource);
			factory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	// DAO에서 factory를 호출할 메서드
	public static SqlSessionFactory getFactory() {
		return factory;
		
	}
	
}
