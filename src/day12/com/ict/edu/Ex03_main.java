package day12.com.ict.edu;

import java.util.Scanner;

public class Ex03_main {

	public static void main(String[] args) {
		Ex03_get_set coffee = new Ex03_get_set();

		Ex03_get_set ion = new Ex03_get_set();
		ion.setName("이온음료");
		ion.setPrice(1500);

		Ex03_get_set cola = new Ex03_get_set();
		cola.setName("탄산음료");
		cola.setPrice(1200);

		Ex03_get_set juice = new Ex03_get_set();
		juice.setName("과일음료");
		juice.setPrice(1800);

		Ex03_get_set[] arr = { coffee, ion, cola, juice };

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
				if(arr[i].getPrice()>=input) {
					System.out.print("O\t");
				}
				else {
					System.out.print("X\t");
				}
			}
			
			System.out.println();
			System.out.print("선택하세요 >> ");
			String drink = sc.next();
			int ouput = 0;
		}
	}

}
