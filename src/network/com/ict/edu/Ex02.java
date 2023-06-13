package network.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

// URL (Uniform Resource Locator) : 인터넷에서 접근가능한 자원의 주소
// URL 클래스는 원격 서버의 자원의 결과만을 가져온다.
// final 클래스이므로 상속 안됨

public class Ex02 {
	public static void main(String[] args) throws Exception {
		

		// 파일에 저장하기
		String pathname = "D:/khj/khj01.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(pathname));

		URL url = new URL("https://movie.daum.net/main");
		System.out.println("프로토콜 : " + url.getProtocol());
		System.out.println("포트 : " + url.getPort());
		System.out.println("경로 : " + url.getPath());
		System.out.println("호스트 : " + url.getHost());
		System.out.println("안내 : " + url.getUserInfo());

		// 해당 사이트 가서 정보 읽기
		BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream())); // url에가서 스트림을 열고 리더로 읽어온다.
		String str = null;
		StringBuffer sb = new StringBuffer();
		while ((str = br.readLine()) != null) {
			System.out.println(str + "\n");
			sb.append(str+"\n");
		}
		
		bw.write(sb.toString());
		bw.flush();
		
	}
}
