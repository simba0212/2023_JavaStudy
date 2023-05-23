package day16.com.ict.edu2;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex05_Toggle extends JFrame {

	public Ex05_Toggle() {
		super("토글버튼");

		JPanel jp = new JPanel();

		Dimension ds = Toolkit.getDefaultToolkit().getScreenSize();
		setBounds(ds.width / 2 - 150, ds.height / 2 - 200, 300, 500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Ex05_Toggle();
	}

}
