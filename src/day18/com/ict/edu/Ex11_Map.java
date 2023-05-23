package day18.com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_Map {
	public static void main(String[] args) {
		// 대한민국, 캐나다, 영국, 스위스의 수도가 각각 HashMap에 저장시키고
		// 원하는 나라가 key값이 되어, 화면에서 나라를 물어보면 수도가
		// 출력되는 프로그램 작성
		// 계속할까요? Y/N
		String con;
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		map.put("대한민국", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		esc: while (true) {
			System.out.print("나라를 입력하세요 >> ");
			String str = sc.next();
			if (!map.keySet().contains(str)) {
				System.out.println("잘못 입력했습니다.");
				continue esc;
			}
			esc2: while (map.keySet().contains(str)) {
				String k = map.get(str);
				System.out.println(str + "의 수도는 " + k + "입니다.");
				while (true) {
					System.out.print("계속할까요?(y/n)");
					con = sc.next();
					if (con.toLowerCase().equals("y")) {
						break esc2;
					} else if (con.toLowerCase().equals("n")) {
						System.out.println("프로그램을 종료합니다.");
						break esc;
					} else {
						System.out.println("잘못입력했습니다.");
						continue;
					}
				}
			}
		}
		sc.close();

	}
}
