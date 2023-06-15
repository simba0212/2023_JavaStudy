package network.com.ict.edu6;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class ChatClient_login extends JPanel implements ActionListener, Runnable {
	ChatClient main;

	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;

	public ChatClient_login(ChatClient main) {
		this.main = main;
		setLayout(new BorderLayout());
		JPanel jp1 = new JPanel();
		add(jp1, BorderLayout.SOUTH);
		jp1.setLayout(new GridLayout(2, 1));

		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		jp2.add(new JLabel("닉네임 : "));
		JTextField nickname_tf = new JTextField(10);
		jp2.add(nickname_tf);

		jp1.add(jp2);

		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		JButton join_bt = new JButton(" 입장하기 ");
		jp3.add(join_bt);

		jp1.add(jp3);

		JLabel img = new JLabel("");
		img.setHorizontalAlignment(SwingConstants.CENTER);
		img.setIcon(new ImageIcon(ChatClient_one.class.getResource("/images/talk.png")));
		add(img, BorderLayout.CENTER);

		join_bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String name = nickname_tf.getText();
				if (name.length() != 0) {
					if (connected()) {
						try {
							Protocol p = new Protocol();
							p.setCmd(1);
							p.setMsg(name);
							out.writeObject(p);
							main.cardLayout.show(main.pg1, "room");

						} catch (Exception e2) {
							e2.printStackTrace();
						}

					}

				} else {
					JOptionPane.showMessageDialog(getParent(), "닉네임을 입력하세요");
					nickname_tf.setText("");
					nickname_tf.requestFocus();
				}

			}
		});

	}

	private boolean connected() {
		boolean value = true;
		try {
			s = new Socket("localhost", 7778);
			out = new ObjectOutputStream(s.getOutputStream());
			in = new ObjectInputStream(s.getInputStream());
			new Thread(this).start();

			return value;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

}
