package day03.com.ict.edu;

public class Ex03_oper {

	public static void main(String[] args) {
		// 비교연산자 : >, <, >=, <=, ==(같다), !=(다르다)
		// 비교연산자를 사용하는 자료형은 문자, 정수, 실수
		// 비교연산자는 참,거짓을 반환하므로 boolean타입의 변수에 저장해야한다.

		int su1 = 90;
		int su2 = 80;

		boolean res = su1 >= su2;
		System.out.println(res);

		double su3 = 89.9;
		double su4 = 80.0;

		res = su1 >= su3;
		System.out.println(res);

		res = su2 == su4;
		System.out.println(res);

		char c1 = 'a';
		char c2 = 'A';

		res = su1 >= c1;
		System.out.println(res);

		res = c1 >= c2;
		System.out.println(res);
	}

}
