package day28.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

// PrintStream : 1byte씩 처리, 모든 데이터 출력할 수 있음. (System.out.println()) 에서 println()이 PrintStream이다.
//               BufferedStream처럼 OutputStream을 이용해서 사용한다.(이런식으로 엮이고 엮이는 방식을 체인방식이라고 한다.)

// PrintWriter : OutputStream(바이트출력), Write(문자출력) 둘다 사용 가능한 장점이 있다.

public class Ex01_printwriter {
	public static void main(String[] args) {
		String pathname = "D:/khj/exam100.txt";
		File file = new File(pathname);
		FileWriter fw = null;
		BufferedWriter bw = null;
		PrintWriter pw = null;
		try {
			fw= new FileWriter(file);
			bw= new BufferedWriter(fw);
			pw = new PrintWriter(bw);
			
			pw.println("PrintWriter 연습");
			pw.println(123456);
			pw.println('A');
			pw.println(true);
			pw.println(178.95);
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				pw.close();
				bw.close();
				fw.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
