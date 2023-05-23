package day16.com.ict.edu;

import java.util.Arrays;

public class Ex01_enum {
	// 열거형(enum) : 상수를 하나의 객체로 인식하고, 여러 개의 상수 객체들을 한곳에 모아둔 하나의 묶음

	int su = 12;
	static final int JAVA = 200;
	static final int HTML = 300;

	public void play() {
		// 지역변수는 static을 사용할 수 없다.
		// static final int CSS = 500;

	}

	public enum Lesson {
		JAVA, JSP, SPRING, ANDROID, HTML
	}

	public static void main(String[] args) {
		int num = 100;

		// 지역에서는 static을 사용할 수 없다.
		// static final int JSP = 400;

		// static 메서드에서는 전역변수 사용 불가
		// System.out.println(su);
		System.out.println(num);
		System.out.println(JAVA);
		System.out.println(HTML);

		// 열거형 내부의 값을 가져와보자
		Lesson[] items = Lesson.values();
		for (int i = 0; i < items.length; i++) {
			System.out.println(items[i] + " : " + items[i].ordinal());
		}

	}
}
