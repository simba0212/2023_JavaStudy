package day14.com.ict.edu;

// 자식클래스에서 부모클래스를 선택해서 상속관계를 맺는다.
// 상속관계 : 자식클래스가 부모크래스의 멤버필드와 멤버메서드를
// 마음대로 사용 할 수 있는 클래스간의 관계
// 형식 : [subClass] extends [superClass]
// 특징 : 모든 클래스는 하나의 부모클래스를 갖는다.
// 부모클래스가 없으면 Object를 상속받는다.
// 다중상속은 불가능하다.
// 다이어그램에서는 자식클래스 부모클래스 
public class Ex03_Sub extends Ex03_Super {
	String name = "홍반장";
	int age = 13;
	double weight = 78.9;
	private String cat = "야옹이";

	static String computer = "10세대";

	public Ex03_Sub() {
		System.out.println("자식클래스 생성자 : " + this);
	}

	public void play() {
		String name = "홍두께";
		// 변수 우선 순위
		// 지역변수 > 전역변수(this) > 부모클래스변수(super)
		System.out.println(name); // 홍두께
		System.out.println(this.name); // 홍반장
		System.out.println(super.name); // 홍길동

		// 지역변수가 없고, 전역변수/부모클래스에게만 있으면
		System.out.println(weight);
		System.out.println(this.weight);

		// 셋다 가능하지만 super쓰는게 가독성up
		System.out.println(addr);
		System.out.println(this.addr);
		System.out.println(super.addr);

		// private 변수는 같은클래스 내에서만 가능하다.
		System.out.println(cat);
		// 상속관계여도 private는 안됨
//		System.out.println(dog);
//		System.out.println(super.dog);

		// static인 경우
		System.out.println(computer);
		System.out.println(this.computer);
		System.out.println(Ex03_Sub.computer);
		System.out.println(Ex03_Sub.playStation);
		
		
		System.out.println(playStation);
		System.out.println(this.playStation);
		System.out.println(super.playStation);
		System.out.println(Ex03_Super.playStation);

	}
}
