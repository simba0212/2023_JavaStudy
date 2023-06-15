package network.com.ict.edu5;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class ChatClient extends JFrame implements Runnable {
	JPanel jp;
	JButton jb;
	JTextField jtf;
	JScrollPane jsp;
	JTextArea jta;

	Socket s;
	BufferedReader br;
	PrintWriter out;

	public ChatClient() {
		super("멀티채팅 ver 0.1");
		jp = new JPanel();
		jta = new JTextArea(20, 1);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("굴림", Font.PLAIN, 20));
		jta.setBackground(Color.lightGray);
		jta.setForeground(Color.white);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jtf = new JTextField(35);
		jb = new JButton("보내기");

		jp.add(jtf);
		jp.add(jb);

		add(jsp, BorderLayout.CENTER);
		add(jp, BorderLayout.SOUTH);

		pack();
		setLocationRelativeTo(null);
		setVisible(true);
		// setDefaultCloseOperation(EXIT_ON_CLOSE);

		connected();
		jtf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});

		jb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sendMessage();
			}
		});

	}

	private void connected() {
		try {
			s = new Socket("localhost", 7778);
			out = new PrintWriter(s.getOutputStream(), true);
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			new Thread(this).start();

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	private void sendMessage() {
		String msg = jtf.getText().trim();
		out.println(msg);
		jtf.setText("");
		jtf.requestFocus();
	}

	private void closed() {
		try {
			br.close();
			out.close();
			s.close();
			System.out.println("프로그램 종료");
			System.exit(0);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void run() {
		while (true) {
			try {
				String msg = br.readLine();
				if (msg.equals("~~bye")) {
					break;
				} else {
					jta.append(msg + "\n");
					// 문자열 출력 후 화면을 가장 하단으로 이동하자.
					jta.setCaretPosition(jta.getText().length());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		closed();
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ChatClient();

			}
		});
	}
}