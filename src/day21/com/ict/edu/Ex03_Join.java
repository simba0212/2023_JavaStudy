package day21.com.ict.edu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex03_Join extends JFrame implements ActionListener {
	JPanel jp;
	JButton jb;
	Ex03_Main main;

	public Ex03_Join(Ex03_Main main) {

		super("회원가입 창");
		this.main = main;
		jp = new JPanel();
		jb = new JButton("뒤로가기");

		jp.add(jb);
		add(jp);
		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.setVisible(true);
				setVisible(false);
			}
		});

		setLocationRelativeTo(null);
		setSize(500, 300);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
