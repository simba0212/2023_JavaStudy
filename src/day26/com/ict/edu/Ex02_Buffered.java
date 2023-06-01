package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

// 읽는 속도향상을 위해서 BufferedInputStream
// 혼자서는 사용 못함, 반드시 InputStream 중 하나를 이용해야한다.
public class Ex02_Buffered {
	public static void main(String[] args) {
		String pathname = "D:/khj/test02.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			
			byte[] b = bis.readAllBytes();
			String msg = new String(b);
			
			System.out.println(msg);
			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				bis.close();
				fis.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}
