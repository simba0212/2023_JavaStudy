package day09.com.ict.edu;

public class Ex05_Array {

	public static void main(String[] args) {
		String[] name = { "홍", "김", "이", "박", "고" };
		int[] kor = { 80, 90, 80, 70, 100 };
		int[] eng = { 85, 95, 75, 85, 95 };
		int[] math = { 100, 95, 90, 100, 100 };

		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		String[] hak = new String[name.length];
		int[] rank = { 1, 1, 1, 1, 1 };

		System.out.println("이름\t평균\t학점\t순위");
		System.out.println("============================");
		for (int i = 0; i < rank.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = (int) (sum[i] / 3.0 * 10) / 10.0;
			if (avg[i] >= 90) {
				hak[i] = "A학점";
			} else if (avg[i] >= 80) {
				hak[i] = "B학점";
			} else if (avg[i] >= 70) {
				hak[i] = "C학점";
			} else {
				hak[i] = "F학점";
			}
		}

		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (i == j) {
					continue;
				} else if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i]+"\t");
			System.out.print(avg[i]+"\t");
			System.out.print(hak[i]+"\t");
			System.out.println(rank[i]);
		}
	}
}
