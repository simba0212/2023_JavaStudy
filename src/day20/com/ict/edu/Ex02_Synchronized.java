package day20.com.ict.edu;

public class Ex02_Synchronized {
	public static void main(String[] args) {
		Ex02 test = new Ex02();
		new Thread(test,"dog").start();
		new Thread(test,"cat").start();
		new Thread(test,"tiger").start();
		new Thread(test,"lion").start();
	}
}
