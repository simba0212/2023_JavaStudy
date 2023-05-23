package day14.com.ict.edu;

public class Ex03_main {
	public static void main(String[] args) {
		// 자식클래스를 객체로 만들면 부모클래스는 자동으로 먼저 생성된다.
		Ex03_Sub subO = new Ex03_Sub();
		
		System.out.println("메인에서 생성자 호출 : "+subO);

		System.out.println(subO.name);
		System.out.println(subO.age);
		System.out.println(subO.addr);
		
		// 외부에서는 private 호출 안됨
//		System.out.println(subO.cat);
//		System.out.println(subO.dog);
		
		// static (접근제한자가 우선순위가 높다.)
		System.out.println(Ex03_Sub.computer);
		System.out.println(Ex03_Super.playStation);
		
	
	
	}
}
