package hw02;

import java.util.Random;
import java.util.Scanner;

public class hw10_Baseball {

	public static void main(String[] args) {
		Random rnd = new Random();
		Scanner sc = new Scanner(System.in);
		String inputS = "";
		String[] inputA = new String[3];
		int strike = 0;
		int ball = 0;
		int count = 0;
		boolean out = true;
		int[] ansA = new int[3];
		String con = "";
		
		while (true) {
			int ans = 100 + rnd.nextInt(899); // 100~999까지 랜덤수를 ans
			ansA[0] = ans / 100; // 100의 자리
			ansA[1] = ans % 100 / 10; // 1의 자리
			ansA[2] = ans % 10; // 1의 자리

			if (ansA[0] == ansA[1] || ansA[0] == ansA[2] || ansA[1] == ansA[2])
				continue;
			else
				break;
		}
		// 정답 입력 완료
		System.out.println("※※※※※※※※※야구게임을 시작합니다※※※※※※※※※");
		esc: while (true) {
			strike = 0;
			ball = 0;
			System.out.print("세 자리 수를 입력해주세요 : ");
			inputS = sc.next();
			inputA = inputS.split(",");
			int[] input = new int[3];
			for (int i = 0; i < 3; i++) {
				input[i] = Integer.parseInt(inputA[i]);
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (input[i] == ansA[j]) {
						if (i == j) {
							strike++;
						} else {
							ball++;
						}
					}
				}
			}
			if (strike + ball == 0) {
				out = true;
				System.out.println("아웃입니다! 다틀림");
			} else {
				out = false;
			}
			if (!out) {
				System.out.println(strike + " Strike");
				System.out.println(ball + " Ball");
				if (strike == 3) {
					System.out.println("정답입니다. 총" + (count + 1) + "번 만에 맞추셨습니다.");
					break esc;
				}
			}
			System.out.println("=================================");
			count++;
			while (true) {
				if (count > 9) {
					System.out.print("계속할까요?(y/n)");
					con = sc.next();
					if (con.toLowerCase().equals("y") ) {
						break;
					} else if (con.toLowerCase().equals("n")) {
						System.out.println("게임을 종료합니다.");
						break esc;
					} else {
						System.out.println("잘못입력했습니다.");
						continue;
					}
				} else
					break;
			}
		}
		sc.close();
	}
}
