package day12.com.ict.edu;

import java.util.Scanner;

public class Ex09_main {

	public static void main(String[] args) {
		// 5명의 이름, 국어, 영어, 수학을 입력받아서
		// 이름, 총점, 평균, 학점, 순위를 구하고
		// 순위 기준으로 오름차순 정렬해서 출력 하자

		Scanner sc = new Scanner(System.in);

		Ex09_Constructor[] arr = new Ex09_Constructor[5];

		for (int i = 0; i < arr.length; i++) {
			System.out.print("이름 : ");
			String name = sc.next();
			System.out.print("국어 : ");
			int kor = sc.nextInt();
			System.out.print("영어 : ");
			int eng = sc.nextInt();
			System.out.print("수학 : ");
			int math = sc.nextInt();
			Ex09_Constructor person = new Ex09_Constructor(name, kor, eng, math);

			arr[i] = person;
		}

		// 순위구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				if (arr[i].getAvg() < arr[j].getAvg()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		// 순위로 정렬
		Ex09_Constructor temp = new Ex09_Constructor();
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.println(arr[i].getRank());
		}
		sc.close();
	}

}
