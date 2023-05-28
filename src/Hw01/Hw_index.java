package Hw01;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Hw_index extends JPanel implements ActionListener {
	JButton jb1, jb2, jb3;
	Hw_CardLayout main;

	public Hw_index(Hw_CardLayout main) {
		jb1 = new JButton("계산기");
		jb2 = new JButton("성적표");
		jb3 = new JButton("수도구하기");
		add(jb1);
		add(jb2);
		add(jb3);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.cardLayout.show(main.pg1, "calc");
			}
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.cardLayout.show(main.pg1, "grade");
			}
		});
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				main.cardLayout.show(main.pg1, "nation");
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
