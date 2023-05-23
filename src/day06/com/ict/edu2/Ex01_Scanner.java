package day06.com.ict.edu2;

import java.util.Scanner;

public class Ex01_Scanner {

	public static void main(String[] args) {
		// Scanner 클래스
		// System.out => 표준 출력장치 (모니터)
		// System.in => 표준 입력장치 (키보드)
		// 회사에서 제공하는 클래스를 사용하기 위해서 import를 해야된다.
		// 해당 클래스 커서를 뒤에 놓고 shift + f2 => 해당 클래스 API 설명서가 나타난다.
		
		Scanner sc = new Scanner(System.in);

		System.out.print("이름 : ");
		// .next() : 입력한 내용을 String 으로 처리하는 메서드
		String name = sc.next();
		System.out.println("받은 내용 : " + name);

		// 숫자를 입력하고 싶으면 다른 메소드를 사용해야한다.
		System.out.print("나이 : ");
		String age = sc.next();
		System.out.println("받은 내용 : " + (age + 1));

		// 숫자를 입력받는 Scanner의 메소드 nextInt()
		System.out.print("나이 : ");
		int age2 = sc.nextInt();
		System.out.println("받은 내용 : " + (age2 + 1));

		System.out.print("키 : ");
		// .nextDouble() : 입력한 내용을 double타입으로 처리하는 메서드
		double h = sc.nextDouble();
		System.out.println("받은 내용 : " + h);
		
		System.out.print("당신은 남성입니까? (true/false)");
		// .nextBoolean() : 입력한 내용을 boolean타입으로 처리하는 메서드
		boolean gender = sc.nextBoolean();
		if(gender) System.out.println("당신은 남성입니다.");
		else System.out.println("당신은 여성입니다.");
		
		sc.close();
	}

}
