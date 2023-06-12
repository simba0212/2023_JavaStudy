package hw10;

import java.util.List;

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

	// 1. customer 테이블 전체보기
	// select, 결과는 여러개, 파라미터가 없음
	public static List<VO> getList() {
		List<VO> list = null;
		// selectList() : 결과가 하나 이상일때
		// selectOne() : 결과가 하나 일때
		// 파라미터가 있는 메서드와 파라미터가 없는 메서드로 나눈다.

		// 1. selectList("mapper의 id",[파라미터]) ==> 파라미터가 있는 메서드
		// 2. selectList("mapper의 id")
		list = getSession().selectList("custList");
		return list;
	}

	// 2.
	public static VO getOne(String custid) {

		VO vo = getSession().selectOne("custOne", custid);
		return vo;
	}

	// 3.
	public static int getInsert(VO vo) {
		
		int res = getSession().insert("custIns", vo);
		ss.commit();
		return res;
	}

	// 4.
	public static int getDelete(VO vo) {
		int res = getSession().delete("custDel", vo);
		return res;
	}

	// 5.
	public static int getUpdate(VO vo) {
		int res = getSession().update("custUp", vo);
		return res;
	}
	
	public static boolean getIdChk(String custid) {
		boolean idchk = false;
		VO vo = getSession().selectOne("idChk", custid);
		if(vo==null) {
			// 중복없음
			idchk = true;
		}

		return idchk;
	}

}
