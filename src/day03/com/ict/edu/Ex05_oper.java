package day03.com.ict.edu;

public class Ex05_oper {
	public static void main(String[] args) {
		// 논리합(OR연산자) = 합집합 = ||
		// 주어진 조건들이 하나라도 true일 경우, true반환
		// 선행조건이 true이면 후행조건은 실행되지않는다.

		int su1 = 10;
		int su2 = 7;
		boolean result;

		result = (su1 >= 7) || (su2 >= 5);
		System.out.println("결과 : " + result);

		result = (su1 <= 7) || (su2 >= 5);
		System.out.println("결과 : " + result);

		result = (su1 >= 7) || (su2 <= 5);
		System.out.println("결과 : " + result);

		result = (su1 <= 7) || (su2 <= 5);
		System.out.println("결과 : " + result);

		System.out.println("====================");

		result = ((su1 = su1 + 2) > su2) || (su1 == (su2 = su2 + 5));
		System.out.println("결과 : " + result);
		System.out.println("su1 : " + su1);
		System.out.println("su2 : " + su2);
		
		boolean res = true;
		System.out.println(res);
		System.out.println(!res);
		

		// 논리부정(NOT연산) = !
		// 주어진 논리값의 반대값을 반환한다.
	}
}