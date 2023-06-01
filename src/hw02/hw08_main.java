package hw02;

import java.util.Random;
import java.util.Scanner;

public class hw08_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		String com = "";
		String input = "";
		System.out.println("☆★☆★☆★가위바위보 게임을 시작합니다★☆★☆★☆");
		int vic = 0;
		int def = 0;
		int draw = 0;
		int vicR = 0;
		String con = "";
		esc: while (true) {
			int num = rnd.nextInt(3);
			while (true) {
				System.out.print("(가위 / 바위 / 보) 중 하나를 입력하세요 : ");
				input = sc.next();
				if (input.equals("가위") || input.equals("바위") || input.equals("보")) {
					switch (num) {
					case 0:
						com = "가위";
						break;
					case 1:
						com = "바위";
						break;
					case 2:
						com = "보";
						break;
					}
					break;
				} else
					System.out.print("잘못입력했습니다.\t");
			}
			System.out.println("============================================");
			System.out.println("컴퓨터가 낸 것\t: " + com + "\n내가 낸것\t\t: " + input);
			System.out.println("============================================");
			if (com.equals(input)) {
				System.out.print("비겼습니다.");
				draw++;
			} else if (com == "가위") {
				switch (input) {
				case "보":
					System.out.print("졌습니다.");
					def++;
					break;
				case "바위":
					System.out.print("이겼습니다.");
					vic++;
					break;
				}
			} else if (com == "바위") {
				switch (input) {
				case "가위":
					System.out.print("졌습니다.");
					def++;
					break;
				case "보":
					System.out.print("이겼습니다.");
					vic++;
					break;
				}
			} else if (com == "보") {
				switch (input) {
				case "바위":
					System.out.print("졌습니다.");
					def++;
					break;
				case "가위":
					System.out.print("이겼습니다.");
					vic++;
					break;
				}
			}
			System.out.println("\t현재 스코어 : " + vic + "승 " + draw + "무 " + def + "패");
			while (true) {
				System.out.println();
				System.out.print("계속할까요? (y/n) >> ");
				con = (sc.next()).toLowerCase();
				if (con.equals("y")) {
					System.out.println("====================" + (vic + def + draw + 1) + "차전====================");
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
		System.out.println(vic + "승 " + draw + "무 " + def + "패");
		System.out.println("승률 : " + vicR + "%");
		System.out.println("============================================");
		sc.close();
	}
}
