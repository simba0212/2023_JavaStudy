package day10.com.ict.edu;

public class Ex02_main {
	public static void main(String[] args) {
		System.out.println(Ex02_Class.AVG);
		System.out.println(Ex02_Class.sum);

		Ex02_Class obj = new Ex02_Class();

		System.out.println(obj);
		System.out.println(obj.GENDER);
		System.out.println(obj.name);

		// 변수와 상수의 차이
		obj.name = "일지매";
		// 상수는 변경할수 없다
//		obj.GENDER = "여성";
		
		Ex02_Class.sum = 1000;
		// 상수는 변경할수 없다
//		Ex02_Class.AVG = 12345;
		
		System.out.println(obj.name);
		System.out.println(Ex02_Class.sum);
		
		
	}
}
