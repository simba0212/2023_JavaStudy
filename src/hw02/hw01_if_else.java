package hw02;

public class hw01_if_else {

	public static void main(String[] args) {
//		농구공 5개씩 한 박스에 들어간다. 
//		 40개면 8상자,  26개면 6개이다.
//		int k1 = 127개이다. 
//		몇 상자가 필요한가요?

		int k1 = 127;
		int box = 0;
		if (k1 % 8 != 0)
			box = (k1 / 8) + 1;
		else
			box = k1 / 8;
		System.out.println("필요한 상자 : " + box + "개 입니다.");

	}

}
