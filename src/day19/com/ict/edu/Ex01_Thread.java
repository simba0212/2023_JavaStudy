package day19.com.ict.edu;

public class Ex01_Thread {

	public void play() {
		System.out.println("스레드이름-2 : " + Thread.currentThread().getName());
		System.out.println("컴퓨터로 놀기");
		System.out.println("스레드이름-3 : " + Thread.currentThread().getName());
	}
	
	public String sound() {
		System.out.println("스레드이름-5 : " + Thread.currentThread().getName());
		return "음악듣기";
	}

	public static void main(String[] args) {

		// 지금은 싱글스레드 이다.(즉, 하나의 스레드가 모든일을 처리한다.)
		// main 메서드에서 일하는 스레드를 main 스레드라고 한다.
		System.out.println("스레드이름-1 : " + Thread.currentThread().getName());

		Ex01_Thread test = new Ex01_Thread();
		
		test.play();
		System.out.println("스레드이름-4 : " + Thread.currentThread().getName());
		
		String msg = test.sound();
		System.out.println("스레드이름-6 : " + Thread.currentThread().getName());
		System.out.println(msg);
	}



	
}
