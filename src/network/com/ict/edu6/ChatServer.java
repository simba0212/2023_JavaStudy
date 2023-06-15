package network.com.ict.edu6;

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
			System.out.println("서버 대기중 ...");

			exec();
		} catch (Exception e) {
		}
	}

	private void exec() throws Exception {
		while (true) {
			Socket s = ss.accept();
			CopyClient cc = new CopyClient(s, this);
			cc.start();
			list.add(cc);
		}
	}

	public void sendMsg(Protocol p) throws Exception {
		for (CopyClient k : list) {
			k.out.writeObject(p);
		}
	}

	public void removeClient(CopyClient copyClient) {
		list.remove(copyClient);
	}

	public static void main(String[] args) {
		new ChatServer();
	}

}
