package day21.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// 카드 레이아웃 : 카드가 뒤집혀 진 상태에서 이벤트가 발생하면 하나씩 보여주는 형태의 레이아웃
// 여기서 카드란, JPanel이다.
public class Ex01_CardLayout extends JFrame implements ActionListener {
	JPanel card1, card2, card3, card4, card5, pg1, pg2;
	JButton jb1, jb2, jb3, jb4;
	CardLayout cardLayout;

	public Ex01_CardLayout() {
		super("카드레이아웃");

		// 각각의 카드패널을 만들어보자
		card1 = new JPanel(new BorderLayout());
		card1.setBackground(Color.PINK);
		card1.add(new JLabel("첫번째 카드", JLabel.CENTER));
		card2 = new JPanel(new BorderLayout());
		card2.setBackground(Color.BLUE);
		card2.add(new JLabel("두번째 카드", JLabel.CENTER));
		card3 = new JPanel(new BorderLayout());
		card3.setBackground(Color.CYAN);
		card3.add(new JLabel("세번째 카드", JLabel.CENTER));
		card4 = new JPanel(new BorderLayout());
		card4.setBackground(Color.GREEN);
		card4.add(new JLabel("네번째 카드", JLabel.CENTER));
		card5 = new JPanel(new BorderLayout());
		card5.setBackground(Color.MAGENTA);
		card5.add(new JLabel("다섯번째 카드", JLabel.CENTER));

		cardLayout = new CardLayout();
		pg1 = new JPanel(cardLayout);
		pg1.setAlignmentX(CENTER_ALIGNMENT);
		pg1.add("1", card1);
		pg1.add("2", card2);
		pg1.add("3", card3);
		pg1.add("4", card4);
		pg1.add("5", card5);

		// 첫 카드를 지정하지 않으면 맨 처음 카드가 나온다.
		// 첫 카드를 지정하자
		cardLayout.show(pg1, "3");

		pg2 = new JPanel();

		jb1 = new JButton("<<");
		jb2 = new JButton("<");
		jb3 = new JButton(">");
		jb4 = new JButton(">>");
		pg2.add(jb1);
		pg2.add(jb2);
		pg2.add(jb3);
		pg2.add(jb4);

		add(pg1);
		add(pg2, BorderLayout.SOUTH);

		setLocationRelativeTo(null);
		setSize(400, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.first(pg1);
			}
		});
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.previous(pg1);
			}
		});
		jb3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.next(pg1);
			}
		});
		jb4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cardLayout.last(pg1);
			}
		});

	}

	public static void main(String[] args) {
		new Ex01_CardLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

	}
}
