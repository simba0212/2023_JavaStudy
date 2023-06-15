package network.com.ict.edu7;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class ChatServer implements Runnable {
	ServerSocket ss;

	// 접속자(대기자)의 정보를 저장하는 곳
	ArrayList<CopyClient> c_list;
	// 대화방을 저장하는 곳
	ArrayList<ChatRoom> r_list;

	public ChatServer() {
		c_list = new ArrayList<>();
		r_list = new ArrayList<>();
		try {
			ss = new ServerSocket(7779);
			System.out.println("서버 대기중...");
			new Thread(this).start();
		} catch (Exception e) {
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				Socket s = ss.accept();
				CopyClient cc = new CopyClient(s, this);
				cc.start();
				c_list.add(cc);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

	}

	// 대기실에 있는 모든 접속자에게 프로토콜 전달
	public void sendMsg(Protocol p) {
		for (CopyClient k : c_list) {
			try {
				k.out.writeObject(p);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

	// 대기실에서 사용자 삭제
	public void removeClient(CopyClient cc) {
		c_list.remove(cc);
		// 목록 갱신
//		refresh();
	}

	// 방목록, 대기실명단 갱신
	public void refresh() {
		Protocol p = new Protocol();
		p.setCmd(2);
		p.setNames(getUserName()); // 대기실 목록 갱신
		p.setRooms(getRoomName()); // 방목록 갱신
	

		sendMsg(p);
	}

	// index를 받아서 r_list로 부터 room하나를 반환하는 메서드
	public ChatRoom getRoom(int index) {
		return r_list.get(index);
	}

	public String[] getRoomName() {
		String[] arr = new String[r_list.size()];
		int i = 0;
		for (ChatRoom k : r_list) {
			arr[i++] = k.getTitle();
		}
		return arr;
	}

	public String[] getUserName() {
		String[] arr = new String[c_list.size()];
		int i = 0;
		for (CopyClient k : c_list) {
			arr[i++] = k.nickName;
		}

		return arr;
	}

	// 방 객체 삭제
	public void removeRoom(ChatRoom cr) {
		r_list.remove(cr);
	}

	public static void main(String[] args) {
		new ChatServer();
	}

	public void addRoom(ChatRoom room) {
		r_list.add(room);
	}

	public void addClient(CopyClient cc) {
		c_list.add(cc);
		refresh();
		
	}

}
