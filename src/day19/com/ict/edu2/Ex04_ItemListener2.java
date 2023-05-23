package day19.com.ict.edu2;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.Border;
import javax.tools.Tool;

public class Ex04_ItemListener2 extends JFrame{
	JPanel jp1, jp2;
	JCheckBox jcb1, jcb2, jcb3, jcb4;
	JTextArea jta;
	JScrollPane jsp;
	JButton jb1, jb2;

	public Ex04_ItemListener2() {
		super("체크박스");
		jp1 = new JPanel();
		jcb1 = new JCheckBox("축구");
		jcb2 = new JCheckBox("야구");
		jcb3 = new JCheckBox("농구");
		jcb4 = new JCheckBox("배구");

		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		jp1.add(jcb4);
		add(jp1, BorderLayout.NORTH);

		jta = new JTextArea(15, 1);
		jsp = new JScrollPane(jta, ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,
				ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		jta.setLineWrap(true);
		jta.setEditable(false);
		add(jsp);

		jp2 = new JPanel();
		jb1 = new JButton("clear");
		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 체크박스를 지우자
				jcb1.setSelected(false);
				jcb2.setSelected(false);
				jcb3.setSelected(false);
				jcb4.setSelected(false);
				jta.setText("");
			}
		});
		jb2 = new JButton("exit");
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		jp2.add(jb1);
		jp2.add(jb2);
		add(jp2, BorderLayout.SOUTH);

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 300, ds.height / 2 - 250, 600, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// 체크박스에 ItemListener를 달자
		jcb1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox obj = (JCheckBox)e.getSource();
				if(e.getStateChange()==e.SELECTED) {
					jta.append(obj.getText()+" 선택\n");
				}
				else if(e.getStateChange()==e.DESELECTED) {
					jta.append(obj.getText()+" 해제\n");
				}
			}
		});
		jcb2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox obj = (JCheckBox)e.getSource();
				if(e.getStateChange()==e.SELECTED) {
					jta.append(obj.getText()+" 선택\n");
				}
				else if(e.getStateChange()==e.DESELECTED) {
					jta.append(obj.getText()+" 해제\n");
				}
			}
		});
		jcb3.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox obj = (JCheckBox)e.getSource();
				if(e.getStateChange()==e.SELECTED) {
					jta.append(obj.getText()+" 선택\n");
				}
				else if(e.getStateChange()==e.DESELECTED) {
					jta.append(obj.getText()+" 해제\n");
				}
			}
		});
		jcb4.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				JCheckBox obj = (JCheckBox)e.getSource();
				if(e.getStateChange()==e.SELECTED) {
					jta.append(obj.getText()+" 선택\n");
				}
				else if(e.getStateChange()==e.DESELECTED) {
					jta.append(obj.getText()+" 해제\n");
				}
			}
		});
		
		

	}


	public static void main(String[] args) {
		new Ex04_ItemListener2();
	}


}
