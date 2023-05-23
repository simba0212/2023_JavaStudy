package day09.com.ict.edu;

public class Ex10_Array {

	public static void main(String[] args) {
		// 가변 길이
		int[][] su = new int[3][];

		int[] k1 = { 10, 20, 30 };
		int[] k2 = { 100, 200 };
		int[] k3 = { 1000, 2000, 3000 };

		su[0] = k1;
		su[1] = k2;
		su[2] = k3;

		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		System.out.println("==================================");
		// 선언, 생성, 초기화 한번에
		String[][] str = { { "java", "자바", "JAVA" }, { "JSP" }, { "HTML", "CSS" } };
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.println(str[i][j]);
			}
		}
	}

}
