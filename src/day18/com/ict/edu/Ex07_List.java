package day18.com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

public class Ex07_List {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		Vector<String> vector = new Vector<>();

		list.add("손흥민");
		list.add("이강인");
		list.add("김민재");
		list.add("손흥민");

		vector.add("손흥민");
		vector.add("이강인");
		vector.add("김민재");
		vector.add("손흥민");

		list.add(1, "차범근"); // 중간에 넣고싶다
		vector.add(1, "차범근"); // 중간에 넣고싶다

		System.out.println(list);
		System.out.println();
		System.out.println(vector);

		// 검색 : search() , elementAt(), firstElement(), lastElement()가 없다.

		if (list.contains("손흥민")) {
			System.out.println(list.indexOf("손흥민"));
			System.out.println(list.lastIndexOf("손흥민"));

//			// 치환
//			list.set(list.lastIndexOf("손흥민"), "박지성");
//			System.out.println(list);

		}
		System.out.println();
		if (vector.contains("손흥민")) {
			System.out.println(vector);
			System.out.println(vector.indexOf("손흥민"));
			System.out.println(vector.lastIndexOf("손흥민"));
			// 치환
//			vector.set(vector.lastIndexOf("손흥민"), "차두리");
//			System.out.println(vector.firstElement());
//			System.out.println(vector.lastElement());
		}
		System.out.println(vector);

		// 삭제 : remove 겹칠때는 앞에꺼부터 삭제
		list.remove("손흥민");
		vector.remove("손흥민");
		System.out.println(list);
		System.out.println(vector);
		// 출력 : 개선된 for문, iterator사용
		for (String k : list) {
			System.out.println(k + "골");
		}
		Iterator<String> it = list.iterator();
		Iterator<String> it2 = vector.iterator();

		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + "킥");
		}

	}
}
