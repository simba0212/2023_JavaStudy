package day09.com.ict.edu;

public class Ex02_Array {
	public static void main(String[] args) {
		// 선언과 생성을 한번에
		// char[] c1;
		// c1 = new char[4];
		char[] c1 = new char[4];

		// 데이터 저장
		c1[0] = 'J';
		c1[1] = 'A';
		c1[2] = 'V';
		c1[3] = 65; // 0~65535까지는 오류 없음

		// 하나씩 출력
		for (int i = 0; i < c1.length; i++) {
			System.out.println(c1[i]);

		}
		System.out.println("==================================");
		// 개선된 for문
		for (char c : c1) {
			System.out.println(c);
		}
		System.out.println("==================================");

		// 선언과 생성, 데이터 저장을 한번에
		char[] c2 = { 'j', 'a', 'v', 97, '0', '1' };
		int[] c3 = { 100, 200, 300, 400 };
		double[] c4 = { 3.14, 7.25, 4, 6.12, 'a' };
		String[] str = { "홍길동", "이길동", "고길동", "박길동" };

		for (int i = 0; i < c4.length; i++) {
			System.out.println(c4[i]);
		}
		System.out.println("==================================");

		for (String k : str) {
			System.out.println(k);
		}
	}
}
