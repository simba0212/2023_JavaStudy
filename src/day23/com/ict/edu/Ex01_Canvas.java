package day23.com.ict.edu;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class Ex01_Canvas extends Canvas {
	Image img;
	int x = 200;

	@Override
	public void paint(Graphics g) {
		img = Toolkit.getDefaultToolkit().getImage("src/images/java3.png");
		g.drawImage(img, x, getHeight() - 100, 100, 100, this);
	}
}
