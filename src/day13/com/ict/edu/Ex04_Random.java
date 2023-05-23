package day13.com.ict.edu;

import java.util.Random;

public class Ex04_Random {
	public static void main(String[] args) {
		// 난수를 발생하는 방법
		// Math.random(), Random 클래스

		// 1. Random 클래스
		Random rnd = new Random();

		// 각종 지본자료형의 난수 발생 : 자료형 범위 안에서 난수 발생
		System.out.println("boolean형 : " + rnd.nextBoolean());
		System.out.println("int형 : " + rnd.nextInt());
		System.out.println("long형 : " + rnd.nextLong());

		// double은 0.0 ~ 1.0 에서 난수 발생.(1보다 작음)
		System.out.println("double형 : " + rnd.nextDouble());

		// 특정 범위를 지정하여 난수 발생시키는 방법
		// 1. nextInt(n) : 0 ~ n-1 의 정수
		System.out.println("int(범위) : " + rnd.nextInt(5));

		// 2. (int)(nextDouble()*범위) : 0 ~ 범위 전까지 난수 발생 (정수)
		System.out.println((int) (rnd.nextDouble() * 5));
		System.out
				.println("===========================================================================================");

		// Math 클래스 : 전체메소드가 static, 객체 생성없이 호출가능
		// 1) random();
		System.out.println("Math.random() : " + Math.random());

		// 특정범위 지정가능
		System.out.println("Math.random(0~4) : " + (int) (Math.random() * 5));

		// 올림, 버림, 반올림
		System.out.println("올림 : " + Math.ceil(3.45));
		System.out.println("올림 : " + Math.ceil(3.55));

		System.out.println("반올림 : " + Math.round(3.45));
		System.out.println("반올림 : " + Math.round(3.55));

		System.out.println("버림 : " + Math.floor(3.45));
		System.out.println("버림 : " + Math.floor(3.45));
	}
}