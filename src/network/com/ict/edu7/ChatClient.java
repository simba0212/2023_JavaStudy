package network.com.ict.edu7;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class ChatClient extends JFrame implements Runnable {
	CardLayout cardLayout;
	JPanel pg;
	JLabel img;
	JTextField nickname_tf, input_tf, msg_tf;
	JPanel login_p, wait_p, chat_p;
	JButton login_bt, memo_bt, join_bt, mkRoom_bt, exit_bt, send_bt, exitR_bt;
	JTextArea jta;

	JList user_list, room_list, join_list;

	// 접속
	Socket s;
	ObjectInputStream in;
	ObjectOutputStream out;

	public ChatClient() {
		super("멀티 채팅");
		cardLayout = new CardLayout();
		pg = new JPanel(cardLayout);
		pg.setBorder(new EmptyBorder(10, 10, 10, 10));

		// 첫번째 카드
		login_p = new JPanel();
		login_p.setLayout(new BorderLayout());

		img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient.class.getResource("/images/chat.PNG")));
		login_p.add(img, BorderLayout.CENTER); // 카드1에 이미지넣기

		JPanel jp1 = new JPanel();
		jp1.setLayout(new GridLayout(2, 1));

		JPanel jp1_1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp1_1.add(new JLabel("닉네임 : "));
		nickname_tf = new JTextField(10);
		jp1_1.add(nickname_tf);
		jp1.add(jp1_1);

		JPanel jp1_2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		login_bt = new JButton(" 입장하기 ");
		jp1_2.add(login_bt);
		jp1.add(jp1_2);
		login_p.add(jp1, BorderLayout.SOUTH);

		pg.add(login_p, "login"); // 카드이름설정, 넣기

		// 두번째 카드
		wait_p = new JPanel(new BorderLayout());

		// 동쪽
		JPanel east_p = new JPanel(new BorderLayout());
		east_p.setPreferredSize(new Dimension(120, 300)); // 패널의 크기지정
		east_p.add(new JLabel(" [대기실] "), BorderLayout.NORTH);

		user_list = new JList();
		JScrollPane jsp = new JScrollPane();
		jsp.setViewportView(user_list);
		east_p.add(jsp, BorderLayout.CENTER);

		// 아래쪽 버튼집합
		JPanel east_south = new JPanel(new GridLayout(4, 1, 0, 0));
		memo_bt = new JButton("쪽지보내기");
		join_bt = new JButton("방 참여");
		mkRoom_bt = new JButton("방 생성");
		exit_bt = new JButton("종료");
		east_south.add(memo_bt);
		east_south.add(join_bt);
		east_south.add(mkRoom_bt);
		east_south.add(exit_bt);

		east_p.add(east_south, BorderLayout.SOUTH);
		wait_p.add(east_p, BorderLayout.EAST);

		// 센터 방목록보기
		JPanel center_p = new JPanel(new BorderLayout());
		room_list = new JList();
		center_p.add(new JLabel("[ 방 목록 ] "), BorderLayout.NORTH);
		JScrollPane jsp2 = new JScrollPane();
		jsp2.setViewportView(room_list);
		center_p.add(jsp2, BorderLayout.CENTER);
		wait_p.add(center_p, BorderLayout.CENTER);

		pg.add(wait_p, "wait");
		// 두번째카드 끝

		// 세번째카드 시작
		chat_p = new JPanel(new BorderLayout());
		pg.add(chat_p, "chat");

		// 동쪽
		JPanel chat_east_p = new JPanel(new BorderLayout());
		chat_east_p.setPreferredSize(new Dimension(120, 300)); // 패널의 크기지정

		join_list = new JList();
		JScrollPane jsp3 = new JScrollPane();
		jsp3.setViewportView(join_list);
		chat_east_p.add(new JLabel(" [사용자] ", JLabel.RIGHT), BorderLayout.NORTH);

		exitR_bt = new JButton("방 나가기");
		chat_east_p.add(exitR_bt, BorderLayout.SOUTH);
		chat_east_p.add(jsp3, BorderLayout.CENTER);

		chat_p.add(chat_east_p, BorderLayout.EAST);

		// 센터
		JPanel chat_center_p = new JPanel(new BorderLayout());

		chat_center_p.add(new JLabel("[채팅 기록]", JLabel.LEFT), BorderLayout.NORTH);
		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		JScrollPane jsp4 = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		chat_center_p.add(jsp4);

		// 채팅입력창
		JPanel center_south = new JPanel(new BorderLayout());

		msg_tf = new JTextField();
		send_bt = new JButton("보내기");

		center_south.add(msg_tf, BorderLayout.CENTER);
		center_south.add(send_bt, BorderLayout.EAST);

		chat_center_p.add(center_south, BorderLayout.SOUTH);
		chat_p.add(chat_center_p);

		cardLayout.show(pg, "login");
		add(pg); // 프레임 설정
		setSize(450, 550);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 이벤트 처리
		// 창 종료했을 떄
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				if (s != null) { // 접속된 상태 (소켓이 있냐 없냐)
					try {
						Protocol p = new Protocol();
						p.setCmd(0);
						out.writeObject(p);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				} else {
				}
			}
		});

		// 입장하기 버튼 액션
		login_bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String name = nickname_tf.getText().trim();
				if (name.length() > 0) {
					// 서버 접속
					if (connected()) {
						Protocol p = new Protocol();
						p.setCmd(2);
						p.setMsg(name);
						try {
							out.writeObject(p);
							cardLayout.show(pg, "wait");
						} catch (Exception e2) {
							// TODO: handle exception
						}
					}
				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임을 입력하세요");
					nickname_tf.setText("");
					nickname_tf.requestFocus();

				}
			}
		});

		exit_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Protocol p = new Protocol();
				p.setCmd(0); // 나 종료할거야
				try {
					out.writeObject(p); // 스트림으로 쏴
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		memo_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String msg = JOptionPane.showInputDialog("내용을 입력하세요");
					if (msg.length() <= 0 || msg == null) {
						JOptionPane.showMessageDialog(getParent(), "내용을 입력하세요");
					} else {
						Protocol p = new Protocol();
						p.setCmd(6);
						p.setMsg(msg);
						// 대기실 리스트에서 사람 선택하는 메서드
						p.setC_index(user_list.getSelectedIndex());

						out.writeObject(p);
					}
				} catch (Exception e2) {

				}
			}
		});

		mkRoom_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 사용자에게 방 제목을 받자
				String name = JOptionPane.showInputDialog(getParent(), "방 제목을 입력하세요");
				if (name.length() <= 0 || name == null) {
					JOptionPane.showMessageDialog(getParent(), "방 제목을 입력하세요");
				} else {
					try {
						Protocol p = new Protocol();
						p.setCmd(3);
						p.setMsg(name);

						out.writeObject(p);
						cardLayout.show(pg, "chat");
					} catch (Exception e2) {
						// TODO: handle exception
					}

				}

			}
		});

		join_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int r_index = room_list.getSelectedIndex();
				if (r_index >= 0) {
					try {
						Protocol p = new Protocol();
						p.setCmd(4);
						p.setR_index(r_index);
						out.writeObject(p);
						cardLayout.show(pg, "chat");
					} catch (Exception e2) {
						// TODO: handle exception
					}
				}

			}
		});

		// 채팅하기
		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
		msg_tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();

			}
		});

		// 방 나가기
		exitR_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					jta.setText("");
					Protocol p = new Protocol();
					p.setCmd(5);
					out.writeObject(p);

					cardLayout.show(pg, "wait");

				} catch (Exception e2) {
					// TODO: handle exception
				}

			}
		});
	}

	private void sendMessage() {
		try {
			String msg = msg_tf.getText().trim();
			if (msg.length() > 0) {
				Protocol p = new Protocol();
				p.setCmd(1);
				p.setMsg(msg);
				out.writeObject(p);
				msg_tf.setText("");
				msg_tf.requestFocus();
			}
		} catch (Exception e) {
		}
	}

	private boolean connected() {
		boolean value = true;
		try {
			s = new Socket("localhost", 7779);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();
			return value;

		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	private void closed() {
		try {
			in.close();
			out.close();
			s.close();
			System.exit(0);
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	@Override
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {

					case 0:

						break esc;
					case 1: // 메세지 전달
						jta.append(p.getMsg() + "\n");
						jta.setCaretPosition(jta.getText().length());
//						join_list.setListData(p.getNames());

						break;
					case 2: // 접속 및 갱신 --> 누가 접속을 했다? 입장하기 버튼을 눌렀다? cmd로 2를 보냈을거고, 여기로 떨어진다.
						// 유저목록가져오기
						user_list.setListData(p.getNames());
						// 방 목록
						room_list.setListData(p.getRooms());

						break;

					case 4: // 방 참여
						join_list.setListData(p.getNames());
						jta.append(p.getMsg() + "\n");
						break;
						
					case 5: // 대화방 참여자 목록
						join_list.setListData(p.getNames()); // 프로토콜에 저장되어 있는 방에 참여한 사람들 목록
						break;

					case 6: // 쪽지 보내기
						JOptionPane.showMessageDialog(getParent(), p.getMsg());
						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		System.exit(0);

	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				new ChatClient();
			}
		});
	}
}
