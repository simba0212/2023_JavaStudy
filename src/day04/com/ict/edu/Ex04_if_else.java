package day04.com.ict.edu;

public class Ex04_if_else {

	public static void main(String[] args) {
		// k1이 60 이상이면 합격 아니면 불합격인 프로그램
		int k1 = 79;
		String str = "";

		if (k1 >= 60)
			str = "합격";
		else
			str = "불합격";
		System.out.println("결과 : " + str);

		// k2가 홀수, 짝수인지 판별하는 프로그램
		int k2 = 49;
		if (k2 % 2 == 0)
			str = "짝수";
		else
			str = "홀수";

		System.out.println("결과 : " + str);

		// k3가 대문자인지, 대문자가 아닌지 판별하는프로그램
		char k3 = 'G';
		if ('A' <= k3 && k3 <= 'Z')
			str = "대문자";
		else
			str = "대문자 아님";

		System.out.println("결과 : " + str);

		// 근무시간이 8시간까지는 시간당 9620이고
		// 8시간을 초과한 시간 만큼은 1.5배 지급한다.
		// 현재 근무한 시간이 10이다.
		// 얼마를 받아야 하는가?
		
		int workTime = 10;
		int pay = 9620;
		int overPay = (int) (1.5 * pay);
		int get = 0;

		if (workTime > 8)
			get = (8 * pay) + ((workTime - 8) * (overPay));
		else
			get = pay * workTime;

		System.out.println("받을 돈 : " + get); // 105820
		
		
		
	}

}
