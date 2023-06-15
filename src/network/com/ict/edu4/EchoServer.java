package network.com.ict.edu4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer implements Runnable {
	ServerSocket ss;
	Socket s;

	BufferedReader br;
	BufferedWriter bw;

	public EchoServer() {
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 대기중 ...");
			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while (true) {
			try {
				s = ss.accept();
				br = new BufferedReader(new InputStreamReader(s.getInputStream()));
				bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

				String msg = br.readLine();
				System.out.println(msg);
				// bw를 사용시 System.lineSeparator() 사용해야 된다.
				// readLine()에서 개행문자까지 읽어오기 때문에!! 오류가 항상 난다.
				// lineSeparator()를 통해 문자의 끝을 알려줄수있다.
				msg += System.lineSeparator();
				bw.write(msg);
				bw.flush();

			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					s.close();
					br.close();
					bw.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		}
	}

	public static void main(String[] args) {
		new EchoServer();
	}
}
