package network.com.ict.edu6;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ChatClient extends JFrame {
	JPanel pg1;
	CardLayout cardLayout;
	
	Socket s;
	ObjectOutputStream out;
	ObjectInputStream in;
	
	

	public ChatClient() {
		super("멀티 채팅 ver 0.3");
		cardLayout = new CardLayout();
		pg1 = new JPanel(cardLayout);

		ChatClient_login log = new ChatClient_login(this);
		ChatClient_room room = new ChatClient_room(this);

		pg1.add("log", log);
		pg1.add("room",room);
		
		add(pg1);
		
		setBounds(700, 300, 380, 520);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pg1.setBorder(new EmptyBorder(10, 10, 10, 10));
		
	}
	

	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {

			@Override
			public void run() {
				ChatClient cc = new ChatClient();
				cc.setVisible(true);
			}
		});
	}
	

	
}
