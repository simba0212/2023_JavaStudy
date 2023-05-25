package day22.com.ict.edu;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame {
	
	int x,y;
	
	public Ex05_Main() {
		super("원 찍기");
		Ex05_Canvas canvas = new Ex05_Canvas();
		
		
		
		
		
		add(canvas);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Ex05_Main();
	}
}
