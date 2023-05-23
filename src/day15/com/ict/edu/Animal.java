package day15.com.ict.edu;

public class Animal {
	// final 변수 = 상수 = 데이터변경 방지
	int eyes = 2;
	String color = "gray";

	public void sound() {
		System.out.println("울음소리");
	}

	public void hobby() {
		System.out.println("좋아하는 행동");
	}

	public final void sleep() {
		System.out.println("8시간 이상 잠을 잔다.");
	}
	
}
