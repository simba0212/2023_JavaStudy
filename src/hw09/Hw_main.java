package hw09;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Hw_main extends JFrame{
	JPanel jp1;
	JTextField id,name,phone,addr,comp;
	JButton add,del,edit,search,clean,seeA;
	
	
	public Hw_main() {
		super("");
		add(new JLabel("Address Book",JLabel.CENTER),BorderLayout.NORTH);
		
		jp1 = new JPanel(new GridLayout(5,2));
		jp1.add(new JLabel("I D :",JLabel.CENTER));
		id = new JTextField(20);
		jp1.add(id);
		jp1.add(new JLabel("이 름 :",JLabel.CENTER));
		name = new JTextField(20);
		jp1.add(name);
		jp1.add(new JLabel("전 화 :",JLabel.CENTER));
		phone = new JTextField(20);
		jp1.add(phone);
		jp1.add(new JLabel("주 소 :",JLabel.CENTER));
		addr = new JTextField(20);
		jp1.add(addr);
		jp1.add(new JLabel("회 사 :",JLabel.CENTER));
		comp = new JTextField(20);
		jp1.add(comp);
		
		
		
		
		add(jp1);
		
		setSize(600, 450);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}
	
	
	public static void main(String[] args) {
		new Hw_main();
	}
}
