package day16.com.ict.edu2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;

public class Ex09_JTab extends JFrame {
	public Ex09_JTab() {
		super("JTab");
		
		// XXXPane = 컨테이너를 의미한다. (다른 컨테이너를 담을 수 있고, 컴포넌트도 담을 수 있다)
		JTabbedPane jtab = new JTabbedPane();
		
		JPanel jp1 = new JPanel();
		jp1.setBackground(Color.BLUE);
		JButton jb1 = new JButton(" + ");
		JButton jb2 = new JButton(" - ");
		JButton jb3 = new JButton(" * ");
		JButton jb4 = new JButton(" / ");
		
		jp1.add(jb1);
		jp1.add(jb2);
		jp1.add(jb3);
		jp1.add(jb4);
		
		jtab.addTab("블루 탭", jp1);
		add(jtab);
		
		JPanel jp2 = new JPanel();
		jp2.setBackground(Color.CYAN);
		JRadioButton jrb1 = new JRadioButton();
		JRadioButton jrb2 = new JRadioButton();
		JRadioButton jrb3 = new JRadioButton();
		JRadioButton jrb4 = new JRadioButton();
		
		ButtonGroup bg1 = new ButtonGroup();
		bg1.add(jrb1);
		bg1.add(jrb2);
		bg1.add(jrb3);
		bg1.add(jrb4);
		
		jp2.add(jrb1);
		jp2.add(jrb2);
		jp2.add(jrb3);
		jp2.add(jrb4);
		
		jtab.addTab("시안 탭", jp2);
		
		JPanel jp3 = new JPanel();
		jp3.setBackground(Color.GREEN);
		JCheckBox jcb1 = new JCheckBox();
		JCheckBox jcb2 = new JCheckBox();
		JCheckBox jcb3 = new JCheckBox();
		JCheckBox jcb4 = new JCheckBox();
		jcb1.setBackground(Color.GREEN);
		jcb2.setBackground(Color.GREEN);
		jcb3.setBackground(Color.GREEN);
		jcb4.setBackground(Color.GREEN);
		
		jp3.add(jcb1);
		jp3.add(jcb2);
		jp3.add(jcb3);
		jp3.add(jcb4);
		
		jtab.addTab("그린 탭", jp3);
		
		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 250, ds.height / 2 - 250, 500, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Ex09_JTab();
	}
}
