package Hw01;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hw_CardLayout extends JFrame {
	JPanel pg1;
	CardLayout cardLayout;

	public Hw_CardLayout() {
		super("프로그램 선택");
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		Hw_index index = new Hw_index(this);
		Hw_grade grade = new Hw_grade(this);
		Hw_calc calc = new Hw_calc(this);
		Hw_nation nation = new Hw_nation(this);
		
		pg1.add("index", index);
		pg1.add("calc",calc);
		pg1.add("grade", grade);
		pg1.add("nation",nation);

		add(pg1);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Hw_CardLayout();
	}
}
