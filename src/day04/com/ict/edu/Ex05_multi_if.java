package day04.com.ict.edu;

public class Ex05_multi_if {

	public static void main(String[] args) {
		// int k1의 점수가 90이상이면 A 학점, 80이상이면 B학점, 70이상이면 C학점, 나머지 F학점

		int k1 = 80;
		String str = "";

		if (k1 >= 90)
			str = "A학점";
		else if (k1 >= 80)
			str = "B학점";
		else if (k1 >= 70)
			str = "C학점";
		else
			str = "F학점";
		System.out.println("학점    : " + str);

		// char k2가 대문자인지, 소문자인지, 숫자인지, 기타문자인지 판별하는 프로그램
		char k2 = '-';
		if ('a' <= k2 && k2 <= 'z')
			str = "소문자";
		else if ('A' <= k2 && k2 <= 'Z')
			str = "대문자";
		else if ('0' <= k2 && k2 <= '9')
			str = "숫자";
		else
			str = "기타문자";
		System.out.println("문자종류 : " + str);

		// char k3이 A,a 이면 아프리카, B,b이면 브라질, C,c 이면 캐나다, 나머지는 한국
		char k3 = 'f';
		if (k3 == 'A' || k3 == 'a')
			str = "아프리카";
		else if (k3 == 'B' || k3 == 'b')
			str = "브라질";
		else if (k3 == 'C' || k3 == 'c')
			str = "캐나다";
		else
			str = "한국";
		System.out.println("국적    : " + str);

		// menu가 1이면 카페모카 3500원, 2이면 카페라떼 4000원, 3이면 아메리카노 3000원,
		// 4이면 과일쥬스 3500원이다. 친구와 2잔을 10000원을 내고 먹었다.
		// 잔돈은 얼마인가? (부가세 10% 별도)
		
		int menu = 1; // 메뉴입력
		int people = 2; // 사람수
		int paidMoney = 10000; // 낸돈
		double vat = 1.1; // vat 10%
		
		int price = 0;
		int leftMoney = 0;
		int totalPrice = 0;

		if (menu == 1)
			price = 3500;
		else if (menu == 2)
			price = 4000;
		else if (menu == 3)
			price = 3000;
		else if (menu == 4)
			price = 3500;
		else
			price = 0;

		totalPrice = people * (int) (price * vat);
		leftMoney = paidMoney - totalPrice;

		System.out.println("잔돈    : " + leftMoney + "원");
	}

}
