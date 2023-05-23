package day09.com.ict.edu;

import java.util.Arrays;
import java.util.Collections;

public class Ex03_Array {

	public static void main(String[] args) {
		// 정렬하기
		int[] su = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };

		// 자리변경을 위한 임시변수 필요
		int temp = 0;
		for (int i = 0; i < su.length - 1; i++) {
			for (int j = i + 1; j < su.length; j++) {
				// 비교하기 ( 오름 (i>j) , 내림(i<j))때 자리 변경하기
				if (su[i] < su[j]) {
					temp = su[i];
					su[i] = su[j];
					su[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(su));
		
		
		int[] su2 = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };
		
		// Arrays 클래스는 배열 복사, 정렬, List 로 전환 등
		// 배열에 관련된 기능을 제공하는 클래스이다.
		// 오름차순 정렬은 sort() 로 가능
		// 내림차순은 없음
		
		Arrays.sort(su2);
		System.out.println(Arrays.toString(su2));
		// 기본자료형으로는 오류 발생
		//int[] su3 = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };

		Integer[] su3 = { 3, 4, 9, 8, 2, 1, 7, 10, 5, 6 };
		Arrays.sort(su3, Collections.reverseOrder());
		System.out.println(Arrays.toString(su3));
		
		
	}
}