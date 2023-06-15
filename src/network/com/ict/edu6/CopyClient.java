package network.com.ict.edu6;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;
	// 객체 직렬화
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;

	public CopyClient(Socket s, ChatServer server) throws Exception {
		this.s = s;
		this.server = server;
		in = new ObjectInputStream(s.getInputStream());
		out = new ObjectOutputStream(s.getOutputStream());
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0: // 접속종료
						out.writeObject(p);
						break esc;

					case 1: // 닉네임받기
						nickName = p.getMsg();
						p.setCmd(2);
						p.setMsg(nickName + "님 입장\n");

						// 접속자 모두에게 전달
						server.sendMsg(p);
						break;

					case 2: // 메세지
						p.setCmd(2);
						p.setMsg(nickName + " : " + p.getMsg() + "\n");
						server.sendMsg(p);

						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		} // while끝
			// 다른사람에게 나 나간다고 알림
		try {
			out.close();
			in.close();
			s.close();

			server.removeClient(this); // 날 지워줘 서버야
			Protocol p2 = new Protocol();
			p2.setCmd(2);
			p2.setMsg(nickName + "님 퇴장\n");
			server.sendMsg(p2);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public CopyClient() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		new CopyClient();
	}

}
