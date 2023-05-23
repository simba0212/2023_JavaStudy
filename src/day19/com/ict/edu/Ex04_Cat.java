package day19.com.ict.edu;


public class Ex04_Cat implements Runnable {
	@Override
	public void run() {
		while (true) {
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("야옹~~~야옹~~~" + Thread.currentThread().getName());
		}
	}
}
