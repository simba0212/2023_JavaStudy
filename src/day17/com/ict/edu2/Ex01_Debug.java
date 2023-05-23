package day17.com.ict.edu2;

import java.util.Iterator;
import java.util.Random;

public class Ex01_Debug {
	public static void main(String[] args) {
		Random rnd = new Random();
		System.out.println(rnd.nextInt(3));
		
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total += i;
			System.out.println("1부터 " + i + "까지의 합은" + total + " 입니다.");
		}
		
	}
}
