package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class drink extends JFrame {
	public drink() {
		super("카페 주문");
		JPanel main = new JPanel(new BorderLayout());

		JPanel radio = new JPanel();
		JRadioButton jra1 = new JRadioButton("아메리카노(3000)");
		JRadioButton jra2 = new JRadioButton("카페모카(4000)");
		JRadioButton jra3 = new JRadioButton("카페 라떼(300)");
		JRadioButton jra4 = new JRadioButton("과일 쥬스(3000)");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jra1);
		bg.add(jra2);
		bg.add(jra3);
		bg.add(jra4);
		radio.add(jra1);
		radio.add(jra2);
		radio.add(jra3);
		radio.add(jra4);

		JPanel tf = new JPanel();
		JTextField tf1 = new JTextField(10);
		JTextField tf2 = new JTextField(10);

		tf.add(new JLabel("수량 : "));
		tf.add(tf1);
		tf.add(new JLabel("입금액 : "));
		tf.add(tf2);
		JLabel label = new JLabel("원하는 음료를 선택하세요");

		main.add(label, BorderLayout.NORTH);
		main.add(radio, BorderLayout.CENTER);
		main.add(tf, BorderLayout.SOUTH);

		JTextArea jta = new JTextArea();
		jta.setLineWrap(true);// 자동 줄바꾸기
		jta.setEditable(false);// 편집 불가능하게 만들기
		JScrollPane jsf = new JScrollPane(jta);

		JPanel l = new JPanel();
		JButton jbu1 = new JButton("계산");
		JButton jbu2 = new JButton("종료");
		JButton jbu3 = new JButton("취소");

		l.add(jbu1);
		l.add(jbu2);
		l.add(jbu3);

		add(main, BorderLayout.NORTH);
		add(jsf, BorderLayout.CENTER);
		add(l, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);

	}

	public static void main(String[] args) {
		new drink();
	}
}