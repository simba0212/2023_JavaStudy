package jdbc.com.ict.edu3;

import java.util.Scanner;

public class TestMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("선택하세요");
		System.out.println("1. 테이블 전체 데이터 보기 ");
		System.out.println("2. 테이블 특정 데이터 보기 ");
		System.out.println("3. 테이블 데이터 삽입 ");
		System.out.println("4. 테이블 데이터 삭제 ");
		System.out.println("5. 테이블 데이터 수정 ");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>");

		int menu = sc.nextInt();
		switch (menu) {
		case 1:
			DAO.getInstance().getSelectAll();
			break;
		case 2:
			System.out.print("고객아이디 : ");
			String c_id = sc.next();
			DAO.getInstance().getSelectOne(c_id);
			break;
		case 3:
			System.out.println("삽입정보를 입력하세요");
			System.out.print("고객아이디 : ");
			c_id = sc.next();
			System.out.print("이름 : ");
			String c_name = sc.next();
			System.out.print("나이 : ");
			String c_age = sc.next();
			System.out.print("등급 : ");
			String c_grade = sc.next();
			System.out.print("직업 : ");
			String c_job = sc.next();
			System.out.print("적립금 : ");
			String c_point = sc.next();

			DAO.getInstance().getInsert(c_id, c_name, c_age, c_grade, c_job, c_point);
			break;
		case 4:
			System.out.print("삭제할 고객 아이디 : ");
			c_id = sc.next();
			DAO.getInstance().getDelete(c_id);
			break;
		case 5:
			System.out.print("수정할 고객 아이디 : ");
			System.out.print("고객아이디 : ");
			c_id = sc.next();
			System.out.println("삽입정보를 입력하세요");
			System.out.print("이름 : ");
			c_name = sc.next();
			System.out.print("나이 : ");
			c_age = sc.next();
			System.out.print("등급 : ");
			c_grade = sc.next();
			System.out.print("직업 : ");
			c_job = sc.next();
			System.out.print("적립금 : ");
			c_point = sc.next();
			DAO.getInstance().getUpdate(c_id,c_name,c_age,c_grade,c_job,c_point);
			break;

		default:
			break;
		}
	}
}
