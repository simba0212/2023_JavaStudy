package day17.com.ict.edu3;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.time.chrono.JapaneseChronology;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex07_Layout extends JFrame {
	public Ex07_Layout() {
		super("절대좌표 : null");

		JPanel jp = new JPanel();
		jp.setLayout(null);

		JButton jb1 = new JButton("버튼1");
		JButton jb2 = new JButton("버튼2");
		JButton jb3 = new JButton("버튼3");
		JButton jb4 = new JButton("버튼4");
		JButton jb5 = new JButton("버튼5");

		jb1.setBounds(10,10,200,320);
		jb2.setBounds(220,10,200,100);
		jb3.setBounds(220,120,200,100);
		jb4.setBounds(220,230,200,100);
		
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		add(jp);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Ex07_Layout();
	}
}
