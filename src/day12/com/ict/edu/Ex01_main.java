package day12.com.ict.edu;

import java.util.Scanner;

public class Ex01_main {

	public static void main(String[] args) {
		Ex01_mathod coffee = new Ex01_mathod();
		coffee.name = "커피음료";
		coffee.price = 1000;

		Ex01_mathod ion = new Ex01_mathod();
		coffee.name = "이온음료";
		coffee.price = 1500;

		Ex01_mathod cola = new Ex01_mathod();
		coffee.name = "탄산음료";
		coffee.price = 1200;

		Ex01_mathod juice = new Ex01_mathod();
		coffee.name = "과일음료";
		coffee.price = 1800;

		Ex01_mathod[] arr = { coffee, ion, cola, juice };

		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 투입하세요 >>>");
		int input = sc.nextInt();

		// 움료들의 최소금액을 구하자. (오름차순에서 맨 처음 최소값, 맨 끝이 최대값)

		if (input < 1000) {
			System.out.println("금액이 부족합니다.");
			System.out.println("잔돈 : " + input);
		}
		else {
			System.out.println("커피\t이온\t탄산\t과일");
			
			// 투입된 금액과 각 음료의 가격을 비교
			for (int i = 0; i < arr.length; i++) {
				if(arr[i].price>=input) {
					System.out.print("O\t");
				}
				else {
					System.out.println("X\t");
				}
			}
		}
	}

}
