package day27.com.ict.edu;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex04_writer_buffered {
	public static void main(String[] args) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			String pathname = "D:/khj/ex02.txt";
			File file = new File(pathname);
			fw= new FileWriter(file);
			bw =new BufferedWriter(fw);
			
			
			// 내용
			// String msg = "안녕하세요"
			bw.write("안녕하세요");
			bw.newLine();
			bw.write("김희준이랍니다.");
			bw.newLine();
			bw.write("자바는 재밌어");
			
			
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			try {
				bw.close();
				fw.close();
				
				
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
