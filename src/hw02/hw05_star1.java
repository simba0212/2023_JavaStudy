package hw02;

public class hw05_star1 {
	public static void main(String[] args) {
//		5. 6 별찍기
//		*
//		* *
//		* * *
//		* * * *
//
//		      *
//		    * *
//		  * * *
//		* * * *
		for(int i=0;i<4;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println("=====");
		for(int i=0;i<4;i++) {
			for(int j=0;j<3-i;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
