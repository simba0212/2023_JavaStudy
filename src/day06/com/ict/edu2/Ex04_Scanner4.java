package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Scanner4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 반복 횟수 : ");
		int count = sc.nextInt();

		System.out.print("원하는 단어 : ");
		String str = sc.next();
//
//		for (int i = 0; i < count; i++) {
//			System.out.println(str);
//		}
		int i = 0;
		while (i < count) {
			System.out.println(str);
			i++;
		}
		sc.close();
	}
}
