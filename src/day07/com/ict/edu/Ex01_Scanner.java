package day07.com.ict.edu;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 전체횟수, 짝수횟수, 짝수가 나온 퍼센트 구하기 (소수점 첫째 자리까지구하자)
		int countAll = 0;
		int countEven = 0;
		int con = 0;

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
				str = "짝수";
			}

			System.out.println(num + "는 " + str + " 입니다");
			while (true) {
				System.out.print("계속할까요?(1.Yes / 2.No) : ");
				con = sc.nextInt();
				if (con == 1)
					break;
				else if (con == 2)
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
