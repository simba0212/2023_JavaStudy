package hw07;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Hw_main extends JFrame {
	JPanel pg1,pg2;
	CardLayout cardLayout, cardLayout2;
	JButton jb1,jb2,jb3;

	public Hw_main() {
		super("카드레이아웃 과제");
		pg1 = new JPanel();
		cardLayout = new CardLayout();
		pg1.setLayout(cardLayout);
		Hw_menu menu = new Hw_menu(cardLayout, pg1);
		Hw_calc calc = new Hw_calc(cardLayout, pg1);
		Hw_grade grade = new Hw_grade();
		Hw_nation nation = new Hw_nation();
		pg1.add("menu", menu);
		pg1.add("calc", calc);
		pg1.add("grade", grade);
		pg1.add("nation", nation);
		add(pg1);
		
		
		
//		cardLayout.show(pg1, "join");

//		pack();
		setLocationRelativeTo(null);
		setSize(500, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Hw_main();
	}
}
