package day23.com.ict.edu;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Ex04_Race extends JFrame implements ActionListener {
	JPanel jp;
	JButton jb;
	Image image1, image2, image3, image4;
	int x1, x2, x3, x4;
	int count;
	CanvasTest canvas = new CanvasTest();

	public Ex04_Race() {
		super("경마게임");

		jp = new JPanel();
		jb = new JButton("start");
		jp.add(jb);
		add(jp, BorderLayout.NORTH);
		add(canvas);

		setSize(800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);

		jb.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new Thread(new Runnable() {

					@Override
					public void run() {
						while (x1 < canvas.getWidth() - 120) {
							x1 = x1 + (int) (Math.random() * 10);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();

						}
						System.out.println(++count + "등 : " + Thread.currentThread().getName());
					}
				}, "dog").start();
				new Thread(new Runnable() {

					@Override
					public void run() {
						while (x2 < canvas.getWidth() - 120) {
							x2 += (int) (Math.random() * 10);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();

						}
						System.out.println(++count + "등 : " + Thread.currentThread().getName());
					}
				}, "cat").start();
				new Thread(new Runnable() {

					@Override
					public void run() {
						while (x3 < canvas.getWidth() - 120) {
							x3 += (int) (Math.random() * 10);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();
						}
						System.out.println(++count + "등 : " + Thread.currentThread().getName());
					}
				}, "tiger").start();
				new Thread(new Runnable() {

					@Override
					public void run() {
						while (x4 < canvas.getWidth() - 120) {
							x4 += (int) (Math.random() * 10);
							try {
								Thread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							canvas.repaint();

						}
						System.out.println(++count + "등 : " + Thread.currentThread().getName());
					}
				}, "lion").start();

			}
		});
	}

	private class CanvasTest extends Canvas {
		@Override
		public void paint(Graphics g) {
			image1 = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
			image2 = Toolkit.getDefaultToolkit().getImage("src/images/java2.png");
			image3 = Toolkit.getDefaultToolkit().getImage("src/images/java3.png");
			image4 = Toolkit.getDefaultToolkit().getImage("src/images/java4.gif");
			g.drawImage(image1, x1, 50, 100, 100, this);
			g.drawImage(image2, x2, 200, 100, 100, this);
			g.drawImage(image3, x3, 350, 100, 100, this);
			g.drawImage(image4, x4, 500, 100, 100, this);

		}
	}

	public static void main(String[] args) {
		new Ex04_Race();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
