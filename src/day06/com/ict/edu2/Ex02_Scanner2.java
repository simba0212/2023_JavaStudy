package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex02_Scanner2 {

	public static void main(String[] args) {
		// 키보드 입력정보를 받아서 일을 처리하자
		Scanner sc = new Scanner(System.in);

		// 키보드에서 받은 숫자가 홀수, 짝수인지 판별해라
		System.out.print("숫자입력 : ");
		int num1 = sc.nextInt();
		String str = "";

		if (num1 % 2 == 0)
			str = "짝수";
		else
			str = "홀수";

		System.out.println(num1 + "은 " + str + "입니다");

		// 60이상이면 합격, 아니면 불합격
		System.out.print("총점 입력 : ");
		int total = sc.nextInt();

		if (total >= 60)
			str = "합격";
		else
			str = "불합격";

		System.out.println("당신의 점수는 " + total + "이고 " + str + "입니다.");
		sc.close();
	}

}
