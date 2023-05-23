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

public class Ex04_Calc extends JFrame {
	public Ex04_Calc() {
		super("계산기4");

		JPanel np = new JPanel();
		JPanel cp = new JPanel(new GridLayout(5,3,5,5));

		JTextField jtf1 = new JTextField(20);
		// 위쪽 패널
		np.add(jtf1);
		add(np, BorderLayout.NORTH);
		
		
		// 아래쪽 버튼
		JButton jb1 = new JButton("1");
		JButton jb2 = new JButton("2");
		JButton jb3 = new JButton("3");
		JButton jb4 = new JButton("4");
		JButton jb5 = new JButton("5");
		JButton jb6 = new JButton("6");
		JButton jb7 = new JButton("7");
		JButton jb8 = new JButton("8");
		JButton jb9 = new JButton("9");
		JButton jb0 = new JButton("0");
		JButton jbA = new JButton("+");
		JButton jbS = new JButton("-");
		JButton jbM = new JButton("*");
		JButton jbD = new JButton("/");
		JButton jbE = new JButton("=");
		cp.add(jb1);
		cp.add(jb2);
		cp.add(jb3);
		cp.add(jb4);
		cp.add(jb5);
		cp.add(jb6);
		cp.add(jb7);
		cp.add(jb8);
		cp.add(jb9);
		cp.add(jb0);
		cp.add(jbA);
		cp.add(jbS);
		cp.add(jbM);
		cp.add(jbD);
		cp.add(jbE);
		
		add(cp);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 250, 250);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex04_Calc();
	}
}
