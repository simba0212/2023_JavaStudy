package day14.com.ict.edu;

import java.util.Random;

public class Ex06_extends extends Random {

	public Ex06_extends() {
		int su = nextInt();
		System.out.println("Ex06 : " + su);
	}

	public static void main(String[] args) {
		Ex06_extends test = new Ex06_extends();
	}

}
