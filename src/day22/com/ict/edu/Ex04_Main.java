package day22.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ex04_Main extends JFrame implements ItemListener {
	JPanel jp;
	ButtonGroup bg;
	JRadioButton jrb1, jrb2;

	public Ex04_Main() {
		super("라디오버튼을 이용한 그림 선택");
		jp = new JPanel();
		jrb1 = new JRadioButton("그림1");
		jrb2 = new JRadioButton("그림2");
		bg = new ButtonGroup();
		bg.add(jrb1);
		bg.add(jrb2);
		jp.add(jrb1);
		jp.add(jrb2);

		add(jp, BorderLayout.NORTH);

		Ex04_Canvas canvas = new Ex04_Canvas();
		add(canvas);
		jrb1.addItemListener(new ItemListener() {

			@Override
			public void itemStateChanged(ItemEvent e) {
				canvas.img = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
				canvas.repaint();
			}

		});
		
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		new Ex04_Main();
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub

	}
}
