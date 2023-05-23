package day11.com.ict.edu;

public class Ex05_Animal {
	// 생존여부
	boolean live;
	// 나이
	int age;
	// 이름
	String name;

	// 생존여부를 변경하는 메서드
	public void setLive(boolean bool) {

		live = bool ? true : false;
	}

	// 생존여부를 반환하는 메서드
	public boolean getLive() {
		return live;
	}

	// 나이를 변경하는 메서드
	public void setAge(int num) {
		age = num;
	}

	// 나이를 반환하는 메서드
	public int getAge() {
		return age;
	}

	// 이름을 변경하는 메서드
	public void setName(String str) {
		name = str;
	}

	// 이름을 반환하는 메서드
	public String getName() {
		return name;
	}

	// 이름, 나이, 생존여부 한번에 변경하자
	public void play(String str, int num, boolean bool) {
		name = str;
		age = num;
		live = bool;
	}

	public void play(boolean bool, int num, String str) {
		name = str;
		age = num;
		live = bool;
	}

	// 이름, 나이, 생존여부 한번에 출력하자
	public void prn() {
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("생존여부\t: " + live);
		System.out.println("======================");
	}

}
