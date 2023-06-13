package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class EchoClient {
	public static void main(String[] args) throws Exception {
		Socket s = null;
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedOutputStream bo;
		BufferedInputStream bi;

		s = new Socket("localhost", 7777);
		System.out.println("클라이언트 연결 성공");

		// 입출력 스트림

		bi = new BufferedInputStream(s.getInputStream());
		
		// 메세지 전송
		bo = new BufferedOutputStream(s.getOutputStream());
		bw.write("보낼 메세지를 입력하세요 : ");
		bw.flush();
		String msg = br.readLine();
		bo.write(msg.getBytes());
		bo.flush();

		// 서버에서 전송된 데이터 수신
		byte[] buff = new byte[100];
		bi.read(buff);
		String receive_msg = new String(buff).trim();

		System.out.println("에코메세지 : " + receive_msg);

	}
}
