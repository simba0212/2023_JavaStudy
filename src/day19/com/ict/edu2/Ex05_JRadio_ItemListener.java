package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.tools.Tool;

public class Ex05_JRadio_ItemListener extends JFrame implements ActionListener, ItemListener{
	JPanel jp1, jp2;
	JRadioButton jrb1, jrb2, jrb3, jrb4;
	JTextArea jta;
	JScrollPane jsp;
	JButton exit, clear;
	ButtonGroup bg;

	public Ex05_JRadio_ItemListener() {
		super("라디오 버튼 이벤트");
		jp1 = new JPanel();
		jrb1 = new JRadioButton(" + ");
		jrb2 = new JRadioButton(" - ");
		jrb3 = new JRadioButton(" * ");
		jrb4 = new JRadioButton("/");

		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		bg.add(jrb3);
		bg.add(jrb4);
		jp1.add(jrb1);
		jp1.add(jrb2);
		jp1.add(jrb3);
		jp1.add(jrb4);
		add(jp1, BorderLayout.NORTH);

		jta = new JTextArea(10, 1);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		add(jsp);

		jp2 = new JPanel();
		clear = new JButton("clear");
		exit = new JButton("exit");
			
		jp2.add(clear);
		jp2.add(exit);
		add(jp2, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 250, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 그리기
		
		// 동작부
		jrb1.addItemListener(this);
		jrb2.addItemListener(this);
		jrb3.addItemListener(this);
		jrb4.addItemListener(this);
		
		exit.addActionListener(this);
		clear.addActionListener(this);
		
		
		

	}
	// 라디오버튼
	@Override
	public void itemStateChanged(ItemEvent e) {
		JRadioButton obj = (JRadioButton)e.getSource();
		if(e.getStateChange() == e.SELECTED) {
			jta.append(obj.getText()+"\t선택\n");
		}
	}
	
	// 클리어,나가기버튼
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton)e.getSource();
		if(obj == clear) {
			jta.setText("");
			bg.clearSelection();
		}else if(obj == exit) {
			System.exit(0);
		}
	}


	public static void main(String[] args) {
		new Ex05_JRadio_ItemListener();
	}



}
