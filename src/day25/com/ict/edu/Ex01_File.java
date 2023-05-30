package day25.com.ict.edu;

import java.io.File;
import java.util.Arrays;

// File클래스	:	특정위치(경로=path)에 존재하는 파일이나 디렉토리를 처리하는 클래스

// 주요 생성자	:	File(String 경로), File(String 상위경로, String 하위경로)
//				File(File 상위경로, String 하위경로)
// 주요 메서드	:	createNewFile()	: 파일 생성
//				mkdir()			: 디렉토리 생성
//				delete()		: 삭제
//				isFile			: 파일이면 true반환
//				isDirectory()	: 디렉토리이면 true
//			파일과 디렉토리 차이점	: 크기가 존재하면 File
//				list()			: 특정위치의 내용을 (파일,디렉토리)를 배열에 저장
//				exists()		: 존재유무. 있으면 true
//				getName()		: 이름반환
//				length()		: File의 크기를 byte로 변환해서 표시
//			getAbsolutPath()	: 절대주소 표시 (루트부터 시작해서 위치 표시)
//				getPath()		: 상대주소 표시 (현재위치부터 시작해서 위치표시)
public class Ex01_File {
	public static void main(String[] args) {
		String pathName = "D:\\khj";
		File file = new File(pathName);
		String [] arr = file.list();
		for (String k : arr) {
//			System.out.println(k);
			File file2 = new File(pathName, k);
//			System.out.println(file2);
			if(file2.isDirectory()) {
				System.out.println("디렉토리 : "+ k);
			}else {
				System.out.println("파일 : "+k);
			}
			
		}
	}
}
