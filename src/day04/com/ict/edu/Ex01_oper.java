package day04.com.ict.edu;

public class Ex01_oper {

	public static void main(String[] args) {
		// 삼항 연산자 : 조건식 => 조건이 참 일때와 거짓 일때를 구분해서 실행한다.
		// 형식) 자료형 변수이름 = (조건식) ? (조건식이 참일때 실행할 문장) : (조건식이 거짓일때 실행할 문장);
		// **주의사항) 변수, 참일때 실행 결과, 거짓일때 실행 결과 모두 같은 자료형이어야 한다.
		// 조건식에는 boolean 값이 오도록 해야한다. 비교연산자 혹은 논리연산자.

		String str = (true) ? "강아지" : "고양이";
		System.out.println("결과 : " + str);

		// int avg = 80;
		double avg = 55.3;
		str = (avg >= 60) ? "합격" : "불합격";
		System.out.println("결과 : " + str);

		// 소문자인지 판별하는 조건문
		char c1 = 'g';
		str = (c1 >= 'a' && c1 <= 'z') ? "소문자" : "소문자 아님";
		System.out.println("결과 : " + str);

		// 1 또는 3 이면 남자, 아니면 여자
		int gender = 1;
		str = (gender == 1 || gender == 3) ? "남자" : "여자";
		System.out.println("결과 : " + str);

		// 홀수이면 남자, 짝수이면 여자
		gender = 4;
		str = (gender % 2 == 1) ? "남자" : "여자";
		System.out.println("결과 : " + str);

		// 3의 배수인지 확인하는 프로그램
		int su1 = 157;
		str = su1 % 3 == 0 ? "3의 배수입니다." : "3의 배수가 아닙니다.";
		System.out.println(su1 + "은 " + str);

		// 아르바이트 일급계산
		int time = 10; // 근무시간
		int pay = 9620; // 기본시급
		int overTime = time - 8; // 초과근무시간
		int get = 0; // 받을 돈을 출력받을 변수

		get = (time > 8) ? (8 * pay) + (int) (1.5 * pay * overTime) : (time * pay);
		System.out.println("받아야 할 돈 : " + get);

		// 두 수 중 큰 수를 뽑는 프로그램
		int num1 = 47;
		int num2 = 32;
		int res = (num1 > num2) ? num1 : num2;
		System.out.println("큰 값 : " + res);

		int res2 = Math.max(num1, num2);
		System.out.println("큰 값 : " + res2);

		// 절대값 구하기
		int num3 = -38;
		int res3 = num3 > 0 ? num3 : -num3;
		System.out.println("절대값 : " + res3);

		res3 = Math.abs(num3);
		System.out.println("절대값 : " + res3);

	}

}