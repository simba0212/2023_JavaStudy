package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

public class Ex05_Canvas extends Canvas {
	int x = -50;
	int y = -50;
	int wh = 30;

	@Override
	public void paint(Graphics g) {
		int r1 = (int) (Math.random() * 256);
		int g1 = (int) (Math.random() * 256);
		int b1 = (int) (Math.random() * 256);
		g.setColor(new Color(r1, g1, b1));
		g.fillOval(x, y, wh, wh);

	}
}