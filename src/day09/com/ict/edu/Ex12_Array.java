package day09.com.ict.edu;

import java.util.Scanner;

public class Ex12_Array {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// 학생 수 입력받기
		System.out.print("학생수를 입력하세요 : ");
		int n = sc.nextInt();
		double[][] arr = new double[n][8];
		// 번호, 국어, 영어, 수학 입력받기
		for (int i = 0; i < n; i++) {
			double[] p = new double[8];

			System.out.print("학생번호를 입력하세요 : ");
			p[0] = sc.nextInt();
			System.out.print("국어점수를 입력하세요 : ");
			p[1] = sc.nextInt();
			System.out.print("영어점수를 입력하세요 : ");
			p[2] = sc.nextInt();
			System.out.print("수학점수를 입력하세요 : ");
			p[3] = sc.nextInt();
			arr[i] = p;
			System.out.println("======================================================");
		}

		// 총점, 평균, 학점, 순위(초기값지정)
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < 4; j++) {
				arr[i][4] += arr[i][j];
			}
			arr[i][5] = arr[i][4] / 3;
			if (arr[i][5] >= 90) {
				arr[i][6] = 'A';
			} else if (arr[i][5] >= 80) {
				arr[i][6] = 'B';
			} else if (arr[i][5] >= 70) {
				arr[i][6] = 'C';
			} else {
				arr[i][6] = 'F';
			}
			arr[i][7] = 1;
		}
		// 순위 구하기
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				} else if (arr[i][4] < arr[j][4]) {
					arr[i][7]++;
				}
			}
		}
		// 오름차순 정렬
		double[] temp = new double[8];
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i][7] > arr[j][7]) { // 순위가 낮으면 앞으로 보낸다.
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("======================================================");

		// 출력
		System.out.println("번호\t총점\t평균\t학점\t순위");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < 8; j++) {
				if (j == 1 || j == 2 || j == 3) {
					continue;
				} else if (j == 5) {
					System.out.printf("%.1f\t", arr[i][j]);
				} else if (j == 6) {
					System.out.print((char) arr[i][j] + "\t");
				} else
					System.out.print((int) arr[i][j] + "\t");
			}
			System.out.println();
		}

		sc.close();
	}

}
