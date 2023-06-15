package network.com.ict.edu3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.Socket;

public class EchoClient_thread implements Runnable {

	Socket s;
	BufferedOutputStream bos;
	BufferedInputStream bis;
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public EchoClient_thread() {
		new Thread(this).start();
	}

	@Override
	public void run() {
		while (true) {
			try {
				System.out.print("데이터 입력 : ");
				String msg = br.readLine();
				br.readLine();

				s = new Socket("localhost", 7778);

				// 출력 --> 바이트변환해서 서버로 송신
				bos = new BufferedOutputStream(s.getOutputStream());
				bos.write(msg.getBytes());
				bos.flush();

				// 서버에서 바이트정보 수신
				bis = new BufferedInputStream(s.getInputStream());
				byte[] b = new byte[1024];
				bis.read(b);

				String str = new String(b);
				System.out.println("서버에서 받은 내용 : " + str);
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				try {
					br.close();
					bis.close();
					bos.close();
					s.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		}
	}

	public static void main(String[] args) {
		new EchoClient_thread();
	}

}
