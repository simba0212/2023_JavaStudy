package day15.com.ict.edu2;

// 추상클래스를 상속했을 때 처리 방법
// 1. 부모클래스의 추상 메서드를 오버라이딩 하면서 내용을 '구체화'시킨다.
public class Ex02_Extends extends Ex01_Abstract{
	@Override
	public void hobby() {
		System.out.println("게임하기");
		
	}
}
