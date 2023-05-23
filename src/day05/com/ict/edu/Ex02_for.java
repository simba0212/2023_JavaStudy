package day05.com.ict.edu;

public class Ex02_for {
	public static void main(String[] args) {
		// for문 : 정해진 규칙에 따라 실행문을 반복 처리하는 문법
		// 형식) for(초기식; 조건식; 증감식){
		// 조건식이 참일때 실행할 문장 ;
		// 조건식이 참일때 실행할 문장 ;
		// 조건식이 참일때 실행할 문장 ;
		// 조건식이 참일때 실행할 문장 ;
		// }
		// ** for문을 만나면 무조건 초기식으로 이동
		// 초기식은 조건식으로 이동
		// 조건식이 참이면 for문 실행, 거짓이면 for문을 실행하지 않는다.
		// for문의 끝을 만나면 무조건 증감식으로 간다.

		// {} 에서 만들어진 변수는 {}밖을 벗어나면 사라진다.(지역변수, lv)

		// 안녕하세요를 열번 출력하기.
		for (int i = 1; i < 11; i++) {
			System.out.println(i + " = 안녕하세요");
		}
		System.out.println("=====================");

		// 0~10까지 출력
		for (int i = 0; i < 11; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n=====================");

		// 0~10까지 짝수만 출력
		for (int i = 2; i < 11; i = i + 2) {
			System.out.print(i + " ");
		}
		System.out.println("\n=====================");

		for (int i = 0; i < 11; i++) {
			if (i % 2 == 1) {
				System.out.print(i + " ");
			}
		}
		System.out.println("\n=====================");

		// 구구단 중 7단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("7 * " + i + " = " + 7 * i);
		}
		System.out.println("=====================");

		// 1-10 누적합 ( 합계 구하기 )
		// 이전저장변수 = 0
		// 누적합 : 이전저장변수 = 이전저장변수 + 현재값 ;

		// 이전저장변수 = 1
		// 누적합 : 이전저장변수 = 이전저장변수 * 현재값 ;

		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("누적합 : " + sum);

		// 짝수의 누적합
		int even = 0;
		for (int i = 2; i < 11; i += 2) {
			even += i;
		}
		System.out.println("짝수의 누적합 : " + even);

		// 7! 구하기

		int fac = 1;
		int num = 7;
		for (int i = 1; i < num+1; i++) {
			fac = fac * i;
		}
		System.out.println("7! : " + fac);
		
		// 1+(-2)+3+(-4)+(5)+(-6)+7+(-8)+9+(-10)
		// FOR문을 이용한 누적합
		sum = 0;
		for(int i=1;i<11;i++) {
			if(i%2==1) sum+=i;
			else sum-=i;
		}
		System.out.println(sum);
		

	}
}
