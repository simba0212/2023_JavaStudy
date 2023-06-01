package day27.com.ict.edu;

import java.io.File;
import java.io.FileWriter;

// FileOutputStream => 1byte 처리, write(ASKII CODE), write(byte[] b) 두가지로 했었다.
// FileWriter       => 2byte 처리, write(String str) String객체를 바로 받을 수 있다. 
public class Ex03_Writer {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			String pathname = "D:/khj/ex01.txt";
			File file = new File(pathname);
			
			// 내가 쓸 내용을 String으로 만들어
			String msg = "안녕하세요\n";
			fw = new FileWriter(file);
			fw.write(msg);
			fw.flush();
			
			
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				fw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
