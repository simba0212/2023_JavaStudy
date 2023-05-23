package day02.com.ict.edu;
class Ex03{
	public static void main(String[] args){
	
		byte su1 = 125;
		System.out.println(su1);
				
		short su2 = 125;
		System.out.println(su2);

		int su3 = 125;
		System.out.println(su3);
		
		long su4 = 125l;
		System.out.println(su4);		
		
		long su5 = 125;
		System.out.println(su5);

		char c1 = 'A' ; // c1 = 65
		int su6 = c1 ;  // su6 = 65
		System.out.println(c1);
		System.out.println(su6);
		
		float su7 = 13.3f ;
		System.out.println(su7);

		double su8 = 15.3 ;
		System.out.println(su8) ;

		su8 = su7 ;
		System.out.println(su8) ;

		// char, int 를 double에 저장하기(프로모션)
		char ch3 = 'a';
		int su9 = 37;
		double su10 = ch3;
		System.out.println(su10) ;
		su10 = su9;
		System.out.println(su10) ;


	}
}