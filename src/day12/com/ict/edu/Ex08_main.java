package day12.com.ict.edu;

import java.util.Scanner;

public class Ex08_main {
	public static void main(String[] args) {
		Ex08_Constructor coffee = new Ex08_Constructor("커피음료", 1000);
		Ex08_Constructor ion = new Ex08_Constructor("이온음료", 1500);
		Ex08_Constructor cola = new Ex08_Constructor("탄산음료", 1200);
		Ex08_Constructor juice = new Ex08_Constructor("과일음료", 1800);

		Ex08_Constructor[] arr = { coffee, ion, cola, juice };

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>> ");
		int input = sc.nextInt();
		// 움료들의 최소금액을 구하자. (오름차순에서 맨 처음 최소값, 맨 끝이 최대값)
		esc:

		while (true) {
			if (input < 1000) {
				System.out.println("금액이 부족합니다.");
				System.out.println("잔돈 : " + input);
				break;
			} else {
				System.out.println("커피(1000)\t이온(1500)\t탄산(1200)\t과일(1800)\t반환");

				// 투입된 금액과 각 음료의 가격을 비교
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].getPrice() <= input) {
						System.out.print("O\t\t");
					} else {
						System.out.print("X\t\\t");
					}
				}

				System.out.println();

				System.out.print("선택하세요 >> ");
				String drink = sc.next();
				switch (drink) {
				case "커피":
					input -= coffee.getPrice();
					System.out.println("잔돈 : " + input);
					System.out.println("===================================================================================");
					break;
				case "이온":
					input -= ion.getPrice();
					System.out.println("잔돈 : " + input);
					System.out.println("===================================================================================");
					break;
				case "탄산":
					input -= cola.getPrice();
					System.out.println("잔돈 : " + input);
					System.out.println("===================================================================================");
					break;
				case "과일":
					input -= juice.getPrice();
					System.out.println("잔돈 : " + input);
					System.out.println("===================================================================================");
					break;
				case "반환":
					System.out.println("잔돈 : " + input);
					System.out.println("===================================================================================");
					break esc;
				default:
					System.out.println("잘못입력했습니다.");
					System.out.println("===================================================================================");
					break;
				}
			}

		}

	}
}
