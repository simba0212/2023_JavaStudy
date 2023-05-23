package day20.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class Ex01_Menu extends JFrame {
	JPanel panelN, panelC1, panelC2, panelC3, panelS, panelC;
	JButton order, cancel;
	JRadioButton jrb1, jrb2, jrb3, jrb4, jrb5, jrb6, jrb7, jrb8, jrb9, jrb10;
	ButtonGroup bg1, bg2, bg3;
	JTextField jtf;
	JTable jtb1, jtb2, jtb3;

	public Ex01_Menu() {
		super("피자 주문판");
		panelN = new JPanel();
		panelN.add(new JLabel("자바 피자에 오신 것을 환영합니다."));

		panelC1 = new JPanel();
		panelC2 = new JPanel();
		panelC3 = new JPanel();
		panelC = new JPanel();

		jrb1 = new JRadioButton("콤보(15000)", true);
		jrb2 = new JRadioButton("포테이토(20000)");
		jrb3 = new JRadioButton("불고기(30000)");
		bg1 = new ButtonGroup();
		bg1.add(jrb1);
		bg1.add(jrb2);
		bg1.add(jrb3);
		panelC1.add(jrb1);
		panelC1.add(jrb2);
		panelC1.add(jrb3);
		panelC1.setLayout(new GridLayout(3, 1));
		panelC1.setBorder(BorderFactory.createTitledBorder("종류"));

		jrb4 = new JRadioButton("피망(500)", true);
		jrb5 = new JRadioButton("치즈(1000)");
		jrb6 = new JRadioButton("페퍼로니(1500)");
		jrb7 = new JRadioButton("베이컨(2000)");
		bg2 = new ButtonGroup();
		bg2.add(jrb4);
		bg2.add(jrb5);
		bg2.add(jrb6);
		bg2.add(jrb7);
		panelC2.add(jrb4);
		panelC2.add(jrb5);
		panelC2.add(jrb6);
		panelC2.add(jrb7);
		panelC2.setLayout(new GridLayout(4, 1));
		panelC2.setBorder(BorderFactory.createTitledBorder("추가 토핑"));

		jrb8 = new JRadioButton("Small(80%)");
		jrb9 = new JRadioButton("Medium(100%)", true);
		jrb10 = new JRadioButton("Large(120%)");
		bg3 = new ButtonGroup();
		bg3.add(jrb8);
		bg3.add(jrb9);
		bg3.add(jrb10);
		panelC3.add(jrb8);
		panelC3.add(jrb9);
		panelC3.add(jrb10);
		panelC3.setLayout(new GridLayout(3, 1));
		panelC3.setBorder(BorderFactory.createTitledBorder("사이즈"));

		panelS = new JPanel();
		jtf = new JTextField(10);
		jtf.setEditable(false);
		order = new JButton("주문");
		cancel = new JButton("취소");
		panelS.add(order);
		panelS.add(cancel);
		panelS.add(jtf);

		panelC = new JPanel();
		panelC.add(panelC1);
		panelC.add(panelC2);
		panelC.add(panelC3);

		add(panelN, BorderLayout.NORTH);
		add(panelC1, BorderLayout.WEST);
		add(panelC2, BorderLayout.CENTER);
		add(panelC3, BorderLayout.EAST);
		add(panelS, BorderLayout.SOUTH);

		pack();
		setResizable(false);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Ex01_Menu();
	}
}
