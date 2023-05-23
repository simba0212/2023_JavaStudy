package day11.com.ict.edu;

public class Ex05_AnimalTest {

	public static void main(String[] args) {
		// 객체생성
		Ex05_Animal obj1 = new Ex05_Animal();
		// 이름 큰뿔소
		obj1.setName("큰뿔소");
		// 나이 3
		obj1.setAge(3);
		// 생존여부 살아있음
		obj1.setLive(true);
		// 결과 출력
		String name = obj1.getName();
		int age = obj1.getAge();
		boolean live = obj1.getLive();

		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("생존여부\t: " + live);
		System.out.println("======================");
		// 이름을 펭귄, 나이1, 생존여부 살아있음 으로 변경
		obj1.setName("펭귄");
		obj1.setAge(1);
		obj1.setLive(true);
		name = obj1.getName();
		age = obj1.getAge();
		live = obj1.getLive();

		// 결과 출력
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("생존여부\t: " + live);
		System.out.println("======================");

		obj1.play(false, 14, "엄지");
		obj1.prn();
		obj1.play("까치", 14, true);
		obj1.prn();
	}

}
