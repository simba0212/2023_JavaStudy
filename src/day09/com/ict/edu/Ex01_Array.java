package day09.com.ict.edu;


public class Ex01_Array {

	public static void main(String[] args) {

		// 1. 선언 : 자료형[] 이름; 또는 자료형 이름[]
		int[] num;
		// 2. 생성 : 이름 = new 자료형[배열의 크기 = 방의 수 = length];
		// new 예약어 : 메모리에 데이터를 저장할 공간을 만들어라
		// => 인스턴스, 객체 생성
		num = new int[4]; // new로 인해 주소가 생기고 그 주소를 num이라는 변수에 저장한다.

		// 3. 데이터 저장 : 이름[index = 방 번호 = 위치
		// 같은 자료형 이어야 저장가능(프로모션, 디모션 가능)
		num[0] = 100;
		num[1] = 'a'; // 프로모션
		num[2] = (int) 2.4; // 디모션 => 형변환 하면 가능
		num[3] = 124;
//		num[4] = 14; // 실행 오류 (배열크기 초과)
		num[0] = 12; // 현재 데이터를 삭제하고 12가 저장된다.(변수와 동일)

		// 배열을 호출하면 주소가 출력된다.
		System.out.println(num);
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println("===============================");
		// 배열의 출력은 일반적으로 for문을 사용
		for (int i = 0; i < num.length; i++) {
			if (i % 2 == 0)
				System.out.println(num[i] * 10);
			else
				System.out.println(num[i]);
		}
		System.out.println("===============================");
		// 개선된 for 문 : 배열이나 컬렉션
		// 배열 전체에 대해서 정보 출력 및 가공 가능
		// 그러나 특정 몇개나 특정 하나를 별도로 출력하거나 가공 할 수 없다.(단점)
		// 인덱스 값을 사용할 수 없다.
		for (int k : num) {
			System.out.println(k);
		}
		
		
		

	}

}
