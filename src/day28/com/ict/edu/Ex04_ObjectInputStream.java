package day28.com.ict.edu;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

// ObjectInputStream : 객체 입력 스트림
// readObject() : 객체 역직렬화 메서드
public class Ex04_ObjectInputStream {
	public static void main(String[] args) {
		String pathname = "D:/khj/object02.ser";
		ArrayList<Ex04_VO> list = new ArrayList<>();
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			// 역 직렬화
			list = (ArrayList<Ex04_VO>) ois.readObject();
			
			for (Ex04_VO k : list) {
				System.out.println(k.getName()+"\t"+k.getAge()+"\t"+k.getAddr()+"\t"+k.isGender()+"\t"+k.getHeight());
			}
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}
}
