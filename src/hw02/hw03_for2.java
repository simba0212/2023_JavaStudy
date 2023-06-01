package hw02;

public class hw03_for2 {

	public static void main(String[] args) {
//		3.  이중 for 문으로 풀기 
//			1  0  0  0
//			0  1  0  0
//			0  0  1  0
//			0  0  0  1
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==j) {
					System.out.print(1+" ");
				}
				else
					System.out.print(0+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
