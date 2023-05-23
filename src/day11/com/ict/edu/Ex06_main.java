package day11.com.ict.edu;

import java.util.Scanner;

public class Ex06_main {

	public static void main(String[] args) {
		// 스캐너로 입력받기
		Scanner sc = new Scanner(System.in);
		// 5명의 이름, 국어, 영어, 수학을 입력 받아서
		Ex06_method obj = new Ex06_method();
		// 이름, 총점, 평균, 학점을 구하고 출력
		// 입력받기
		for (int i = 0; i < 5; i++) {
			System.out.print((i + 1) + "번 학생의    이름을 입력하세요 : ");
			obj.name[i] = sc.next();
			System.out.print((i + 1) + "번 학생의 국어점수를 입력하세요 : ");
			obj.kor[i] = sc.nextInt();
			System.out.print((i + 1) + "번 학생의 영어점수를 입력하세요 : ");
			obj.eng[i] = sc.nextInt();
			System.out.print((i + 1) + "번 학생의 수학점수를 입력하세요 : ");
			obj.math[i] = sc.nextInt();
		}
		String[] name = obj.name;
		// 총점 구하기
		int[] total = obj.getTotal();
		// 평균 구하기
		double[] avg = obj.getAvg();
		// 학점 구하기
		String[] grade = obj.getGrade();
		// 출력하기
		System.out.println("이름\t총점\t평균\t학점");
		for (int i = 0; i < 5; i++) {
			System.out.println(name[i] + "\t" + total[i] + "\t" + avg[i] + "\t" + grade[i]);
		}
	}

}
