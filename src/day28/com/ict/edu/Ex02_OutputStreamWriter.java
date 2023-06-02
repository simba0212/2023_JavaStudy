package day28.com.ict.edu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

// OutputStreamWriter : btye처리 스트림인 OutputStream을 문자처리스트림인 Writer로 변경해주거나 역으로 변경해주는 스트림
// OutputStream => OutputStreamWriter 를 거치면 => BufferedWriter로 쓸 수 있다.

// InputStreamReader : btye처리 스트림인 InputStream을 문자처리스트림인 Reader로 변경해주거나 역으로 변경해주는 스트림
// InputStream => InputStreamReader 를 거치면 => BufferedReader로 쓸 수 있다.
public class Ex02_OutputStreamWriter {
	public static void main(String[] args) throws IOException {

//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		이런식으로 한번에도 쓸수 있지만, 수업내용에서 배운것도 적어놓기

		// 모니터에 정보를 내보내는 법 System.out!
		OutputStreamWriter osw = new OutputStreamWriter(System.out);
		BufferedWriter bw = new BufferedWriter(osw);
		bw.write("원하는 문자 : ");
		bw.flush();
		// 키보드(표준입력장치 System.in)을 통해서 정보를 입력 받기
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String msg = br.readLine();
		
		bw.write("받은 문자 : " + msg);
		
		bw.flush();
	}
}
