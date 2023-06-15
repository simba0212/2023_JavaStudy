package network.com.ict.edu7;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class CopyClient extends Thread {
	Socket s;
	ChatServer server;
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;

	// 현재 클라이언트가 참여하고 있는 방의 정보
	ChatRoom c_room; // null이면 어떤 방에도 참여하지 않은 상태

	public CopyClient(Socket s, ChatServer server) {
		this.s = s;
		this.server = server;
		try {
			in = new ObjectInputStream(s.getInputStream());
			out = new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj;
				obj = in.readObject(); // 스트림에서 받아
				if (obj != null) {
					Protocol p = (Protocol) obj; // 오브젝트 인풋 스트림으로 가져온 obj를 우리가 알수있는 프로토콜 객체로 형변환한다.
					switch (p.getCmd()) { // 프로토콜에 전송되어있는 CMD값(커맨드값)에 따라 각각 다른 역할을 수행하도록 한다.
					case 0: // 종료
						// 현재 방에 참여하고 있는 상태인지 확인
						if (c_room != null) {
							outRoom();
						}
						out.writeObject(p);
						break esc;
					case 1: // 메세지
						p.setMsg(nickName + " : " + p.getMsg());
						
						c_room.sendProtocol(p);
						break;
					case 2: // 접속 및 갱신
						nickName = p.getMsg();
						// 현재 대기실의 명단을 수집하자.
						p.setNames(server.getUserName());
						// 방 제목 수집
						p.setRooms(server.getRoomName());
						// 모두에게 전달
						server.sendMsg(p);
						break;
					case 3: // 방 만들기
						c_room = new ChatRoom(p.getMsg());
						// 만든 사람이 방에 들어가야함
						c_room.join(this);
						// 대기실에서는 삭제해야함
						server.removeClient(this);
						// 서버에 방 추가
						server.addRoom(c_room);
						// 대기실 갱신
						server.refresh();
						break;
					case 4: // 방 참여
						// r_index를 이용해서 방 객체 가져오기
						c_room = server.getRoom(p.getR_index());
						// 방 들어가기
						c_room.join(this);
						// 대기실에서 나오기
						server.removeClient(this);
						server.refresh();
						break;
					case 5: // 방 나가기
						outRoom();
						server.refresh();
						server.addClient(this);
						break;
					case 6: // 쪽지보내기
						CopyClient client = server.c_list.get(p.getC_index());
						String msg = p.getMsg();
						p.setMsg(nickName + "님 쪽지 : \n" + msg);

						// 한사람에게 쪽지보내기
						client.out.writeObject(p);
						break;

					}
				}

			} catch (ClassNotFoundException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} // 하나의 사용자에 대해 한개의 쓰레드가 무한반복으로 받고있는거다.
		server.removeClient(this);
		try {
			out.close();
			in.close();
			s.close();

		} catch (Exception e) {
			// TODO: handle exception
		}

	} // run블럭 끝

	private void outRoom() {
		c_room.getOut(this);
		int cnt = c_room.getJoinCount();
		if (cnt == 0) {
			server.removeRoom(c_room);
		}
		c_room = null;
	}

}
