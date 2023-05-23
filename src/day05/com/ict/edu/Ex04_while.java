package day05.com.ict.edu;

public class Ex04_while {

	public static void main(String[] args) {
		// while 문 : for문과 같은 반복문
		// 형식1)
		// 초기식;
		// while(조건식){
		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식;
		// }
		// while문의 끝을 만나면 조건식으로 간다.

		// 형식2)
		// 초기식;
		// while(true){
		// if(빠져나갈 조건)
		// break;

		// 조건식이 참이면 실행할 문장;
		// 조건식이 참이면 실행할 문장;
		// 증감식;
		// }

		// 1 - 10 까지 출력하는 프로그램
		int i = 1;
		while (i < 11) {
			System.out.println("i = " + i);
			i++;
		}

		// 0 - 10 까지 짝수 출력
		System.out.println("===============================================");

		i = 0;
		while (i < 11) {
			if (i % 2 == 0) {
				System.out.println("짝수 i = " + i);

			}
			i++;
		}
		System.out.println("===============================================");
		// 구구단 중 7단 출력
		i = 1;
		while (i < 10) {
			System.out.println("7 * " + i + " = " + (7 * i));
			i++;
		}

		// 1-10 누적합구하기
		int sum = 0;
		i=1;
		while (i < 11) {
			sum += i;
			i++;
		}
		System.out.println("===============================================");
		System.out.println("누적합 : " + sum);
		System.out.println("===============================================");
		
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		// 0 0 0 0
		int num1 = 0;
		int num2 = 0;
		while(num1<4) {
			
			num2=0;
			while(num2<4) {
				System.out.print(0+" ");
				num2++;
			}
			System.out.println();
			num1++;
			
		}
		System.out.println("===============================================");
		
		

	}

}
