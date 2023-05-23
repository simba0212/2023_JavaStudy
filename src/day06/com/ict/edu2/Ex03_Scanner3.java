package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex03_Scanner3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 얼마를 받아야 하는가?

		System.out.print("근무시간 : ");
		int pay = 9620;
		int overPay = (int) (pay * 1.5);
		int time = sc.nextInt();
		int overTime = time - 8;
		int get = 0;

		if (time >= 8)
			get = (8 * pay) + (overTime * overPay);
		else
			get = time * pay;

		System.out.println("받을 금액 : " + get + "원 입니다.");
		System.out.println("===================================");
		// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000,
		// 3이면 아메리카노 3000, 4이면 과일 쥬스 3500이다.
		// 친구와 함께 2잔을 10000 내고 먹었다.
		// 선택한 메뉴와 잔돈을 출력하자 (단, 부가세 10%는 포함)
		// (친구와 같은 음료을 먹어야 한다.)
		System.out.print("메뉴선택 \n1.카페모카(3500)\n2.카페라떼(4000)" + "\n3.아메리카노(3000)\n4.과일쥬스(3500)\n>>>>>>>>>  ");
		int menu = 0;
		String name = "";
		int people = 2;
		int paidMoney = 10000;
		int leftMoney = 0;
		int price = 0;
		int total = 0;

		menu = sc.nextInt();
		if (menu == 1) {
			name = "카페모카";
			price = 3500;
		} else if (menu == 2) {
			name = "카페라떼";
			price = 4000;
		} else if (menu == 3) {
			name = "아메리카노";
			price = 3000;
		} else if (menu == 4) {
			name = "과일쥬스";
			price = 3500;
		}

		total = (int) (price * people * 1.1);
		leftMoney = paidMoney - total;
		System.out.println("선택한 메뉴 : " + name);
		System.out.println("잔돈 : " + leftMoney);
		System.out.println("===================================");

		// 나라를 입력하면 수도가 출력되게 하자
		// 한국=>서울, 중국=>베이징, 일본=>도쿄, 미국=>워싱턴 , 이외에는 데이터 없음
		// (swtich~case)

		System.out.print("나라 : ");
		String country = sc.next();
		String cap = "";
		switch (country) {
		case "한국":
			cap = "서울";
			break;
		case "중국":
			cap = "베이징";
			break;
		case "일본":
			cap = "도쿄";
			break;
		case "미국":
			cap = "워싱턴";
			break;
		default:
			cap = "데이터 없음";
		}
		System.out.println(country + "의 수도 : " + cap);
		sc.close();
	}

}
