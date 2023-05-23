package day17.com.ict.edu4;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Toolkit;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

import javax.swing.*;
import java.awt.*;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex06_Calc extends JFrame {
	public Ex06_Calc() {
		super("카페 주문");
//		setLayout(new GridLayout(4,	1, 2, 2));
		JPanel jpOne = new JPanel(new BorderLayout());
		
		JPanel jp1 = new JPanel();
		JPanel jp2 = new JPanel();
		JPanel jp3 = new JPanel();
		JPanel jp4 = new JPanel();
		JPanel jp5 = new JPanel();
		
		JTextField jtf1 = new JTextField(10);
		JTextField jtf2 = new JTextField(10);
		JTextField jtf3 = new JTextField(10);
		JTextField jtf4 = new JTextField(10);
		
		jp1.add(new JLabel("원하는 음료를 선택하세요"));
		jpOne.add(jp1,BorderLayout.NORTH);
		
		JRadioButton jrb1 = new JRadioButton();
		JRadioButton jrb2 = new JRadioButton();
		JRadioButton jrb3 = new JRadioButton();
		JRadioButton jrb4 = new JRadioButton();
		ButtonGroup bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		
		
		jp2.add(jrb1);
		jp2.add(new JLabel("아메리카노(3000)"));
		jp2.add(jrb2);
		jp2.add(new JLabel("카페모카(4000)"));
		jp2.add(jrb3);
		jp2.add(new JLabel("카페라떼(3500)"));
		jp2.add(jrb4);
		jp2.add(new JLabel("과일쥬스(3000)"));
		jpOne.add(jp2,BorderLayout.CENTER);
		
		jp3.add(new JLabel("수량 : "));
		jp3.add(jtf1);
		jp3.add(new JLabel("입금액 : "));
		jp3.add(jtf2);
		jpOne.add(jp3,BorderLayout.SOUTH);
		
		add(jpOne,BorderLayout.NORTH);
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta,ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		jta.setLineWrap(true);
		add(jsp);
		
		JButton jb1 = new JButton("계 산");
		JButton jb2 = new JButton("종 료");
		JButton jb3 = new JButton("취 소");
		
		jp4.add(jb1);
		jp4.add(jb2);
		jp4.add(jb3);
		
		add(jp4,BorderLayout.SOUTH);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 600, 600);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex06_Calc();
	}
}
