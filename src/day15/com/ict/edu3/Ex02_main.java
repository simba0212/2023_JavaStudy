package day15.com.ict.edu3;

public class Ex02_main {
	public static void main(String[] args) {
		Ex02_Calc test = new Ex02_Calc();
		
		double s1 = test.plus(9, 3); 
		System.out.println(s1);
		
		double s2 = test.minus(9, 3);
		System.out.println(s2);

		double s3 = test.mul(9, 3);
		System.out.println(s3);
	
		double s4 = test.div(9, 3);
		System.out.println(s4);
	}
}
