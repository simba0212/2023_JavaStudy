package day19.com.ict.edu;

public class Ex03_Main {
	public static void main(String[] args) {
		System.out.println("main : " + Thread.currentThread().getName());
		Ex03_Dog dog = new Ex03_Dog();
		Ex03_Cat cat = new Ex03_Cat();

		// Runnable 인터페이스에는 start가 없어서 start를 쓸 수 없다.
		// cat.start();

		Thread thread = new Thread(dog);
		thread.start();
//		
//		Thread thread2 = new Thread(cat);
//		thread2.start();

		// 익명
		new Thread(cat).start();

		new Thread(new Runnable() {
			public void run() {
				while (true) {
					System.out.println("AAAAAAAA" + Thread.currentThread().getName());
				}
			}
		}).start();

		System.out.println("main : " + Thread.currentThread().getName());
	}
}
