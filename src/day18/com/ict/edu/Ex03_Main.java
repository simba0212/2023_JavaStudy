package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Main {
	public static void main(String[] args) {
		// setter를 이용해서 데이터 삽입
		// 생성자를 이용해서 데이터 삽입
		Ex03 p1 = new Ex03();
		p1.setName("둘리");
		p1.setAge(500);
		p1.setWeight(35.7);

		Ex03 p2 = new Ex03("희동이", 4, 12.6);
		Ex03 p3 = new Ex03("마이콜", 21, 65.2);
		Ex03 p4 = new Ex03("또치", 500, 56.2);

		// 객체를 저장하는 방법 : 배열, 컬렉션
		// 1. 배열 : 크기를 지정하면 바꿀 수 없다.
		Ex03[] arr = new Ex03[4];
		arr[0] = p1;
		arr[1] = p2;
		arr[2] = p3;
		arr[3] = p4;

		// 2. 컬렉션 : 크기지정 없음, 추가 가능
		HashSet<Ex03> set1 = new HashSet<>();
		set1.add(p1);
		set1.add(p2);
		set1.add(p3);
		set1.add(p4);
		set1.add(new Ex03("공실이", 24, 51.4));

		// 이름만 출력하기
		// 1. 배열 : 일반 for문, 개선된 for문 사용가능
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i].getName());
		}
		for (Ex03 ex03 : arr) {
			System.out.println(ex03.getName());
		}
		System.out.println();

		// 2. 컬렉션 : 개선된 for문 / Iterator문 사용가능
		for (Ex03 ex03 : set1) {
			System.out.println(ex03.getName());
		}
		System.out.println();
		Iterator<Ex03> it = set1.iterator();
		
		while (it.hasNext()) {
			Ex03 ex03 = it.next();
			System.out.println(ex03.getName());
		}

	}
}
