package day18.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex03_grade extends JFrame {
	public Ex03_grade() {
		super("성적계산");
		JPanel jpOne = new JPanel(new BorderLayout());
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		
		JTextField jtf1 = new JTextField(10);
		JTextField jtf2 = new JTextField(10);
		JTextField jtf3 = new JTextField(10);
		JTextField jtf4 = new JTextField(10);
		
		jp1.add(new JLabel("이름 : "));
		jp1.add(jtf1);
		jpOne.add(jp1,BorderLayout.NORTH);
		
		jp2.add(new JLabel("국어 : "));
		jp2.add(jtf2);
		jp2.add(new JLabel("영어 : "));
		jp2.add(jtf3);
		jp2.add(new JLabel("수학 : "));
		jp2.add(jtf4);
		jpOne.add(jp2,BorderLayout.SOUTH);
		add(jpOne,BorderLayout.NORTH);
		
		JTextArea jta = new JTextArea(30,50);
		JScrollPane jsp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		add(jsp);
		
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		jp3.add(jb1);
		jp3.add(jb2);
		jp3.add(jb3);
		
		add(jp3,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	public static void main(String[] args) {
		new Ex03_grade();
	}
}
