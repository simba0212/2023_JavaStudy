package day18.com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;

public class Ex02_Set {
	public static void main(String[] args) {
		// 컬렉션 생성
		HashSet<Integer> h1 = new HashSet<>();
		HashSet<Double> h2 = new HashSet<>();
		HashSet<Character> h3 = new HashSet<>();
		HashSet<String> h4 = new HashSet<>();

		System.out.println(h1);
		// 컬렉션에 객체 넣기(add)
		h1.add(new Integer(14));
		h1.add(new Integer("16"));
		h1.add(20);
		// Boxing : 기본자료형이 해당 객체로 만들어진다.
		// unBoxing : 해당 객체를 기본자료형으로 되돌리는 것

		System.out.println(h1);

		h2.add(new Double(30.1));
		h2.add(new Double("35.1"));
		h2.add(38.2);
//		h2.add(30);
		System.out.println(h2);
		// 무조건 제네릭타입을 맞춰야 한다.
		
		h3.add(new Character('j'));
		h3.add('a');
		h3.add('v');
		h3.add('a');
		System.out.println(h3);

		System.out.println("하나씩 처리하기 (개선된 for문)");
		for (Integer k : h1) {
			System.out.println(k);
		}

		System.out.println();
		System.out.println("하나씩 처리하기 (iterator)");
		Iterator<Double> it = h2.iterator();
		while (it.hasNext()) {
			Double k = it.next();
			System.out.println(k);
		}
		System.out.println();
		System.out.println("하나씩 처리하기 (iterator)");
		Iterator<Character> it2 = h3.iterator();
		while (it2.hasNext()) {
			Character character = it2.next();
			System.out.println(character);
		}

	}

}
