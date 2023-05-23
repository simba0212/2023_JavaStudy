package day03.com.ict.edu2;

public class Test05 {

	public static void main(String[] args) {
		int su = 3781;
		
		// 결과
		// 천의 자리 : 3
		// 백의 자리 : 7
		// 십의 자리 : 8
		// 일의 자리 : 1
		
		
		
		System.out.println("천의 자리 : "+(su/1000));
		System.out.println("백의 자리 : "+((su%1000)/100));
		System.out.println("십의 자리 : "+((su%100)/10));
		System.out.println("일의 자리 : "+(su%10));
	}

}
