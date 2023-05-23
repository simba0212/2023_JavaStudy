package day19.com.ict.edu2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex02_ActionEvent extends JFrame implements ActionListener {

	JPanel jp;
	JButton jb1, jb2, jb3;

	public Ex02_ActionEvent() {
		super("ActionEvent");

		jp = new JPanel();
		jb1 = new JButton("입력 1");
		jb2 = new JButton("입력 2");
		jb3 = new JButton("EXIT");

		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);

		add(jp);
		
		pack();
		setLocationRelativeTo(null);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		jb1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력 1 눌렀네");
				 
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("입력 2 눌렀네");
			}
		});
		jb3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton obj = (JButton) e.getSource();
		if(obj==jb1) {
			System.out.println("입력 1이 눌렸네");
		}else if(obj==jb2) {
			System.out.println("입력 2가 눌렸네");
		}else if(obj ==jb3) {
			System.exit(0);
		}
	}

	public static void main(String[] args) {
		new Ex02_ActionEvent();
	}
}
