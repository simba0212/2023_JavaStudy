package network.com.ict.edu;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// URLConnection 클래스 : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올 수 있다.
public class Ex03 {
	public static void main(String[] args) throws Exception {
		BufferedReader br;
		URL url = new URL("https://movie.daum.net/main");
		URLConnection conn = url.openConnection();

		br = new BufferedReader(new InputStreamReader(conn.getInputStream())); // url에서 커넥션을 연결하고, 리더로 읽어온다.

		System.out.println("인코딩\t: " + conn.getContentEncoding());
		System.out.println("길이\t: " + conn.getContentLength());
		System.out.println("문서타입\t: " + conn.getContentType());
		
		// 인터넷 정보는 헤더와 바디로 나눠진다.
		// 헤더 정보를 가지고 웹브라우저가 해석하고 실행한다.
		// 헤더 정보를 얻어내는 방법
		Map<String, List<String>> list = conn.getHeaderFields();
		for (String k : list.keySet()) {
			System.out.println(k + " : "+list.get(k));
		}
		br.close();
	}

}
