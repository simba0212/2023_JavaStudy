package day27.com.ict.edu;

import java.io.FileReader;

// FileInputStream => 1byte, read() => 아스키코드(숫자), read(byte[] b)
// FileReader      => 2byte, read() => 유니코드(숫자), read(char[] b)

public class Ex05_reader {
	public static void main(String[] args) {
		FileReader fr = null;
		try {
			String pathname = "D:/khj/ex01.txt";
			fr = new FileReader(pathname);

			// 한 글자씩 읽는다.
			int k = fr.read();
			System.out.println(k+" : " +(char)(k));

		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
