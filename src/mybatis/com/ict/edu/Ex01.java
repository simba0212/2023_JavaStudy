package mybatis.com.ict.edu;

import java.util.Scanner;

// 마이바티스 세팅하기
// 1. config.xml		- DB 접속
// 2. mapper.xml		- 실제 SQL 작성하는 파일 (DB에 접근해서 데이터를 내보내는 파일)
// 3. VO.java			- DB에 들어갈 파라미터 및 리턴의 저장을 담당하는 파일 (테이블의 컬럼명과 일치해야함)
// 4. DAO.java			- mapper와 연결되서 자바에서 DB 실행 시키는 파일 (DB 처리하는 클래스들을 모아놓은 파일)
// 5. DBService.java	- config.xml 을 읽어와서 MyBatis를 실행할수 있도록 하는 파일 




// 1. 환경설정파일(config.xml) 만들기
//
public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		int menu = sc.nextInt();
		
		switch (menu) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;

		default:
			System.out.println("제대로 입력하세요");
			break;
		}
	}
}
