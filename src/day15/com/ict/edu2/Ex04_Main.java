package day15.com.ict.edu2;

import java.util.Scanner;

public class Ex04_Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("선택하세요(1. 고양이, 2. 강아지) >> ");

			int ani = sc.nextInt();

			/*
			 * switch (animal) { case 1: Ex04_Cat cat = new Ex04_Cat(); cat.sound();
			 * cat.play(); break;
			 * 
			 * case 2: Ex04_Dog dog = new Ex04_Dog(); dog.sound(); dog.play(); break; }
			 */

			// 다형성의 동적바인딩
			Ex04_Abstract animal = null;
			switch (ani) {
			case 1:
				animal = new Ex04_Cat();
				break;
			case 2:
				animal = new Ex04_Dog();
				break;
			}
			animal.sound();
			animal.play();
			
			
			break;
		}
		sc.close();
	}

}
