package hw01;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Hw_grade extends JPanel implements ActionListener {
	Hw_CardLayout main;
	JPanel jpOne, jp1, jp2, jp3;
	JTextField jtf1, jtf2, jtf3, jtf4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2, jb3, jb4;

	public Hw_grade(Hw_CardLayout main) {
		this.main = main;
		
		setLayout(new BorderLayout());
		jpOne = new JPanel(new BorderLayout());
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();

		jtf1 = new JTextField(10);
		jtf2 = new JTextField(10);
		jtf3 = new JTextField(10);
		jtf4 = new JTextField(10);

		jp1.add(new JLabel("이름 : "));
		jp1.add(jtf1);
		jpOne.add(jp1, BorderLayout.NORTH);

		jp2.add(new JLabel("국어 : "));
		jp2.add(jtf2);
		jp2.add(new JLabel("영어 : "));
		jp2.add(jtf3);
		jp2.add(new JLabel("수학 : "));
		jp2.add(jtf4);

		jpOne.add(jp2, BorderLayout.SOUTH);
		add(jpOne, BorderLayout.NORTH);

		jta = new JTextArea(30, 50);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

		jta.setLineWrap(true);
		add(jsp);

		jb1 = new JButton("계 산");
		jb2 = new JButton("종 료");
		jb3 = new JButton("취 소");
		jb4 = new JButton("뒤로가기");

		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		jp3.add(jb4);
		add(jp3, BorderLayout.SOUTH);
		// 화면구성끝

		// 버튼구현
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		jb3.addActionListener(this);
		jb4.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if (obj == jb2) {
			System.exit(0);
		} else if (obj == jb3) {
			jta.setText("");
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");
		} else if (obj == jb1) {
			cal();
		} else if (obj == jb4) {
			jtf1.setText("");
			jtf2.setText("");
			jtf3.setText("");
			jtf4.setText("");
			jta.setText("");
			main.cardLayout.show(main.pg1, "index");
		}

	}

	public void cal() {
		String name = jtf1.getText();
		int kor = Integer.parseInt(jtf2.getText());
		int eng = Integer.parseInt(jtf3.getText());
		int math = Integer.parseInt(jtf4.getText());

		int total = kor + eng + math;
		double avg = (int) (total / 3.0 * 10) / 10.0;
		char grade;

		if (avg >= 90)
			grade = 'A';
		else if (avg >= 80)
			grade = 'B';
		else if (avg >= 70)
			grade = 'C';
		else if (avg >= 60)
			grade = 'D';
		else
			grade = 'F';

		jta.append("이름 : " + name + "\n");
		jta.append("총점 : " + total + "\n");
		jta.append("평균 : " + avg + "\n");
		jta.append("학점 : " + grade + "\n");

	}
}
