package day03.com.ict.edu2;

public class Test04 {

	public static void main(String[] args) {
		// 카페모카가 6500원이다.
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가? (단, 부가세 10%는 별도로 계산한다)

		int cafeMocha = 6500;
		int num = 2;
		int money = 15000;
		int sum = num * cafeMocha;
		int vat = sum / 10;
		int total = sum + vat;

		int leftMoney = money - total;

		System.out.println("잔돈 : " + leftMoney);

		// 위 정보를 한번에 처리
		int leftMoney2 = money - (int) (sum * 1.1);
		System.out.println("잔돈 : " + leftMoney2);
	}

}
