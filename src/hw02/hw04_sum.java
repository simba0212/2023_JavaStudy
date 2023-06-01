package hw02;

public class hw04_sum {
	public static void main(String[] args) {
//		4.   1+(-2)+3+(-4)+... 과 같은 식으로 계속 더해나갔을 때,
//		몇까지 더해야 총합이 100이상이 되는지 구하시오

		int sum = 0;
		int count = 0;
		for (int i = 1; sum < 100; i++) {
			if (i % 2 == 0)
				sum -= i;
			else
				sum += i;
			count = i;

		}
		System.out.println(count + "를 더했을 때, 총합이 " + sum + "이 됩니다.");

	}
}
