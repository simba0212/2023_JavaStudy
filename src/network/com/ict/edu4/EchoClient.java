package network.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class EchoClient extends JFrame implements Runnable, ActionListener {
	JPanel jp;
	JTextArea jta;
	JScrollPane jsp;
	JTextField jtf;
	JButton jb;

	Socket s = null;
	OutputStreamWriter osw = null;
	BufferedWriter bw = null;

	InputStreamReader isr = null;
	BufferedReader br = null;

	public EchoClient() {
		super("에코클라이언트");
		jp = new JPanel();
		jta = new JTextArea(20, 1);
		jta.setLineWrap(true);
		jta.setEditable(false);
		jta.setFont(new Font("굴림", Font.PLAIN, 20));
		jta.setBackground(Color.LIGHT_GRAY);
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
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		connet();
		jtf.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				connet();
				sendMsg();
			}
		});

		jb.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				connet();
				sendMsg();
			}
		});
	}

	public void connet() {
		try {
			s = new Socket("localhost", 7778);
			bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(s.getInputStream()));

			new Thread(this).start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 보내는애
	public void sendMsg() {
		try {
			String msg = jtf.getText().trim();
			if (msg != null) {
				msg = msg + System.lineSeparator();
				bw.write(msg);
				bw.flush();
				jtf.setText("");
				jtf.requestFocus();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	// 받는 역할만 하는애
	public void run() {
		while (true) {
			try {
				String msg = br.readLine();
				if (msg != null) {
					jta.append(msg + "\n");
				}
				if (msg.equals("exit")) {
					closed();
					break;
				}
			} catch (Exception e) {
				// TODO: handle exception

			}
		}
		closed();
	}

	private void closed() {
		try {
			s.close();
			System.out.println("프로그램 종료");
			System.exit(0);

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public static void main(String[] args) {
		new EchoClient();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
