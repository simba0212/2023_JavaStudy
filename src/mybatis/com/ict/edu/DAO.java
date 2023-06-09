package mybatis.com.ict.edu;

import org.apache.ibatis.session.SqlSession;

// DB처리하는 메서드들을 포함하고 있는 클래스

public class DAO {
	// 실제 사용하는 클래스 = SqlSession이다.
	private static SqlSession ss;

	// 싱글턴 패턴 (동기화처리) : 프로그램이 종료될 때 까지 한번 만들어진 객체를 재사용하는것.
	private synchronized static SqlSession getSession() {
		if (ss == null) {
			ss = DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB처리하는 메서드들
	
	
	
	
	
	
}
