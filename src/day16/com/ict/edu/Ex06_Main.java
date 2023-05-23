package day16.com.ict.edu;

public class Ex06_Main {
	public static void main(String[] args) {
		// 내부클래스를 별도로 객체 생성할 수 없다(static은 제외)
		// Member 내부클래스 만드는 방식으로도 사용 불가
		
		Ex06_Local test = new Ex06_Local();
		// play메서드 내부에 존재하기때문에 play를 실행해야한다.
		test.play();
		
		
		
	}
}
