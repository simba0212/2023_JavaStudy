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
		case 1: DAO.getInstance().getSelectAll();	break;
		case 2: 	break;
		case 3: 	break;
		case 4: 	break;
		case 5: 	break;

		default:
			break;
		}
	}
}
