package hw06;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class hw_0519 extends JFrame {
	public hw_0519() {
		super("회원가입");

		JPanel jpNorth = new JPanel(new GridLayout(6, 1));
		JPanel jp1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp2 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp4 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp5 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp6 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		JPanel jp7 = new JPanel();

		JTextField jtf1 = new JTextField(10);
		JTextField jtf2 = new JTextField(10);
		JTextField jtf3 = new JTextField(20);

		jp1.add(new JLabel("이 름 : "));
		jp1.add(jtf1);
		jp1.add(new JLabel("성 별 : "));
		JRadioButton jrb1 = new JRadioButton("남");
		JRadioButton jrb2 = new JRadioButton("여");
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jp1.add(jrb1);
		jp1.add(jrb2);
		jpNorth.add(jp1);

		jp2.add(new JLabel("생년월일 : "));
		jp2.add(jtf2);
		jpNorth.add(jp2);

		jp3.add(new JLabel("주  소 : "));
		jp3.add(jtf3);
		jpNorth.add(jp3);

		jp4.add(new JLabel("부 서 명 : "));
		String[] items = { "부서", "부서1", "부서2", "부서3" };
		JComboBox<String> jcom = new JComboBox<>(items);
		jp4.add(jcom);
		jpNorth.add(jp4);

		jp5.add(new JLabel("취 미 : "));
		JCheckBox jcb1 = new JCheckBox("운동");
		JCheckBox jcb2 = new JCheckBox("영화");
		JCheckBox jcb3 = new JCheckBox("독서");
		JCheckBox jcb4 = new JCheckBox("컴퓨터");
		jp5.add(jcb1);
		jp5.add(jcb2);
		jp5.add(jcb3);
		jp5.add(jcb4);
		jpNorth.add(jp5);

		jp6.add(new JLabel("자 기 소 개"));
		jpNorth.add(jp6);

		add(jpNorth, BorderLayout.NORTH);

		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		add(jsp, BorderLayout.CENTER);

		JButton jb1 = new JButton("저 장");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		jp7.add(jb1);
		jp7.add(jb2);
		jp7.add(jb3);
		add(jp7, BorderLayout.SOUTH);
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 200, ds.height / 2 - 250, 400, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new hw_0519();
	}
}
