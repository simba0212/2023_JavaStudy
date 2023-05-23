package day12.com.ict.edu;

import java.util.Scanner;

public class Ex05_main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		Ex05_Constructor p1 = new Ex05_Constructor();
		System.out.println(p1.getName());
		System.out.println(p1.getAge());
		System.out.println(p1.getAddr());
		System.out.println("======================================");
		
		Ex05_Constructor p2 = new Ex05_Constructor("태권브이");
		System.out.println(p2.getName());
		System.out.println(p2.getAge());
		System.out.println(p2.getAddr());
		System.out.println("======================================");
		
		Ex05_Constructor p3 = new Ex05_Constructor("둘리",1920);
		System.out.println(p3.getName());
		System.out.println(p3.getAge());
		System.out.println(p3.getAddr());
		System.out.println("======================================");
		
		Ex05_Constructor p4 = new Ex05_Constructor("고길동",39,"경기도");
		System.out.println(p4.getName());
		System.out.println(p4.getAge());
		System.out.println(p4.getAddr());
		System.out.println("======================================");
		
		
		
	}
}
