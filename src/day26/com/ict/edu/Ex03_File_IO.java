package day26.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// D:/khj/test01.txt 읽어서 D:/khj/test02.txt 내용추가 
public class Ex03_File_IO {
	public static void main(String[] args) {
		String readPath = "D:/khj/test01.txt";
		File readFile = new File(readPath);
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		String writePath = "D:/khj/test02.txt";
		File writeFile = new File(writePath);
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
			fis = new FileInputStream(readFile);
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream(writeFile, true);
			bos = new BufferedOutputStream(fos);

			byte[] b = bis.readAllBytes();
			
			bos.write(b);
			bos.flush();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				bos.close();
				bis.close();
				fos.close();
				fis.close();

			} catch (Exception e2) {
			}
		}

	}
}
