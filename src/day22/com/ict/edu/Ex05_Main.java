package day22.com.ict.edu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;

public class Ex05_Main extends JFrame {

	int x, y;

	public Ex05_Main() {
		super("원 찍기");
		Ex05_Canvas canvas = new Ex05_Canvas();

		add(canvas);
		setSize(300, 300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		// 마우스 이벤트
		// ItemListener, ActionListener 처럼 오버라이딩메서드가
		// 하나가 아니라, 두개 이상이면 불필요한 메서드까지 오버라이딩된다.
		// 그래서 나온게 Adapter()이다.
//		canvas.addMouseListener(new MouseListener() {
//			@Override
//			public void mouseReleased(MouseEvent e) {
//			}
//			@Override
//			public void mousePressed(MouseEvent e) {
//			}
//			@Override
//			public void mouseExited(MouseEvent e) {
//			}
//			@Override
//			public void mouseEntered(MouseEvent e) {
//			}
//			@Override
//			public void mouseClicked(MouseEvent e) {
//			}
//		});
		canvas.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				canvas.x = e.getX();
				canvas.y = e.getY();
				canvas.repaint();
			}
		});

	}

	public static void main(String[] args) {
		new Ex05_Main();
	}
}
