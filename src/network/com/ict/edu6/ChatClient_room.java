package network.com.ict.edu6;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient_room extends JPanel implements ActionListener {
	ChatClient main;
	JTextArea jta;
	JTextField input_tf;

	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;

	public ChatClient_room(ChatClient main) {
		this.main = main;
		this.s = main.s;
		this.out = main.out;
		this.in = main.in;

		setLayout(new BorderLayout());
		jta = new JTextArea();
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("굴림", Font.PLAIN, 15));
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		add(jsp);

		JPanel jp1 = new JPanel(new BorderLayout());
		input_tf = new JTextField(10);
		jp1.add(input_tf, BorderLayout.CENTER);

		JButton send_bt = new JButton("보내기");
		jp1.add(send_bt, BorderLayout.EAST);
		JButton back = new JButton("뒤로가기");
		jp1.add(back, BorderLayout.WEST);

		add(jp1, BorderLayout.SOUTH);

		input_tf.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String msg = input_tf.getText().trim();
				jta.setText(msg);
				sendMessage();
			}
		});
		send_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});
	}

	private void sendMessage() {
		String msg = input_tf.getText().trim();
		if (msg.length() > 0) {
			try {
				// 메세지 보내기
				Protocol p = new Protocol();
				p.setCmd(2);
				p.setMsg(msg);
				out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		input_tf.setText("");
		input_tf.requestFocus();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	// 받기
	public void run() {
		esc: while (true) {
			try {
				Object obj = in.readObject();
				if (obj != null) {
					Protocol p = (Protocol) obj;
					switch (p.getCmd()) {
					case 0:
						break esc;

					case 2:
						jta.append(p.getMsg());
						break;

					default:
						break;
					}
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
	}

}
