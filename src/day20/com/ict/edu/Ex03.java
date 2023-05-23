package day20.com.ict.edu;

public class Ex03 implements Runnable {
	int x;

	@Override
	public synchronized void run() {
		for (int i = 0; i < 50; i++) {
			System.out.println(++x + " : " + Thread.currentThread().getName());
			if(x==11) {
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}else {
				notify();
			}
		}
	}
}