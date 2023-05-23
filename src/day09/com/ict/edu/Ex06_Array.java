package day09.com.ict.edu;

import java.util.Scanner;

public class Ex06_Array {

	public static void main(String[] args) {
		// 학급 인원수 입력받기
		// 인원수 만큼 이름,국어,영어,수학점수 입력
		Scanner sc = new Scanner(System.in);
		System.out.print("학급 인원수를 입력해주세요 : ");
		int n = sc.nextInt();
		String[] name = new String[n];
		int[] kor = new int[n];
		int[] eng = new int[n];
		int[] math = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.print((i + 1) + "번 학생의     이름을 입력해주세요 : ");
			name[i] = sc.next();
			System.out.print((i + 1) + "번 학생의 국어점수를 입력해주세요 : ");
			kor[i] = sc.nextInt();
			System.out.print((i + 1) + "번 학생의 영어점수를 입력해주세요 : ");
			eng[i] = sc.nextInt();
			System.out.print((i + 1) + "번 학생의 수학점수를 입력해주세요 : ");
			math[i] = sc.nextInt();
			System.out.println("===================================");
		}

		int[] sum = new int[n];
		double[] avg = new double[n];
		String[] hak = new String[n];
		int[] rank = new int[n];

		System.out.println("이름\t평균\t학점\t순위");
		System.out.println("===========================================");
		for (int i = 0; i < n; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j) {
					continue;
				} else if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(hak[i] + "\t");
			System.out.println(rank[i] + 1);
		}
		sc.close();
	}

}
