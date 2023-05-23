package day16.com.ict.edu;

public class Ex07_Static {
	String name = "홍길동";
	private int age = 24;
	static boolean gender = true;

	public Ex07_Static() {
		System.out.println("외부 생성자 : " + this);
	}

	public void play() {
		int money = 1010;
		System.out.println("외부 메서드 : " + money);
		System.out.println("외부 메서드 : " + name);
	}

	// 내부클래스를 만들어보자
	public static class Inner01 {
		String addr = "서울 마포구";
		int roomNumber = 1;
		static int count = 30;

		public Inner01() {
			System.out.println("내부 생성자 : " + this);
		}

		public void prn() {
			System.out.println(addr);
			System.out.println(roomNumber);
			// 외부클래스의 멤버도 마음대로 사용가능(private도 사용가능)
//			System.out.println(name);
//			System.out.println(age);
			System.out.println(gender);

			// 외부클래스의 메서드도 사용가능
//			play();
		}
	}
}
