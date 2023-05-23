package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 계속할까요(1.yes, 2.no)일 때, Ex01_Scanner는 숫자로 받았는데
		// 문자가 들어오니 오류가 발생 된다.
		// 그래서 문자로 받아서 처리 하자
		int countAll = 0;
		int countEven = 0;
		String con = "";

		esc:

		while (true) {
			System.out.print("숫자 입력 : ");
			int num = sc.nextInt();
			String str = "";
			countAll++;
			if (num % 2 == 0) {
				str = "짝수";
				countEven++;
			} else {
				str = "홀수";
			}

			System.out.println(num + "는 " + str + " 입니다");
			while (true) {
				System.out.print("계속할까요? Y(y) / N(n)  : ");
				con = sc.next();
				if (con.equalsIgnoreCase("Y"))
					break;
				else if (con.equalsIgnoreCase("N"))
					break esc;
				else
					System.out.println("잘못 입력했습니다.");
			}
		}
		double per = (int) ((1000) * ((1.0 * countEven) / countAll)) / 10.0;
		System.out.println("전체 횟수 = " + countAll + "입니다.");
		System.out.println("짝수 횟수 = " + countEven + "입니다.");
		System.out.println("퍼센트 = " + per + "%입니다.");
		sc.close();

	}

}
