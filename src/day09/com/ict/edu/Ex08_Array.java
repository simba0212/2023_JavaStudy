package day09.com.ict.edu;


public class Ex08_Array {

	public static void main(String[] args) {
		int num[][];
		num = new int[2][3]; // 1차원 배열은 2개이고, 각각 3개의 배열을 가지고 있다.
		num[0][0] = 10;
		num[0][1] = 20;
		num[0][2] = 30;

		num[1][0] = 100;
		num[1][1] = 200;
		num[1][2] = 300;

		System.out.println(num);
		System.out.println(num[0]);
		System.out.println(num[1]);

		// 다차원 배열 출력
		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[0][2]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		System.out.println(num[1][2]);
		System.out.println("============================");
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
	}

}
