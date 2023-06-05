package jdbc.com.ict.edu4;

import java.util.ArrayList;
import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. 테이블 전체 데이터 보기 ");
		System.out.println("2. 테이블 특정 데이터 보기 ");
		System.out.println("3. 데이터 삽입 ");
		System.out.println("4. 데이터 삭제 ");
		System.out.println("5. 데이터 수정 ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

		int menu = sc.nextInt();
		ArrayList<VO> list = null;
		switch (menu) {
		case 1:
			list = DAO.getInstance().getSelectAll();

			for (VO k : list) {
				System.out.print(k.get고객아이디() + "\t");
				System.out.print(k.get고객이름() + "\t");
				System.out.print(k.get나이() + "\t");
				System.out.print(k.get등급() + "\t");
				System.out.print(k.get직업() + "\t");
				System.out.println(k.get적립금());
			}

			break;
		case 2:
			System.out.print("고객아이디 : ");
			String c_id = sc.next();
			VO vo = DAO.getInstance().getSelectOne(c_id);
			System.out.print(vo.get고객아이디() + "\t");
			System.out.print(vo.get고객이름() + "\t");
			System.out.print(vo.get나이() + "\t");
			System.out.print(vo.get등급() + "\t");
			System.out.print(vo.get직업() + "\t");
			System.out.print(vo.get적립금() + "\t");
			break;
		case 3:
			System.out.println("삽입정보를 입력하세요");
			System.out.print("고객아이디 : ");
			vo = new VO();
			vo.set고객아이디(sc.next());
			System.out.print("이름 : ");
			vo.set고객이름(sc.next());
			System.out.print("나이 : ");
			vo.set나이(sc.next());
			System.out.print("등급 : ");
			vo.set등급(sc.next());
			System.out.print("직업 : ");
			vo.set직업(sc.next());
			System.out.print("적립금 : ");
			vo.set적립금(sc.next());

			int res = DAO.getInstance().getInsert(vo);
			if (res > 0) {
				list = DAO.getInstance().getSelectAll();
				for (VO k : list) {
					System.out.print(k.get고객아이디() + "\t");
					System.out.print(k.get고객이름() + "\t");
					System.out.print(k.get나이() + "\t");
					System.out.print(k.get등급() + "\t");
					System.out.print(k.get직업() + "\t");
					System.out.println(k.get적립금());
				}

			} else {
				System.out.println("삽입 실패");
			}
			break;
		case 4:
			System.out.print("삭제할 고객 아이디 : ");
			c_id = sc.next();
			vo = DAO.getInstance().getDelete(c_id);
			list = DAO.getInstance().getSelectAll();

			for (VO k : list) {
				System.out.print(k.get고객아이디() + "\t");
				System.out.print(k.get고객이름() + "\t");
				System.out.print(k.get나이() + "\t");
				System.out.print(k.get등급() + "\t");
				System.out.print(k.get직업() + "\t");
				System.out.println(k.get적립금());
			}
			break;
		case 5:
			vo = new VO();
			System.out.print("수정할 고객 아이디 : ");
			vo.set고객아이디(sc.next());
			System.out.println("삽입정보를 입력하세요");
			System.out.print("이름 : ");
			vo.set고객이름(sc.next());
			System.out.print("나이 : ");
			vo.set나이(sc.next());
			System.out.print("등급 : ");
			vo.set등급(sc.next());
			System.out.print("직업 : ");
			vo.set직업(sc.next());
			System.out.print("적립금 : ");
			vo.set적립금(sc.next());
			res = DAO.getInstance().getUpdate(vo);
			if (res > 0) {
				list = DAO.getInstance().getSelectAll();
				for (VO k : list) {
					System.out.print(k.get고객아이디() + "\t");
					System.out.print(k.get고객이름() + "\t");
					System.out.print(k.get나이() + "\t");
					System.out.print(k.get등급() + "\t");
					System.out.print(k.get직업() + "\t");
					System.out.println(k.get적립금());
				}
			} else {
				System.out.println("업데이트 실패");
			}

			break;

		default:
			break;
		}
	}
}
