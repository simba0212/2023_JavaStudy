package day13.com.ict.edu;

public class Ex03_main {

	public static void main(String[] args) {
		// static 접근제한
		// k1 = public = 누구나 접근가능
		// k2 = default = 같은 패키지만 접근가능
		// k3 = private = 외부에서 접근불가능
		System.out.println(Ex03_static.k1);
		System.out.println(Ex03_static.k2);
//		System.out.println(Ex03_static.k3);
		System.out.println();

		System.out.println("s2 = " + Ex03_static.s2);
		System.out.println("k2 = " + Ex03_static.k2);

		Ex03_static p = new Ex03_static();
		System.out.println(p.s1);
		System.out.println(p.s2);
		System.out.println();

		System.out.println("m1 = " + Ex03_static.m1);
		System.out.println("m2 = " + Ex03_static.m2);
		System.out.println("s3 = " + p.s3);
		System.out.println("==============================");
		
		
		
		
	}

}
