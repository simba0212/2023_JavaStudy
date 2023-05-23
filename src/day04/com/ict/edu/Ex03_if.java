package day04.com.ict.edu;

public class Ex03_if {
	public static void main(String[] args) {
		// int k1이 60 이상이면 합격
		int k1 = 50;
		String res = "초기값";
		if (k1 >= 60) {
			res = "합격";
		}

		if (k1 < 60) {
			res = "불합격";
		}

		System.out.println("결과 : " + res);

		// int k2가 홀수 인지 짝수인지 판별하는 프로그램

		int k2 = 20;
		res = "짝수";
		if (k2 % 2 == 1) {
			res = "홀수";
		}
		System.out.println("결과 : " + res);

		// char k3이 대문자인지 소문자인지 판별하는 프로그램
		res = "대문자";
		char k3 = 'g';
		if ('a' <= k3 && k3 <= 'z')
			res = "소문자";
		System.out.println("결과 : " + res);

		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?

		int workTime = 10;
		int pay = 9620;
		int overPay = (int) (1.5 * pay);
		int get = pay * workTime;

		if (workTime > 8) {
			get = (8 * pay) + ((workTime - 8) * (overPay));
		}

		System.out.println("받을 돈 : " + get); // 105820

	}

}
