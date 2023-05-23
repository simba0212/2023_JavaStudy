package day14.com.ict.edu5;

public class Ex01_main {
	public static void main(String[] args) {
		// 오버로딩(중복정의) : 한 클래스 안에서 같은 이름의 메소드가 여러개 있는것
		// (인자의 자료형이나 개수가 달라야 한다.)
		// 오버라이딩(재정의) : 상속관계에서 부모클래스의 메소드와 자식클래스의 메소드의 이름이 같은 것
		// 자식클래스가 부모클래스의 메소드를 가지고 와서 다른명령을 수행하는것

		Ex01_Sub test = new Ex01_Sub();
		test.sound();
		test.like();
		test.hobby();
		System.out.println(test.weight);
		
		
	}
}
