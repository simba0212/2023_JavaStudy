package day18.com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex06_List {
	// List 인터페이스
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.add("둘리");
		stack.push("공실이");
		stack.addElement("마이콜");
		stack.add(0, "고길동");
		stack.add(2, "희동이");

		// 마지막 객체 보기 : pop(보고 버림) , peek(보고 돌려놓음)
		System.out.println(stack.peek());
		System.out.println(stack);
		System.out.println(stack.pop());
		System.out.println(stack);

		// "둘리"가 있으면 실행
		if (stack.contains("둘리")) {

			// "둘리" 위치찾기
			System.out.println(stack.indexOf("둘리")); // 왼쪽, 0부터 index를 찾음
			System.out.println(stack.search("둘리")); // 오른쪽, 1부터 검색

			// index를 이용해 객체 얻기
			System.out.println(stack.get(1));
			System.out.println(stack.elementAt(1));
			System.out.println(stack.get(stack.indexOf("둘리")));
		} else
			System.out.println("둘리없음");
		if (stack.contains("고길동")) {

			// 변경
			stack.setElementAt("도우너", stack.indexOf("고길동"));
		}
		System.out.println(stack);

		// 중복가능
		stack.add("둘리");
		stack.add("고길동");
		System.out.println(stack);

		// 하나씩 꺼내기 (배열,왼쪽부터)
		for (String k : stack) {
			System.out.println(k + "님");
		}
		System.out.println();
		Iterator<String> it = stack.iterator();
		while (it.hasNext()) {
			String k = it.next();
			System.out.println(k + "짱");
		}
		System.out.println();
		// 스택방식으로(오른쪽부터)
		while (!stack.isEmpty()) {
			String k = stack.pop();
			System.out.println(k + ", 크기는" + stack.size() + " 입니다.");
		}
		System.out.println(stack);

	}
}
