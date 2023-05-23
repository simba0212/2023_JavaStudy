package day06.com.ict.edu;

public class Ex03_break_continue {
	public static void main(String[] args) {

		// 1-10 출력 6일때 break사용
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				break;
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				break;
		}
		System.out.println();

		// 1-10 출력 6일때 continue 사용
		for (int i = 1; i < 11; i++) {
			if (i == 6)
				continue;
			System.out.print(i + " ");
		}
		System.out.println();

		for (int i = 1; i < 11; i++) {
			System.out.print(i + " ");
			if (i == 6)
				continue;
		}
		System.out.println();
	}
}
