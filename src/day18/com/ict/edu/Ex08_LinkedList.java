package day18.com.ict.edu;

import java.util.LinkedList;

public class Ex08_LinkedList {

	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();

		linkedList.add("고길동");
		linkedList.offer("도우너");
		linkedList.addFirst("둘리");
		linkedList.offerFirst("또치");
		linkedList.addLast("둘리"); // 중복가능
		linkedList.add(3, "차두리");

		if (linkedList.contains("둘리")) {
			System.out.println(linkedList.indexOf("둘리"));
			System.out.println(linkedList.getFirst());
			System.out.println(linkedList.getLast());

			// 치환
			linkedList.set(linkedList.lastIndexOf("둘리"), "공실이");
			
		}
		System.out.println(linkedList);
		
		// 삭제
		linkedList.removeFirst();
		linkedList.removeLast();
		linkedList.remove("차두리");
		linkedList.remove(); // 맨앞 삭제
		System.out.println(linkedList);

	}

}
