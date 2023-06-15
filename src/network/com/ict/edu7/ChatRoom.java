package network.com.ict.edu7;

import java.io.IOException;
import java.util.ArrayList;

public class ChatRoom {
	// 방 참여자들이 모여있는 공간 - 입장/퇴장시 여기서 처리해야한다.
	// 마지막사람이 나가면 방은 삭제된다.

	ArrayList<CopyClient> j_list;
	String title; // 방제목

	public ChatRoom(String title) {
		j_list = new ArrayList<>();
		this.title = title;

	}

	public String getTitle() {
		return title;
	}

	// 현재 방에 참여자들의 수를 반환 - 방 나갈때, 마지막 사람일 경우 방을 삭제한다.
	public int getJoinCount() {
		return j_list.size();
	}

	// 방 참여
	public void join(CopyClient cc) {
		j_list.add(cc);

		// 방 참여자에게 메세지 전달 (대기실에 있는 사람에게는 전달안됨)
		Protocol p = new Protocol();
		p.setCmd(4);
		p.setMsg(" ** " + cc.nickName + "님 입장 **");
		p.setNames(getJoinUsers());
		sendProtocol(p);
	}

	// 방 참여 명단 반환 (방 나가기하면 명단 갱신 필요)
	public String[] getJoinUsers() {
		String[] arr = new String[j_list.size()];
		int i = 0;
		for (CopyClient k : j_list) {
			arr[i++] = k.nickName;
		}
		return arr;
	}

	// 채팅기능
	public void sendProtocol(Protocol p) {
		for (CopyClient k : j_list) {
			try {
				k.out.writeObject(p);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	// 방 나가기
	public void getOut(CopyClient cc) {
		j_list.remove(cc);

		// 방 참여자에게 메세지 전달 (대기실에 있는 사람에게는 전달안됨)
		Protocol p = new Protocol();
		p.setCmd(1);
		p.setMsg(" ** " + cc.nickName + "님 퇴장 **");
		p.setNames(getJoinUsers());
		sendProtocol(p);
	}

//	public void refresh() {
//		Protocol p = new Protocol();
//		p.setCmd(2);
//		p.setNames(getJoinUsers());
//
//		sendProtocol(p);
//	}

}
