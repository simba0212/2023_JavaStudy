package network.com.ict.edu5;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer {
	ServerSocket ss;
	ArrayList<CopyClient> list;
	

	public ChatServer() {
		list = new ArrayList<>();
		try {
			ss = new ServerSocket(7778);
			System.out.println("서버 시작!");

			exe();
		} catch (Exception e) {
		}
	}

	public void exe() {
		while (true) {
			try {
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				list.add(cc);
				sendMsg(" ** "+ cc.ip+ "님 입장");
			} catch (Exception e) {
			}
		}
	}

	public void sendMsg(String msg) {
		// List의 모든사람에게 채팅을 보내는 메서드
		for (CopyClient k : list) {
			k.out.println(msg);
		}
	}
	
	public void removeClint(CopyClient copyClient) {
		// 클라이언트 삭제 메서드
		list.remove(copyClient);
		
	}

	public static void main(String[] args) {
		new ChatServer();
	}

	
}
