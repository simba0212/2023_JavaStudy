package hw07;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Hw_menu extends JPanel implements ActionListener {
	CardLayout cardLayout;
	JPanel pg1;
	JButton jb1, jb2,jb3;

	// main에 있는 cardLayout, pg1를 이용하기 위해서 정보를 받아야 한다.
	// 새로 만들면 정보 교류를 할 수 없다
	public Hw_menu(CardLayout cardLayout, JPanel pg1) {
		// 생성자에서 받은정보는 무조건 전역변수로 만들어준다
		this.cardLayout = cardLayout;
		this.pg1 = pg1;

//		add("login", this);

		jb1 = new JButton("계산기");
		jb2 = new JButton("성적표");
		jb3 = new JButton("수도구하기");
		add(jb1);
		add(jb2);
		add(jb3);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "calc");
			}
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "grade");
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.show(pg1, "nation");
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
