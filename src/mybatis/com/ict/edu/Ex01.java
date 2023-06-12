package mybatis.com.ict.edu;

import java.util.List;
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
		Ex01 test = new Ex01();

		System.out.println("선택하세요");
		System.out.println("1. customer 테이블 전체보기");
		System.out.println("2. customer 테이블 특정 데이터 보기");
		System.out.println("3. customer 테이블 데이터 삽입");
		System.out.println("4. customer 테이블 데이터 삭제");
		System.out.println("5. customer 테이블 데이터 수정");
		System.out.print(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		int menu = sc.nextInt();
		List<VO> list = null;
		switch (menu) {
		case 1:
			list = DAO.getList();
			test.prn(list);
			break;
		case 2:
			System.out.print("custid를 입력하세요 : ");
			String custid = sc.next();
			VO vo = DAO.getOne(custid);
			System.out.println("번호\t이름\t주소\t전화번호");
			System.out.print(vo.getCustid() + "\t");
			System.out.print(vo.getName() + "\t");
			System.out.print(vo.getAddress() + "\t");
			System.out.println(vo.getPhone());
			break;
		case 3:
			System.out.println("삽입정보를 입력하세요");
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("주소 : ");
			sc.nextLine();
			String address = sc.nextLine();
			System.out.print("전화번호 : ");
			String phone = sc.next();
			VO vo2 = new VO();
			vo2.setName(name);
			vo2.setAddress(address);
			vo2.setPhone(phone);
			int res = DAO.getInsert(vo2);
			if(res>0) {
				System.out.println("삽입성공!");
				list = DAO.getList();
				test.prn(list);
			}else System.out.println("삽입실패!");
			
			
			break;
		case 4:
			System.out.print("삭제할 custid를 입력하세요 >> ");
			String custid2 = sc.next();
			VO vo3 = new VO();
			vo3.setCustid(custid2);
			int res2 = DAO.getDelete(vo3);
			if(res2>0) {
				System.out.println("삭제성공!");
				list = DAO.getList();
				test.prn(list);
			}else System.out.println("삽입실패!");
			
			
			break;
		case 5:
			sc.nextLine();
			System.out.println("삽입정보를 입력하세요");
			System.out.print("custid : ");
			String custid3 = sc.nextLine();
			System.out.print("이름 : ");
			String name2 = sc.nextLine();
			System.out.print("주소 : ");
			String address2 = sc.nextLine();
			System.out.print("전화번호 : ");
			String phone2 = sc.nextLine();
			
			VO vo4 = new VO();
			vo4.setCustid(custid3);
			vo4.setName(name2);
			vo4.setAddress(address2);
			vo4.setPhone(phone2);
			
			int res3 = DAO.getUpdate(vo4);
			if(res3>0) {
				list = DAO.getList();
				test.prn(list);
			}
			
			
			break;

		default:
			System.out.println("제대로 입력하세요");
			break;
		}
	}

	// 테이블 전체보기 메서드
	public void prn(List<VO> list) {
		System.out.println("번호\t이름\t주소\t전화번호");
		for (VO k : list) {
			System.out.print(k.getCustid() + "\t");
			System.out.print(k.getName() + "\t");
			System.out.print(k.getAddress() + "\t");
			System.out.println(k.getPhone());
		}
	}

}
