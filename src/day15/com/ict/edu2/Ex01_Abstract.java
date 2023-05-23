package day15.com.ict.edu2;

public abstract class Ex01_Abstract {
	// 추상메서드와 추상클래스
	
	// 추상메서드 : body(몸통=블록={ }를 가지고 있지 않은 메서드
	// 구체적인 실행 내용이 없음
	// 반드시 abstract 예약어를 붙여야 한다.
	
	// 추상클래스 : 일반클래스가 가지는 멤버필드, 멤버메서드, 생성자를 가질 수 있다.
	// 하나이상의 추상메서드를 가지고 있는 클래스를 말한다.

	String name = "홍길동";
	
	
	// 일반 메서드
	public void play() {
		System.out.println("놀자");
	}

	public String sound() {
		return "6시간 이상 잠자기";
	}
	
	// 추상메서드
	public abstract void hobby();
		
	
}
