package day15.com.ict.edu3;

public class Ex01_main {
	public static void main(String[] args) {
		System.out.println(Ex01_Interface.SU1);
		System.out.println(Ex01_Interface.SU2);
		System.out.println(Ex01_Interface.su3);
		System.out.println(Ex01_Interface.su4);

		Ex01_Interface.like();
		System.out.println();

		Ex01_extends t1 = new Ex01_extends();
		t1.sound();
		t1.play();
		System.out.println();
		// 익명 내부클래스
// 		추천안함
//		Ex01_extends2 t2 = new Ex01_extends2() {
//
//			@Override
//			public void sound() {
//				System.out.println("뮤직듣기");
//			}
//
//			@Override
//			public void play() {
//				System.out.println("오락실게임하기");
//			}
//		};

//		t2.study();
//		t2.sound();
//		t2.play();
		System.out.println();
		Ex01_extends3 t3 = new Ex01_extends3();
		t3.study();
		t3.sound();
		t3.play();

	}

}
