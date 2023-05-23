package day02.com.ict.edu;
class Ex05{
	public static void main(String[] args){
		int kor = 90 ; 
		int eng = 80 ;
		int math = 80;
		
		// 총점
		int sum = kor + eng + math ;

		// 평균
		int avg = sum / 3;
		
		// 소수점까지 평균
		double avg2 = sum / 3;
		double avg3 = (double) (sum / 3);		
		double avg4 = (double)(sum)/3;
		double avg5 = sum/3.0;
		double avg6 = (int)(avg5*100)/(100.0);
		
		System.out.println(sum);
		System.out.println(avg);
		System.out.println(avg2);
		System.out.println(avg3);
		System.out.println(avg4);
		System.out.println(avg5);
		System.out.println(avg6);

		// 1472 를 원단위 절삭해서 1470으로 만들어 보자
		int num1 = 1472 ;
		int num2 = (num1 / 10)*10 ;
		System.out.println(num2);
		
	}
}