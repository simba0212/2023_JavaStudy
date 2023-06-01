package hw02;

import java.util.Scanner;

public class hw06_Scanner {
	public static void main(String[] args) {
//		원하는 회수를 입력 받고 
//		숫자를 입력 받아서 
//		입력 받은 숫자가 홀수 인지, 짝수인지 판별하는 코딩
//
//		이름, 국어, 영어, 수학를 입력 받아서 
//		총점, 평균, 학점을 구하고 
//		이름, 총점, 평균, 학점을 출력하는 코딩 
//		(평균은 소숫점 첫째자리까지 구하자)
//
//
//		첫번째 숫자 받기
//		두번째 숫자 받기
//		연산자 받기("1 => + 2 => -  3 => *  4 =>  / >>>>   ")

		Scanner sc = new Scanner(System.in);

		System.out.print("원하는 회수를 입력하세요 : ");
		int count = sc.nextInt();
		System.out.print("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		for (int i = 0; i < count; i++) {
			if (num % 2 == 0)
				System.out.println(num + "은 짝수입니다.");
			else
				System.out.println(num + "은 홀수입니다.");
		}
		System.out.println("==========================");

		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		System.out.print("수학 : ");
		int math = sc.nextInt();

		int total = kor + eng + math;
		double avg = (int) (total / 3.0 * 10) / 10.0;
		char grade;

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';
		System.out.println("==========================");
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		System.out.println("학점 : " + grade);
		System.out.println("==========================");

		char oper = 'a';
		double res = 0;
		System.out.print("첫 번째 숫자 입력 : ");
		int num1 = sc.nextInt();
		System.out.print("두 번째 숫자 입력 : ");
		int num2 = sc.nextInt();
		System.out.print("연산자 숫자 입력  : ");
		int operInt = sc.nextInt();
		System.out.println("==========================");
		switch (operInt) {
		case 1:
			oper = '+';
			res = num1 + num2;
			break;
		case 2:
			oper = '-';
			res = num1 - num2;
			break;
		case 3:
			oper = '*';
			res = num1 * num2;
			break;
		case 4:
			oper = '/';
			res = num1 / (num2 * 1.0);
			break;
		default:
			break;
		}
		System.out.println(num1 + " " + oper + " " + num2 + " = " + res);
		sc.close();
	}
}
