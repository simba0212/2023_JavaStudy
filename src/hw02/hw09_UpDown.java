package hw02;

import java.util.Random;
import java.util.Scanner;

public class hw09_UpDown {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		int vic = 0;
		int def = 0;
		int vicR = 0;
		String con = "";

		esc: while (true) {
			int comNum = rnd.nextBoolean() ? 1 : 2;
			int input = 0;
			String ans = comNum == 1 ? "높음" : "낮음";
			System.out.println("★☆★☆★☆★☆★☆업/다운 게임을 시작합니다★☆★☆★☆★☆");
			System.out.println("숫자를 입력하세요 : 1. 높음 2. 낮음");
			System.out.print(">>>>>>>>>>>>>> ");
			input = sc.nextInt();
			if (input == 1) {
				if (input == comNum) {
					vic++;
				} else
					def++;
				System.out.println("'높음'을 선택하셨습니다.\n정답은 " + ans + "입니다.");
			} else if (input == 2) {
				if (input == comNum) {
					vic++;
				} else
					def++;
				System.out.println("'낮음'을 선택하셨습니다.\n정답은 " + ans + "입니다.");
			} else {
				System.out.println("잘못입력했습니다.");
			}
			while (true) {
				System.out.println();
				System.out.print("계속할까요? (y/n) >> ");
				con = (sc.next()).toLowerCase();
				if (con.equals("y")) {
					System.out.println("====================" + (vic + def + 1) + "차전====================");
					continue esc;
				} else if (con.equals("n")) {
					System.out.println("게임을 종료합니다.");
					break esc;
				} else
					System.out.print("잘못입력했습니다.\t");
			}

		}
		vicR = (vic * 100 / (vic + def));
		System.out.println("===================최종결과===================");
		System.out.println(vic + "승 " + def + "패");
		System.out.println("승률 : " + vicR + "%");
		System.out.println("============================================");
		sc.close();
	}
}
