package network.com.ict.edu5;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer chatServer;

	BufferedReader br;
	PrintWriter out;
	String ip;

	public CopyClient(Socket s, ChatServer chatServer) {
		this.s = s;
		this.chatServer = chatServer;
		try {
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			out = new PrintWriter(s.getOutputStream(), true);
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				String msg = br.readLine();
				if (msg.equals("exit")) {
					// 원격에 있는 실제 클라이언트에게 종료메시지를 송신
					out.println("~~bye");
					break;
				}
				chatServer.sendMsg(ip + " : " + msg);
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		try {
			out.close();
			br.close();
			s.close();
			// server에 있는 list에 현재 객체 삭제
			chatServer.removeClint(this);
			chatServer.sendMsg(ip + "님 퇴장");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
