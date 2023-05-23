package day14.com.ict.edu;

import java.util.StringTokenizer;

public class Ex02_StringBuffer {

	public static void main(String[] args) {
		// 문자열을 추가할때 사용 (메모리 주소가 변경되지 않는다.)
		// 추가할때 append()사용
		// toString() => String으로 전환한다.
		StringBuffer sb = new StringBuffer("ictedu");
		sb.append(" 대한민국");

		System.out.println(sb);
		System.out.println(sb.toString());

		// StringTokenizer : 구분자를 이용해서 문자열 분리, split 과 차이점은 배열의 크기를 지정 못함
		// 구분자가 없으면 (띄어쓰기,",")
		// nextToken()를 이용해서 문자열 분리

		// split(String regex) : String[]
		// split(String regex, int limit) : String[]
		// regex = 구분자(나눌 기준), limit => 배열의 크기
		String str = "사과 바나나 망고 오렌지 수박";
		StringTokenizer st = new StringTokenizer(str);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println();
		
		str = "사과,바나나,망고,오렌지,수박";
		st = new StringTokenizer(str,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println();
		
		// 추천
		String[] arr = str.split(",");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
