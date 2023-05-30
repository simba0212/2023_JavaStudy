package day25.com.ict.edu;

import java.io.File;
import java.io.IOException;

public class Ex02_File {
	public static void main(String[] args) {
		String pathName = "D:/khj/exam01.txt";
		File file = new File(pathName);
		try {
			boolean res = file.createNewFile();
			if (res) {
				System.out.println("파일 생성 성공!!");
			} else {
				System.out.println("파일 생성 실패ㅠㅠ(파일 이름 중복)");
			}
			System.out.println("=================================");
			System.out.println("절대경로 : " + file.getAbsolutePath());
			System.out.println("상대경로 : " + file.getPath());
			System.out.println("파일이름 : " + file.getName());
			System.out.println("=================================");

			File file2 = new File("D:/khj/EXAM/AAA");
			// 중간에 하나라도 없으면 만들어지지 않는다.
			// boolean res2 = file2.mkdir();
			// 중간에 디렉토리가 없어도 만들어진다.
			boolean res2 = file2.mkdirs();
			if (res2) {
				System.out.println("디렉토리 생성 성공!!!");
			} else {
				System.out.println("디렉토리 생성 실패 ㅠㅠ");
			}
			System.out.println("=================================");

			// 파일 삭제
			pathName = "D:/khj/exam01.txt";
			File file3 = new File(pathName);
			boolean res3 = file3.delete();
			if (res3) {
				System.out.println("파일삭제 성공");
			} else {
				System.out.println("파일삭제 실패");
			}
			System.out.println("=================================");

			// 디렉토리 삭제
			File file4 = new File("D:/khj/EXAM/AAA");
			boolean res4 = file4.delete();
			if (res4) {
				System.out.println("디렉토리삭제 성공");
			} else {
				System.out.println("디렉토리삭제 실패");
			}

		} catch (IOException e) {
			System.out.println("위치가 틀렸습니다.");
		}

	}
}
