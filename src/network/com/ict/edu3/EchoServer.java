package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
	
	
	
	public static void main(String[] args) throws Exception {
		ServerSocket ss = null;

		Socket s = null;

		// 생성
		ss = new ServerSocket(7777);
		System.out.println("서버 대기중 ... ");

		// 무한루프
		while (true) {
			// Request가 올때까지 대기하다가, Request가 오면
			// Client와 통신할 Socket을 만든다.
			s = ss.accept();

			// 입출력 스트림
			BufferedInputStream bi = new BufferedInputStream(s.getInputStream());
			BufferedOutputStream bo = new BufferedOutputStream(s.getOutputStream());

			// 데이터 수신
			byte[] buff = new byte[100];
			bi.read(buff);

			String read_data = new String(buff).trim();
			String client_ip = s.getInetAddress().getHostAddress();
			System.out.println("서버에 수신된 데이터 : " + read_data + "(" + client_ip + ")");

			// 데이터 송신
			bo.write(read_data.getBytes());
			bo.flush();

		}

	}
}
