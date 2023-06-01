package day26.com.ict.edu;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

// 바이트 입력 스트림	: InputStream 자식클래스 FileInputStream 사용
//					: FileInStream을 이용해서 해당파일에 내용을 1byte로 읽기
//			주요메서드	: read() : int => 숫자(0-255, 아스키코드), 해당 숫자를 문자로 보려면 char 형변환한다.
//					: 더이상 읽을 수 없으면 -1이 나온다.
//					: read(byte[] b) : 배열에 존재하는 아스키코드 읽기, 한글 깨짐
//					: close() : 입력 스트림 닫기

public class Ex01_inputStream {
	public static void main(String[] args) {
		String pathname = "D:/khj/test01.txt";
		File file = new File(pathname);
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);

			// 한 글자 읽기(아스키코드 숫자값으로 읽어온다)
			// int res = fis.read();
			// System.out.println((char) res);

			// 한글자씩 다 읽기
			// -1 나올 때 까지 무한루프
			// 이미지, 동영상은 무조건 사용해야한다.

//			int res = 0;
//			while (true) {
//				res = fis.read();
//				if (res == -1)
//					break;
//				System.out.println(res + " : " + (char) res);
//			}
//			int res = 0;
//			while ((res = fis.read()) != -1) {
//				System.out.println(res + " : " + (char) res);
//			}
			// 배열이용 : 한글, 한자 깨짐
//			byte[] b = fis.readAllBytes();
//			for (int i = 0; i < b.length; i++) {
//				System.out.println(b[i] + " : " + (char) b[i]);
//			}
			
			// String 클래스 생성자 이용
			byte[] b = fis.readAllBytes();
			String msg = new String(b);
			System.out.println(msg);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
