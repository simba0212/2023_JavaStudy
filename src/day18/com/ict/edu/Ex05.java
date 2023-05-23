package day18.com.ict.edu;

import java.util.TreeSet;

public class Ex05 {
	public static void main(String[] args) {
		TreeSet<Integer> lotto = new TreeSet<>();
		for (int i = 0; i < 6; i++) {
			int su = (int) (Math.random() * 45) + 1;
			// lotto컬렉션에 su를 넣고 싶은데 안들어가지면 무엇인가 실행하겠다.
			if (!lotto.add(su)) {
				i--;
			}

		}
		System.out.println(lotto);
	}
}
