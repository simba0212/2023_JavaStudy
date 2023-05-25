package day22.com.ict.edu;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

public class Ex03_Canvas extends Canvas {

	@Override
	public void paint(Graphics g) {
		Image img = Toolkit.getDefaultToolkit().getImage("src/images/java1.png");
		g.drawImage(img, 10, 230, this); // 원래 크기

		g.drawImage(img, 120, 230, 100, 100, this); // 크기 조절
		try {
			BufferedImage image2 = ImageIO.read(new File("src/images/java2.png"));
			g.drawImage(image2, 240, 230, 100, 100, this);
			g.drawImage(image2, 350, 230, 100, 100, new Color(255, 255, 0, 255), this); // 배경색 추가
		} catch (Exception e) {
		}
		Image img3 = new ImageIcon("src/images/java3.png").getImage();
		g.drawImage(img3, 460, 230, 100, 100, new Color(0, 100, 0, 50), this);
	}
	
}
