package day11.com.ict.edu;

import java.util.Scanner;

public class Ex07_main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[][] arr = new String[5][8];
		Ex07_method obj = new Ex07_method();

		for (int i = 0; i < 5; i++) {
			System.out.print("이름 : ");
			arr[i][0] = sc.next();
			System.out.print("국어 : ");
			arr[i][1] = sc.next();
			System.out.print("영어 : ");
			arr[i][2] = sc.next();
			System.out.print("수학 : ");
			arr[i][3] = sc.next();
			// 총점구해서 4번에 넣기
			int kor = Integer.parseInt(arr[i][1]);
			int eng = Integer.parseInt(arr[i][2]);
			int math = Integer.parseInt(arr[i][3]);
			arr[i][4] = Integer.toString(obj.getTotal(kor, eng, math));
			// 평균구해서 5번에 넣기
			arr[i][5] = Double.toString(obj.getAvg());
			// 평균으로 학점구해서 6번에 넣기
			arr[i][6] = obj.getGrade();
			// 순위 초기화
			arr[i][7] = "1";
		}
		// 순위정하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					continue;
				}
				if (Double.parseDouble(arr[i][5]) < Double.parseDouble(arr[j][5])) {
					arr[i][7] = "" + (Integer.parseInt(arr[i][7]) + 1);
				}
			}
		}
		// 순위정렬
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				String[] temp = new String[8];
				int rankI = Integer.parseInt(arr[i][7]);
				int rankJ = Integer.parseInt(arr[j][7]);
				if (rankI > rankJ) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		// 출력
		System.out.println("이름\t총점\t평균\t학점\t순위");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(
					arr[i][0] + "\t" + arr[i][4] + "\t" + arr[i][5] + "\t" + arr[i][6] + "\t" + arr[i][7] + "\n");
		}
	}

}
