package day03.com.ict.edu2;

public class Test01 {

	public static void main(String[] args) {
		// 이름이 홍길동인 사람의 점수가
		// 국어 90, 영어 80, 수학 80점입니다.
		// 총점과 평균을 구하자
		// 화면 출력은 이름, 총점, 평균만 출력하자
		// (단, 평균은 소수점 첫째자리까지 구하자);
		
		String name = "홍길동";
		int kor = 90;
		int eng = 80;
		int math = 80;
		
		int total = kor + eng + math;
		double avg = total/3.0;
		
		
		System.out.println("이름 : " + name);
		System.out.println("총점 : " + total);
		System.out.printf("평균 : %.1f%n",avg);
		
	}
}
