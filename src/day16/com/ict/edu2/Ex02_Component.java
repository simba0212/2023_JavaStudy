package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_Component extends JFrame {
	public Ex02_Component() {
		super("버튼 이벤트");

		JPanel jp = new JPanel();

		JButton jb1 = new JButton();
		jb1.setText("첫번째");

		JButton jb2 = new JButton("두번째");

		// jb1.addActionListener(ActionListener i);
		// ActionListener => 인터페이스
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("첫번째 버튼 클릭");
			}
		});

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 150, ds.width / 2 - 150, 300, 300);// 크기한번에 지정하기
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
	}

	public static void main(String[] args) {
		new Ex02_Component();
	}

}
